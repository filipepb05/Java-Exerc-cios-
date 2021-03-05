package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;

import java.util.List;

public class ConsultarDetalhesSerieReponseMapper {

    public ConsultarDetalhesSerieResponse mapear (final SerieEntity serie, final List<AtoresResponse> atores){
        return new ConsultarDetalhesSerieResponse(serie.getId(), serie.getNome(), serie.getGenero(),
                serie.getTemporada(), serie.getEpisodio(), atores);

    }

}
