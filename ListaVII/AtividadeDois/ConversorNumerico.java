import java.util.Scanner;

public class ConversorNumerico {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Digite o número decimal a ser convertido: ");
int numeroDecimal = scanner.nextInt();

boolean opcaoValida = false;
    while (!opcaoValida) {
        try {
    System.out.println("Escolha a conversão:");
    System.out.println("(a) Decimal para Binário");
    System.out.println("(b) Decimal para Octal");
    System.out.println("(c) Decimal para Hexadecimal");
    System.out.print("Opção: ");
        char opcao = scanner.next().charAt(0);
            String resultado = "";
            switch (opcao) {
                case 'a':
                resultado = Conversor.decimalParaBase(numeroDecimal, 2);
                    opcaoValida = true;
                    break;
                case 'b':
                resultado = Conversor.decimalParaBase(numeroDecimal, 8);
                    opcaoValida = true;
                    break;
                case 'c':
                resultado = Conversor.decimalParaBase(numeroDecimal, 16);
                    opcaoValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
    }

        if (opcaoValida) {
            System.out.println("Resultado da conversão: " + resultado);
    }
        } catch (Exception erro) {
        System.out.println("Erro ao processar a opção. Tente novamente.");
            scanner.next();
            }
        }
    scanner.close();
    }
}

