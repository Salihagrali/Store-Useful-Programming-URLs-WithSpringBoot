package org.example.helpfullinkstostudycoding.repository;

import org.assertj.core.api.Assertions;
import org.example.helpfullinkstostudycoding.model.Language;
import org.example.helpfullinkstostudycoding.model.URL;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class URLRepositoryTest {

    @Autowired
    private URLRepository urlRepository;

    @Test
    public void URLRepository_SearchByUrl_ReturnSearchedOne() {
        URL url = URL.builder()
                .url("random.com")
                .updatedAt(LocalDateTime.now())
                .createdAt(LocalDateTime.now())
                .placeHolder("Spring")
                .build();

        urlRepository.save(url);

        Optional<URL> found = urlRepository.findByUrl(url.getUrl());

        Assertions.assertThat(found.isPresent()).isTrue();
        Assertions.assertThat(found.get().getUrl()).isEqualTo(url.getUrl());
    }

}
