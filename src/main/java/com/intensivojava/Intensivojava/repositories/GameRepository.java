package com.intensivojava.Intensivojava.repositories;

import com.intensivojava.Intensivojava.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
