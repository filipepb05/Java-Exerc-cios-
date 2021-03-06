package br.com.cwi.resetflix.service;

import static java.util.Objects.nonNull;
import static org.apache.logging.log4j.util.Strings.isEmpty;

import java.util.List;

import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretorRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.exception.BadRequestException;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;

import javax.transaction.Transactional;

@Service
public class FilmesService {

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private AtoresRepository atoresRepository;

    @Autowired
    private DiretorRepository diretoresRepository;

    @Autowired
    private FilmeResponseMapper filmeResponseMapper;

    @Autowired
    private FilmeEntityMapper filmeEntityMapper;

    @Autowired
    private ConsultarDetalhesFilmeResponseMapper consultarDetalhesFilmeResponseMapper;

    public List<FilmeResponse> getFilmes(final Genero genero) {

        final List<FilmeEntity> filmes = filmeRepository.findAll();

        if (nonNull(genero)) {
            return filmeResponseMapper.mapear (filmeRepository.findAllByGenero(genero));
        } else {
            return filmeResponseMapper.mapear(filmes);
        }
    }

    @Transactional
    public Long criarFilme(final CriarFilmeRequest request) {

        if (request == null || isEmpty(request.getNome())) {
            throw new BadRequestException("Dados inválidos para cadastro de filme");
        }

        final FilmeEntity filmeNovo = filmeEntityMapper.mapear(request);

        filmeRepository.save(filmeNovo);

        return filmeNovo.getId();
    }

    public ConsultarDetalhesFilmeResponse consultarDetalhesFilme(final Long id) {

        final FilmeEntity filme = filmeRepository.findById(id).orElse(null);

        if (filme == null) {
            throw new NotFoundException("Filme não encontrado");
        }

        return consultarDetalhesFilmeResponseMapper.mapear(filme);
    }
}
