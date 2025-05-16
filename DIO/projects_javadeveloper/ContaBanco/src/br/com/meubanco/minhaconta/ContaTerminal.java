package br.com.meubanco.minhaconta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: "Conhecer e importar a classe Scanner"
        Scanner sc = new Scanner(System.in);

        int numero;
        double saldo;
        String agencia;
        String nomeCliente;

        //TODO: "Exibir as mensagens para o nosso usuário"
        System.out.println("\nSeja bem vindo(a) a criação da sua conta digital!!");

        System.out.print("\nPara criar seu cadastro, digite o seu nome e sobrenome: ");
        //TODO: "Obter pela Scanner os valores digitados no terminal"
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o número escolhido da Agência com o digito(Ex: 1234-5): ");
        //TODO: "Obter pela Scanner os valores digitados no terminal"
        agencia = sc.nextLine();

        System.out.print("Agora, digite o número escolhido para a sua conta: ");
        //TODO: "Obter pela Scanner os valores digitados no terminal"
        numero = sc.nextInt();

        System.out.print("Digite o valor para o seu primeiro depósito: ");
        //TODO: "Obter pela Scanner os valores digitados no terminal"
        saldo = sc.nextDouble();

        //TODO: "Exibir a mensagem conta criada"
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
