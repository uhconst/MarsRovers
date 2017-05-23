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
		 * Setando o X e Y final do Rover
		 */
		rover.setxRoverFinalCoord(Integer.parseInt(xylRoverPosition[0]));
		rover.setyRoverFinalCoord(Integer.parseInt(xylRoverPosition[1]));
		
		/*
		 * Setando a direção final que o Rover está.
		 * Usando graus pra ficar mais fácil os calculos
		 * Quando ele for se movimentar
		 */
		if(xylRoverPosition[2].equals("N")){
			rover.sethRoverFinalCoord(0);
		}
		
		else if(xylRoverPosition[2].equals("E")){
			rover.sethRoverFinalCoord(90);
		}
		
		else if(xylRoverPosition[2].equals("S")){
			rover.sethRoverFinalCoord(180);
		}
		
		else if(xylRoverPosition[2].equals("W")){
			rover.sethRoverFinalCoord(270);
		}
		
        /*
         * Percorrer o array de movimentos
         */          
        for (String moveLetter : roverMovements) {
            System.out.println("\nLetra: " + moveLetter);
            
            	
            	switch (moveLetter)
                {
                   case "M":
                   case "m":   if(rover.gethRoverFinalCoord()==0){
                	   				rover.setyRoverFinalCoord(rover.getyRoverFinalCoord()+1);
                   				}
			      				else if(rover.gethRoverFinalCoord()==90){
			      					rover.setxRoverFinalCoord(rover.getxRoverFinalCoord()+1);
			     				}
                   				else if(rover.gethRoverFinalCoord()==180){
			                	   rover.setyRoverFinalCoord(rover.getyRoverFinalCoord()-1);
			      				}
                   				else if(rover.gethRoverFinalCoord()==270){
			                	   rover.setxRoverFinalCoord(rover.getxRoverFinalCoord()-1);
			      				}
                               break;
                   case "L":
                   case "l":   rover.sethRoverFinalCoord(rover.gethRoverFinalCoord()-90);
                   			   /*
                   			    * Checando se ele não vai ficar negativo. Se ficar corrige o número
                   			    */
                   			   if(rover.gethRoverFinalCoord()==-90){
                   				   rover.sethRoverFinalCoord(270);
                   			   }
                               break;  
                   case "R":
                   case "r":   rover.sethRoverFinalCoord(rover.gethRoverFinalCoord()+90);
			       			   /*
			       			    * Checando se ele não vai dar uma volta inteira e virar 360.
			       			    * Se virar, zera.
			       			    */
			       			   if(rover.gethRoverFinalCoord()==360){
			       				   rover.sethRoverFinalCoord(0);
			       			   }
                               break;
                   
                   default: System.out.println("Invalid moviment.");
                }
            	
        }
        
        System.out.println("X Final: " + rover.getxRoverFinalCoord());
        System.out.println("Y Final: " + rover.getyRoverFinalCoord());
        System.out.println("H Final: " + rover.gethRoverFinalCoord());
	}
}
