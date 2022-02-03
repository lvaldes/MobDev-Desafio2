package com.mobdev.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.mobdev.entity.Character;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CharacterServiceTest {
	@Autowired
	private CharacterService characterService;

	@Test
	public void testgetCharacter() {
		Character character = new Character();
		character = characterService.getCharacter(1);
		assertEquals(1, character.getId());
	}
}