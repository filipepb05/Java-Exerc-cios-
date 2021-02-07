public class Aplicação {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultadoSoma = calculadora.soma(3, 6);
        int resultadoSubtrai = calculadora.subtrai(3, 6);
        int resultadoMultiplica = calculadora.multiplica(3, 6);
        int resultadoDivide = calculadora.divide(12, 6);

        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtrai);
        System.out.println(resultadoMultiplica);
        System.out.println(resultadoDivide);

        Comparador comparador = new Comparador();
        boolean resultadoMenorQue = comparador.menorQue(9, 8);

        System.out.println(resultadoMenorQue);

        NotaAluno aluno = new NotaAluno("João",8.5);
        aluno.aprovado();

    }

}
