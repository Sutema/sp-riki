package com.riki.core.officer;

import java.util.List;
import java.util.UUID;

public interface OfficerService {
    List<Officer> findAll();
    Officer findById(UUID id);
    void save(Officer officer);
}
