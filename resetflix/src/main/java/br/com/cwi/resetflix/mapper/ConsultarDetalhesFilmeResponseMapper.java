package br.com.cwi.resetflix.mapper;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;

import java.util.List;


public class ConsultarDetalhesFilmeResponseMapper {

    public ConsultarDetalhesFilmeResponse mapear(final FilmeEntity filmeBuscado, final DiretoresResponse diretor,
                                                 List<AtoresResponse> atores) {

        return new ConsultarDetalhesFilmeResponse(filmeBuscado.getId(), filmeBuscado.getNome(),
                filmeBuscado.getGenero(), diretor, atores);
    }
}
