import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha um Exercício:"); //println(): Exibe conteúdo com quebra de linha (diferente de print)
        Scanner scanner = new Scanner(System.in);
        int opcao_desej = scanner.nextInt();

       switch (opcao_desej) {
            case 0:
                exercicio0();
                break;
            case 1:
                exercicio1();
                break;
            case 2:
                exercicio2();
                break;
            case 3:
                exercicio3();
                break;
            case 4:
                exercicio4();
                break;
            case 5:
                exercicio5();
                break;
            case 6:
                exercicio6();
                break;
            case 7:
                exercicio7();
                break;
            case 8:
                exercicio8();
                break;
            case 9:
                exercicio9();
                break;
            case 10:
                exercicio10();
                break;
            case 11:
                exercicio11();
                break;
            case 12:
                exercicio12();
                break;
            case 13:
                exercicio13();
                break;
            case 14:
                exercicio14();
                break;
            case 15:
                exercicio15();
                break;
            case 16:
                exercicio16();
                break;
            case 17:
                exercicio17();
                break;
            case 18:
                exercicio18();
                break;
            case 19:
                exercicio19();
                break;
            case 20:
                exercicio20();
                break;
            case 21:
                exercicio21();
                break;
            case 22:
                exercicio22();
                break;
            case 23:
                exercicio23();
                break;
            case 24:
                exercicio24();
                break;
            case 25:
                exercicio25();
                break;
        }
        scanner.close();
    }

    public static void exercicio0(){
        System.out.println("Hello, World!");
        String nome = "Exemplo";
        int idade;
        Scanner entrada = new Scanner(System.in); //Scanner(System.in) - Scanner: Como um "prompt" em Javascript para a Entrada de Dados!
        //System: Comunicação com o Sistema Operacional; Como se o Chamássemos! in: Entrada; Algo Aqui Pode ser Inserido; Digitado!
        //Em Suma... Um "var nome = prompt();" em Javascript :`D
        //NullPointerException - Significa que o JAVA Não Entendeu o que Queremos Dizer!
        //Scanner: Uma Porta Aberta; Uma Conversa Constante com Nosso Sistema Operacional

        System.out.println("Qual o seu nome?");
        nome = entrada.next(); //Altamente Tipado! Captura a Próxima String (Texto) Digitada!
        System.out.println("Seu nome é " + nome);

        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();
        System.out.println("Sua idade é " + idade);

        entrada.close();
    }

    public static void exercicio1() {
        //1 - Baby Steps
        //Escreva um programa em Java e crie uma variável chamada "Planeta" e atribua-a um valor "Plutão".
        //Exiba o valor para o usuário.
        String planeta = "Plutão";
        System.out.println(planeta);
    }

     public static void exercicio2() {
        //2 - Hello Clarice
        //Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = entrada.next();
        
        System.out.println("Olá, " + nome + "!");
        entrada.close();
    }

    public static void exercicio3() {
        //3 - A Bit of Information
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = entrada.next();
        
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt(); // nextInt() para números inteiros
        
        System.out.println("Olá, " + nome + ", sua idade é " + idade + "!");
        entrada.close();
    }

    public static void exercicio4() {
        //4 - A Bit of Geometry
        //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os arquivos no GitHub. Link do repositório abaixo.
        
        //Áreas de Figuras Planas
        
        //Retângulo: A = base . altura
        //Quadrado: A = lado . lado = lado²
        //Losango: A = diagonal maior . diagonal menor / 2
        //Trapézio: A = (base maior + base menor) . h / 2
        //Paralelogramo: A = base . altura
        //Triângulo: A = base . altura / 2
        //Círculo: A = π . r²
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha uma Figura Geométrica:");
        System.out.println("1 - Retângulo\n2 - Quadrado\n3 - Losango\n4 - Trapézio\n5 - Paralelogramo\n6 - Triângulo\n7 - Círculo");
        int opcao = entrada.nextInt();
        
        switch(opcao) {
            case 1: // Retângulo
                System.out.println("Informe-nos a Base de seu Retângulo:");
                double base = entrada.nextDouble();  //double: Tipo de dado para números decimais de precisão dupla
                System.out.println("Agora, Informe-nos a Altura de seu Retângulo:");
                double altura = entrada.nextDouble();
                System.out.println("A Área de seu Retângulo Equivale A: " + (base * altura) + " cm²!");
                break;
            case 2: // Quadrado
                System.out.println("Informe-nos Sobre o Primeiro Lado de seu Quadrado:");
                double lado1 = entrada.nextDouble();
                System.out.println("Agora, Informe-nos Sobre o Segundo Lado de seu Quadrado:");
                double lado2 = entrada.nextDouble();
                System.out.println("A Área de seu Quadrado Equivale A:" + (lado1 * lado2) + " cm²!");
                break;
            case 3: // Losango
                System.out.println("Informe-nos Sobre a Maior Diagonal de seu Losango:")
                double diag_maior = entrada.nextDouble();
                System.out.println("Agora, Informe-nos Sobre a Menor Diagonal de seu Losango:");
                double diag_menor = entrada.nextDouble();
                System.out.println("A Área de seu Losango Equivale A: " + ((diag_maior * diag_menor)/2) + " cm²!");  
                break;
            case 4: // Trapézio
                System.out.println("Informe-nos Sobre a Maior Base de seu Trapézio:")
                double base_maior = entrada.nextDouble();
                System.out.println("Agora, Informe-nos Sobre a Menor Base de seu Trapézio:");
                double base_menor = entrada.nextDouble();
                System.out.println("E, Por Fim, Informe-nos Sobre a Altura de seu Trapézio:");
                double altura = entrada.nextDouble();
                System.out.println("A Área de seu Trapézio Equivale A: " + ((base_maior + base_menor) * altura/2) + " cm²!");
                break;
            case 5: // Paralelogramo
                System.out.println("Informe-nos a Base de seu Paralelogramo:")
                double base = entrada.nextDouble();
                System.out.println("Agora, Informe-nos a Altura de seu Paralelogramo");
                double altura = entrada.nextDouble();
                System.out.println("A Área de seu Paralelogramo Equivale A: " + (base * altura) + " cm²!");
                break;
            case 6: // Triângulo
                System.out.println("Informe-nos a Base de seu Triângulo:")
                double base = entrada.nextDouble();
                System.out.println("Agora, Informe-nos a Altura de seu Triângulo");
                double altura = entrada.nextDouble();
                System.out.println("A Área de seu Triângulo Equivale A: " + ((base * altura)/2) + " cm²!");
                break;
            case 7: // Círculo
                System.out.println("Basta nos Informar o Raio do Mesmo! Qual É o Raio de Seu Círculo?")
                double raio = entrada.nextDouble();
                System.out.println("A Área de seu Círculo Equivale A: " + (Math.PI * (raio * raio)) + " cm²!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        entrada.close();
    }

    public static void exercicio5() {
        //5 - 1, 2 e 3
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        double numero = entrada.nextDouble();
        
        if(numero > 0) {
            System.out.println("Positivo");
        } else if(numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Neutro");
        }
        entrada.close();
    }

    public static void exercicio6() {
        //6 - Qual o maior?
        //Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 3 valores diferentes:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        
        double maior = a;
        if(b > maior) maior = b;
        if(c > maior) maior = c;
        
        System.out.println("O maior valor é: " + maior);
        entrada.close();
    }

    public static void exercicio6_1() {
        //6.1 - Qual o maior? (4 vezes pior)
        //Faça um programa para ler 4 valores (considere que não serão informados valores iguais) e escrever o maior deles.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 4 valores diferentes:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        
        double maior = a;
        if(b > maior) maior = b;
        if(c > maior) maior = c;
        if(d > maior) maior = d;
        
        System.out.println("O maior valor é: " + maior);
        entrada.close();
    }

    public static void exercicio7() {
        //7 - Qual o quê?
        //Faça um programa que leia 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 3 valores diferentes:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        
        // Encontrar o menor para excluir
        double menor = a;
        if(b < menor) menor = b;
        if(c < menor) menor = c;
        
        double soma = (a + b + c) - menor;
        System.out.println("Soma dos dois maiores: " + soma);
        entrada.close();
    }

    public static void exercicio7_1() {
        //7.1 - 5 vezes?
        //Faça um programa que leia 5 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
        //Repita contigo
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 5 valores diferentes:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        
        //Encontrar o menor para excluir
        double menor = a;
        if(b < menor) menor = b;
        if(c < menor) menor = c;
        if(d < menor) menor = d;
        if(e < menor) menor = e;
        
        double soma = (a + b + c + d + e) - menor;
        System.out.println("Soma dos dois maiores: " + soma);
        entrada.close();
    }
    
    public static void exercicio8() {
        //8 - Enquanto isso
        //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        double a = entrada.nextDouble();
        
        double b;
        do {
            System.out.println("Digite o segundo valor (deve ser positivo):");
            b = entrada.nextDouble();
        } while(b <= 0);
        
        System.out.println("Resultado da divisão: " + (a / b));
        entrada.close();
    }

    public static void exercicio9() {
        //9 - Cansar de Digitar
        //Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
        Scanner entrada = new Scanner(System.in);
        double[] valores = new double[10]; //double[]: Array de números decimais (double) com tamanho fixo (10 posições)
        double soma = 0.0;

        System.out.println("Digite 10 valores:");
        for(int i = 0; i < 10; i++) { //for: Estrutura de repetição com contador (inicialização; condição; incremento)
        valores[i] = entrada.nextDouble(); //nextDouble(): Lê um número decimal da entrada
        soma += valores[i]; //+=: Operador de atribuição com adição (equivalente a soma = soma + valores[i])
    }

        System.out.println("Números informados:");
        for(double num : valores) { //for-each: Percorre todos os elementos do array sem necessidade de índice
        System.out.print(num + " "); //print(): Exibe conteúdo sem quebra de linha (diferente de println)
    }

        System.out.println("\nMédia: " + (soma / 10));
        entrada.close();
    }

    public static void exercicio10() {
        //10 - Parabéns
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas). 
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[4]; //Array para armazenar as 4 notas
        double somaNotas = 0.0;

        System.out.println("Digite as 4 notas do semestre:");
        for(int i = 0; i < notas.length; i++) { //length: Propriedade do array que retorna seu tamanho
        System.out.print("Nota " + (i+1) + ": "); //Concatenação de string com número (i+1)
        notas[i] = entrada.nextDouble();
        somaNotas += notas[i];
    }

        double media = somaNotas / notas.length;
        System.out.printf("Média: %.2f\n", media); //%.2f = 2 casas decimais após uma "," ou ".")

        if(media >= 6.0) {
        System.out.println("Parabéns, Você Foi Aprovado!~");
        } else {
        System.out.println("Que Pena, Você Não Foi Aprovado... Mas Não Desanime! Sempre se Pode Tentar Novamente!~");
        }
        entrada.close();
    }

    public static void exercicio11() {
        //11 - BOOOOMMM
        //Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".
        System.out.println("Contagem regressiva:");
        for(int i = 30; i >= 0; i--) { // i--: Decremento (equivalente a i = i - 1)
        System.out.println(i);
        try {
            Thread.sleep(1000); //Thread.sleep(): Pausa a execução por 1000 milissegundos (1 segundo)
        } catch (InterruptedException e) { //try-catch: Tratamento de exceções
            e.printStackTrace(); //printStackTrace(): Imprime detalhes do erro ocorrido
        }
    }
    System.out.println("EXPLOSÃO!!! 💥💥💥");
    }

    public static void exercicio12() {
        //12 - 10, 9, 8...
        //Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em ordem decrescente.
        System.out.println("Contagem decrescente:");
        int i = 10;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void exercicio13() {
        //13 - De quanto até quanto?
        //Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números inteiros (o primeiro menor que o segundo):");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
    
        if(num1 >= num2) {
            System.out.println("Erro: O primeiro número deve ser menor que o segundo!");
            return;
        }

        int soma = 0;
        int contador = 0;
        System.out.println("Números no intervalo:");
        for(int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
            soma += i;
            contador++;
        }

        double media = (double) soma / contador; // (double): Casting - conversão explícita de tipo
        System.out.printf("\nMédia: %.2f\n", media);
        entrada.close();
    }

    public static void exercicio14() {
        //14 - Passou no Teste?
        //Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.   
        Scanner entrada = new Scanner(System.in);
        int aprovados = 0;
        char resposta; //char: Tipo para caracteres individuais (ex: 'S', 'N')
    
        do { //do-while: Executa o bloco pelo menos uma vez antes de verificar a condição
            double somaNotas = 0.0;
            System.out.println("Digite as 6 notas do aluno:");
        
            for(int i = 0; i < 6; i++) {
                System.out.print("Nota " + (i+1) + ": ");
                somaNotas += entrada.nextDouble();
            }
        
            double media = somaNotas / 6;
            System.out.printf("Média: %.2f - ", media);
        
            if(media >= 6.5) {
                System.out.println("Aprovado");
                aprovados++;
            } else {
                System.out.println("Reprovado");
            }
        
            System.out.print("Calcular a média de outro aluno (S/N)? ");
            resposta = entrada.next().charAt(0); //charAt(0): Pega o primeiro caractere da string
        
        } while(resposta == 'S' || resposta == 's');
    
        System.out.println("Total de aprovados: " + aprovados);
        entrada.close();
    }

    public static void exercicio15() {
        //15 - Uma Brincadeira Sobre Alturas
        //Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
        //Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.
        double alturaAnacleto = 1.50; //Altura em metros
        double alturaFelisberto = 1.10;
        int anos = 0;
    
        while(alturaFelisberto <= alturaAnacleto) { //Enquanto Felisberto não for mais alto
            alturaAnacleto += 0.02; //2 cm = 0.02 m
            alturaFelisberto += 0.03; //3 cm = 0.03 m
            anos++;
        }
    
        System.out.println("Serão necessários " + anos + " anos para Felisberto ser mais alto que Anacleto");
        System.out.printf("Altura final - Anacleto: %.2fm, Felisberto: %.2fm", alturaAnacleto, alturaFelisberto);
    }

    public static void exercicio16() {
        //16 - O Voto é secreto
        //Escreva um programa para ler: 
           //• o número total de eleitores de um município.
        //Agora o programa deve receber a quantindade (percentual):
           //• o número de votos brancos;
           //• o número de votos válidos;
           //• o número de votos nulos. 
        //Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao total de eleitores. 
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Número total de eleitores:");
        int totalEleitores = entrada.nextInt();
    
        System.out.println("Votos brancos (número absoluto):");
        int brancos = entrada.nextInt();
    
        System.out.println("Votos nulos (número absoluto):");
        int nulos = entrada.nextInt();
    
        System.out.println("Votos válidos (número absoluto):");
        int validos = entrada.nextInt();
    
        //Verificação de Consistência dos Dados
        if((brancos + nulos + validos) > totalEleitores) {
            System.out.println("Erro: A soma dos votos excede o total de eleitores!");
            return;
        }
    
        //Cálculos Percentuais
        double percBrancos = (brancos * 100.0) / totalEleitores;
        double percNulos = (nulos * 100.0) / totalEleitores;
        double percValidos = (validos * 100.0) / totalEleitores;
    
        System.out.println("\nResultado:");
        System.out.printf("Brancos: %.2f%%\n", percBrancos);
        System.out.printf("Nulos: %.2f%%\n", percNulos);
        System.out.printf("Válidos: %.2f%%\n", percValidos);
        entrada.close();
    }

    public static void exercicio17() {
        //17 - Custa quanto?
        //O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
        //Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica, escreva um programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.  
        Scanner entrada = new Scanner(System.in);
        final double PERC_DISTRIBUIDOR = 0.28; //final: Constante (não pode ser alterada)
        final double PERC_IMPOSTOS = 0.45;
    
        System.out.println("Custo de fábrica do veículo:");
        double custoFabrica = entrada.nextDouble();
    
        //Cálculo dos Acréscimos
        double valorDistribuidor = custoFabrica * PERC_DISTRIBUIDOR;
        double valorImpostos = custoFabrica * PERC_IMPOSTOS;
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;
    
        System.out.println("\nDetalhamento:");
        System.out.printf("Custo fábrica: R$ %.2f\n", custoFabrica);
        System.out.printf("Taxa distribuidor (28%%): R$ %.2f\n", valorDistribuidor);
        System.out.printf("Impostos (45%%): R$ %.2f\n", valorImpostos);
        System.out.printf("Custo final ao consumidor: R$ %.2f\n", custoFinal);
        entrada.close();
    }

    public static void exercicio18() {
        //18 - A pagar
        //Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários vendedores. O algoritmo deve receber como entrada o número de carros vendidos, o valor total das vendas, o salário fixo mensal do vendedor e a comissão fixa por carro vendido.
        //O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5% do valor total das vendas realizadas pelo vendedor.
        //Considere que o salário inicial é de R$ 5.000,00.
        //O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.
        Scanner entrada = new Scanner(System.in);
        final double SALARIO_BASE = 5000.00;
        final double PERC_COMISSAO = 0.05;
    
        System.out.println("Número de carros vendidos:");
        int numCarros = entrada.nextInt();
    
        System.out.println("Valor total das vendas:");
        double totalVendas = entrada.nextDouble();
    
        System.out.println("Comissão fixa por carro:");
        double comissaoFixa = entrada.nextDouble();
    
        //Cálculo do Salário
        double comissaoVariavel = totalVendas * PERC_COMISSAO;
        double salarioFinal = SALARIO_BASE + (numCarros * comissaoFixa) + comissaoVariavel;
    
        System.out.println("\nDemonstrativo de Pagamento:");
        System.out.printf("Salário base: R$ %.2f\n", SALARIO_BASE);
        System.out.printf("Comissão fixa (%d carros): R$ %.2f\n", numCarros, (numCarros * comissaoFixa));
        System.out.printf("Comissão variável (5%% das vendas): R$ %.2f\n", comissaoVariavel);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);
        entrada.close();
    }

    public static void exercicio19() {
        //19 - É o quê?
        //Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
        //Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite as 3 medidas dos lados do triângulo:");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
    
        //Verificando a Condição da Existência do Triângulo
        boolean ehTriangulo = (a < b + c) && (b < a + c) && (c < a + b);
    
        if(ehTriangulo) {
            System.out.println("Forma um triângulo!");
        
            //Determinando o Tipo de Triângulo
            if(a == b && b == c) {
                System.out.println("Triângulo equilátero");
            } else if(a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo!");
        }
        entrada.close();
    }

    public static void exercicio20() {
        //20 - CPF na nota?
        //Faça um programa para ler:
            //O nome do produto, 
            //A quantidade adquirida do produto,
            //O preço unitário do produto. 
        //Agora o programa deve calcular e escrever:
            //O valor da venda (valor da venda = quantidade adquirida * preço unitário), 
            //O percentual de desconto,
            //O valor fixo de imposto que é 20%.
            //O total a pagar (total a pagar = valor da venda - desconto).
        //Sabendo-se que: 
            //Se quantidade <= 5 o desconto será de 2%
            //-
            //Se quantidade > 5 e quantidade <=10 o desconto será de 3%
            //-
            //Se quantidade > 10 o desconto será de 5%   
        //No fim, escreva um recibo que detalhe a compra como uma nota fiscal. 
        Scanner entrada = new Scanner(System.in);
        final double IMPOSTO = 0.20;
    
        System.out.println("Nome do produto:");
        String nomeProduto = entrada.nextLine(); //nextLine(): Lê toda a linha (incluindo espaços)
    
        System.out.println("Quantidade adquirida:");
        int quantidade = entrada.nextInt();
    
        System.out.println("Preço unitário:");
        double precoUnitario = entrada.nextDouble();
    
        //Cálculos
        double valorVenda = quantidade * precoUnitario;
    
        //Determinando Descontos com Switch-Case
        double desconto;
        if(quantidade <= 5) {
            desconto = 0.02;
        } else if(quantidade <= 10) {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }
    
        double valorDesconto = valorVenda * desconto;
        double valorImposto = valorVenda * IMPOSTO;
        double totalPagar = valorVenda - valorDesconto + valorImposto;
    
        //Emitindo Notas Fiscais
        System.out.println("\n--- NOTA FISCAL ---");
        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Quantidade: %d × R$ %.2f\n", quantidade, precoUnitario);
        System.out.printf("Subtotal: R$ %.2f\n", valorVenda);
        System.out.printf("Desconto (%.0f%%): -R$ %.2f\n", (desconto * 100), valorDesconto);
        System.out.printf("Imposto (20%%): +R$ %.2f\n", valorImposto);
        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", totalPagar);
        entrada.close();
    }

    public static void exercicio21() {
        //21 - Descanso merecido
        //Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um dos seguintes requisitos deve ser satisfeito: 
        // - Ter no mínimo 65 anos de idade. 
        // - Ter trabalhado no mínimo 30 anos. 
        // - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos. 
        //Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
        Scanner entrada = new Scanner(System.in);
        final int ANO_ATUAL = java.time.Year.now().getValue(); //Obtém o ano atual do sistema
    
        System.out.println("Código do empregado:");
        int codigo = entrada.nextInt();
    
        System.out.println("Ano de nascimento:");
        int anoNasc = entrada.nextInt();
    
        System.out.println("Ano de ingresso na empresa:");
        int anoIngresso = entrada.nextInt();
    
        //Cálculos
        int idade = ANO_ATUAL - anoNasc;
        int tempoTrabalho = ANO_ATUAL - anoIngresso;
    
        System.out.println("\nDados do empregado " + codigo + ":");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
    
        //Verificando as Condições para a Aposentadoria
        boolean podeAposentar = (idade >= 65) || (tempoTrabalho >= 30) || (idade >= 60 && tempoTrabalho >= 25);
    
        System.out.println(podeAposentar ? 
                     "Requerer aposentadoria" : //Operador ternário (condição ? valor_se_verdadeiro : valor_se_falso)
                     "Não requerer");
        entrada.close();
    }

    public static void exercicio22() {
        //22 - Conta comigo
        //Escreva um algoritmo que imprima as seguintes seqüências de números: 

            //• (1, 1 2 3 4 5 6 7 8 9 10) 
            //• (2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20) 
            //• (3, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)

        //E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20.
        int numero = 1;
        int contador = 1;
    
        while(numero <= 20) {
            System.out.print("(" + numero + ", ");
        
            for(int i = 0; i < 10; i++) {
                System.out.print(contador);
                if(i < 9) System.out.print(" ");
                contador++;
            }
        
            System.out.println(")");
            numero++;
        }
    }

    public static void exercicio23() {
        //23 - Não Conta comigo
        //Escreva um algoritmo que imprima as seguintes seqüências de números: 

            //• (1, 1 2 3 4 5 6 7 8 9 10) 
            //• (2, 1 2 3 4 5 6 7 8 9 10) 
            //• (3, 1 2 3 4 5 6 7 8 9 10) 

        //E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20. 
        for(int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");
        
            for(int j = 1; j <= 10; j++) { // Loop aninhado
                System.out.print(j);
                if(j < 10) System.out.print(" ");
            }
        
            System.out.println(")");
        }
    }

    public static void exercicio24() {
        //24 - Jornada de trabalho
        //A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        //Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
        Scanner entrada = new Scanner(System.in);
        final int HORAS_SEMANAIS = 40;
        final int SEMANAS_MES = 4;
    
        System.out.println("Horas trabalhadas no mês:");
        double horasTrabalhadas = entrada.nextDouble();
    
        System.out.println("Salário por hora:");
        double salarioHora = entrada.nextDouble();
    
        double salarioTotal;
        if(horasTrabalhadas <= (HORAS_SEMANAIS * SEMANAS_MES)) {
            salarioTotal = horasTrabalhadas * salarioHora;
        } else {
            double horasExtras = horasTrabalhadas - (HORAS_SEMANAIS * SEMANAS_MES);
            double valorHoraExtra = salarioHora * 1.5; //Acréscimo de 50%
            salarioTotal = (HORAS_SEMANAIS * SEMANAS_MES * salarioHora) + (horasExtras * valorHoraExtra);
        }
    
        System.out.printf("Salário total: R$ %.2f\n", salarioTotal);
        entrada.close();
    }

    public static void exercicio25() {
        //25 - Invertendo tudo
        //Escreva um programa que para ler doze números informados pelo usuário e que serão armazenados em um vetor/array. 

        //No fim o programa deve dar duas saídas:  
        //1) o programa deve processar os dados invertendo a posição dos elementos trocando o primeiro elemento com o último, o segundo com penúltimo etc.
        //2) o programa deve processar os dados invertendo a posição dos elementos trocando, mas separando os dados por tipo. 

        //Exemplo: 
        //Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
        //Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1 
        //Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B 
        Scanner entrada = new Scanner(System.in);
        Object[] valores = new Object[12]; // Object: Tipo genérico que aceita qualquer objeto
    
        System.out.println("Digite 12 valores (podem ser números ou textos):");
        for(int i = 0; i < valores.length; i++) {
            if(entrada.hasNextInt()) { //hasNextInt(): Verifica se a próxima entrada é um inteiro
                valores[i] = entrada.nextInt();
            } else {
                valores[i] = entrada.next(); //Armazena como String
            }
        }
    
        //Saída 1: Inversão Completa
        System.out.println("\nSaída 1 (Inversão completa):");
        for(int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
    
        //Saída 2: Separados por Tipo
        System.out.println("\n\nSaída 2 (Separados por tipo):");
    
        //Números
        for(int i = valores.length - 1; i >= 0; i--) {
            if(valores[i] instanceof Integer) { //instanceof: Operador que verifica o tipo do objeto
                System.out.print(valores[i] + " ");
            }
        }
    
        System.out.print("- ");
    
        //Textos
        for(int i = valores.length - 1; i >= 0; i--) {
            if(valores[i] instanceof String) {
                System.out.print(valores[i] + " ");
            }
        }
    
        entrada.close();
        
}
