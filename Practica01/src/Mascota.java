/**
 * Práctica 2 del curso ICC. "Clases y Objetos"
 * -NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */

public class Mascota {

	//ACTIVIDAD 1 - Declaración de variables y atributos.

        /** Atributo que servirá para crear a diversos perros. */
	    public String perros;
        
        /** Atributo que servirá para decirnos el número de chip en caso de extravío de un perro, la cual 
         *  posteriormente nos servirá para registrarlo en una aplicaicón la cual nos dirá a cuántos
         *  kilómetros se encuentra el perro de nosostros.
         *  El atributo es private, porque ésta información es personal para el perro y el (los) dueño(s). */
		private int numeroDeChipDeExtravio;

        /** Atributo que servirá para decirnos el nombre del perro. */
		public String nombre;

        /** Atributo que servirá para especificar qué raza es el perro. */
		public String raza;

		/** Atributo que servirá para especificar el color del perro. */
		public String color;

        /** Atributo que servirá para saber si el perro es macho (M) ó hembra (H). */
		public char genero;

		/** Atributo que servirá para epecificar el número de patas de la mascota (en caso de que 
		 *  haya perdido alguna en un accidente ó por nacimiento. */
		public int numeroDePatas;

        /** Atributo que sirve para especificar que (suponiendo este caso) los perros siempre tendrán sus dos orejas. */
		public final int numeroDeOrejas = 2;

        /** Atributo que servirá para que un perro le diga a otro lo que más adora de su dueño. */
		private String adorarMasDeSuDuenio;

		/** Atributo que servirá para que un perro pueda guardar recuerdos. */
		private String recuerdos;
        
        /** Atributo que servirá para que un perro pueda guardar recuerdos. */
		public int nombre1;

    
    //ACTIVIDAD 2 - Implementar métodos contructores.

	    /**
        * Construye a un nuevo perro con sus atributos.
        * @param numeroDeChipDeExtravio clave (numérica) única en caso de extravío del perro.
        * @param nombre nombre del perro.
        * @param raza raza del perro.
        * @param color color del perro.
        * @param genero el perro es macho ó hembra.
        * @param numeroDePatas cantidad de patas que tiene el perro.
        */ 
        public Mascota(int numeroDeChipDeExtravio, String nombre, String raza, String color, char genero, 
        int numeroDePatas){
    	    this.numeroDeChipDeExtravio = numeroDeChipDeExtravio;
     	    this.nombre = nombre;
	        this.raza = raza;
	        this.color = color;
	        this.genero = genero;
	        this.numeroDePatas = numeroDePatas;
	    }

        /**
        * Construye a un nuevo perro con sus atributos.
        * Sobreescribe el metodo constructor, aquí deben cambiar los parametros.
        * En éste caso quitaremos el atributo "numeroDeChipDeExtravio", ya que no todos los dueños se
        * lo ponen a sus perros porque es algo costoso, por lo tanto habrá perros sin chip.
        * @param nombre nombre del perro.
        * @param raza raza del perro.
        * @param color color del perro.
        * @param genero el perro es macho ó hembra.
        * @param numeroDePatas cantidad de patas que tiene el perro.
        */
        public Mascota(String nombre, String raza, String color, char genero, int numeroDePatas){
	        this.nombre = nombre;
	        this.raza = raza;
	        this.color = color;
	        this.genero = genero;
	        this.numeroDePatas = numeroDePatas;
        }


        //Métodos de Acceso

        /**
        * Permite accesar al número de chip de extravío del perro.
        * @return clave númerica.
        */
        public int getNumeroDeChipDeExtravio(){
	        return this.numeroDeChipDeExtravio;
        }

        /**
        * Permite accesar al nombre del perro.
        * @return el nombre del perro.
        */
        public String getNombre(){
	        return this.nombre;
        }

        /**
        * Permite accesar a la raza del perro.
        * @return la raza del perro.
        */
        public String getRaza(){
	        return this.raza;
        }

        /**
        * Permite accesar al color del perro.
        * @return el color del perro.
        */
        public String getColor(){
	        return this.color;
        }

        /**
        * Permite accesar al género del perro.
        * @return el género del perro.
        */
        public char getGenero(){
	        return this.genero;
        }

        /**
        * Permite accesar al número de patas del perro.
        * @return el número de patas del perro.
        */
        public int getNumeroDePatas(){
	        return this.numeroDePatas;
        }


        //Métodos de Manipulación.

        /**
        * Modifica el número de chip de extravío del perro.
        * @param numeroDeChipDeExtravio nuevo número de chip de extravío del perro.
        */
        public void setNumeroDEChipDeExtravio(int numeroDeChipDeExtravio){
	        this.numeroDeChipDeExtravio = numeroDeChipDeExtravio;
        }

        /**
        * Modifica el nombre del perro.
        * @param nombre nuevo nombre del perro.
        */
        public void setNombre(String nombre){
	        this.nombre = nombre;
        }

        /**
        * Modifica la raza del perro.
        * @param raza nuevo raza del perro.
        */
        public void setRaza(String raza){
	        this.raza = raza;
        }

        /**
        * Modifica el color del perro.
        * @param color nuevo color del perro.
        */
        public void setColor(String color){
	        this.color = color;
        }

        /**
        * Modifica el género del perro.
        * @param genero nuevo género del perro.
        */
        public void setGenero(char genero){
	        this.genero = genero;
        }

        /**
        * Modifica el número de patas del perro.
        * @param numeroDePatas nuevo número de patas del perro.
        */
        public void setNumeroDePatas(int numeroDePatas){
	        this.numeroDePatas = numeroDePatas;
        }

    //ACTIVIDAD 3 - Recuerdos de mascota.


        /**
        * Permite expresar lo que un perro adora más de su dueño a otro perro. 
        * @return lo que el perro más adora de su dueño.
        */
        public String getAdorarMasDeSuDuenio(){
	        return this.adorarMasDeSuDuenio;
        }

        /**
        * Modifica el mensaje de lo que un perro más adora de su dueño.
        * @param adorarMasDeSuDuenio nuevo mensaje de lo que un perro más adora de su dueño.
        */
        public void setAdorarMasDeSuDuenio(String adorarMasDeSuDuenio){
	        this.adorarMasDeSuDuenio = adorarMasDeSuDuenio;
        }

        //Métodos de Implementación.

        /**
        * Permite a un perro contarle a otro perro lo que más adora de su dueño. 
        * @param adorarMasDeSuDuenio lo que el perro adora más de su dueño
        * @param perro nombre del perro que va a escuchar.
        */
        public void contar(String adorarMasDeSuDuenio, Mascota perro){
	        System.out.println(this.getNombre() + " le ha contado a " +
			   perro.getNombre() + " que lo que más adora de su dueño es " + this.adorarMasDeSuDuenio());
        }

        /**
        * Permite a un perro recordar lo que otros perros le ha contado sobre lo que adoran de sus dueños.
        * @param perro nombre del perro que contó qué adora de su dueño.
        * @param perro1 otro nombre del perro que contó qué adora de su dueño.
        * @param perro2 otro nombre de perro que contó qué adora de su dueño.
        */
        public void recordar(Mascota perro, Mascota perro2, Mascota perro3){
	        System.out.println(this.getNombre() + " ha recordado que  " +
			   perro.getNombre() +  " lo que más adora de su dueño es " + perro.adorarMasDeSuDuenio() + 
			   ", " + perro1.getNombre() +  " lo que más adora de su dueño es " + perro1.adorarMasDeSuDuenio()
			   + "y " + perro2.getNombre() +  " lo que más adora de su dueño es " + perro2.adorarMasDeSuDuenio());
        }

            @Override
            public String toString(){
			return "Nombre: "+this.nombre +
	    		this.adorarMasDeSuDuenio() + this.recordar();
    		}

    	public static void main(String[] args) {
			Mascota perro = new Mascota("Lucky", "que lo acaricie");
			Mascota perro1 = new Mascota("Manchas","que jueguen a la pelota juntos");
			Mascota perro2 = new Mascota("Max","que le de de su comida");
			Mascota perro3 = new Mascota("Kiara", "que paseén juntos en la noche");
			Mascota perro4 = new Mascota("Galleta","que le bese su frente");
			Mascota perro5 = new Mascota("Zeus","que le de pequeñas palamditas en su lomito");

				System.out.println(perro);
				System.out.println(perro1);
				System.out.println(perro2);
				System.out.println(perro3);
				System.out.println(perro4);
				System.out.println(perro5);


	//ACTIVIDAD 4 - Variable estática que indica cuantas instancias de la clase hay.




        
        



		









}







}