package org.example.helpfullinkstostudycoding.repository;

import org.example.helpfullinkstostudycoding.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface URLRepository extends JpaRepository<URL,Long> {
    @Query(nativeQuery = true, value = "Select * from urls where url=:url")
    Optional<URL> findByUrl(String url);
}
