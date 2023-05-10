package com.intensivojava.Intensivojava.repositories;

import com.intensivojava.Intensivojava.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
