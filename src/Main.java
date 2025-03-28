import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("---------MENU---------");
            System.out.println("| 1 - Adição          |");
            System.out.println("| 2 - Subtração       |");
            System.out.println("| 3 - Multiplicação   |");
            System.out.println("| 4 - Divisão         |");
            System.out.println("| 5 - Sair            |");
            System.out.println("----------------------");

            do {
                System.out.print("Escolha uma das opções: ");
                escolha = leitor.nextInt();
            } while (escolha < 1 || escolha > 5 );

            System.out.println();

            float num1, num2;

            switch (escolha) {
                case 1:
                    Adicao adi = new Adicao();
                    System.out.println("===========ADIÇÃO==========");
                    System.out.print  ("Informe o primeiro número: ");
                    num1 = leitor.nextFloat();
                    System.out.print("Informe o segundo número: ");
                    num2 = leitor.nextFloat();
                    adi.somar(num1, num2);
                    System.out.println("===========================");
                    break;

                case 2:
                    Subtracao sub = new Subtracao();
                    System.out.println("=========SUBTRAÇÃO=========");
                    System.out.print  ("Informe o primeiro número: ");
                    num1 = leitor.nextFloat();
                    System.out.print("Informe o segundo número: ");
                    num2 = leitor.nextFloat();
                    sub.subtrair(num1, num2);
                    System.out.println("===========================");
                    break;

                case 3:
                    Multiplicacao mult = new Multiplicacao();
                    System.out.println("=======MULTIPLICAÇÃO=======");
                    System.out.print  ("Informe o primeiro número: ");
                    num1 = leitor.nextFloat();
                    System.out.print("Informe o segundo número: ");
                    num2 = leitor.nextFloat();
                    mult.multiplicar(num1, num2);
                    System.out.println("===========================");
                    break;

                case 4:
                    Divisao divi = new Divisao();
                    System.out.println("=======DIVISÃO=======");
                    System.out.print  ("Informe o Dividendo: ");
                    num1 = leitor.nextFloat();
                    System.out.print("Informe o Divisor: ");
                    num2 = leitor.nextFloat();
                    divi.dividir(num1, num2);
                    System.out.println("=====================");
                    break;


                case 5:
                    System.out.println("Até mais...");
                    break;
            }

            System.out.println("Fazer outra conta?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");

            do {
                System.out.print("Escolha: ");
                escolha = leitor.nextInt();
            }while (escolha != 1 && escolha != 2);

            System.out.println();

        }while(escolha != 2); // repete menu

        System.out.println("Até mais...");
    }
}
