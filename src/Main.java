import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha um exercício:");
        Scanner scanner = new Scanner(System.in);
        //pesquisar switch case ou if e else
        exercicio0(); //listar os exercícios aqui! fazer todos neste mesmo arquivo e chamá-los aqui, fazendo uma lista de funções!
        exercicio1();
    }

    public static void exercicio0(){
        System.out.println("Hello, World!");
        String nome = "Exemplo";
        int idade;
        Scanner entrada = new Scanner(System.in); //Scanner(System.in) - Scanner: Como um "prompt" em Javascript!
        //System: Comunicação com o Sistema Operacional; Como se o Chamássemos! in: Entrada; Algo Aqui Pode ser Inserido; Digitado!
        //Em Suma... Um "var nome = prompt();" em Javascript :`D
        //NullPointerException - Significa que o JAVA Não Entendeu o que Queremos Dizer!
        //Sxanner: Uma Porta Aberta; Uma Conversa Constante com Nosso Sistema Operacional

        System.out.println("Qual o seu nome?");
        nome = entrada.next(); //Altamente Tipado!
        System.out.println("Seu nome é " + nome);

        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();
        System.out.println("Sua idade é " + idade);

        entrada.close();
    }

    public static void exercicio1() {
        //1 - Baby Steps
        //Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão".
        //
        //Exiba o valor para o usuário.

        String planeta = "Plutão";
        System.out.println(planeta);
    }

}