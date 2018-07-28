package com.riki.core.officer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OfficerRepository extends JpaRepository<Officer, UUID> {
}
