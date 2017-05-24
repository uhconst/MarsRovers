package com.uhc.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.uhc.model.Rover;

public class RoverServiceTest {

	private RoverService roverService;
	
	@Before
	public void setUp(){
		this.roverService = new RoverService();
	}

	/*
	 * Teste para verificar se as cordenadas finais do Rover estão corretas
	 */
	@Test
	public void deveCalcularCoordenadaFinalDoRover() throws Exception {
		Rover rover = new Rover();
		
		/*
		 * Coordenadas e heading que serão esperados na saida
		 */
		Integer testX = 1;
		Integer testY = 3;
		String testH = "N";
		
		/*
		 * Coordenadas, heading e movimentos de entrada
		 */
		rover.setRoverPosition("1 2 N");
		rover.setRoverMovements("LMLMLMLMM");
		
		Rover roverFinalPosition = roverService.calcular(rover);
		
		assertEquals(testX, roverFinalPosition.getxRoverFinalCoord());
		assertEquals(testY, roverFinalPosition.getyRoverFinalCoord());
		assertEquals(testH, roverFinalPosition.gethRoverFinalCoord());
	}
}
