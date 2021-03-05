package br.com.cwi.resetflix.repository;


import java.util.ArrayList;
import java.util.List;

import br.com.cwi.resetflix.exception.NotFoundException;
import org.springframework.stereotype.Repository;
import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long contadorIds = 1l;

    public List<FilmeEntity> getFilmes(){
        return filmes;
    }

    public Long criarFilme(final FilmeEntity filmeNovo){
        if(filmeNovo.getId() == null){
            filmeNovo.setId(contadorIds);
            contadorIds++;
        }
        filmes.add(filmeNovo);
        return filmeNovo.getId();
    }

    public List<FilmeEntity> getFilmesPorGenero (Genero genero){
        if (genero == null){
            return filmes;
        } else {
            List<FilmeEntity> filmesGeneroEscolhido = new ArrayList<>();

            for (FilmeEntity filme : filmes) {
                if (filme.getGenero().equals(genero)) {
                    filmesGeneroEscolhido.add(filme);
                }
            }
            return filmesGeneroEscolhido;
        }
    }

    public FilmeEntity acharFilmePorId(final Long id) {

        for(FilmeEntity filmeEntity : filmes){
            if(filmeEntity.getId().equals(id)){
                return filmeEntity;
            }
        }
        throw new NotFoundException("ID de filme não encontrado no sistema");
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {

        List<FilmeEntity> filmesPorAtor = new ArrayList<>();

        for (FilmeEntity filme : filmes) {
            List<Long> idsAtoresFilmeEntity = filme.getIdsAtores();
            for (Long idAtorBuscado : idsAtoresFilmeEntity) {
                if (idAtorBuscado.equals(id))
                    filmesPorAtor.add(filme);
            }

        }
        return filmesPorAtor;
    }

    public List<FilmeEntity> acharFilmesDiretor(final Long id) {

        List<FilmeEntity> filmesPorDiretor = new ArrayList<>();

        for (FilmeEntity filme : filmes) {
            if (filme.getIdDiretor().equals(id)) {
                filmesPorDiretor.add(filme);
            }
        }
        return filmesPorDiretor;
    }


}
