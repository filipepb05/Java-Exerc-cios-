package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;


import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.*;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.SeriesRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    @Autowired
    private DiretoresRepository diretoresRepository;

    @Autowired
    private AtoresRepository atoresRepository;

    static SerieResponseMapper MAPPER_RESPONSE = new SerieResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY = new SerieEntityMapper();
    static AtoresResponseMapper MAPPER_RESPONSE_ATORES = new AtoresResponseMapper();
    static ConsultarDetalhesSerieReponseMapper MAPPER_DETALHES_SERIE = new ConsultarDetalhesSerieReponseMapper();

    public List<SerieResponse> getSeries(Genero genero) {
        final List<SerieEntity> series = seriesRepository.getSeriesPorGenero(genero);
        return MAPPER_RESPONSE.mapear(series);
    }

    public Long criarSerie (final CriarSerieRequest request){
        SerieEntity serieNova = MAPPER_ENTITY.mapear(request);
        return SeriesRepository.criarSerie(serieNova);
    }

    public ConsultarDetalhesSerieResponse consultarDetalhesSerie(final Long id) {
        SerieEntity serieBuscada = seriesRepository.acharSeriePorId(id);

        List<Long> listaIdsAtores = serieBuscada.getIdsAtores();
        List<AtorEntity> listaAtoresSerieBuscada = new ArrayList<>();
        for(Long idAtor: listaIdsAtores){
            AtorEntity ator = atoresRepository.acharAtorPorId(idAtor);
            listaAtoresSerieBuscada.add(ator);
        }
        List<AtoresResponse> listaAtoresSerieResponse = MAPPER_RESPONSE_ATORES.mapear(listaAtoresSerieBuscada);

        return MAPPER_DETALHES_SERIE.mapear(serieBuscada, listaAtoresSerieResponse);
    }

}
