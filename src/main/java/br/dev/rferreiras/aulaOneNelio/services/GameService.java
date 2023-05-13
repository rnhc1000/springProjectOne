package br.dev.rferreiras.aulaOneNelio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.rferreiras.aulaOneNelio.dto.GameMinDTO;
import br.dev.rferreiras.aulaOneNelio.entities.Game;
import br.dev.rferreiras.aulaOneNelio.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto =result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
//	public List<GameMinDTO> findAll() {
//		List<GameMinDTO> dto = gameRepository.findALL().stream().map(x -> new GameMinDTO(x)).toList();
//		return dto;
//	}

}
