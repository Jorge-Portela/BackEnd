package resevation.model.entities;

public class Test {
    import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Main {
        public static void main(String[] args) {
            String s = "Esta é uma frase de exemplo com 123 palavras válidas e 12! inválidas.";

            int numPalavrasValidas = countValidWords(s);
            System.out.println("Número de palavras válidas: " + numPalavrasValidas);
        }

        public static int countValidWords(String s) {
            int count = 0;

            // Definir padrão regex para caracteres alfanuméricos
            Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]{3,}\\b");
            Matcher matcher = pattern.matcher(s);

            // Iterar sobre as palavras na string
            while (matcher.find()) {
                String palavra = matcher.group();

                // Verificar se a palavra possui pelo menos uma vogal e uma consoante
                if (contarVogais(palavra) > 0 && contarConsoantes(palavra) > 0) {
                    count++;
                }
            }

            return count;
        }

        // Função para contar o número de vogais em uma palavra
        public static int contarVogais(String palavra) {
            int count = 0;
            for (char ch : palavra.toCharArray()) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    count++;
                }
            }
            return count;
        }

        // Função para contar o número de consoantes em uma palavra
        public static int contarConsoantes(String palavra) {
            int count = 0;
            for (char ch : palavra.toCharArray()) {
                if ("BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(ch) != -1) {
                    count++;
                }
            }
            return count;
        }
    }
}
