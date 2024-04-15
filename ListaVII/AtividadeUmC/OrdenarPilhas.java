import java.util.Stack;

public class OrdenarPilhas {
    public static Stack<Integer> ordenarPilha(Stack<Integer> pilha) {
        Stack<Integer> pilhaOrdenada = new Stack<>();
        while (!pilha.isEmpty()) {
        int temp = pilha.pop();
        while (!pilhaOrdenada.isEmpty() && pilhaOrdenada.peek() > temp) {
            pilha.push(pilhaOrdenada.pop());
    }
            pilhaOrdenada.push(temp);
}

    return pilhaOrdenada;
}
}

