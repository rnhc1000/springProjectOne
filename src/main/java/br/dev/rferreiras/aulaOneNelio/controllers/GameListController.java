package br.dev.rferreiras.aulaOneNelio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.rferreiras.aulaOneNelio.dto.GameListDTO;
import br.dev.rferreiras.aulaOneNelio.dto.GameMinDTO;
import br.dev.rferreiras.aulaOneNelio.services.GameListService;
import br.dev.rferreiras.aulaOneNelio.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {	
		List<GameListDTO> result = gameListService.findAll();
		return result;	
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {	
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;	
	}
	
	
	

}
