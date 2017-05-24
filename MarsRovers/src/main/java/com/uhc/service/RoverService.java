package com.uhc.service;

import org.springframework.stereotype.Service;

import com.uhc.model.Rover;

@Service
public class RoverService {
	public Rover calcular(Rover rover) {
		
		/*
		 * Quebrando as Strings entradas pelo usuário em array
		 */
		String[] xyUpperRightCoord = rover.getUpperRightCoord().split("\\s+");
		
		String[] xylRoverPosition = rover.getRoverPosition().split("\\s+");
		
		String[] roverMovements = rover.getRoverMovements().split("");

		/*
		 * Convertando as coordenadas para inteiro para os cálculos
		 */
		Integer actualRoverHeading = 0;
		Integer xUpperRightCoord = Integer.parseInt(xyUpperRightCoord[0]);
		Integer yUpperRightCoord = Integer.parseInt(xyUpperRightCoord[1]);
		
		/*
		 * Setando o X e Y final do Rover
		 */
		rover.setxRoverFinalCoord(Integer.parseInt(xylRoverPosition[0]));
		rover.setyRoverFinalCoord(Integer.parseInt(xylRoverPosition[1]));
		
		/*
		 * Setando a direção final que o Rover está.
		 * Usando graus pra ficar mais fácil os calculos
		 * quando ele for se movimentar
		 */
		if(xylRoverPosition[2].equals("N")){
			actualRoverHeading = 0;
		}
		
		else if(xylRoverPosition[2].equals("E")){
			actualRoverHeading = 90;
		}
		
		else if(xylRoverPosition[2].equals("S")){
			actualRoverHeading = 180;
		}
		
		else if(xylRoverPosition[2].equals("W")){
			actualRoverHeading = 270;
		}
			
        /*
         * Percorrer o array de movimentos
         */          
        for (String moveLetter : roverMovements) {
            
        	/*
        	 * Checando qual foi a letra de comando para movimento 
        	 * do rover
        	 */
        	switch (moveLetter)
            {
               case "M":
               case "m":   if(actualRoverHeading==0){
            	   				rover.setyRoverFinalCoord(rover.getyRoverFinalCoord()+1);
               				}
		      				else if(actualRoverHeading==90){
		      					rover.setxRoverFinalCoord(rover.getxRoverFinalCoord()+1);
		     				}
               				else if(actualRoverHeading==180){
		                	   rover.setyRoverFinalCoord(rover.getyRoverFinalCoord()-1);
		      				}
               				else if(actualRoverHeading==270){
		                	   rover.setxRoverFinalCoord(rover.getxRoverFinalCoord()-1);
		      				}
			               /*
			                * Checando se o rover andou pra fora do planteau. 
			                * Seja maior o X/Y do upper-right ou o X/Y menor que o lower-left.
			                * Dando só um System.out pra avisar que saiu dos limites
			                */
			               if(rover.getxRoverFinalCoord()>xUpperRightCoord || rover.getyRoverFinalCoord()>yUpperRightCoord ||
			               		rover.getxRoverFinalCoord()<Rover.getXlowerleftcoord() || rover.getyRoverFinalCoord()<Rover.getYlowerleftcoord()){
			               	 System.out.println(">>Rover saiu dos limites!");
			               }
                           break;
               /*
                * Virando o rover para esquerda (-90 graus)
                */
               case "L":
               case "l":   actualRoverHeading = actualRoverHeading-90;
               			   /*
               			    * Checando se ele não vai ficar negativo. Se ficar corrige o número
               			    */
               			   if(actualRoverHeading==-90){
               				   actualRoverHeading = 270;
               			   }
                           break;
               /*
                * Virando o rover para direita (+90 graus)
                */
               case "R":
               case "r":   actualRoverHeading = actualRoverHeading+90;
		       			   /*
		       			    * Checando se ele não vai dar uma volta inteira e virar 360.
		       			    * Se virar, zera.
		       			    */
		       			   if(actualRoverHeading==360){
		       				actualRoverHeading = 0;
		       			   }
                           break;
               
               default: System.out.println("Invalid movement.");
            }
            	
        }
        
        /*
         * Setando a letra do ponto cardial final do rover pelo grau
         */
        if(actualRoverHeading == 0){
        	rover.sethRoverFinalCoord("N");
        }
        else if(actualRoverHeading == 90){
        	rover.sethRoverFinalCoord("E");
        }
        else if(actualRoverHeading == 180){
        	rover.sethRoverFinalCoord("S");
        }
        else if(actualRoverHeading == 270){
        	rover.sethRoverFinalCoord("W");
        }
        
        return rover;
	}
}
