package com.pnsa.gymguru.repository;

import com.pnsa.gymguru.model.PersonalTrainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalTrainerRepository extends JpaRepository<PersonalTrainer, Integer> {
}
