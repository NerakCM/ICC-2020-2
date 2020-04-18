import java.util.Scanner;

/**
 * Proyecto 2 del curso ICC. "Cifrado de César, de Rieles y de Kama-sutra".
 * NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */


public class Gato{


//MÉTODO QUE IMPRIME EL GATO.
	public static void imprime(String [][] gato){
		for(int i = 0; i < gato.length; i++){
			System.out.println(" -------------"); //Solo es formato
			for(int j = 0; j < gato[i].length; j++){
				
				System.out.print(" | "+gato[i][j]);
			}
			System.out.print(" |"); //Solo es formato. 
			System.out.println();
		}

	}


//MÉTODOS PARA VALIDAR LA JUGADA 

	//MÉTODO PARA REVISAR DIAGONAL IZQ-DER.
	public static String revisaDiagoIzqDer(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 0, j = 0; i < gato.length && j < gato[i].length; i++, j++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR DIAGONAL DER-IZQ.
	public static String revisaDiagoDerIzq(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 0, j = 2; i < gato.length && j < gato[i].length; i++, j--){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR VERTICAL SUPERIOR.
	public static String revisaVerticalSup(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 0, j = 0; i < gato.length && j < gato[i].length; j++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR VERTICAL DE ENMEDIO.
	public static String revisaVerticalEnmedio(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 1, j = 0; i < gato.length && j < gato[i].length; j++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR VERTICAL DE INFERIOR.
	public static String revisaVerticalInf(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 2, j = 0; i < gato.length && j < gato[i].length; j++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR HORIZONTAL DE LA IZQUIERDA.
	public static String revisaHorizontalIzq(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 0, j = 0; i < gato.length && j < gato[i].length; i++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR HORIZONTAL DE ENMEDIO.
	public static String revisaHorizontalEnmedio(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 0, j = 1; i < gato.length && j < gato[i].length; i++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}

	//MÉTODO PARA REVISAR HORIZONTAL DE LA DERECHA.
	public static String revisaHorizontalDer(String [][] gato){
		int cruz = 0, circulo = 0;
		for(int i = 0, j = 2; i < gato.length && j < gato[i].length; i++){
			if(gato[i][j].equals("o"))
				circulo++;
			if(gato[i][j].equals("x"))
				cruz++;
		}
		if(cruz == gato.length)
			return "\nGana cruz";
		else if(circulo == gato.length)
			return "\nGana circulo";
		else
			return "";
	}


	//MÉTODO QUE SEÑALA AL GANADOR.
	public static boolean hayGanador(String [][] gato){
		String diagIzqDer = revisaDiagoIzqDer(gato);
		if(!diagIzqDer.equals("")){
			System.out.println(diagIzqDer);
			return true;
			}

		String diagDerIzq = revisaDiagoDerIzq(gato);
		if(!diagDerIzq.equals("")){
			System.out.println(diagDerIzq);
			return true;
			}

		String verticalSup = revisaVerticalSup(gato);
		if(!verticalSup.equals("")){
			System.out.println(verticalSup);
			return true;
			}

		String verticalEnmedio = revisaVerticalEnmedio(gato);
		if(!verticalEnmedio.equals("")){
			System.out.println(verticalEnmedio);
			return true;
			}

		String verticalInf = revisaVerticalInf(gato);
		if(!verticalInf.equals("")){
			System.out.println(verticalInf);
			return true;
			}

		String horizontalIzq = revisaHorizontalIzq(gato);
		if(!horizontalIzq.equals("")){
			System.out.println(horizontalIzq);
			return true;
			}

		String horizontalEnmedio = revisaHorizontalEnmedio(gato);
		if(!horizontalEnmedio.equals("")){
			System.out.println(horizontalEnmedio);
			return true;
			}

		String horizontalDer = revisaHorizontalDer(gato);
		if(!horizontalDer.equals("")){
			System.out.println(horizontalDer);
			return true;
			}

		return false;
	}


	//MÉTODO PARA TIRAR "x"
	public static String equis(String [][] gato, int fila, int columna  ){
		return gato[fila][columna] = "x";		
	}


	//MÉTODO PARA TIRAR "o"
	public static String bolita(String [][] gato, int fila, int columna ){
		return gato[fila][columna] = "o";	
	}


	//MÉTODO PARA SABER SI HAY CASILLAS DISPONIBLES.
	public static boolean disponible(String [][] gato, int fila, int columna){
		boolean dispon;
		if(gato[fila][columna] == ("-")){
			dispon = true;
		}else{
			dispon = false;
		}
		return dispon;
	}


	public static void main(String arg []){
		
		Scanner sc = new Scanner(System.in);
		String gato [][] = new String [3][3];

		System.out.println("\n**** BIENVENIDO AL gato GATO ****\n");
		System.out.println("INSTRUCCIONES:\n");
		System.out.println("-El jugador UNO será \"x\"\n");
		System.out.println("-El jugador DOS será \"o\"\n");
		System.out.println("NOTA:\nDirección de filas: →\nDirección de columnas: ↓");

		System.out.println("\nA continuación se presenta el tablero:\n");
		System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");
	
		for(int i = 0; i < gato.length; i++){
					for(int j = 0; j < gato.length; j++){
						gato[i][j] = "-";
					}
				}

		//CÓDIGO PARA EL TURNO DEL JUGADOR 1.
		System.out.print("\nJugador UNO ¿en qué fila y columna deseas colocar \"x\"?");
		System.out.println("\n-fila: ");
		int fil1 = sc.nextInt();
		if(fil1 != 0 && fil1 != 1 && fil1 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil1 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col1 = sc.nextInt();
		if(col1 != 0 && col1 != 1 && col1 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col1 = sc.nextInt();
	}
		equis(gato,fil1,col1);
		imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 2.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador DOS ¿en qué fila y columna deseas colocar \"o\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones = sc.nextInt();
		if(posiciones == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");
		}
		System.out.println("\n-fila: ");
		int fil2 = sc.nextInt();
		if(fil2 != 0 && fil2 != 1 && fil2 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil2 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col2 = sc.nextInt();
		if(col2 != 0 && col2 != 1 && col2 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col2 = sc.nextInt();
		}

			while(disponible(gato,fil2,col2)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil2 = sc.nextInt();

				System.out.println("\n-columna: ");
					col2 = sc.nextInt();
			}
					bolita(gato,fil2,col2);
			
					bolita(gato,fil2,col2);
					imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 1.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador UNO ¿en qué fila y columna deseas colocar \"x\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones1 = sc.nextInt();
		if(posiciones1 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");
		}
		System.out.println("\n-fila: ");
		int fil3 = sc.nextInt();
		if(fil3 != 0 && fil3 != 1 && fil3 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil3 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col3 = sc.nextInt();
		if(col3 != 0 && col3 != 1 && col3 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col3 = sc.nextInt();
		}
		
			while(disponible(gato,fil3,col3)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil3 = sc.nextInt();

				System.out.println("\n-columna: ");
					col3 = sc.nextInt();
			}
					equis(gato,fil3,col3);
			
					equis(gato,fil3,col3);
					imprime(gato);



		//CÓDIGO PARA EL TURNO DEL JUGADOR 2.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador DOS ¿en qué fila y columna deseas colocar \"o\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones2 = sc.nextInt();
		if(posiciones2 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");
		}
		System.out.println("\n-fila: ");
		int fil4 = sc.nextInt();
		if(fil4 != 0 && fil4 != 1 && fil4 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil4 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col4 = sc.nextInt();
		if(col4 != 0 && col4 != 1 && col4 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col4 = sc.nextInt();
		}
		
			while(disponible(gato,fil4,col4)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil4 = sc.nextInt();

				System.out.println("\n-columna: ");
					col4 = sc.nextInt();
			}
					bolita(gato,fil4,col4);
			
					bolita(gato,fil4,col4);
					imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 1.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador UNO ¿en qué fila y columna deseas colocar \"x\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones3 = sc.nextInt();
		if(posiciones3 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");}
		System.out.println("\n-fila: ");
		int fil5 = sc.nextInt();
		if(fil5 != 0 && fil5 != 1 && fil5 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil5 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col5 = sc.nextInt();
		if(col5 != 0 && col5 != 1 && col5 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col5 = sc.nextInt();
		}
		
			while(disponible(gato,fil5,col5)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil5 = sc.nextInt();

				System.out.println("\n-columna: ");
					col5 = sc.nextInt();
			}
					equis(gato,fil5,col5);
			
					equis(gato,fil5,col5);
					imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 2.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador DOS ¿en qué fila y columna deseas colocar \"o\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones4 = sc.nextInt();
		if(posiciones4 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");}
		System.out.println("\n-fila: ");
		int fil6 = sc.nextInt();
		if(fil6 != 0 && fil6 != 1 && fil6 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil6 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col6 = sc.nextInt();
		if(col6 != 0 && col6 != 1 && col6 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col6 = sc.nextInt();
		}
		
			while(disponible(gato,fil6,col6)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil6 = sc.nextInt();

				System.out.println("\n-columna: ");
					col6 = sc.nextInt();
			}
					bolita(gato,fil6,col6);
			
					bolita(gato,fil6,col6);
					imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 1.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador UNO ¿en qué fila y columna deseas colocar \"x\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones5 = sc.nextInt();
		if(posiciones5 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");}
		System.out.println("\n-fila: ");
		int fil7 = sc.nextInt();
		if(fil7 != 0 && fil7 != 1 && fil7 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil7 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col7 = sc.nextInt();
		if(col7 != 0 && col7 != 1 && col7 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col7 = sc.nextInt();
		}
		
			while(disponible(gato,fil7,col7)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil7 = sc.nextInt();

				System.out.println("\n-columna: ");
					col7 = sc.nextInt();
			}
					equis(gato,fil7,col7);
			
					equis(gato,fil7,col7);
					imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 2.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador DOS ¿en qué fila y columna deseas colocar \"o\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones6 = sc.nextInt();
		if(posiciones6 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");}
		System.out.println("\n-fila: ");
		int fil8 = sc.nextInt();
		if(fil8 != 0 && fil8 != 1 && fil8 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil8 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col8 = sc.nextInt();
		if(col8 != 0 && col8 != 1 && col8 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col8 = sc.nextInt();
		}
		
			while(disponible(gato,fil8,col8)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil8 = sc.nextInt();

				System.out.println("\n-columna: ");
					col8 = sc.nextInt();
			}
					bolita(gato,fil8,col8);
			
					bolita(gato,fil8,col8);
					imprime(gato);


		//CÓDIGO PARA EL TURNO DEL JUGADOR 1.
		if(hayGanador(gato)==false){
		System.out.print("\nJugador UNO ¿en qué fila y columna deseas colocar \"x\"? ");
		System.out.println("\nOprime \"1\" para ver las posiciones en filas y columnas de las celdas. En caso contrario imprime cualquier otro número.");
		int posiciones7 = sc.nextInt();
		if(posiciones7 == 1){
			System.out.println("-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------");
			System.out.print("\nCASILLAS:\nCasilla 1 = 0(fila), 0(columna).\nCasilla 2 = 0(fila), 1(columna).\nCasilla 3 = 0(fila), 2(columna).\nCasilla 4 = 1(fila), 0(columna).\nCasilla 5 = 1(fila), 1(columna)."+
				"\nCasilla 6 = 1(fila), 2(columna).\nCasilla 7 = 2(fila), 0(columna).\nCasilla 8 = 2(fila), 1(columna).\nCasilla 9 = 2(fila), 2(columna).\n");}

		System.out.println("\n-fila: ");
		int fil9 = sc.nextInt();
		if(fil9 != 0 && fil9 != 1 && fil9 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!!");
			System.out.println("\n-fila: ");
			fil9 = sc.nextInt();
		}

		System.out.println("\n-columna: ");
		int col9 = sc.nextInt();
		if(col9 != 0 && col9 != 1 && col9 != 2){
			System.out.println("¡¡Ingresa números establecidos en las casillas tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2)!! ");
			System.out.println("\n-columna: ");
			col9 = sc.nextInt();
		}
		
			while(disponible(gato,fil9,col9)==false){
				System.out.println("\n¡¡CASILLA OCUPADA!!\nRECUERDA ingresar números tal que correspondan a filas (0, 1 ó 2) y columnas (0, 1 ó 2).\n");
				System.out.println("\n-fila: ");
					fil9 = sc.nextInt();

				System.out.println("\n-columna: ");
					col9 = sc.nextInt();
			}
					equis(gato,fil9,col9);
			
					equis(gato,fil9,col9);
					imprime(gato);

System.out.println("\nNo hay ganador :C\n");
	hayGanador(gato);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}