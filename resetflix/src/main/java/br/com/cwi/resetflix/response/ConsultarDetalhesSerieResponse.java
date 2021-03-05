package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class ConsultarDetalhesSerieResponse {

    private Long id;
    private String nome;
    private Genero genero;
    private Long temporada;
    private Long episodio;
    private List<AtoresResponse> atores;

    public ConsultarDetalhesSerieResponse(Long id, String nome, Genero genero, Long temporadas,
                                          Long episodio, List<AtoresResponse> atores) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporada = temporadas;
        this.episodio = episodio;
        this.atores = atores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Long getTemporada() {
        return temporada;
    }

    public void setTemporada(Long temporada) {
        this.temporada = temporada;
    }

    public Long getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Long episodio) {
        this.episodio = episodio;
    }

}
