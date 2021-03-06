package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cwi.resetflix.entity.FilmeEntity;

import java.util.ArrayList;
import java.util.List;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {

     List<FilmeEntity> findAllByGenero(Genero genero);
//
//         final List<FilmeEntity> filmesPorGenero = new ArrayList<>();
//
//         for (FilmeEntity filme : filmes) {
//             if (filme.getGenero().equals(genero)){
//                 filmesPorGenero.add(filme);
//             }
//         }
//        return filmesPorGenero;
//    }

}
