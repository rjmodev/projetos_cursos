import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Declarar as variaveis para receber as informações do código
        String nomeCliente, numeroAgencia;
        int numeroConta;
        float saldoConta;

        //TODO: Conhecer e importar a classe Scanner
        Scanner scan = new Scanner (System.in);

        //TODO: Exibir as mensagens para o usuário
        System.out.println("Olá! Seja muito bem vindo ao Premium Bank!");
        System.out.println("Para prosseguirmos o atendimento, é necessário inserir informações paar criarmos a sua conta.");
        System.out.println("Digite os dados solicitados a seguir.");

        //TODO: Obter pela scanner os valores digitados no terminal
        System.out.println("Digite seu nome e sobrenome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Agora digite o número de sua  agência (não esqueça do DIV): ");
        numeroAgencia = scan.nextLine();

        System.out.println("A seguir informe o número da sua conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Verificação concluída!");
        System.out.println("Seja bem vindo " + nomeCliente"!");
        System.out.println("Verifiquei que você não possui saldo disponível em conta.");
        System.out.println("Devido a ausência de saldo e movimentação, sua conta está desativada!");


        //TODO: Exibir a mensagem da conta criada
    }
}
