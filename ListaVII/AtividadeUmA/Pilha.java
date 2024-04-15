import java.util.Stack;

public class Pilha {
    public static String inverterPalavras(String texto) {
        String[] palavras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }
            resultado.append(" ");
        }

        return resultado.toString();
    }
}
