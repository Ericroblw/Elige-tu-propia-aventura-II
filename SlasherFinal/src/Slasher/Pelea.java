package Slasher;

import java.util.Random;
import java.util.Scanner;

public class Pelea extends Personajes {
	
	public int vidaProtagonista=100;
	public int vidaProtaMax = 100;
	public int[] vidaEnemigo= {50,50,100};
	public int dañoEnemigo = 10;
	public int[] ataque = { 10, 20, 30 };
	public int[] ataquePuño = { 0, 5, 10 };
	public int[] ataqueBate = { 0, 10, 20 };
	public int[] ataquePistola = { 0, 15, 30 };
	public int[] vidaArma = { 4, 2, 1 };
	public int ataqueOwen = 3;
	public int dañoProtagonista = 0;
	public int golpes = 0;
	public int vendas = 5;
	public int balaspistola = 0;
	public int vidaOwen = 100;
	public int vidaBate = 2;
	public int vida = 100;
	public int visitaAbogado = 1;
	public int visitaCasaHermano = 1;
	public int visitaTienda = 1;
	public int visitaTia = 1;
	int[] impactoEnemigo = {0, 5, 10};
	
	Personajes personaje = new Personajes();
	Cofre tesoros = new Cofre();
	
	Random random = new Random();
	Scanner leer = new Scanner(System.in);
	
	
	
	
	public void peleaAbogado() {
		if (visitaAbogado > 0) {
			visitaAbogado--;
			System.out.println("Decider hacer una visita a su abogado a ver si sabe donde esta Connor");
			System.out.println(
					"Al verte, coge un cuchillo de la cocina y te dice que o te vas o acabarás con tu mujer e hija");

			boolean finCombate = false;

			while (finCombate == false) {
				enfrentamiento();
				finCombate = true;
			}

		} else {
			System.out.println("No puedes volver a ir, la policía te está investigando.");
		}

	
		
	}
	
	public void peleaTia() {
		if (visitaTia > 0) {
			visitaTia--;
			System.out.println(
					"Decides investigar más la vida de Connor y descubres que tiene una relación muy cercana con su tía,");
			imprimirConSeparador(
					"por lo que decides ir a hacerla una visita para ver si puedes descubrir donde está Connor");

			boolean finCombate = false;

			while (finCombate == false) {

				System.out.println(
						"Al llegar a casa de la tía ¿Que haces? forzar la cerradura(1) o entrar haciendo ruido(2)");
				int robo = leer.nextInt();

				while (robo < 1 || robo > 2) {
					System.out.println("Número no valido, prueba otra vez");
					robo = leer.nextInt();
				}

				if (robo == 1) {
					System.out.println("resuelve el siguiente acertijo para poder entrar:");
					imprimirConSeparador("Cuanto más me quitas más grande me hago");
					System.out.println("(1) un agujero");
					System.out.println("(2) la sombra");
					imprimirConSeparador("(3) el vacio");
					int acertijo = leer.nextInt();

					while (acertijo < 1 || acertijo > 3) {
						System.out.println("Número no valido, prueba otra vez");
						acertijo = leer.nextInt();
					}

					if (acertijo == 1) {
						imprimirConSeparador("Consigues abrir la cerradura sin hacer ruido");
					}
					if (acertijo == 2) {
						imprimirConSeparador(
								"No te apañas bien forzando la cerradura y abres la puerta haciendo ruido");
					}
					if (acertijo == 3) {
						imprimirConSeparador(
								"No te apañas bien forzando la cerradura y abres la puerta haciendo ruido");
					}

				}
				if (robo == 2) {
					System.out.println("Rompes la ventana y entras a casa de la tía de Connor");
				}
				System.out.println(
						"Una vez dentro de la casa subes las escaleras y encuentras a la tía de Connor en la habitación");
				imprimirConSeparador(
						"Al verte agarra una lámpara y te pregunta que quien eres y que haces en su casa, (1)mentir, (2) matarla");
				int tia = leer.nextInt();

				while (tia < 1 || tia > 2) {
					System.out.println("Número no valido, prueba otra vez");
					tia = leer.nextInt();
				}

				if (tia == 1) {
					System.out.println(
							"Le dices que eres un amigo de Connor y que estás muy preocupado por el, que sabes que alguien va trás el,");
					System.out.println(
							"y que temes por lo que le pueda pasar. La tía de Connor suelta la lámpara y te dice que se ha ido,");
					System.out.println(
							"que no sabe a donde pero que iba a ir a la tienda que está bajando la calle, y que se había ido hace poco ");
					imprimirConSeparador("Por lo que le agradeces y  abandonas la casa.");
					finCombate = true;
				}
				if (tia == 2) {
					System.out.println("Apuntas a la tía de Connor con la pistola y la atas a una silla");
					System.out.println("Le dices que su sobrino va a pagar por lo que hizo");
					imprimirConSeparador("Decides rajarle el cuello y dejar otra pista para la policía");

					System.out.println(
							"Cuando estás a punto de irte, escuchas a un coche aparcar fuera y en ese momento recuerdas");
					System.out.println(
							"que de camino a la casa habías visto una cara familiar, y de repente te acordaste, era el policía que dió parte del accidente ");
					System.out.println(
							"y que también estaba presente durante el juicio. El sujeto se bajo del coche y se acercó a la casa.");
					System.out.println(
							"Por lo que decides huir, subiendo rápido las escalera, cerrando de un portazo la habitación de la tía de Connor");
					imprimirConSeparador("Y saltando por la ventana");
					finCombate = true;
				}

			}

		} else {
			System.out.println("No puedes volver a ir, la policía te está investigando.");
		}
	}
	
	public void peleaTienda() {
		if (visitaTienda > 0) {
			visitaTienda--;

			boolean finCombate = false;

			while (finCombate == false) {

				System.out.println(
						"Decides ir a la tienda de cerca de casa Connor a preguntar por el, el dependiente te dice que compres algo");
				imprimirConSeparador("primero,comprar mistrey box(1) o amenazar(2)");
				int tienda = leer.nextInt();

				while (tienda < 1 || tienda > 2) {
					System.out.println("Número no valido, prueba otra vez");
					tienda = leer.nextInt();
				}
				if (tienda == 1) {
					tesoros.abrirCofre();
					imprimirConSeparador(
							"El dependiente dice que es amigo suyo y que había ido a ver a su padre, se lo agradeces y abandonas la tienda");

				} else if (tienda == 2) {
					System.out.println("Owen saca el arma y le pregunta que si acepta ese medio de pago");
					imprimirConSeparador(
							"El dependiente dice que es amigo suyo y que había ido a ver a su padre");
					System.out.println("¿Que quieres hacer con el? dejarle vivir(1) o ruleta rusa(2)");
					int muerte = leer.nextInt();

					while (muerte < 1 || muerte > 2) {
						System.out.println("Número no valido, prueba otra vez");
						muerte = leer.nextInt();
					}

					if (muerte == 1) {
						System.out.println("Decides dejarle vivir y abandonas la tienda");

					}
					if (muerte == 2) {
						System.out.println(" decides hacer una ruleta rusa al dependiente.");
						int balas2 = random.nextInt(6);

						if (balas2 / 2 != 0) {
							System.out.println("El arma se dispara, matando así al dependiente");

						}
						if (balas2 / 2 == 0) {
							System.out.println("El arma no se dispara,y le dejas vivir ");

						}

					}

				}
				System.out.println(
						"Al salir de la tienda ves movimiento en un callejón oscuro y te acercas a investigar, una vez dentro");
				System.out.println(
						"Escuchas una voz en tu espalda, un vagabundo te esta mirando con un machete en mano,");
				System.out.println(" te dice que le des lo que llevas en la mochila");
				imprimirConSeparador("Le das la mochila(1) o te peleas con el(2)");
				int vagabundo = leer.nextInt();

				while (vagabundo < 1 || vagabundo > 2) {
					System.out.println("Número no valido, prueba otra vez");
					vagabundo = leer.nextInt();
				}

				if (vagabundo == 1) {
					tesoros.roboMochila();
					finCombate = true;
				}
				if (vagabundo == 2) {

					enfrentamiento();
					finCombate = true;
				}

			}

		} else {
			System.out.println("No puedes volver a ir, la policía te está investigando.");
		}
	}
	
	public void peleaHermano() {
		if (visitaCasaHermano > 0) {
			visitaCasaHermano--;
			System.out.println(
					"Decides ir a casa de tu hermano, con el que llevas viviendo 2 años desde el accidente.");
			System.out.println(
					"El no está en casa, por lo que subes al cuarto de arriba a ver que hay en la caja fuerte");

			System.out.println("encuentras el cofre ¿que quieres hacer? elige entre abrir(1) o ignorarlo(2)");
			int decision = leer.nextInt();

			while (decision < 1 || decision > 2) {
				System.out.println("Prueba otra vez");
				decision = leer.nextInt();
			}
			if (decision == 1) {
				System.out.println("Adivina el número hasta el 50");
				int numero = leer.nextInt();

				int numeroDesconocido = random.nextInt(50) + 1;
				while (numeroDesconocido != numero) {

					if (numero < numeroDesconocido) {
						System.out.println("numero incorrecto, inserte un número mayor al anterior ");
						numero = leer.nextInt();
					} else if (numero > numeroDesconocido) {
						System.out.println("numero incorrecto, inserte un número menor al anterior ");
						numero = leer.nextInt();
					}
				}
				if (numeroDesconocido == numero) {
					System.out.println("Enhorabuena has adivinado el número");
				}

			tesoros.abrirCofre2();

			} else {
				System.out.println("Decides ignorar el cofre");
			}

		} else {
			System.out.println("No puedes volver a ir, la policía te está investigando.");
		}
	}
	
	public void enfrentamiento() {
		boolean finCombate = false;
		
		boolean finPelea = false;

		while (finPelea == false) {
			System.out.println("¿Que haces? atacar(1),atarle(2), curarse(3) o huir(4)");
			int pelea = leer.nextInt();

			while (pelea < 1 || pelea > 4) {
				System.out.println("Número no valido, prueba otra vez");
				pelea = leer.nextInt();
			}

			switch (pelea) {

			case 1:
				System.out.println("puñetazo(1), bate(2) o disparo(3)");
				int atacarVagabundo = leer.nextInt();

				while (atacarVagabundo < 1 || atacarVagabundo > 3) {
					System.out.println("Número no valido, prueba otra vez");
					atacarVagabundo = leer.nextInt();
				}
				if (atacarVagabundo == 1) {
					int primero = random.nextInt(2);
					int impacto = random.nextInt(3);

					if (primero == 0) {

						if (impacto == 0) {
							dañoProtagonista = ataquePuño[0];
							vidaEnemigo[1] -= dañoProtagonista;
							
							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							}
							System.out.println("le atacas, pero el golpe no impacta, ahora tiene "
									+ vidaEnemigo[1] + " pts de vida");
							
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						} else if (impacto == 1) {
							dañoProtagonista = ataquePuño[1];
							vidaEnemigo[1] -= dañoProtagonista;

							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							}
							System.out.println(
									"le atacas, y le das parcialmente, quitándole 5 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
							
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						} else if (impacto == 2) {
							dañoProtagonista = ataquePuño[2];
							vidaEnemigo[1] -= dañoProtagonista;
							
							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							}
							System.out.println(
									"le atacas y el impacto es total, quitándole 10 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
							
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						}

					} else {

						if (vidaEnemigo[1] > 0) {
							vidaProtagonista -= 10;
							dañoProtagonista = ataquePuño[2];
							vidaEnemigo[1] -= dañoProtagonista;
							

							imprimirConSeparador("te ataca quitándote 10 pts de vida, ahora tienes "
									+ vidaProtagonista + " pts de vida");
							System.out.println(
									"Le atacas de vuelta quitándole 10 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
						}
					}
					if (vidaEnemigo[1] <= 0) {
						vidaEnemigo[1]=0;
						imprimirConSeparador(
								"Le has eliminado, decides huir de la escena del crimen");
						finCombate = true;
						finPelea = true;
					}
					if (vidaProtagonista < 0) {
						imprimirConSeparador("Has sido eliminado");
						finCombate = true;
						finPelea = true;
					}

				}
				if (atacarVagabundo == 2) {
					int primero = random.nextInt(2);
					int impacto = random.nextInt(3);

					if (primero == 0) {

						if (impacto == 0) {
							dañoProtagonista = ataqueBate[0];
							vidaEnemigo[1] -= dañoProtagonista;
							
							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							}
							System.out.println("le atacas, pero el golpe no impacta, ahora tiene "
									+ vidaEnemigo[1] + " pts de vida");
							
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						} else if (impacto == 1) {
							dañoProtagonista = ataqueBate[1];
							vidaEnemigo[1] -= dañoProtagonista;

							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							}
							System.out.println(
									"le atacas, y le das parcialmente, quitándole 10 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
							
							
							 if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						} else if (impacto == 2) {
							dañoProtagonista = ataqueBate[2];
							vidaEnemigo[1] -= dañoProtagonista;

							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							}
							System.out.println(
									"le atacas y el impacto es total, quitándole 20 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
							
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						}

					} else {

						if (vidaEnemigo[1] > 0) {
							vidaProtagonista -= 10;
							dañoProtagonista = ataqueBate[2];
							vidaEnemigo[1] -= dañoProtagonista;
							imprimirConSeparador("te ataca quitándote 10 pts de vida, ahora tienes "
									+ vidaProtagonista + " pts de vida");
							System.out.println(
									"Le atacas de vuelta quitándole 20 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
						}
					}
					if (vidaEnemigo[1] <= 0) {
						vidaEnemigo[1]=0;
						imprimirConSeparador(
								"Le has eliminado, decides huir de la escena del crimen");
						finCombate = true;
						finPelea = true;
					}
					if (vidaProtagonista < 0) {
						imprimirConSeparador("Has sido eliminado");
						finCombate = true;
						finPelea = true;
					}

				}
				if (atacarVagabundo == 3) {
					int primero = random.nextInt(2);
					int impacto = random.nextInt(3);

					if (primero == 0) {

						if (impacto == 0) {
							dañoProtagonista = ataquePistola[0];
							vidaEnemigo[1] -= dañoProtagonista;
							
							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;

							System.out.println("le atacas, pero el ataque no impacta, ahora tiene "
									+ vidaEnemigo[1] + " pts de vida");
							}
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						} else if (impacto == 1) {
							dañoProtagonista = ataquePistola[1];
							vidaEnemigo[1] -= dañoProtagonista;
							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;
							

							System.out.println(
									"le atacas, y le das parcialmente, quitándole 15 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
							}
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						} else if (impacto == 2) {
							dañoProtagonista = ataquePistola[2];
							vidaEnemigo[1] -= dañoProtagonista;
							if(vidaEnemigo[1]<0) {
								vidaEnemigo[1]=0;

							System.out.println(
									"le atacas y el impacto es total, quitándole 30 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
							}
							
							if (vidaEnemigo[1] > 0) {
								vidaProtagonista -= 10;
								imprimirConSeparador(
										"te ataca de vuelta quitándote 10 pts de vida, ahora tienes "
												+ vidaProtagonista + " pts de vida");
							}
						}

					} else {

						if (vidaEnemigo[1] > 0) {
							vidaProtagonista -= 10;
							dañoProtagonista = ataquePistola[2];
							vidaEnemigo[1] -= dañoProtagonista;
							
							imprimirConSeparador("te ataca quitándote 10 pts de vida, ahora tienes "
									+ vidaProtagonista + " pts de vida");
							System.out.println(
									"Le atacas de vuelta quitándole 30 pts de vida, ahora tiene "
											+ vidaEnemigo[1] + " pts de vida");
						}
					}
					if (vidaEnemigo[1] <= 0) {
						vidaEnemigo[1]=0;
						imprimirConSeparador(
								"Has eliminado al vagabundo y decides huir de la escena del crimen");
						finCombate = true;
						finPelea = true;
					}
					if (vidaProtagonista < 0) {
						imprimirConSeparador("Has sido eliminado");
						finCombate = true;
						finPelea = true;
					}

				}

				break;
			case 2:
				if (vidaEnemigo[1] <= 25) {
					System.out.println("Te lanzas sobre el y lo atas");
					System.out.println(
							"¿Que vas a hacer? matarlo(1) dejar su vida en manos de Dios(2)");
					int tortura = leer.nextInt();

					while (tortura < 1 || tortura > 2) {
						System.out.println("Número no valido, prueba otra vez");
						tortura = leer.nextInt();
					}

					if (tortura == 1) {
						System.out.println("Lo asesinas a sangre fría.");
						finPelea = true;
					}
					if (tortura == 2) {
						System.out.println("decides hacer una ruleta rusa.");
						int balas = random.nextInt(6);

						if (balas / 2 != 0) {
							System.out.println("El arma se dispara, le has matado");
							finPelea = true;
						}
						if (balas / 2 == 0) {
							System.out.println(
									"El arma no se dispara,pero le matas igualmente , dejando una pista ");
							finPelea = true;
						}
					}
				}
				if (vidaEnemigo[1] > 25) {
					dañoEnemigo = 20;
					vidaProtagonista -= dañoEnemigo;
					System.out.println(
							"intentas atar al enemigo pero te apuñala quitándote 20 pts de vida, te quedan "
									+ vidaProtagonista + " pts de vida");
				}

				break;
			case 3:
				if (vendas > 0) {
					vendas--;
					vidaProtagonista += 20;
					if (vidaProtagonista > vidaProtaMax) {
						vidaProtagonista = vidaProtaMax;
					}
					System.out.println( Personajes.protagonista + " se ha curado 20pts de vida, ahora tiene "
							+ vidaProtagonista + " pts de vida y le quedan " + vendas
							+ " vendas restantes");
				} else {
					System.out.println("No te quedan vendas");
				}

				break;
			case 4:
				System.out.println("Has decidido huir y lo has hecho de forma exitosa");
				finPelea = true;

				break;
			}

		}
		finCombate = true;
	}
	
	public static void imprimirConSeparador(String mensaje) {
		System.out.println(mensaje);
		System.out.println("-------------------------"); // Separador
	}
}
