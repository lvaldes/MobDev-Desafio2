package com.mobdev.service;

import org.springframework.stereotype.Service;

import com.mobdev.entity.Character;

@Service
public interface CharacterService {
	Character getCharacter(long id);
}
