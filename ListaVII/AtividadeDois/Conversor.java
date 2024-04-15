import java.util.Stack;

public class Conversor {
    public static String decimalParaBase(int numeroDecimal, int base) {
        Stack<Character> pilha = new Stack<>();
        while (numeroDecimal > 0) {
            int resto = numeroDecimal % base;
            char digito = (resto < 10) ? (char) (resto + '0') : (char) (resto - 10 + 'A'); // fiz essa condição ternária pro código não ficar muito grande
            pilha.push(digito);
            numeroDecimal /= base;
        }
        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }
        return resultado.toString();
    }
}


