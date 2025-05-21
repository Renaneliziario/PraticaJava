package com.devsuperior.dslist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

// lembrete: classe para regras de negócio.

@Service
public class GameService {
	
		@Autowired
		private GameRepository gameRepository;
	
		public List<Game> findAll()  {
			var result = gameRepository.findAll();
			return result;		
	}	
}
