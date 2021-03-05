package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.exception.NotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DiretoresRepository {

    static List<DiretorEntity> diretores = new ArrayList<>();
    static Long contadorIds = 1l;

    public List<DiretorEntity> getDiretores() {
        return diretores;
    }

    public Long criarDiretor(final DiretorEntity diretorNovo) {
        if(diretorNovo.getId() == null){
            diretorNovo.setId(contadorIds);
            contadorIds++;
        }

        diretores.add(diretorNovo);

        return diretorNovo.getId();
    }

    public DiretorEntity acharDiretorPorId(final Long id) {

        for(DiretorEntity diretorEntity : diretores){
            if(diretorEntity.getId().equals(id)){
                return diretorEntity;
            }
        }
        throw new NotFoundException("ID de Diretor não cadastrado no banco de dados");
    }
}
