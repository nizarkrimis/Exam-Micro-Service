package com.example.cour;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourService {

    private final CourRepository repository;

    public void saveCour(Cour cour) {
        repository.save(cour);
    }

    public List<Cour> findAllSchools() {
        return repository.findAll();
    }



}
