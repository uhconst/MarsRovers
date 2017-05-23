package com.uhc.service;

import org.springframework.stereotype.Service;

import com.uhc.model.Rover;

@Service
public class RoverService {
	public void calcular(Rover rover) {
		
		String[] xyUpperRightCoord = rover.getUpperRightCoord().split("\\s+");
		
		String[] xylRoverPosition = rover.getRoverPosition().split("\\s+");
		
		String[] roverMovements = rover.getRoverMovements().split("");
		
        /*
         * Percorrer o array de movimentos
         */          
        for (String moveLetter : roverMovements) {
            System.out.print("\nLetra: " + moveLetter);
        }
	}
}
