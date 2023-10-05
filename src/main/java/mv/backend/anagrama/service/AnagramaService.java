package mv.backend.anagrama.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class AnagramaService {
    public static boolean areAnagrams(String word1, String word2) {
        // Removendo espaços em branco e convertendo as palavras para letras minúsculas
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        // Verificando se as palavras têm o mesmo comprimento
        if (word1.length() != word2.length()) {
            return false;
        }

        // Convertendo as palavras para arrays de caracteres e ordenando-os
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Comparando os arrays ordenados para verificar se são iguais
        return Arrays.equals(charArray1, charArray2);
    }
}





