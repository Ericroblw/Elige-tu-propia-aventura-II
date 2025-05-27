package Slasher;

import java.util.Scanner;

public class Personajes  {
   
	public String[] personajes= {"Owen Blake","Miles Carter","Connor Tate"};
	
	public static String protagonista;
	
	Scanner leer=new Scanner(System.in);
	
	public void elegirProtagonista() {
		
		System.out.println("Esta historia va a tener como protagonistas a tres personajes, un padre de familia que lo pierde todo,");
		System.out.println("un hombre culpable, que debido a su posición se salva el pellejo y el policía que se encuentra entre medias de ambos");
		System.out.println("Elige un personaje entre Miles Carter(1), Connor Tate(2) y Owen Blake(3)");
		int eleccion1 =leer.nextInt(); 
		while(eleccion1<1||eleccion1>3) {
		System.out.println("Número no válido, introduce otro número");
		eleccion1=leer.nextInt();
		}
		if (eleccion1==1){
			protagonista= personajes[1];
			System.out.println("Enhorabuena has elegido a "+ protagonista);
			
		}else if (eleccion1==2){
			protagonista= personajes[2];
			System.out.println("Enhorabuena has elegido a "+ protagonista);
		} else if (eleccion1==3){
			protagonista= personajes[0];
			System.out.println("Enhorabuena has elegido a "+ protagonista);
		}
		
	}
	
}
