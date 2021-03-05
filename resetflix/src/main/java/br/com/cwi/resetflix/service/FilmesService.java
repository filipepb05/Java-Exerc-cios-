package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.mapper.*;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmesService {

    @Autowired
    private DiretoresRepository diretoresRepository;

    @Autowired
    private FilmeRepository filmesRepository;

    @Autowired
    private AtoresRepository atoresRepository;

    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper();
    static AtoresResponseMapper MAPPER_RESPONSE_ATORES = new AtoresResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFilmeResponseMapper();

    public List<FilmeResponse> getFilmes(Genero genero) {
        final List<FilmeEntity> filmes = filmesRepository.getFilmesPorGenero(genero);
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme (final CriarFilmeRequest request){
        FilmeEntity filmeNovo = MAPPER_ENTITY.mapear(request);
        return filmesRepository.criarFilme(filmeNovo);
    }

    public ConsultarDetalhesFilmeResponse consultarDetalhesFilme(final Long id) {
        FilmeEntity filmeBuscado = filmesRepository.acharFilmePorId(id);

        List<Long> listaIdsAtores = filmeBuscado.getIdsAtores();
        List<AtorEntity> listaAtoresFilme = new ArrayList<>();

        for(Long idAtor: listaIdsAtores){
            AtorEntity ator = atoresRepository.acharAtorPorId(idAtor);
            listaAtoresFilme.add(ator);
        }
        List<AtoresResponse> listaAtoresResponse = MAPPER_RESPONSE_ATORES.mapear(listaAtoresFilme);

        Long idDiretor = filmeBuscado.getIdDiretor();
        DiretorEntity diretorFilmeBuscado = diretoresRepository.acharDiretorPorId(idDiretor);
        DiretoresResponse diretorResponse = new DiretoresResponse(diretorFilmeBuscado.getId(),
                diretorFilmeBuscado.getNome());

        return MAPPER_DETALHES_FILME.mapear(filmeBuscado, diretorResponse, listaAtoresResponse);
    }


}
