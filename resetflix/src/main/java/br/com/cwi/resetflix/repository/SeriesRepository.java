package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.exception.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeriesRepository {

    static List<SerieEntity> series = new ArrayList<>();
    static Long contadorIds = 1l;

    public static Long criarSerie(final SerieEntity serieNova){
        if(serieNova.getId() == null){
            serieNova.setId(contadorIds);
            contadorIds++;
        }
        series.add(serieNova);
        return serieNova.getId();
    }

    public List<SerieEntity> getSeriesPorGenero (Genero genero){
        if (genero == null){
            return series;
        } else {
            List<SerieEntity> seriesGeneroEscolhido = new ArrayList<>();

            for (SerieEntity serie : series) {
                if (serie.getGenero().equals(genero)) {
                    seriesGeneroEscolhido.add(serie);
                }
            }
            return seriesGeneroEscolhido;
        }
    }

    public SerieEntity acharSeriePorId (final Long id){
        for(SerieEntity serie : series){
            if(serie.getId().equals(id)){
                return serie;
            }
        }
        throw new NotFoundException("ID de série não encontrado no sistema");
    }

}
