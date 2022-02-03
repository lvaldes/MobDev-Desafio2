package com.mobdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mobdev.entity.Character;
import com.mobdev.entity.Origin;

@Service
public class CharacterServiceImpl implements CharacterService {

	@Autowired
	private RestTemplate restTemplate;

	public Character getCharacter(long id) {
		Origin origin = null;
		Character character = restTemplate.getForObject("https://rickandmortyapi.com/api/character/" + id,
				Character.class);
		character.setEpisode_count(character.getEpisode().size());

		if (!character.getOrigin().getUrl().equals("")) {
			origin = restTemplate.getForObject(character.getOrigin().getUrl(), Origin.class);
			character.getOrigin().setDimension(origin.getDimension());
			character.getOrigin().setResidents(origin.getResidents());

		}

		return character;

	}

	public CharacterServiceImpl() {
		super();
	}

}
