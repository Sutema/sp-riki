package com.riki.core.officer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OfficerServiceImpl implements OfficerService {
    @Autowired
    private OfficerRepository officerRepository;

    @Override
    public List<Officer> findAll() {
        return officerRepository.findAll();
    }

    @Override
    public Officer findById(UUID id) {
        Optional<Officer> officerOptional = officerRepository.findById(id);
        return officerOptional.orElse(null);
    }

    @Override
    public void save(Officer officer) {
        if(officer.getId() == null){
            officer.setId(UUID.randomUUID());
        }

        officerRepository.save(officer);
    }
}
