package com.mobdev;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.mobdev.entity.Character;
import com.mobdev.entity.Origin;
import com.mobdev.service.CharacterServiceImpl;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MobDevRestApplication {

	private static final Logger log = LoggerFactory.getLogger(MobDevRestApplication.class);
	@Autowired
	private CharacterServiceImpl characterService;

	public static void main(String[] args) {
		SpringApplication.run(MobDevRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		return args -> {
			Character character = new Character();
			character = characterService.getCharacter(1);

			/*
			 * Character character =
			 * restTemplate.getForObject("https://rickandmortyapi.com/api/character/1",
			 * Character.class);
			 * System.out.println("https://rickandmortyapi.com/api/character/1");
			 * System.out.println(character.toString()); String[] datos =
			 * character.getOrigin().getUrl().split("/");
			 * System.out.println(character.getOrigin().getUrl());
			 * 
			 * System.out.println(datos[datos.length - 1]); Origin origin =
			 * restTemplate.getForObject(character.getOrigin().getUrl(), Origin.class);
			 * 
			 * System.out.println(origin.toString());
			 */
		};
	}

}
