package com.jin.MyDomitory.service;

import com.jin.MyDomitory.domain.Personal;
import com.jin.MyDomitory.dto.personal.AddPersonalScoreRequest;
import com.jin.MyDomitory.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonalService {
    @Autowired
    private final PersonalRepository personalRepository;

    public PersonalService(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    public Personal addPersonalScore(AddPersonalScoreRequest request){
        return personalRepository.save(request.toEntity());
    }
}