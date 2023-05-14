package br.dev.rferreiras.aulaOneNelio.dto;

import br.dev.rferreiras.aulaOneNelio.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	// BeanUtils.copyproperties...
	public GameListDTO(GameList entity) {
		
		id = entity.getId();
		name = entity.getName();
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
