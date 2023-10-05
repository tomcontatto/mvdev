package mv.backend.anagrama.tests;

import mv.backend.anagrama.service.AnagramaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class AnagramaTest {

    @Autowired
    private AnagramaService anagramaService;

    String word1 = "iracema";
    String word2 = "america";
    String word3 = "brasil";

    boolean resultado1 = anagramaService.areAnagrams(word1, word2);

    boolean resultado2 = anagramaService.areAnagrams(word1, word3);

    boolean resultado3 = anagramaService.areAnagrams(word2, word3);

    @Test
    public void testPrintMessage() {
        // sem erros
        assertEquals(resultado1, true);
        assertEquals(resultado2, false);
        // com erros
        assertEquals(resultado3, true);
    }
}
