package java_fundamentals.learnig_sintax.anatomy_of_class;

public class DeclararMetodo {
    public static void main(String[] args) {
        String primeiroNome = "Joellisson";
        String sobreNome = "Dionisio";
        String nomePacienteCompleto = nomePaciente(primeiroNome,sobreNome);

        System.out.println(nomePacienteCompleto);
    }
    /*
    Os métodos deverão ser nomeados como verbos, através de uma mistura de letras
    minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser m
    antidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir
    da segunda palavra.
    */
    //TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    public static String nomePaciente (String primeiroNome, String sobreNome) {
        return "O próximo paciente a ser atendido é " + primeiroNome.concat(" ").concat(sobreNome);

    /*
    Outros exemplos

    somar (int n1, int n2) {}
    abrirConexão () {}
    concluirProcessamento () {}
    concluirProcessamento () {}
    finById (int id) {}
    calcularImprimir () {} há algo de errado neste méodo, ele deveria ter uma única finalidade
    */
    }
}
