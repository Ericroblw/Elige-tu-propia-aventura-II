package Slasher;

import java.util.Arrays;
import java.util.Random;

public class Cofre {
	
	Random random = new Random();
	
	public String[] cofre = { "happy meal", "McWrap", "Mcchicken", "botiquin", "municion", "municion", "municion", "bate",
			"bate", "Francotirador", "municion" };
	public String[] mochila = new String[4];
	
	
	
	public void abrirCofre() {
		String objetoEncontrado = cofre[random.nextInt(cofre.length)];
		mochila[0] = objetoEncontrado;
		System.out
				.println(objetoEncontrado + " en la mochila ahora tienes " + Arrays.toString(mochila));
	}
	
	public void abrirCofre2() {
		String objetoEncontrado = cofre[random.nextInt(cofre.length)];
		mochila[1] = objetoEncontrado;
		System.out
				.println(objetoEncontrado + " en la mochila ahora tienes " + Arrays.toString(mochila));
	}
	
	public void roboMochila() {
		String nulo = "NULL";
		mochila[0] = nulo;
		mochila[1] = nulo;
		System.out.println("En la mochila ahora tienes " + Arrays.toString(mochila));
	}
	

}
