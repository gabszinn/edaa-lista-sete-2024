import java.util.Stack;

public class VerificadorPalindromo {
    public static boolean ehPalindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            pilha.push(palavra.charAt(i));
    }
        for (int i = (comprimento + 1) / 2; i < comprimento; i++) {
            if (palavra.charAt(i) != pilha.pop()) {
                return false;
        }
}
        return true;
    }
}

