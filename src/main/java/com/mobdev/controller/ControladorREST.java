package com.mobdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mobdev.entity.Character;
import com.mobdev.service.CharacterService;
import com.mobdev.service.CharacterServiceImpl;

@RestController
public class ControladorREST {
	@Autowired
	private CharacterService characterService;

	@GetMapping("/{id}")
	public Character getCharacter(@PathVariable("id") long id) {
		Character character = new Character();
		character = characterService.getCharacter(id);
		return character;
	}
}