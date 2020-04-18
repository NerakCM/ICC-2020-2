/**
 * Clase Calculadora
 * @author Adriana Sánchez Del Moral.
 * @version 1.0 
 */

import java.util.Scanner;  

public class Calculadora{
	/** Color de la calculadora */
	private String color;

	/** Marca de la calculadora */
	private String marca;

	/** Propietario de la calculadora */
	private  String nombreDuenio;



	/**
     * Constructor de una calculadora.
     * @param color color de la calculadora.
     * @param marca marca de la calculadora.
     * @param nombreDuenio propietario de la calculadora.
     */


	public Calculadora(String color, String marca, String duenio){
		this.color = color;
		this.marca = marca;
		this.nombreDuenio = duenio;
	}

	/**
     * Constructor por default de una calculadora.
     */

	public Calculadora(){
		this.color = "Negro";
		this.marca = "Patito";
		this.nombreDuenio = "Sin dueño";
	}

	/**
     * Metodo toString para representar una calculadora
     */

	@Override
	public String toString(){
		return "- Calculadora de: " + this.getDuenio() + ".\n- Color: "+ this.getColor() + ". \n- Marca: "+ this.getMarca();
	}

	/**
     * Modifica el color de la calculadora.
     * @param color color de la calculadora.
     */
	public void setColor(String color){
		this.color=color;
	}

	/**
     * Modifica la marca de la calculadora.
     * @param marca marca de la calculadora.
     */
	public void setMarca(String marca){
		this.marca=marca;
	}

	/**
     * Modifica el duenio de la calculadora
     * @param duenio duenio de la calculadora.
     */
	public void setDuenio(String duenio){
		this.nombreDuenio=duenio;
	}

	/**
     * Regresa el color de la calculadora.
     * @return el color de la calculadora.
     */

	//Métodos de Acceso, permiten ver el estado de una instancia (getters inlcuyen return, no llevan parámetros).
	public String getColor(){ 
		return this.color;
	}

	public String getMarca(){
		return this.marca;
	}

	public String getDuenio(){
		return this.nombreDuenio;
	}


	/**
     * Realiza una suma de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return a+b
     */

	public int sumarBinaria (int a, int b){
		return a+b;
	}

	/**
     * Realiza una resta de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return a-b	
     */

	public int restarBinaria (int a, int b){
		return a-b;
	}

	/**
     * Realiza una multiplicación de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return  a*b		
     */

	public int multiplicar (int a, int b){
		return a*b;
	}

	/**
     * Realiza una división de doa numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return  a/b	
     */

	public int dividir (int a, int b){
		if(b > 0)
			return a/b;
		else 
			return -1000; //Se pudo regresar cualquier OTRA numero "absurdo"
	}

	/**
     * Obtiene el modulo de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return  a%b		
     */

	public int modular (int a, int b){
		return a%b;
	}


	/**
     * Obtiene la suma de dos numeros enteros haciendo operaciones unarias Postfijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a+b		
     */

	public int sumarPostfijo (int a, int b){
		for(int i= 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " x++ " + a++);
		
		}
		return a;
	}

	/**
     * Obtiene la resta de dos numeros enteros haciendo operaciones unarias Postfijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a-b		
     */

	public int restarPostfijo (int a, int b){
		for(int i = 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " x-- " + a--);
		}
		return a;
	}



	/**
     * Obtiene la suma de dos numeros enteros haciendo operaciones unarias Sufijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a+b		
     */

	public int sumarSufijo (int a, int b){
		for(int i= 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " ++x " + ++a);
		
		}
		return a;
	}

	/**
     * Obtiene la resta de dos numeros enteros haciendo operaciones unarias Sufijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a-b		
     */

	public int restarSufijo (int a, int b){
		for(int i = 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " --x " + --a);
		}
		return a;
	}

	public static void main(String[] args) {

		/*
		* Creación del menú (de la clase Calculadora)
 		* Alumna: Cristóbal Morales Karen.
 		*/

		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		
		//Mensaje con instrucciones al usuario.
        System.out.println("\n" + "INSTRUCCIONES: Selecciona una opción del menú para poder realizar dicha  operación. \n\n"
        	+ "*ADEVRTENCIA: Además de la opción 0, si eliges un número fuera del menú, el programa cerrará automáticamente.\n\n");

		System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 

		System.out.print("Teclea la opción que desees realilzar: ");
		int opciones = sc.nextInt();

		do{ 
            switch(opciones){
                    
                //Opción de salir.
                case 0:
                	salir = true;
                break;

               case 1:
                	Scanner sc1 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 1: CONFIGURA LOS DATOS DE LA CALCULADORA ****\n");
                    System.out.print("- Ingresa el nombre del dueño de la calculadora: ");
                    String duenio = sc1.nextLine();
                    calculadora.setDuenio(duenio);
                    System.out.print("- Ingresa la marca de la calculadora: ");
                    String marca = sc1.nextLine();
                    calculadora.setMarca(marca);
                    System.out.print("- Ingresa el color de la calculadora: ");
                    String color = sc1.nextLine();
                    calculadora.setColor(color);

                    System.out.print("\n¡¡¡ Los datos han sido guardados exitosamente C: !!! ");
                    
                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                 case 2:
                	System.out.println("\n**** Elegiste la opción 2: OBTENER DATOS ****\n");
                    System.out.println(calculadora.toString());
                   
                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                case 3:
                	Scanner sc3 = new Scanner(System.in);
                   
                    System.out.println("\n**** Elegiste la opción 3: HACER SUMA BINARIA ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a3 = sc3.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b3 = sc3.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.sumarBinaria(a3,b3)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;
                

                case 4:
                	Scanner sc4 = new Scanner(System.in);
                   
                    System.out.println("\n**** Elegiste la opción 4: HACER RESTA BINARIA ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a4 = sc4.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b4 = sc4.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.restarBinaria(a4,b4)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;

            	
            	case 5:
                	Scanner sc5 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 5: HACER MULTIPLICACIÓN ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a5 = sc5.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b5 = sc5.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.multiplicar(a5,b5)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                case 6:
                	Scanner sc6 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 6: HACER DIVISIÓN ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a6 = sc6.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b6 = sc6.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.dividir(a6,b6)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                case 7:
                	Scanner sc7 = new Scanner(System.in);
                     
                    System.out.println("\n**** Elegiste la opción 7: HACER MODULO ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a7 = sc7.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b7 = sc7.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.modular(a7,b7)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                case 8:
                	Scanner sc8 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 8: HACER SUMA OPERADOR INCREMENTO POSTFIJO ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a8 = sc8.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b8 = sc8.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.sumarPostfijo(a8,b8)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                case 9:
                	Scanner sc9 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 9: HACER SUMA OPERADOR INCREMENTO SUFIJO ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a9 = sc9.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b9 = sc9.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.sumarSufijo(a9,b9)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;


                case 10:
                	Scanner sc10 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 10: HACER RESTA OPERADOR INCREMENTO POSTFIJO ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a10 = sc10.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b10 = sc10.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.restarPostfijo(a10,b10)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n");
					System.out.print("Opción: "); 
                    opciones = sc.nextInt();
                break;


                case 11:
                	Scanner sc11 = new Scanner(System.in);
                    
                    System.out.println("\n**** Elegiste la opción 11: HACER RESTA OPERADOR INCREMENTO SUFIJO ****\n");
                    System.out.print("- Ingresa primer número: ");
                    int a11 = sc11.nextInt();
                    System.out.print("- Ingresa segundo número: ");
                    int b11 = sc11.nextInt(); 
                    System.out.println("\nResultado −> " + calculadora.restarSufijo(a11,b11)); 

                    System.out.println("\n\n------------------------------------------------------------");
                    System.out.println("\nTECLEA CUALQUIER OTRA OPCIÓN DEL MENÚ.\n");
                    System.out.println("0- Salir. \n" +
						   "1- Configura los datos de la calculadora. \n"+
						   "2- Obtener datos. \n" +
						   "3- Hacer suma binaria. \n" +
						   "4- Hacer resta binaria. \n" +
						   "5- Hacer multiplicación. \n" +
						   "6- Hacer división. \n" +
						   "7- Hacer modulo. \n" +
						   "8- Hacer suma operador incremento postfijo. \n" +
						   "9- Hacer suma operador incremento sufijo. \n" +
						   "10- Hacer resta operador incremento postfijo. \n" +
						   "11- Hacer resta operador incremento sufijo. \n"); 
                    System.out.print("Opción: ");
                    opciones = sc.nextInt();
                break;

                default:
                	salir = true;
                	System.out.print("\n¡¡¡ INSERTA NÚMEROS ESTABLECIDOS EN EL MENÚ !!!\n");
                break;

            }

            if (opciones == 0){
				System.out.println("\nCalculadora de \"" + calculadora.getDuenio() + "\" fuera.\n");
			}  
                     
        }while(opciones != 0 && salir == false);

	}
}