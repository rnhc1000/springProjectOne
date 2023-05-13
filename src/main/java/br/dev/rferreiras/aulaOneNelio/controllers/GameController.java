package br.dev.rferreiras.aulaOneNelio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.rferreiras.aulaOneNelio.dto.GameMinDTO;
import br.dev.rferreiras.aulaOneNelio.entities.Game;
import br.dev.rferreiras.aulaOneNelio.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired
	private GameService gameService;
	@GetMapping
	public List<GameMinDTO> findAll() {
		
		List<GameMinDTO> result = gameService.findAll();
		return result;
		
	}

}
