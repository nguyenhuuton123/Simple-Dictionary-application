// /src/main/java/com/example/dictionary/controller/DictionaryController.java
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    private String[] words = {"hello", "world", "spring", "mvc"};
    private String[] meanings = {"xin chào", "thế giới", "mùa xuân", "mô hình xử lý yêu cầu"};

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/lookup")
    public String lookup(@RequestParam String word, Model model) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                model.addAttribute("meaning", meanings[i]);
                return "result";
            }
        }
        model.addAttribute("error", "Không tìm thấy từ trong từ điển.");
        return "error";
    }
}
