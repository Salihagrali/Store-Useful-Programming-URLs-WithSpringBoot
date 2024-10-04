package org.example.helpfullinkstostudycoding.repository;

import org.example.helpfullinkstostudycoding.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesRepository extends JpaRepository<Language,Long> {
}
