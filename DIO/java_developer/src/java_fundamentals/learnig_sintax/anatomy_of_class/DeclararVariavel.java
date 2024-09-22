package java_fundamentals.learnig_sintax.anatomy_of_class;

public class DeclararVariavel {
    public static void main(String[] args) {
        /*
        Uma variável deve ser clara, sem abreviações ou definição sem sentido;
        Uma variável é sempre no singular, exceto quando se referir a um array ou coleção.
        Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.
        Tipo NomeBemDefinido = Atribuição (opcional em alguns casos);
        */

        //Não recomendável
        double salMedio = 1500.23;  //variável abreviada, o que dificulta a compreensão
        String emails = "aluno@escola.com"; //confuso se a variável seria um array ou único e-mail
        String myName = "JOSEPH"; //se idioma pt-BR, o valor poder ser de outro idioma mas o nome da variável não

        //Recomendavel
        double salarioMedio = 1500.23;
        String email = "aluno@escola.com";
        String [] emailsEscola = {"aluno@escola.com","professor@escola.com"};
        String primeiroNome = "JOSEPH";

        //Outros exemplos
        String meuNome = "Reginaldo";
        int notaMatematica = 80;
        boolean ehVerdadeiro = true;

        notaMatematica = 85;
    }
}
