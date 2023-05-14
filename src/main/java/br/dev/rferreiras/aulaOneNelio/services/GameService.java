package br.dev.rferreiras.aulaOneNelio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.rferreiras.aulaOneNelio.dto.GameDTO;
import br.dev.rferreiras.aulaOneNelio.dto.GameMinDTO;
import br.dev.rferreiras.aulaOneNelio.entities.Game;
import br.dev.rferreiras.aulaOneNelio.projections.GameMinProjection;
import br.dev.rferreiras.aulaOneNelio.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	//ACID
	@Transactional(readOnly=true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;	
	}
	
	@Transactional(readOnly=true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto =result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
	@Transactional(readOnly=true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	
	
//	public List<GameMinDTO> findAll() {
//		List<GameMinDTO> dto = gameRepository.findALL().stream().map(x -> new GameMinDTO(x)).toList();
//		return dto;
//	}

}
