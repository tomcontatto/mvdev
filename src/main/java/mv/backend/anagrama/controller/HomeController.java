package mv.backend.anagrama.controller;

import mv.backend.anagrama.service.AnagramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/anagramas")
public class HomeController {

    @Autowired
    private AnagramaService anagramaService;

    @GetMapping("/check")
    public boolean checkAnagramas(@RequestParam String word1, @RequestParam String word2) {
        return anagramaService.areAnagrams(word1, word2);
    }
}
