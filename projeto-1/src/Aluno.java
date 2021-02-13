public class Aluno {

    private String nome;
    private double nota;


    public Aluno (String nome) {
        this.nome = nome;
    }

    public void nota(double nota){
        this.nota = nota;
    }

    public boolean situacao(double nota) {
        return nota >= 7;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}
