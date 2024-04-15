public class Programa {
    public static void main(String[] args) {
        String palavra1 = "tebet";
        String palavra2 = "daniel";
        System.out.println(palavra1 + " é palíndromo? " + VerificadorPalindromo.ehPalindromo(palavra1));
        System.out.println(palavra2 + " é palíndromo? " + VerificadorPalindromo.ehPalindromo(palavra2));
    }
}
