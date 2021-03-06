package br.com.cwi.resetflix.service;

import static org.apache.logging.log4j.util.Strings.isEmpty;

import java.util.List;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.repository.DiretorRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.exception.BadRequestException;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesDiretorResponseMapper;
import br.com.cwi.resetflix.mapper.DiretorEntityMapper;
import br.com.cwi.resetflix.mapper.DiretoresResponseMapper;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;

import javax.transaction.Transactional;

@Service
public class DiretoresService {

    @Autowired
    private DiretorRepository diretoresRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private DiretoresResponseMapper diretoresResponseMapper;

    @Autowired
    private DiretorEntityMapper diretorEntityMapper;

    @Autowired
    private ConsultarDetalhesDiretorResponseMapper consultarDetalhesDiretorResponseMapper;

    public List<DiretoresResponse> getDiretores() {
        final List<DiretorEntity> diretores = diretoresRepository.findAll();
        return diretoresResponseMapper.mapear(diretores);
    }

    @Transactional
    public Long criarDiretor(final CriarDiretorRequest request) {

        if (request == null || isEmpty(request.getNome())) {
            throw new BadRequestException("Dados inválidos para cadastro de diretor");
        }

        final List<FilmeEntity> Filmes = filmeRepository.findAllById(request.getIdFilmes());

        final DiretorEntity diretorSalvar = diretorEntityMapper.mapear(request, Filmes);

        diretoresRepository.save(diretorSalvar);

        for (FilmeEntity filme : Filmes) {
            filme.setDiretor(diretorSalvar);
        }

        return diretorSalvar.getId();
    }

    public ConsultarDetalhesDiretorResponse consultarDetalhesDiretor(final Long id) {

        final DiretorEntity diretor = diretoresRepository.findById(id).orElse(null);

        if (diretor == null) {
            throw new NotFoundException("Diretor não encontrado");
        }

        return consultarDetalhesDiretorResponseMapper.mapear(diretor);
    }
}
