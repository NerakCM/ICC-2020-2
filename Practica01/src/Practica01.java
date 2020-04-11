/**
 * Práctica 1 del curso ICC. "Tipos y Operadores"
 * -NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */

public class Practica01 {
	public static void main(String[] args) {

	//ACTIVIDAD 1

		/* byte - Es un tipo de dato primitivo de 8 bits. Puede almacenar valores numéricos de -128 a 127.
		 * Se clasifica para números de tipo entero. Éste tipo de dato primitivo nos permitirá ahorrar espacio (si tenemos dos  
		 * vectores, uno de tipo int y otro de tipo byte, la cantidad de memoria que usará el byte será mucho menor). 
     	 */
		byte menor1;
		byte menor2;

		/* short - Es un tipo de dato primitivo de 16 bits. Puede almacenar valores numéricos de -32768 a 32767.
		 * Se clasifica para números de tipo entero. Éste tipo de dato primitivo (al igual que el byte) nos permite guardar 
		 * en memoria arreglos grandes, donde su uso nos puede ayudar a ahorrar memoria.
     	 */
		short numCorto1;
		short numCorto2;

		/* int - Es un tipo de dato primitivo de 32 bits. Puede almacenar valores numéricos de -2147483648 a 2147483647.
		 * Se clasifica para números de tipo entero. Un número tipo entero entre el valor numérico -2147483648 a 2147483647 será mucho 
		 * más rápido de calcular si se le declara del tipo entero int. Generalmente int es la elección predeterminada 
		 * para valores enteros.
     	 */
		int numEntero1;
		int numEntero2;

		/* long - Es un tipo de dato primitivo de 64 bits. Puede almacenar valores numéricos de -9223372036854775808
		 * a 9223372036854775807. Se clasifica para números de tipo entero. El long nos permite hacer lo mismo que un int,
		 * usaremos long cuando el rango de los valores sean muy amplios, donde un int ya no será suficiente.
     	 */
		long numGrande1;
		long numGrande2;

		/* float - Es un tipo de dato primitivo de 32 bits. Puede almacenar valores numéricos de ±3.40282347E+38
		 * a ±1.40239846E-45. Se clasifica para números de tipo decimal (simple). Se recomienda usar un float (en vez de un double)
		 * si se necesita ahorrar memoria en grandes arreglos de números en coma flotante. 
     	 */
		float decimalCorto1;
		float decimalCorto2;

		/* double - Es un tipo de dato primitivo de 64 bits. Puede almacenar valores numéricos de ±1.79769312486231570E+308
		 * a ±4.94065645841246544E-324. Se clasifica para números de tipo decimal (doble). Normalmente este tipo de dato es la elección 
		 * predeterminada para valores decimales. Usaremos double cuando el rango de valores sean amplios. 
     	 */
		double decimalGrande1;
		double decimalGrande2;

		/* boolean - Es un tipo de dato primitivo de 1 bit de información. Su tamaño es algo que no está definido con precisión.
		 * Éste tipo de dato primitivo tiene dos valores posibles: true o false. Usar un boolean nos ayudará a evaluar condiciones
		 * de verdadero o falso.
     	 */ 
		boolean verdadero;
	    boolean falso;

		/* char - Es un tipo de dato primitivo de un solo carácter unicode de 16 bits. Tiene valor mínimo de \u0000 y máximo de \uffff.
		 * Se clasifica para números de tipo carácter (simple). El carácter siempre va entrecomillado, con posibilidad de 65.537 caracteres, 
		 * de esta forma podemos utilizar desde el latín hasta el arábigo.
     	 */
		char letra1;
	    char letra2;


	//ACTIVIDAD 2

	    //Para byte
	    menor1 = 5;
	    menor2 = 13;

	    //Para short
	    numCorto1 = 500;
	    numCorto2 = 750;

	    //Para int
	    numEntero1 = 1200;
	    numEntero2 = 2020;

	    //Para long
	    numGrande1 = -252525;
	    numGrande2 = 252525;

	    //Para float
	    decimalCorto1 = -1.5253f;
	    decimalCorto2 = 3.78535222f;

	    //Para double
	    decimalGrande1 = 3.141592653589793238462;
	    decimalGrande2 = 8.0348199105828400482;

	    //Para boolean
	    verdadero = true;
	    falso = false;

	    //Para char
	    letra1 = 'k';
	    letra2 = 'n';


	//ACTIVIDAD 3

	    /* Usé boolean como tipo de dato en la variable, ya que es el único que nos conviene usar, porque el boolean
	     * tiene dos valores: true o false (en éste caso usamos true), que nos servirá de mucho para evaluar condiciones.
     	 */ 
	    boolean booleanTrue = true;


	    /* Usé al byte como tipo de dato en la variable, ya que el rango de información del byte nos permite asignarle a 
	     * la variable el entero 127. Además decidí usar el byte en lugar de un int para ahorrar espacio en la memoria. 
     	 */ 
	    byte cientoVeintisiete = 127;


	    /* Usé short como tipo de dato en la variable, ya que el rango de información de short nos permite asignarle a 
	     * la variable el valor de 32000. Además decidí usar al short para ahorrar espacio en la memoria. 
     	 */ 
	    short treintaYDosMil = 32000;


	    /* Usé int como tipo de dato en la variable, ya que el rango de información de int nos permite asignarle a 
	     * la variable el valor de 2000000000. 
     	 */ 
	    int dosMilMillones = 2000000000;


	    /* Usé long como tipo de dato en la variable, ya que el rango de información de long nos permite asignarle a 
	     * la variable el valor de 200000000000. 
     	 */ 
	    long doscientosMilMillones = 200000000000L;


	    /* Usé char como tipo de dato en la variable, ya que char es utilizado para asignarles valor a las variables de un 
	     * carácter, en éste caso la letra b es un carácter.
     	 */ 
	    char b = 'b';


	    /* Usé float como tipo de dato en la variable, ya que el rango de información de float nos permite asignarle a la variable
	     * un valor en números decimales, en éste caso 1.2000 Usé float en lugar de double para ahorrar espacio en la memoria.
     	 */ 
	    float unoPuntodosMil = 1.2000f;


	    /* Usé double como tipo de dato en la variable, ya que el rango de información de double nos permite asignarle a la 
	     * variable un valor en números decimales muy largo, en éste caso 1.200000000000 
     	 */ 
	    double unoPuntoDoscientosMilMillones = 1.200000000000;


	//ACTIVIDAD 4

	    // 1.
	    byte y = 2;
	    System.out.println("y = " + y);


	    // 2.
	    float yAlCuadradoMas1 = y*y + 1;
	    float parentesis = (y/yAlCuadradoMas1);
	    float x = y*y*y*parentesis;
	    System.out.println("x = " + x);


	    //3.
	    float equisMas30 = x + 30;
	    float yAlCuadrado = y*y;
	    float equisAlCuadrado = x*x;
	    float equisSobreY = equisAlCuadrado/y;
	    float z = x*(equisMas30/(yAlCuadrado+equisSobreY));
	    System.out.println("z = " + z);


	    //4.
	    boolean w = true && false || true || true;
	    System.out.println("w = " + w);


	    //5.
	    boolean v = false || w && w || false || ! false;
	    System.out.println("v = " + v);
		
	}
	
}