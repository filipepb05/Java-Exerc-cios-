public class NotaAluno {

    private String nome;

    private double nota;

    private boolean aprovado;

    public NotaAluno (String nome, double nota) {
        this.nome = nome;
        this.nota = nota;

        System.out.println("Aluno " + nome + " com nota " + nota + " foi instanciado.");
    }

    public void aprovado() {
        if (nota >= 7) {
            this.aprovado = true;
            System.out.println("O aluno " + nome + " com nota " + nota + " está aprovado!");
        }
        else{
            this.aprovado = false;
        System.out.println("O aluno " + nome + " com nota " + nota + " está reprovado!");
        }

    }
}
