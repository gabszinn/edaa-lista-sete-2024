import java.util.Stack;

public class EstatisticasPilha {
    public static void calcularEstatisticas(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        int maior = pilha.peek();
        int menor = pilha.peek();
        int soma = 0;
    
        for (int numero : pilha) {
    if (numero > maior) {
            maior = numero;
    }
    if (numero < menor) {
            menor = numero;
    }
    soma += numero;
        }
        double media = (double) soma / pilha.size();

        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média aritmética: " + media);
    }
}

