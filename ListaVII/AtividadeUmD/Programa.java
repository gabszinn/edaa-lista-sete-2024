import java.util.Stack;

public class Programa {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(5);
        pilha.push(2);
        pilha.push(9);
        pilha.push(1);
        pilha.push(7);

        EstatisticasPilha.calcularEstatisticas(pilha);
    }
}
