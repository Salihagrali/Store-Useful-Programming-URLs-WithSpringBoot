package org.example.helpfullinkstostudycoding.controller;

import org.example.helpfullinkstostudycoding.model.Language;
import org.example.helpfullinkstostudycoding.repository.LanguagesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class URLController {

    LanguagesRepository languagesRepository;
    public URLController(LanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    @GetMapping("/entity")
    public ResponseEntity<Language> entity() {
        return ResponseEntity.ok(languagesRepository.findById(3L).get());
    }
}
