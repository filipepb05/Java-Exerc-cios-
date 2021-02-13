public class Aplicacao {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double primeiroValor = 8;
        double segundoValor = 8;

        double resultadoSoma = calculadora.soma(primeiroValor, segundoValor);
        double resultadoSubtrai = calculadora.subtrai(primeiroValor, segundoValor);
        double resultadoMultiplica = calculadora.multiplica(primeiroValor, segundoValor);
        double resultadoDivide = calculadora.divide(primeiroValor, segundoValor);

        System.out.println(primeiroValor + " + " + segundoValor + " = " + resultadoSoma);
        System.out.println(primeiroValor + " - " + segundoValor + " = " + resultadoSubtrai);
        System.out.println(primeiroValor + " * " + segundoValor + " = " + resultadoMultiplica);
        System.out.println(primeiroValor + " / " + segundoValor + " = " + resultadoDivide);

        Comparador comparador = new Comparador();
        boolean resultadoMenorQue = comparador.menorQue(9, 8);

        System.out.println(primeiroValor + " é < que " + segundoValor + "? " + resultadoMenorQue);

        Aluno aluno = new Aluno("Joao");
        aluno.nota(2);

       // System.out.println("Aluno " + aluno.getNome() + " foi instanciado.");

          if (aluno.situacao(aluno.getNota()) == true) {
            System.out.println("O aluno " + aluno.getNome() + " com nota " + aluno.getNota() + " está aprovado!");
          }
         else{
             System.out.println("O aluno " + aluno.getNome() + " com nota " + aluno.getNota() + " está reprovado!");
         }
    }
}