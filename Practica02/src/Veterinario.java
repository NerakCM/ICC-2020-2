/**
 * Práctica 2 del curso ICC. "Clases y Objetos"
 * -NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */


//ACTIVIDAD 5

	public class Veterinario{

	//Declaración de atributos.
	
		/** Atributo que servirá para decirnos el nombre del veterinario */
		public String nombre;

		/** Atributo que servirá para decirnos el género del veterinario */
		public String genero;


	//Método constructor para el veterinario

		/**
        * Construye a un nuevo veterinario con sus atributos.
        * @param nombre nombre del veterinario
        * @param genero si el veterinario es hombre o mujer.
        */ 
        public Veterinario(String nombre, String genero){
            this.nombre = nombre;
    	    this.genero = genero;
	    }


	//Métodos de Acceso

        /**
         * Permite saber el nombre del veterinario.
         * @return el nombre del vterinario.
         */
        public String getNombre(){
            return this.nombre;
        }

		/**
         * Permite saber si el veterinario es hombre o mujer.
         * @return el genero del veterinario.
         */
        public String getGenero(){
            return this.genero;
        }


    //Métodos de Manipulación.

        /**
        * Modifica el nombre del veterinario.
        * @param nombre nuevo nombre del veterinario.
        */
        public void setNombre(String nombre){
	        this.nombre = nombre;
        }

        /**
        * Modifica el genero del veterinario.
        * @param nombre nuevo genero del veterinario.
        */
        public void setGenero(String nombre){
	        this.genero = genero;
        }



	//Métodos de implementación

        /**
        * Permite hacer mejores amigos a dos mascotas.
        * @param masc1 primera mascota que formará parte de la relación de amistas.
        * @param masc2 segunda mascota que formará parte de la relación deamistad.
        */
		public void hacerAmistad(Mascota masc1, Mascota masc2){
			//Caso 1
			masc1.setNoAmigos(masc1.getAmigos());
			masc1.setAmigos(masc2);
			//Caso 2
			masc2.setNoAmigos(masc2.getAmigos());
			masc2.setAmigos(masc1);
		}

		/**
        * Permite deshacer una relación de amistad entre dos mascotas.
        * @param masc1 primera mascota que formará parte de la relación de amistas.
        */
		public void deshacerAmistad(Mascota masc1){
			masc1.setAmigos(masc1.getNoAmigos());
			masc1.setNoAmigos(null);
		}



		@Override 
    	public String toString(){
    	return "Nombre del veterinario: " + this.nombre 
        + "\nGenero: "+this.genero;
    	}

	
	//(EJECUCIÓN DEL PROGRAMA)

	public static void main(String[] args) {
		
		//(Instancias de la clase Veterinario)
		Veterinario veterinario1 = new Veterinario ("Mario", "hombre");
		Veterinario veterinario2 = new Veterinario ("Roxana", "mujer");

		
		System.out.println("-----------------------------------");
		System.out.println("*** DATOS DE LOS VETERINARIOS ***" + "\n");
		System.out.println("(1)");
		System.out.println(veterinario1 + "\n");
		System.out.println("(2)");
        System.out.println(veterinario2 + "\n");
     

		Mascota perro1 = new Mascota("Perro", "Lucky", "Cocker", "dorado", 'M', 4, " Que le de baños calientes con masaje. ");
        Mascota perro2 = new Mascota("Perro", "Galleta", "Schnauzer", "gris", 'H', 3, " Que le rasque el lomito. ");
		Mascota perro3 = new Mascota("Perro", "Manchas", "Bóxer", "negro",'M', 4, " Que juega mucho con él. ");
		Mascota perro4 = new Mascota("Perro", "Zeus", "Husky", "gris con blanco",'M', 4, " Cuando le hace carne especial. ");
		Mascota perro5 = new Mascota("Perro", "Kiara", "Labrador", "café claro - dorado", 'H', 4, " Su olor. ");
		Mascota perro6 = new Mascota("Perro", "Rocky", "Bulldog", "café", 'M', 4, " Que es puntual para sacarlo a pasear. ");
        Mascota perro7 = new Mascota("Perro", "Luna", "Pit bull", "blanco", 'H', 4, " Que lo cargue y lo abrace. ");		

		System.out.println("-----------------------------------");

		System.out.println("*** RELACIONES DE AMISTAD DE LAS MASCOTAS ***" + "\n");

	//CASO 1
		System.out.println("CASO 1" + "\n");

		System.out.println("El veterinario " + veterinario1.getNombre() + " ha registrado la siguiente información: " + "\n");

		//cuando dos mascotas son amigos
		veterinario1.hacerAmistad(perro1, perro2);
		veterinario1.hacerAmistad(perro1, perro3);
		System.out.println(perro1 + "\n");	

		//cuando dos mascotas ya no son amigos
		veterinario1.deshacerAmistad(perro1);

		System.out.println("El veterinario " + veterinario1.getNombre() + " ha vuelto a hacer amigos a los perros que anteriormente ya no lo eran. \n\n" 
			+ perro1 + "\n\n");


	//CASO 2
		System.out.println("CASO 2" + "\n");

		System.out.println("La veterinaria " + veterinario2.getNombre() + " ha registrado la siguiente información: " + "\n");

		//cuando dos mascotas son amigos
		veterinario2.hacerAmistad(perro6, perro4);
		veterinario2.hacerAmistad(perro6, perro1);
		System.out.println(perro6 + "\n");	

		//cuando dos mascotas ya no son amigos
		veterinario2.deshacerAmistad(perro6);

		System.out.println("La veterinaria " + veterinario2.getNombre() + " ha vuelto a hacer amigos a los perros que anteriormente ya no lo eran. \n\n" 
			+ perro6 + "\n\n");


	//CASO 3
		System.out.println("CASO 3" + "\n");

		System.out.println("El veterinario " + veterinario1.getNombre() + " ha registrado la siguiente información: " + "\n");

		//cuando dos mascotas son amigos
		veterinario1.hacerAmistad(perro7, perro5);
		veterinario1.hacerAmistad(perro7, perro3);
		System.out.println(perro7 + "\n");	

		//cuando dos mascotas ya no son amigos
		veterinario1.deshacerAmistad(perro7);

		System.out.println("El veterinario " + veterinario1.getNombre() + " ha vuelto a hacer amigos a los perros que anteriormente ya no lo eran. \n\n" 
			+ perro7 + "\n\n");


	//CASO 4
		System.out.println("CASO 4" + "\n");

		System.out.println("La veterinaria " + veterinario2.getNombre() + " ha registrado la siguiente información: " + "\n");

		//cuando dos mascotas son amigos
		veterinario2.hacerAmistad(perro3, perro6);
		veterinario2.hacerAmistad(perro3, perro1);
		System.out.println(perro3 + "\n");	

		//cuando dos mascotas ya no son amigos
		veterinario2.deshacerAmistad(perro3);

		System.out.println("La veterinaria " + veterinario2.getNombre() + " ha vuelto a hacer amigos a los perros que anteriormente ya no lo eran. \n\n" 
			+ perro3 + "\n\n");


	//CASO 5
		System.out.println("CASO 5" + "\n");

		System.out.println("El veterinario " + veterinario1.getNombre() + " ha registrado la siguiente información: " + "\n");

		//cuando dos mascotas son amigos
		veterinario1.hacerAmistad(perro5, perro7);
		veterinario1.hacerAmistad(perro5, perro2);
		System.out.println(perro5 + "\n");	

		//cuando dos mascotas ya no son amigos
		veterinario1.deshacerAmistad(perro5);

		System.out.println("El veterinario " + veterinario1.getNombre() + " ha vuelto a hacer amigos a los perros que anteriormente ya no lo eran. \n\n" 
			+ perro5 + "\n\n");


		//CASO 6
		System.out.println("CASO 6" + "\n");

		System.out.println("La veterinaria " + veterinario2.getNombre() + " ha registrado la siguiente información: " + "\n");

		//cuando dos mascotas son amigos
		veterinario2.hacerAmistad(perro2, perro3);
		veterinario2.hacerAmistad(perro2, perro7);
		System.out.println(perro2 + "\n");	

		//cuando dos mascotas ya no son amigos
		veterinario2.deshacerAmistad(perro2);

		System.out.println("La veterinaria " + veterinario2.getNombre() + " ha vuelto a hacer amigos a los perros que anteriormente ya no lo eran. \n\n" 
			+ perro2 + "\n\n");

	}
}


	