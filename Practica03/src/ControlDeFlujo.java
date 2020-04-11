/**
 * Práctica 3 del curso ICC. "Controladores de Flujo"
 * Usaremos los diferentes controladores de flujo en java, también el Scanner
 * y algunos métodos de la clase String.
 * -NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */

import java.util.Scanner;

public class ControlDeFlujo implements AnalizadorDeCadenas {


//MÉTODOS DE LA INTERFAZ "AnalizadorDeCadenas"

    //Método encuentraPosicion
    @Override
    public int encuentraPosicion(String cadena, char c){ 
    	int posicion = cadena.indexOf(c);
			return posicion;
	}


    //Método esNumero
    @Override
    public boolean esNumero(String cadena){
    	int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
        	//condición que nos permite verificar su en la cadena hay números.
        	if(cadena.charAt(i) != '0' && cadena.charAt(i) != '1' && cadena.charAt(i) != '2'
        		&& cadena.charAt(i) != '3' && cadena.charAt(i) != '4' && cadena.charAt(i) != '5'  
        		&& cadena.charAt(i) != '6' && cadena.charAt(i) != '7' && cadena.charAt(i)
        		!= '8' && cadena.charAt(i) != '9' && cadena.charAt(i) != '.'){
        		return false ;  
      		}
      		//condición que nos permite verificar si hay más de un punto en la cadena.
    		if (cadena.charAt(i) == '.'){
    			contador++;
    		}
    		if(1<contador){
                return false;
       		}
        }
        	return true;
    }
        

    //Método reemplazaCaracter
    @Override
    public String reemplazaCaracter(String cadena, char reemplazado, char reemplazador){
        String nuevaCadena = "";
        for(int i = 0; i < cadena.length(); i++){
        //condición que dado un caracter dentro de la cadena, lo cambia por otro pasado por el usuario.
        if(cadena.charAt(i) == reemplazado){
            nuevaCadena += reemplazador;
        //en caso de ingresas un carácter que no está en la cadena, se regresará a la cadena original.
        } else {
            nuevaCadena += cadena.charAt(i);
        } 
        }
        return nuevaCadena;
    }

        
    //Método cuentaCaracter  
    @Override    
    public int cuentaCaracter(String cadena, char c){ 
     	int posicion, contador = 0;
      	posicion = cadena.indexOf(c);
      	/* código que cuenta las veces que aparece un caracter en la cadena, con ayuda de una variable que
      	 * nos da la posición del caracter, y  un contador que nos da las veces de repeticiones del carácter. */
      	while(posicion != -1){
      		contador++;
      		posicion = cadena.indexOf(c, posicion + 1);
     	}
      	return contador;
    }


 	//Método esPalindromo
 	@Override     
    public boolean esPalindromo(String cadena){ 
    	int indice;
    	//pasamos a minúsculas la cadena
		cadena = cadena.toLowerCase();
		boolean valor = true;
		String otraCadena = "";
		//código que nos ayudará a quitar los espacios de la cadena.
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != ' '){
  				otraCadena += cadena.charAt(i);	
			}
		}
		indice = otraCadena.length();
		//comparamos cadenas
		for (int i = 0; i < otraCadena.length(); i++){
			if (otraCadena.charAt(i) != otraCadena.charAt(indice -1 -i)) 
				/* Cuando un sólo carácter no corresponde a la defición de palíndromo entonces 
				 * regresamos false. */
				return false;
		}
 		return true;
	}


    //Método contiene
    @Override        
    public boolean contiene(String cadena, String buscada){
        boolean valor = false;
        for(int i = 0; i < cadena.length(); i++){
        	//busca el índice de inicio de la segunda cadena (subcadena) en la primera cadena.
            if(cadena.charAt(i) == buscada.charAt(0)){
            	//Si la longitud de la subcadena es mayor, entonces regresa false.
            	if(i + buscada.length() > cadena.length()){
              		return false;
            	}
        		for(int j = 0; j < buscada.length(); j++){
        			/* verifica que los carácteres de la subcadena estén en la cadena original, 
        			 * si son iguales, regresa true. */
            		if(cadena.charAt(i + j) == buscada.charAt(j)){
                		valor = true;
              		} else {
                		valor = false;
              		}
            		}
          	}	
        }
        return valor;
    }


    //Método sonIguales
    @Override        
    public boolean sonIguales(String cadena1, String cadena2){  
    	//pasamos a minúscula los carácteres de cada cadena.
        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();
        //si el tamáno de la cadena 1 es diferente a la cadena 2, regresa false.
        if(cadena1.length() != cadena2.length()){
           return false;
        }
       for(int i=0; i < cadena1.length(); i++){
       	//Si los carácteres de las dos cadenas son diferentes, regresa false.
            if(cadena1.charAt(i) != cadena2.charAt(i)){
               return false;
            }
        }
        return true;
    }


    //Método daSubcadena
    @Override        
    public String daSubcadena(String cadena, int inicio, int fin){
        String subCadena = "";
        //cuando pasen como inicio un índice menor a cero, entoces regresa a la cadena original tal cual.
        if(inicio < 0){
            return cadena;
        }
        //si la longitud de la cadena es menor al índice pasado como final, entonces regresa a la cadena original tal cual.
		if(cadena.length() < fin){
            fin = cadena.length();
        }
        /* cuando los índices estén dentro de los índices de la cadena, entonces regresa 
         * la pequeña subcadena formada al pasar los índice de inicio y fin. */
        for(int i = inicio; i < fin; i++){
            subCadena += cadena.charAt(i);
        }
        return subCadena;
    }


//PARTE EJECUTABLE DEL PROGRAMA
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Mensaje con instrucciones al usuario.
        System.out.println("\n" + "INSTRUCCIONES: Dado un texto que teclees, el programa podrá ser capas de: \n");

        //varibale que nos servirá para saber si el usuario ya no quiere ejecutar el programa
        boolean salir = false;

        //Mensaje con el menú que el usuario puede usar.
        System.out.println("1. DAR POSICIÓN DE ALGÚN CARÁCTER EN LA CADENA.\n"
        	+ "2. SABER SI LA CADENA ES UN NÚMERO. \n"
        	+ "3. REEMPLAZAR UN CARÁCTER POR OTRO EN LA CADENA. \n"
        	+ "4. SABER CUÁNTAS VECES APARECE ALGÚN CARÁCTER DE LA CADENA. \n"
        	+ "5. SABER SI LA CADENA ES UN PALÍNDROMO. \n"
        	+ "6. DADAS DOS CADENAS, SABER SI UNA ESTÁ CONTENIDA EN OTRA. \n"
        	+ "7. DADAS DOS CADENAS, SABER SI SON IGUALES. \n"
        	+ "8. OBTENER UNA SUBCADENA DE LA CADENA DADOS DOS ÍNDICES (INICIO Y FINAL). \n"
        	+ "9. SALIR. \n");

        System.out.println("**** Por favor teclea la opción que quisieras saber dada tu cadena **** \n");
        int opciones = sc.nextInt();

       
        do{ 
            //El switch nos es muy útil para crear menús interactivos con el usuario (junto al Scanner)
            switch(opciones){
                    
                //Caso que se ejecuta cuando el usuario teclea la opción 1 de menú.
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    ControlDeFlujo obj1 = new ControlDeFlujo();
                   
                    System.out.println("1. DAR POSICIÓN DE ALGÚN CARÁCTER EN LA CADENA.\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad1 = sc1.nextLine();
                    System.out.println("\nIngresa el caráter el cuál quisieras saber su posición: ");
                    String car1 = sc1.nextLine();
                    char x = car1.charAt(0);
                    if(obj1.encuentraPosicion(cad1, x) != -1){
                        System.out.println("\""+ x +"\" , posición: " + obj1.encuentraPosicion(cad1, x));
                    }else{
                        System.out.println("\""+ x +"\" no está en la cadena: " + obj1.encuentraPosicion(cad1, x));
                    }           
                    System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                    opciones = sc.nextInt();
                        
                break;

                //Caso que se ejecuta cuando el usuario teclea la opción 2 de menú.
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    ControlDeFlujo obj2 = new ControlDeFlujo();
                   
                    System.out.println("2. SABER SI LA CADENA ES UN NÚMERO.\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad2 = sc2.nextLine();
                    System.out.println("\n" + obj2.esNumero(cad2));
                    System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                    opciones = sc.nextInt();
                break;

                //Caso que se ejecuta cuando el usuario teclea la opción 3 de menú.
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    ControlDeFlujo obj3 = new ControlDeFlujo();
                   
                    System.out.println("3. REEMPLAZAR UN CARÁCTER POR OTRO EN LA CADENA.\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad3 = sc3.nextLine();

                    System.out.println("\nIngresa el caráter a reemplazar: ");
                    String primerCar = sc3.nextLine();
                    char reemplazado = primerCar.charAt(0);

                    System.out.println("\nIngresa el caráter a cambiar: ");
                    String segundoCar = sc3.nextLine();
                    char reemplazador = segundoCar.charAt(0);
                    
                    System.out.println(obj3.reemplazaCaracter(cad3, reemplazado, reemplazador));
                          
                        System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                        opciones = sc.nextInt();
                break;

                //Caso que se ejecuta cuando el usuario teclea la opción 4 de menú.
                case 4:
                          Scanner sc4 = new Scanner(System.in);
                          ControlDeFlujo obj4 = new ControlDeFlujo();
  
                          System.out.println("4. SABER CUÁNTAS VECES APARECE ALGÚN CARÁCTER DE LA CADENA.\n");
                          System.out.println("Ingresa una cadena: ");
                          String cad4 = sc4.nextLine();
  
                          System.out.println("\n¿Qué carácter deseas contar? ");
                          String c = sc4.nextLine();
                          char x4 = c.charAt(0);

                          System.out.print("\n"+ obj4.cuentaCaracter(cad4, x4));

                          System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                          opciones = sc.nextInt();
                    break; 

                //Caso que se ejecuta cuando el usuario teclea la opción 5 de menú.
                case 5:
                    Scanner sc5 = new Scanner(System.in);
                    ControlDeFlujo obj5 = new ControlDeFlujo();
                   
                    System.out.println("5. SABER SI LA CADENA ES UN PALÍNDROMO.\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad5 = sc5.nextLine();

                    System.out.println("\n" + obj5.esPalindromo(cad5));
                    System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                        opciones = sc.nextInt();
                break;

               //Caso que se ejecuta cuando el usuario teclea la opción 6 de menú.
                case 6:
                    Scanner sc6 = new Scanner(System.in);
                    ControlDeFlujo obj6 = new ControlDeFlujo();
                   
                    System.out.println("6. DADAS DOS CADENAS, SABER SI UNA ESTÁ CONTENIDA EN OTRA.\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad6 = sc6.nextLine();

                    System.out.println("\nIngresa otra cadena: ");
                    String cadena2 = sc6.nextLine();

                    System.out.println("\n" + obj6.contiene(cad6, cadena2));
                          
                        System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                        opciones = sc.nextInt();
                break;

 				//Caso que se ejecuta cuando el usuario teclea la opción 7 de menú.
                case 7:
                    Scanner sc7 = new Scanner(System.in);
                    ControlDeFlujo obj7 = new ControlDeFlujo();
                   
                    System.out.println("7. DADAS DOS CADENAS, SABER SI SON IGUALES.\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad7 = sc7.nextLine();

                    System.out.println("\nIngresa otra cadena: ");
                    String cadena7 = sc7.nextLine();

                    System.out.println("\n" + obj7.sonIguales(cad7, cadena7));
                    System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                        opciones = sc.nextInt();
                break;

                //Caso que se ejecuta cuando el usuario teclea la opción 8 de menú.
                case 8:
                    Scanner sc8 = new Scanner(System.in);
                    ControlDeFlujo obj8 = new ControlDeFlujo();
                   
                    System.out.println("8. OBTENER UNA SUBCADENA DE LA CADENA DADOS DOS ÍNDICES (INICIO Y FINAL).\n");
                    System.out.println("Ingresa una cadena: ");
                    String cad8 = sc8.nextLine();

                    System.out.println("\nIngresa el índice de inicio: ");
                    int inicio = sc8.nextInt();

                    System.out.println("\nIngresa el índice final: ");
                    int fin = sc8.nextInt();

                    System.out.println("\n\""+ obj8.daSubcadena(cad8, inicio, fin)+"\"");
                    
                    System.out.println("\n TECLEA CUALQUIER OTRO NÚMERO DEL MENÚ. ");
                        opciones = sc.nextInt();
                break;

                //Si el usuario teclea la opción 9, entonces el programa dejará de ejecutarse.
                case 9:
                	salir = true;
                break;

                //Caso cuando el usuario teclea otro número no establecido en el menú.
        		default:
                    sc.close();
                    opciones=9;
                    System.out.print("¡¡¡ INSERTA NÚMEROS ESTABLECIDOS EN EL MENÚ !!!\n");
                }
              //Queremos que el programa se ejecute n veces hasta que el usuario lo decida.  
            } while(opciones != 9);
    	}   
	}