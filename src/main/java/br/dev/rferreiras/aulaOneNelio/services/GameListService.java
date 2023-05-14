package br.dev.rferreiras.aulaOneNelio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.rferreiras.aulaOneNelio.dto.GameListDTO;
import br.dev.rferreiras.aulaOneNelio.entities.GameList;
import br.dev.rferreiras.aulaOneNelio.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly=true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
	
//	public List<GameMinDTO> findAll() {
//		List<GameMinDTO> dto = gameRepository.findALL().stream().map(x -> new GameMinDTO(x)).toList();
//		return dto;
//	}

}
