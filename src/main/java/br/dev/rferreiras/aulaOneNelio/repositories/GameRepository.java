package br.dev.rferreiras.aulaOneNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.rferreiras.aulaOneNelio.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
