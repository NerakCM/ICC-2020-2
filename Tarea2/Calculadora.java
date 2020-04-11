/**
 * Tarea 2 del curso ICC. "Clases y Objetos"
 * -NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */

public class Calculadora{

//ATRIBUTOS.

	/** Atributo que servirá para caracterizar un color (logo) a la calculadora. */
	private String color;
	/** Atributo que servirá para darle una marca a la calculadora. */
	private String marca;
	/** Primer número entero que nos ayudará a realizar operaciones binarias (+, -, *, /, %). */
	private int num1;
	/** Segundo número entero que nos ayudará a realizar operaciones binarias (+, -, *, /, %). */
	private int num2;
	/** Tercer número entero que nos ayudará a comparar si hay mayor número entero, menor o igual entre 
	 * los otros dos anteriores. */
	private int num3;
	

//CONSTRUCTORES.

    /**
     * Construye una nueva calculadora con sus atributos (marca y color).
     * @param color color (logo) de la calculadora.
     * @param marca marca de la calculadora.
     */
    private Calculadora( String color, String marca){
	/**'this' se refiere a los atributos de la clase. Las variables sin 'this' se refiere a los parámetros 
    del método. */
		this.color = color;
		this.marca = marca;
    }


//MÉTODOS DE ACCESO.
    /**
     * Permite accesar a el color de la calculadora.
     * @return color de la calculadora.
     */
    public String getColor(){
		return this.color;
    }

    /**
     * Permite accesar a la marca de la calculadora.
     * @return marca de la calculadora.
     */
    public String getMarca(){
		return this.marca;
    }


//MÉTODOS DE MANIPULACIÓN.   

    /**
     * Nos permite modificar el color de la calculadora.
     * @param color el nuevo color de la calculadora.
     */
    public void setColor(String color){
		this.color = color;
    }

    /**
     * Nos permite modificar la marca de la calculadora.
     * @param marca la nueva marca de la calculadora.
     */
    public void setMarca(String marca){
		this.marca = marca;
    }


//MÉTODOS DE IMPLEMENTACIÓN.
    /**
     * Permite hacer una suma con dos números enteros.
     * @param num1 primer número a sumar.
     * @param num2 segundo número a sumar.
     * @return la suma de num1 + num2.
     */
    public int sumarBinaria(int num1, int num2){
    	int sumaTotal = num1 + num2;
		return sumaTotal;
    }

    /**
     * Permite hacer una resta con dos números enteros.
     * @param num1 primer número a restar.
     * @param num2 segundo número a restar.
     * @return la resta de num1 - num2.
     */
    public int restarBinaria(int num1, int num2){
    	int restaTotal = num1 - num2;
		return restaTotal;
    }

    /**
     * Permite hacer una multiplicación con dos números enteros.
     * @param num1 primer número a multiplicar.
     * @param num2 segundo número a multiplicar.
     * @return la multiplicación de num1 * num2.
     */
    public int multiplicar(int num1, int num2){
    	int multiplicacionTotal = num1 * num2;
		return multiplicacionTotal;
    }

     /**
     * Permite hacer una división con dos números enteros.
     * @param num1 primer número a dividir.
     * @param num2 segundo número a dividir.
     * @return la división de num1 / num2.
     */
    public double dividir(int num1, int num2){
    	double divisionTotal = num1 / num2;
		return divisionTotal;
    }

     /**
     * Permite obtener el módulo de dos números enteros.
     * @param num1 primer número.
     * @param num2 segundo número.
     * @return el módulo de num1 y num2.
     */
    public int modular(int num1, int num2){
    	int moduloTotal = num1 % num2;
		return moduloTotal;
    }

    /**
     * Permite tener la suma postfija de un número.
     * @param num1 número al cuál se le aplicará la suma postfija.
     * @param num2 número que servirá para definir el límite en la condición for.
     * @return la suma postfija de num1.
     */
    public int sumarPostfijo(int num1, int num2){
    	for (int i = 0; i < num2; i++){
    		System.out.println("iteración: " + i + "," + " actual " + num1 + "," + " (num1++) " + num1++ + ".");
    	}
			return num1;
    }

    /**
     * Permite tener la resta postfija de un número.
     * @param num1 número al cuál se le aplicará la resta postfija.
     * @param num2 número que servirá para definir el límite en la condición for.
     * @return la resta postfija de num1.
     */
    public int restarPostfijo(int num1, int num2){
    	for (int i = 0; i < num2; i++){
    		System.out.println("iteración: " + i + "," + " actual " + num1 + "," + " (num1--) " + num1-- + ".");
    	}
			return num1;
    }

    /**
     * Permite tener la suma postfija de un número.
     * @param num1 número al cuál se le aplicará la suma sufija.
     * @param num2 número que servirá para definir el límite en la condición for.
     * @return la suma sufija de num1.
     */
    public int sumarSufijo(int num1, int num2){
    	for (int i = 0; i < num2; i++){
    		System.out.println("iteración: " + i + "," + " actual " + num1 + "," + " (++num1) " + ++num1 + ".");
    	}
			return num1;
    }

    /**
     * Permite tener la resta sufija de un número.
     * @param num1 número al cuál se le aplicará la resta sufija.
     * @param num2 número que servirá para definir el límite en la condición for.
     * @return la resta sufija de num1.
     */
    public int restarSufijo(int num1, int num2){
    	for (int i = 0; i < num2; i++){
    		System.out.println("iteración: " + i + "," + " actual " + num1 +  "," + " (--num1) " + --num1 + ".");
    	}
			return num1;
    }

    /**
     * Permite saber dados tres números enteros, cuál es el mayor, cuál el menor, y saber si son iguales.
     * @param num1 primer número a comparar.
     * @param num2 segundo número a comparar.
     * @param num3 tercer número a comparar.
     * @return el número mayor y el menor, o si son iguales los enteros.
     */
    public void orden(int num1, int num2, int num3){

		if (num1 < num2 && num2 < num3){
    		System.out.println( num1 +  " es el menor, " + num3 + " es el mayor y no hay números iguales");
    	}
		if (num1 < num3 && num3 < num2){
    		System.out.println(num1 +  " es el menor, " + num2 + " es el mayor y no hay números iguales");
    	}
		if (num2 < num1 && num1 < num3){
    		System.out.println(num2 +  " es el menor, " + num3 + " es el mayor y no hay números iguales");
    	}
		if (num2 < num3 && num3 < num1){
    		System.out.println(num2 +  " es el menor, " + num1 + " es el mayor y no hay números iguales");
    	}    
		if (num3 < num2 && num2 < num1){
    		System.out.println(num3 +  " es el menor, " + num1 + " es el mayor y no hay números iguales");
    	}    
    	if (num3 < num1 && num1 < num2){
    		System.out.println(num3 +  " es el menor, " + num2 + " es el mayor y no hay números iguales");
    	}    
		if (num1 < num2 && num2 == num3){
    		System.out.println(num2 + " y " + num3 + " son iguales, y " + num1 + " es el menor.");
    	}
    	if (num1 > num2 && num2 == num3){
    		System.out.println(num2 + " y " + num3 + " son iguales, y " + num1 + " es el mayor.");
    	}
    	if (num2 < num1 && num1 == num3){
    		System.out.println(num1 + " y " + num3 + " son iguales, y " + num2 + " es el menor.");
    	}
    	if (num2 > num1 && num1 == num3){
    		System.out.println(num1 + " y " + num3 + " son iguales, y " + num2 + " es el mayor.");
    	}
    	if (num3 < num1 && num1 == num2){
    		System.out.println(num1 + " y " + num2 + " son iguales, y " + num3 + " es el menor.");
    	}
    	if (num3 > num1 && num1 == num2){
    		System.out.println(num1 + " y " + num2 + " son iguales, y " + num3 + " es el mayor.");
    	}
    	if (num1 == num2 && num2 == num3){
    		System.out.println("Todos los números son iguales");
    	}
}


    @Override
    public String toString(){
		return "Color: " + this.color + "\nMarca: " + this.marca +"\n";
    }

    public static void main(String[] args) {

	
	/** Hemos creado varias instancias de la clase calculadora, las cuales hacen y tienen las mismas 
	 *  funciones, ya las probé y todas funcionan, pero las puse en comentarios ya que en el planteamiento 
	 *  del problema se especifica que probemos especialmente la calculadora del director.
	 *  Calculadora calalumno1 = new Calculadora("Azul","KENKO");
	 *  Calculadora calalumno2 = new Calculadora("Verde","DELTA");
	 *  Calculadora calalumno3 = new Calculadora("Morado","MATHEMA");
	 *  Calculadora calalumno4 = new Calculadora("Negro", "CANON");
     */

    
    //Haremos la prueba con la calculadora del DIRECTOR.
	Calculadora calDirector = new Calculadora("Rojo","CASIO");

	System.out.println("LA CALCULADORA DEL  DIRECTOR ES: \n" + calDirector);

    System.out.print("El resultado de sumar 10+12 es : ");
	System.out.println(calDirector.sumarBinaria(10,12));

	System.out.print("El resultado de restar 45-13 es : ");
	System.out.println(calDirector.restarBinaria(44,13));

    System.out.print("El resultado de multiplicar 4*6 es : ");
	System.out.println(calDirector.multiplicar(4,6));

	System.out.print("El resultado de dividir 72/9 es : ");
	System.out.println(calDirector.dividir(72,9));

	System.out.print("El módulo de 25%4 es : ");
	System.out.println(calDirector.modular(25,4));

	System.out.print("sumarPostfijo, ");
	calDirector.sumarPostfijo(3,5);

	System.out.print("restarPostfijo, ");
	calDirector.restarPostfijo(4,7);

	System.out.print("sumarSufijo, ");
	calDirector.sumarSufijo(12,5);

	System.out.print("restarSufijo, ");
	calDirector.restarSufijo(15,1);

	System.out.println("Al comparar los tres números tenemos que: ");
  	calDirector.orden(2,2,7);

	}
   
}