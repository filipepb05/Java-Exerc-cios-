package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.FilmeResponse;

import java.util.List;

public class ConsultarDetalhesDiretorResponseMapper {

    public ConsultarDetalhesDiretorResponse mapear(final DiretorEntity diretorBuscado, final List<FilmeEntity> filmesDiretor) {
        List<FilmeResponse> filmesResponse = new FilmeResponseMapper().mapear(filmesDiretor);
        return new ConsultarDetalhesDiretorResponse(diretorBuscado.getId(), diretorBuscado.getNome(), filmesResponse);
    }
}
