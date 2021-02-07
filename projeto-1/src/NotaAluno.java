public class NotaAluno {

    private String nome;

    private double nota;


    public NotaAluno (String nome, double nota) {
        this.nome = nome;
        this.nota = nota;

        System.out.println("Aluno " + nome + " com nota " + nota + " foi instanciado.");
    }

    public void situacao() {
        if (nota >= 7) {
            System.out.println("O aluno " + nome + " com nota " + nota + " está aprovado!");
        }
        else{
            System.out.println("O aluno " + nome + " com nota " + nota + " está reprovado!");
        }

    }
}
