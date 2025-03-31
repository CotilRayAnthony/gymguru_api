package com.pnsa.gymguru.repository;

import com.pnsa.gymguru.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio, Integer> {
}
