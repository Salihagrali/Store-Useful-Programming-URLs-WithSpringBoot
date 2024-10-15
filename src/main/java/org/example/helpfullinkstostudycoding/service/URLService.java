package org.example.helpfullinkstostudycoding.service;

import org.example.helpfullinkstostudycoding.model.URL;
import org.springframework.stereotype.Service;

public interface URLService {
    void addUrl(URL url);
    boolean searchUrl(URL url);
}
