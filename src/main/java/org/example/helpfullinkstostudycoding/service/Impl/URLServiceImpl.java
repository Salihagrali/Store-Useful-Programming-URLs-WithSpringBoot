package org.example.helpfullinkstostudycoding.service.Impl;

import org.example.helpfullinkstostudycoding.model.URL;
import org.example.helpfullinkstostudycoding.repository.URLRepository;
import org.example.helpfullinkstostudycoding.service.URLService;
import org.springframework.stereotype.Service;

@Service
public class URLServiceImpl implements URLService {

    URLRepository urlRepository;

    public URLServiceImpl(URLRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Override
    public void addUrl(URL url) {
        urlRepository.save(url);
    }

    @Override
    public boolean searchUrl(URL url) {
        URL foundUrl = urlRepository.findByUrl(url.getUrl()).get();
        return foundUrl != null;
    }
}
