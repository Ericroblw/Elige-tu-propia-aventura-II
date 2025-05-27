package Slasher;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Historia extends Pelea {

	int vidaProtagonista = 100;
	int vidaProtaMax = 100;
	int[] vidaEnemigo = { 50, 50, 100 };
	int dañoEnemigo = 10;
	int[] ataque = { 10, 20, 30 };
	int[] ataquePuño = { 0, 5, 10 };
	int[] ataqueBate = { 0, 10, 20 };
	int[] ataquePistola = { 0, 15, 30 };
	int[] vidaArma = { 4, 2, 1 };
	int ataqueOwen = 3;
	int dañoProtagonista = 0;
	int golpes = 0;
	int visitaAbogado = 1;
	int visitaCasaHermano = 1;
	int visitaTienda = 1;
	int visitaTia = 1;
	int vendas = 5;
	int balaspistola = 0;
	int vidaOwen = 100;
	int vidaBate = 2;
	int vida = 100;

	Random random = new Random();
	Scanner leer = new Scanner(System.in);
	
	Personajes personaje = new Personajes();
	Cofre tesoros = new Cofre();
	Pelea pelea = new Pelea();
	
	

	public void comenzarHistoria3() {
		
		boolean finCombate = false;
	
		System.out.println(
				protagonista +" es un hombre común, un padre y esposo amoroso, cuya vida da un giro dramático tras perder a su esposa e hija en un trágico accidente de tráfico. ");
		imprimirConSeparador(
				"El culpable, un conductor ebrio llamado Connor Tate, que recibe una pena mínima y no llega a entrar en prisión.");
		System.out.println(
				"Tras todo lo ocurrido, Owen decide investigar el motivo por el cual a Connor no le ha caído apenas castigo. ");
		System.out.println("Al enterarse de que no solo no es la primera vez que le ocurre algo parecido,");
		System.out.println(
				"sino que siempre sale impune debido a que su padre es un alto cargo del sistema judicial de la ciudad, decide tomarse la justicia por su mano.");
		System.out.println(
				"Owen, trás meses pensando y con la cabeza un poco tocada, escribe una carta en la cual le dice a Connor que le va a hacer pagar lo que ha hecho ");
		System.out.println("¿Que decisión vas a tomar? enviar la carta(1), o quemar la carta(2)");
		int decision1 = leer.nextInt();

		while (decision1 < 1 || decision1 > 2) {
			System.out.println("Número no válido, introduce otro número");
			decision1 = leer.nextInt();
		}
		if (decision1 == 1) {
			imprimirConSeparador(
					"Decides enviar la carta, lo que provoca que Connor desaparezca del mapa, complicando así tu proposito de acabar con su vida.");

		} else {
			imprimirConSeparador(
					"Decides no enviar la carta ya que esto podría complicar tu objetivo de acabar con Connor");
		}
		System.out.println(
				"Sales de casa con una mochila con 4 huecos de momento vacía, y aparte llevas una pistola y un bate");
		imprimirConSeparador(" y 5 vendas que curan 20 de vida");

		boolean todasVisitasHechas = false;
		while (!todasVisitasHechas) {

			System.out.println("Necesitas encontrar a Connor, ¿A donde quieres ir?");
			System.out.println(
					"a casa de su abogado(1), a casa de un familiar de Connor(2), a la tienda(3) o a casa de tu hermano(4) ");
			int decision2 = leer.nextInt();

			while (decision2 < 1 || decision2 > 4) {
				System.out.println("Número no válido, introduce otro número");
				decision2 = leer.nextInt();
			}

			if (decision2 == 1) {
				
			pelea.peleaAbogado();
			
			}

			else if (decision2 == 2) {
				
			pelea.peleaTia();
			
			} else if (decision2 == 3) {
				
				pelea.peleaTienda();
				
			} else if (decision2 == 4) {
				
				pelea.peleaHermano();
			
			}
				
			if (pelea.visitaTia == 0 && pelea.visitaTienda == 0 && pelea.visitaCasaHermano == 0 && pelea.visitaAbogado == 0) {
				todasVisitasHechas = true; // Si ya no queda ningún lugar por visitar, terminamos el bucle
			}
		
		}
		System.out.println("Owen decide ir en busca de el padre de Connor dispuesto a acabar ya con todo esto");
		imprimirConSeparador(
				"Al llegar, tampoco está Connor, por lo que harto de juegos, apunta al padre de Connor y lo secuestra.");
		System.out.println(
				"Decide llevarlo al punto donde su vida se rompió en pedazos, la casa en la que vivía con su mujer e hija,");
		System.out.println("cogió el movil del padre de Connor y le escribió diciéndole, que le tenía secuestrado");
		imprimirConSeparador(" y le puso un par de adivinanzas que desvelaban el numero y la calle en la que estaba.");
		System.out.println(
				"A la hora, Connor, apareció en la ubicación, era la casa en la que Owen vivía con su mujer e hija. ");
		imprimirConSeparador(
				"Connor abrió la puerta con cuidado, y al abrirla se encontró con su padre atado a una silla y fotos del accidente que provocó pegadas por las paredes y techo");
		System.out.println(
				"La puerta se cerró trás el, era Owen, que con una pistola le apuntaba mientras se acercaba al padre de Connor");
		imprimirConSeparador(
				"Trás una conversación Owen harto de excusas decide disparar al padre de Connor a sangre fría");
		System.out.println("Connor entre lágrimas te dice que ya le has hecho suficiente daño, que que más quieres");
		imprimirConSeparador("¿Que decisión vas a tomar?");
		imprimirConSeparador("Huir(1), pegarte con Connor(2), Ruleta rusa a Connor(3)");
		int peleaFinal = leer.nextInt();
		boolean finPeleaFinal = false;

		while (finPeleaFinal == false) {
			while (peleaFinal < 1 || peleaFinal > 3) {
				System.out.println("Prueba otra vez");
				peleaFinal = leer.nextInt();
			}
			if (peleaFinal == 1) {
				System.out.println("Owen trás hablarlo con Connor, lo termina perdonando y cuadran las cosas.");
				System.out.println(
						"Aunque Owen se haya dado cuenta de los errores que ha cometido y haya perdonado a Connor, decide huir del país");
				imprimirConSeparador("para así poder intentar vivir una vida tranquila.");
				finPeleaFinal = true;
				// System.out.println("¡¡FIN DEL JUEGO!!");
			}
			if (peleaFinal == 2) {
				System.out.println("Decides luchar contra Connor");
				boolean finPelea = false;

				while (finPelea == false) {
					System.out.println("¿Que haces? atacar(1) o curarse(2)");
					int pelea3 = leer.nextInt();

					while (pelea3 < 1 || pelea3 > 2) {
						System.out.println("Número no valido, prueba otra vez");
						pelea3 = leer.nextInt();
					}

					switch (pelea3) {

					case 1:
						System.out.println("puñetazo(1), bate(2)");
						int atacarConnor = leer.nextInt();

						while (atacarConnor < 1 || atacarConnor > 3) {
							System.out.println("Número no valido, prueba otra vez");
							atacarConnor = leer.nextInt();
						}
						if (atacarConnor == 1) {
							ataqueOwen--;
							dañoProtagonista = ataque[0];
							vidaEnemigo[2] -= dañoProtagonista;
							System.out.println("le atacas quitándole 10 pts de vida, ahora tiene " + vidaEnemigo[2]
									+ " pts de vida");

							if (vidaEnemigo[2] > 0) {
								vidaProtagonista -= 15;
								imprimirConSeparador("te ataca de vuelta quitándote 15 pts de vida, ahora tienes "
										+ vidaProtagonista + " pts de vida");
							}

							if (ataqueOwen == 0) {
								System.out.println("La pelea esta intensa, pero de repente");
								int muerte = random.nextInt(6);

								if (muerte <= 3) {
									imprimirConSeparador(
											"Owen coge un objeto punzante del suelo y se lo clava en el cuello a Connor, acabando así con su vida.");
									finPelea = true;
									finPeleaFinal = true;
								} else {
									System.out.println(
											"Connor coge un objeto punzante del suelo y se lo clava a Owen en el cuello, ");
									imprimirConSeparador("acabando así con su vida y alertando a las autoridades.");
									finPelea = true;
									finPeleaFinal = true;
								}
							}

							///////////////////////////
							if (vidaEnemigo[2] <= 0) {
								imprimirConSeparador(
										"Has eliminado a Connor, pero no te sientes completo. Decides abandonar la escena del crimen y te vas del país para empezar una nueva vida");
								finPelea = true;
								finPeleaFinal = true;
							}
							if (vidaProtagonista < 0) {
								imprimirConSeparador("Has sido eliminado");
								finPelea = true;
								finPeleaFinal = true;
							}

						}
						if (atacarConnor == 2) {
							ataqueOwen--;
							dañoProtagonista = ataque[1];
							golpes = vidaArma[0];
							vidaArma[0]--;
							vidaEnemigo[2] -= dañoProtagonista;

							if (ataqueOwen == 0) {
								System.out.println("La pelea esta intensa, pero de repente");
								int muerte = random.nextInt(6);

								if (muerte <= 3) {
									imprimirConSeparador(
											"Owen coge un objeto punzante del suelo y se lo clava en el cuello a Connor, acabando así con su vida.");
									finPelea = true;
									finPeleaFinal = true;
								} else {
									System.out.println(
											"Connor coge un objeto punzante del suelo y se lo clava a Owen en el cuello, ");
									imprimirConSeparador("acabando así con su vida y alertando a las autoridades.");
									finPelea = true;
									finPeleaFinal = true;
								}
							}

							else {
								if (vidaArma[0] >= 0) {
									System.out.println("le atacas quitándole 20 pts de vida, ahora tiene "
											+ vidaEnemigo[2] + " pts de vida y te quedan " + vidaArma[0]
											+ " golpes con el bate antes de que se rompa");
								} else if (vidaArma[0] < 0) {
									System.out.println("Tienes el bate roto");
								}
								if (vidaEnemigo[2] > 0) {
									vidaProtagonista -= 15;
									imprimirConSeparador("te ataca de vuelta quitándote 15 pts de vida, ahora tienes "
											+ vidaProtagonista + " pts de vida");
								}
								if (vidaEnemigo[2] <= 0) {
									imprimirConSeparador(
											"Has eliminado a Connor, pero no te sientes completo. Decides abandonar la escena del crimen y te vas del país para empezar una nueva vida");
									finPelea = true;
									finPeleaFinal = true;
								}
								if (vidaProtagonista < 0) {
									imprimirConSeparador("Has sido eliminado");
									finPelea = true;
									finPeleaFinal = true;
								}
							}
						}
						break;

					case 2:
						if (vendas > 0) {
							vendas--;
							vidaProtagonista += 20;
							if (vidaProtagonista > vidaProtaMax) {
								vidaProtagonista = vidaProtaMax;
							}
							System.out.println(personaje.protagonista + " se ha curado 20pts de vida, ahora tiene "
									+ vidaProtagonista + " pts de vida y le quedan " + vendas + " vendas restantes");
						} else {
							System.out.println("No te quedan vendas");
						}

						break;
					}
				}
			}
			if (peleaFinal == 3) {
				System.out.println(
						"Owen ata a Connor, y le dice que tiene parte de razón, que matarle no va a traer de vuelta a su familia,");
				System.out.println(
						"que va a ser Dios quien decida si vive o muere. Carga una única bala en el revolver.");
				System.out.println(
						"Apunta a la cabeza y al disparar se encasquilla el arma y acto seguido, el policía Miles Carter, que había estado siguiendo el caso");
				System.out.println(
						"tira la puerta abajo y al ver la situación dispara a Owen sin dudarlo, acabando así con su vida.");
				imprimirConSeparador("Desata a Connor y lo lleva al hospital para que le curen las heridas.");
				finPeleaFinal = true;
			}
		}
		System.out.println("El enfrentamiento final ha terminado. El destino de Owen Blake está sellado.");
		System.out.println(
				"Gracias por jugar. ¿Te atreverías a volver a jugar explorando otras alternativas y probando otros personajes?");
		imprimirConSeparador("¡¡FIN DEL JUEGO!!");
	}
	

	
	public void comenzarHistoria1() {
	  
	    imprimirConSeparador(protagonista +"es un detective veterano, marginado tras testificar en contra de un juez corrupto. Ahora sigue una pista que lo conecta con Connor Tate y Owen Blake. La ciudad se desmorona, y la justicia real está en tus manos.");

	    // Variables iguales al juego de Owen
	  
	    int[] impactoEnemigo = {0, 5, 10};
	    int visitaComisaria = 1;
	    int visitaCasaOwen = 1;
	    int visitaBar = 1;
	    int visitaJuez = 1;

	    boolean todasVisitasHechas = false;

	    while (!todasVisitasHechas) {
	        System.out.println("¿A dónde quieres ir?");
	        System.out.println("Comisaría(1), Casa de Owen Blake(2), Bar clandestino(3), Despacho del juez Tate(4)");
	        int decisionLugar = leer.nextInt();

	        while (decisionLugar < 1 || decisionLugar > 4) {
	            System.out.println("Número no válido, introduce otro número");
	            decisionLugar = leer.nextInt();
	        }

	        if (decisionLugar == 1 && visitaComisaria > 0) {
	            visitaComisaria--;
	            imprimirConSeparador("Entras a la comisaría y notas que hay murmullos sobre ti. Uno de los agentes intenta golpearte por entrometerte en el caso.");
	          enfrentamiento();

	        } else if (decisionLugar == 2 && visitaCasaOwen > 0) {
	            visitaCasaOwen--;
	            imprimirConSeparador("Owen te recibe con desconfianza. Cree que estás encubriendo a Connor. Decide atacarte sin previo aviso.");
	            enfrentamiento(); 

	        } else if (decisionLugar == 3 && visitaBar > 0) {
	            visitaBar--;
	            imprimirConSeparador("Un matón en el bar intenta asaltarte al preguntarle por Connor Tate.");
	            enfrentamiento();

	        } else if (decisionLugar == 4 && visitaJuez > 0) {
	            visitaJuez--;
	            imprimirConSeparador("El juez Tate se siente acorralado y ordena a su guardaespaldas eliminarte.");
	            enfrentamiento();
	          
	        } else {
	            System.out.println("No puedes volver a ir, ya lo investigaste.");
	        }

	        if (visitaComisaria == 0 && visitaCasaOwen == 0 && visitaBar == 0 && visitaJuez == 0) {
	            todasVisitasHechas = true;
	        }
	    }

	    imprimirConSeparador("Tras conectar las pistas, descubres que Connor Tate se esconde en un almacén abandonado junto al puerto. Decides ir allí.");
	    imprimirConSeparador("Al llegar, encuentras al padre de Connor muerto en el suelo, y a Connor atado a una silla, lleno de pánico.");

	    System.out.println("¿Qué decides hacer?\n1. Huir\n2. Pelear\n3. Ruleta rusa con Connor");
	    int eleccionFinal = leer.nextInt();

	    boolean finPeleaFinal = false;
	    int vidaConnor = 100;
	    int ataqueMiles = 3;

	    while (!finPeleaFinal) {
	        switch (eleccionFinal) {
	            case 1:
	                imprimirConSeparador("Decides que esto no te corresponde. Sueltas tu arma y abandonas el almacén. Connor queda solo entre la vida y la muerte.");
	                finPeleaFinal = true;
	                break;
	            case 2:
	                while (vidaConnor > 0 && vidaProtagonista > 0 && ataqueMiles > 0) {
	                    System.out.println("¿Qué haces? Puñetazo(1), Bate(2), Pistola(3)");
	                    int accion = leer.nextInt();
	                    int impacto = new Random().nextInt(3);
	                    int daño = 0;

	                    if (accion == 1) daño = ataquePuño[impacto];
	                    else if (accion == 2 && vidaArma[0]-- > 0) daño = ataqueBate[impacto];
	                    else if (accion == 3 && balaspistola-- > 0) daño = ataquePistola[impacto];
	                    else System.out.println("No puedes usar esa arma ahora.");

	                    vidaConnor -= daño;
	                    ataqueMiles--;
	                    System.out.println("Le haces " + daño + " de daño. Vida Connor: " + vidaConnor);

	                    if (vidaConnor > 0) {
	                        int impactoEnem = new Random().nextInt(3);
	                        int dañoConnor = impactoEnemigo[impactoEnem];
	                        vidaProtagonista -= dañoConnor;
	                        System.out.println("Connor te ataca con un objeto suelto. Te hace " + dañoConnor + " de daño. Vida: " + vidaProtagonista);
	                    }

	                    if (ataqueMiles == 0 && vidaConnor > 0 && vidaProtagonista > 0) {
	                        int destino = new Random().nextInt(6);
	                        if (destino <= 3) {
	                            imprimirConSeparador("Te lanzas sobre Connor y lo atraviesas con una barra metálica. Acaba muerto a tus pies.");
	                        } else {
	                            imprimirConSeparador("Connor se libera y te clava un cuchillo en el cuello. Todo se vuelve negro.");
	                        }
	                        finPeleaFinal = true;
	                    }

	                    if (vidaConnor <= 0) {
	                        imprimirConSeparador("Has eliminado a Connor Tate. La justicia ha sido impartida... a tu manera.");
	                        finPeleaFinal = true;
	                    }
	                    if (vidaProtagonista <= 0) {
	                        imprimirConSeparador("Has sido eliminado en combate. El caso muere contigo.");
	                        finPeleaFinal = true;
	                    }
	                }
	                break;
	            case 3:
	                imprimirConSeparador("Decides dejar la decisión en manos del azar. Colocas una bala en el revólver y giras el tambor. Connor tiembla.");
	                int ruleta = new Random().nextInt(6);
	                if (ruleta == 0) {
	                    imprimirConSeparador("El arma no se dispara. Connor respira aliviado, pero Miles no se fía y dispara de nuevo. Esta vez... sí.");
	                } else {
	                    imprimirConSeparador("El disparo sale y acaba con la vida de Connor Tate al instante. Silencio absoluto.");
	                }
	                finPeleaFinal = true;
	                break;
	            default:
	                System.out.println("Opción no válida. Introduce 1, 2 o 3");
	                eleccionFinal = leer.nextInt();
	                break;
	        }
	    }

	    imprimirConSeparador("El caso ha terminado. Lo que comenzó como una investigación personal terminó en un ajuste de cuentas inevitable.\n¿Realmente hiciste lo correcto?\n¡¡FIN DEL JUEGO!!");
	
	}

	public void comenzarHistoria2() {
		
	}
	
	
	
	
	public void comprobarProtagonista() {
		elegirProtagonista();
		if(protagonista== personajes[0]) {
			comenzarHistoria3();
		}else if(protagonista== personajes[1]) {
			comenzarHistoria1();
		}else if(protagonista== personajes[2]) {
			comenzarHistoria2();
		}
	}
	
	
	
	public static void imprimirConSeparador(String mensaje) {
		System.out.println(mensaje);
		System.out.println("-------------------------"); // Separador
	}

}
