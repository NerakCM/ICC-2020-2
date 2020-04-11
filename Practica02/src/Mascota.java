/**
 * Práctica 2 del curso ICC. "Clases y Objetos"
 * -NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */


public class Mascota {


//ACTIVIDAD 1 - Declaración de variables y atributos.


        /** Atributo que sirve para especificar qué animal es la mascota (en éste caso nos enfocaremos solo a perros). */
        public String perro;

        /** Atributo que servirá para decirnos el número de chip en caso de extravío de un perro, el cual 
         *  posteriormente nos servirá para registrarlo en una aplicación y ésta nos dirá a cuántos
         *  kilómetros se encuentra el perro de nosostros.
         *  El atributo es private, porque ésta información es personal para el perro y el (los) dueño(s). */
		private int numeroDeChipDeExtravio;

        /** Atributo que servirá para decirnos el nombre del perro. */
		public String nombre;

        /** Atributo que servirá para especificar qué raza es el perro. */
		public String raza;

		/** Atributo que servirá para especificar el color del pelaje del perro. */
		public String color;

        /** Atributo que servirá para saber si el perro es macho (M) ó hembra (H). */
		public char genero;

		/** Atributo que servirá para epecificar el número de patas de la mascota (en caso de que 
		 *  haya perdido alguna en un accidente ó por nacimiento. */
		public int numeroDePatas;

        /** Atributo que sirve para especificar que (suponiendo este caso) los perros siempre tendrán sus dos orejas. */
		public final int NUMERO_DE_OREJAS = 2;



        //ACTIVIDAD 3
        /** Atributo que servirá para que un perro le diga a otro lo que más adora de su dueño. */
        private String adorarMasDeSuDuenio;

        /** Atributo que servirá para que un perro pueda guardar recuerdos. */
        private String recuerdos = "";



        // ACTIVIDAD 4
        /**  Atributo que nos permite saber cuántas instancias de la clase hemos creado. */
        public static int NumInstancias;


        // ACTIVIDAD 5
        /**  Atributo que nos permite saber que dos mascotas son mejores amigos. */
        private Mascota amigos;

        /**  Atributo que nos permite saber que dos mascotas no son mejores amigos. */
        private Mascota noAmigos;



//ACTIVIDAD 2 - Implementar métodos contructores.

	    /**
        * Construye a un nuevo perro con sus atributos.
        * @param perro tipo de mascota.
        * @param numeroDeChipDeExtravio clave (numérica) única en caso de extravío del perro.
        * @param nombre nombre del perro.
        * @param raza raza del perro.
        * @param color color del perro.
        * @param genero el perro es macho ó hembra.
        * @param numeroDePatas cantidad de patas que tiene el perro.
        * @param adorarMasDeSuDuenio lo que un perro más adora de su dueño. (ACTIVIDAD 3)
        * @param NumInstancias cantidad de instancias de la clase que hemos creado (ACTIVIDAD 4).
        */ 
        public Mascota(String perro, int numeroDeChipDeExtravio, String nombre, String raza, String color, char genero, 
        int numeroDePatas, String adorarMasDeSuDuenio, int NumInstancias){
            this.perro = perro;
    	    this.numeroDeChipDeExtravio = numeroDeChipDeExtravio;
     	    this.nombre = nombre;
	        this.raza = raza;
	        this.color = color;
	        this.genero = genero;
	        this.numeroDePatas = numeroDePatas;
            this.adorarMasDeSuDuenio = adorarMasDeSuDuenio; //(ACTIVIDAD 3)
            this.NumInstancias++; //(ACTIVIDAD 4)
	    }

        /**
        * Construye a un nuevo perro con sus atributos.
        * Sobreescribe el método constructor, aquí deben cambiar los parametros.
        * En éste caso quitaremos el atributo "numeroDeChipDeExtravio", ya que no todos los dueños tienen la 
        * oportunidad de ponérlselo a sus perros porque es algo costoso, por lo tanto habrá perros sin chip.
        * @param perro tipo de mascota.
        * @param nombre nombre del perro.
        * @param raza raza del perro.
        * @param color color del perro.
        * @param genero el perro es macho ó hembra.
        * @param numeroDePatas cantidad de patas que tiene el perro.
        * @param adorarMasDeSuDuenio lo que un perro más adora de su dueño. (ACTIVIDAD 3)
        * @param NumInstancias cantidad de instancias de la clase que hemos creado (ACTIVIDAD 4).
        */
        public Mascota(String perro, String nombre, String raza, String color, char genero, int numeroDePatas, 
            String adorarMasDeSuDuenio){
            this.perro = perro;
	        this.nombre = nombre;
	        this.raza = raza;
	        this.color = color;
	        this.genero = genero;
	        this.numeroDePatas = numeroDePatas;
            this.adorarMasDeSuDuenio = adorarMasDeSuDuenio; //(ACTIVIDAD 3)
            this.NumInstancias++; //(ACTIVIDAD 4)
        }



    //Métodos de Acceso

        /**
         * Permite saber qué tipo de macota es.
         * @return tipo de mascota, es éste caso especificamos anteriorimente que queríamos solo perros.
         */
        public String getPerro(){
            return this.perro;
        }

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


        //(ACTVIDAD 3)
        /**
        * Permite expresar lo que un perro adora más de su dueño a otro perro. 
        * @return lo que el perro más adora de su dueño.
        */
        public String getAdorarMasDeSuDuenio(){
            return this.adorarMasDeSuDuenio;
        }

        /**
        * Permite mostrar los recuerdos alamcenados que tiene un perro. 
        * @return recuerdos.
        */
        public String getRecuerdos(){
            return this.recuerdos;
        }


        //(ACTVIDAD 4)
        /**
        * Nos permitirá saber cuántas instancias hemos creado de la clase.
        * @return el total de instancias de la clase que creamos.
        */
        public int getNumInstancias(){
            return this.NumInstancias;
        }


        //(ACTVIDAD 5)
        /**
        * Nos permitirá saber si dos mascotas son mejores amigos.
        * @return si dos mascotas son mejores amigos.
        */
        public Mascota getAmigos(){
            return this.amigos; 
        }

        /**
        * Nos permitirá saber si dos mascotas no son amigos.
        * @return si dos mascotas no son amigos.
        */
        public Mascota getNoAmigos(){
            return this.noAmigos; 
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


        //(ACTIVIDAD 3)
        /**
        * Modifica el mensaje de lo que un perro más adora de su dueño.
        * @param adorarMasDeSuDuenio nuevo mensaje de lo que un perro más adora de su dueño.
        */
        public void setAdorarMasDeSuDuenio(String adorarMasDeSuDuenio){
            this.adorarMasDeSuDuenio = adorarMasDeSuDuenio;
        }

        /**
        * Modifica los recuerdos que va teniendo el perro.
        * @param recuerdos nuevos recuerdos de otros perros. 
        */
        public void setRecuerdos(String recuerdos){
            this.recuerdos = recuerdos;
        }        


        //(ACTVIDAD 4)
        /**
         * Modifica el número de intancias.
         * @param NumInstancias el nuevo número de intancias.
         */
        public void setNumInstancias(int NumInstancias){
            this.NumInstancias = NumInstancias;
        }


        //(ACTVIDAD 5)
        /**
        * Nos permitirá modificar la relacion de amistad. Y hacer a dos mascotas mejores amigos.
        * @param amigos nueva relación de amistad entre dos mascotas.
        */
        public void setAmigos(Mascota amigos){
            this.amigos = amigos; 
        }

        /**
        * Nos permitirá modificar la relación de amistad para dejar que ya no sean mejores amigos.
        * @param noAmigos nueva relación rota de amistad entre dos mascotas.
        */
        public void setNoAmigos(Mascota noAmigos){
            this.noAmigos = noAmigos; 
        }


//ACTIVIDAD 3 - Recuerdos de mascota.

        /**
        * Permite a un perro contarle a otro perro lo que más adora de su dueño. 
        * @param perrox lo que el perro adora más de su dueño
        */
        public void contar(Mascota perrox){
            this.setRecuerdos(this.recuerdos + " " + perrox.getAdorarMasDeSuDuenio());
    } 


    //(EJECUCIÓN DEL PROGRAMA)

        @Override
            public String toString(){
                return "Tipo de mascota: " + this.perro
                    +  "\nNombre: " + this.nombre 
                    +  "\nRaza: " + this.raza
                    +  "\nColor: " + this.color 
                    +  "\nGénero: " + this.genero 
                    +  "\nNúmero de patas : " + this.numeroDePatas 
                    +  "\nNúmero de orejas : " + this.NUMERO_DE_OREJAS
                    +  "\nLo que más adora de su dueño es: " + this.adorarMasDeSuDuenio 
                    +  (this.amigos == null ? "" : "\nSu mejor amigo es: " + this.amigos.nombre)
                    +  (this.noAmigos== null ? "" : "\nSu ex mejor amigo es : " + this.noAmigos.nombre) + "\n";
            }  
            


    	public static void main(String[] args) {

            //(Instancias de la clase Mascota)
			Mascota perro1 = new Mascota("Perro", "Lucky", "Cocker", "dorado", 'M', 4, " Que le de baños calientes con masaje. ");
            Mascota perro2 = new Mascota("Perro", "Galleta", "Schnauzer", "gris", 'H', 3, " Que le rasque el lomito. ");
			Mascota perro3 = new Mascota("Perro", "Manchas", "Bóxer", "negro",'M', 4, " Que juega mucho con él. ");
			Mascota perro4 = new Mascota("Perro", "Zeus", "Husky", "gris con blanco",'M', 4, " Cuando le hace carne especial. ");
			Mascota perro5 = new Mascota("Perro", "Kiara", "Labrador", "café claro - dorado", 'H', 4, " Su olor. ");
			Mascota perro6 = new Mascota("Perro", "Rocky", "Bulldog", "café", 'M', 4, " Que es puntual para sacarlo a pasear. ");
            Mascota perro7 = new Mascota("Perro", "Luna", "Pit bull", "blanco", 'H', 4, " Que lo cargue y lo abrace. ");


            System.out.println("*** INFORMACIÓN DE LAS MASCOTAS *** " + "\n");
            System.out.println(perro1 + "\n");
            System.out.println(perro2 + "\n");
            System.out.println(perro3 + "\n");
            System.out.println(perro4 + "\n");
            System.out.println(perro5 + "\n");
            System.out.println(perro6 + "\n");
            System.out.println(perro7 + "\n");


            //RECUERDOS DE LAS MASCOTAS

            perro1.contar(perro3);
            perro1.contar(perro5);
            perro1.contar(perro4);

            perro2.contar(perro1);
            perro2.contar(perro7);
            perro2.contar(perro6);
        
            perro3.contar(perro2);
            perro3.contar(perro4);
            perro3.contar(perro5);

            perro4.contar(perro7);
            perro4.contar(perro6);
            perro4.contar(perro1);

            perro5.contar(perro7);
            perro5.contar(perro3);
            perro5.contar(perro2);

            perro6.contar(perro5);
            perro6.contar(perro1);
            perro6.contar(perro4);

            perro7.contar(perro6);
            perro7.contar(perro5);
            perro7.contar(perro3);
			
				
            System.out.println("*** RECUERDOS DE LAS MASCOTAS *** " + "\n");

            System.out.println("1. " + perro1.getNombre() + " recuerda que " + perro3.getNombre() + ", " + perro5.getNombre() + " y " + 
                perro4.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro1.recuerdos + "\n");

            System.out.println("2. " + perro2.getNombre() + " recuerda que " + perro1.getNombre() + ", " + perro7.getNombre() + " y " + 
                perro6.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro2.recuerdos + "\n");

            System.out.println("3. " + perro3.getNombre() + " recuerda que " + perro2.getNombre() + ", " + perro4.getNombre() + " y " + 
                perro5.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro3.recuerdos + "\n");

            System.out.println("4. " + perro4.getNombre() + " recuerda que " + perro7.getNombre() + ", " + perro6.getNombre() + " y " + 
                perro1.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro4.recuerdos + "\n");

            System.out.println("5. " + perro5.getNombre() + " recuerda que " + perro7.getNombre() + ", " + perro3.getNombre() + " y " + 
                perro3.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro5.recuerdos + "\n");

            System.out.println("6. " + perro6.getNombre() + " recuerda que " + perro5.getNombre() + ", " + perro1.getNombre() + " y " + 
                perro4.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro6.recuerdos + "\n");

            System.out.println("7. " + perro7.getNombre() + " recuerda que " + perro6.getNombre() + ", " + perro5.getNombre() + " y " + 
                perro3.getNombre() + " le contaron que lo que más adoran de su dueño es: " + perro7.recuerdos + "\n");

 
    //ACTIVIDAD 4 - Números de Instancias

        System.out.println("*** NÚMERO DE INSTANCIAS *** " + "\n");

        System.out.println("El número total de mascotas es " + NumInstancias + ".");


        }
}