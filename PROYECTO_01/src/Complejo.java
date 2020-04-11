/**
 * Proyecto 1 del curso ICC. "Números complejos"
 * Usaremos todo lo visto en clase, además de implementar una interfaz.
 * NÚMERO DE CUENTA: 317180321.
 * @author Cristóbal Morales Karen.
 * @version 1.0
 */

import java.lang.Math;

public class Complejo implements ServiciosComplejo {


//ATRIBUTOS

	/** Atributo que servirá para especificar la parte real del complejo */
	private double real;

    /** Atributo que servirá para especificar la parte imaginaria del complejo */
	private double imaginaria ;


//CONTRUCTORES

	/**
     * Primer constructor: constructor vacío.
     */ 
	public Complejo(){
        this.real = 0.0;
        this.imaginaria = 0.0;
	}

	/**
     * Segundo constructor: constructor que recibe los valores de las entradas real e imaginaria del complejo.
     * @param real números reales con los que se podrá llevar a cabo las diversas operaciones especificadas.
     * @param imaginaria números imaginarios con los que se podrá llevar a cabo las diversas operaciones especificadas.
     */ 
    public Complejo(double real, double imaginaria){
        this.real = real;
    	this.imaginaria = imaginaria;
	}


//MÉTODOS DE ACCESO (getters)

	/**
     * Permite saber cuál es el conjunto real (números reales).
     * @return el conjunto real.
     */
    public double getReal(){
        return this.real;
    }

    /**
     * Permite saber cuál es el conjunto imaginario (números imaginarios).
     * @return el conjunto imaginario.
     */
    public double getImaginaria(){
        return this.imaginaria;
    }


//MÉTODOS DE MANIPULACIÓN (setters)

    /**
     * Modifica al número real.
     * @param real nuevo número real.
     */
    public void setReal(double real){
	    this.real = real;
    }

    /**
     * Modifica al número imaginario.
     * @param imaginaria nuevo número imaginario.
     */
    public void setImaginaria(double imaginaria){
	    this.imaginaria = imaginaria;
    }



//MÉTODOS DE LA INTERFAZ "ServiciosComplejo"

    //Método sumar
    @Override
    public Complejo suma(Complejo otro){
        //creamos un nuevo número complejo.
        Complejo complejo = new Complejo(); 
        //código para sumar la parte real.
        double parteRealSum = this.real + otro.getReal(); 
        //código para sumar la parte imaginaria.
        double parteImaginariaSum = this.imaginaria + otro.getImaginaria();  
        //nuevos valores para la parte real. 
        complejo.setReal(parteRealSum); 
        //nuevos valores para la parte imaginaria.
        complejo.setImaginaria(parteImaginariaSum); 
        //regresa la nueva instancia.
        return complejo; 
    }

    //Método multiplicar 
    @Override  
    public Complejo multiplica(Complejo otro){
        //creamos un nuevo número complejo.
        Complejo complejo = new Complejo();
        //código para multiplicar la parte real. 
        double parteRealMul = this.real * otro.getReal() - this.imaginaria * otro.getImaginaria(); 
        //código para multiplicar la parte imaginaria.
        double parteImaginariaMul = this.real * otro.getImaginaria() + this.imaginaria * otro.getReal(); 
        //nuevos valores para la parte real.
        complejo.setReal(parteRealMul);
        //nuevos valores para la parte imaginaria.
        complejo.setImaginaria(parteImaginariaMul); 
        //regrasa la nueva instancia.
        return complejo; 
    }

    //Método elevar al cuadrado
    @Override
    public Complejo cuadrado(){
        //código que nos idica que el complejo será multiplicado por sí mismo. 
        return this.multiplica(this);
    }

    //Método elevar al cubo
    @Override
    public Complejo cubo (){
        /* código que nos indica que el complejo multiplicado al cuadrado (utilizando el método anterior)
         * será multiplicado nuevamente por el complejo, es decir (a + bi)^2 * (a + bi) = (a + bi)^3.  */
        return this.cuadrado().multiplica(this);
    }

    //Método obtener conjugado 
    @Override
    public Complejo conjugado (){
        //código que corresponde a cambiarle el sigo (+ ó -) a la parte imaginaria de un complejo.
        double cambiarImaginario = this.imaginaria * -1; 
        //creamos un nuevo complejo que regresa el cambio de signo a su componente imaginaria.
        return new Complejo(this.real, cambiarImaginario); 
    }

    //Método obtener inverso
    @Override
    public Complejo inverso (){
        //código que corresponde al denominador de la fórmula "inverso de un complejo" (a^2 + b^2).
        double denominador = Math.pow(this.real,2) + Math.pow(this.imaginaria,2); 
        //código que corresponde a la parte real del inverso del complejo.
        double parteRealIn = this.real / denominador; 
        //código que corresponde a la parte imaginaria del inverso del complejo.
        double parteImaginariaIn = (-1 * this.imaginaria) / denominador; 
        //creamos un nuevo complejo que regresa el inverso del complejo.
        return new Complejo(parteRealIn, parteImaginariaIn); 
    }

    //Método dividir
    @Override
    public Complejo divide(Complejo otro){
        /* código que nos indica que el complejo se va a multiplicar por el inverso de otro complejo
         * ya que la fórmula de la división de complejos es: (a + bi) ∗ (c + di)^(−1).  */
        return this.multiplica(otro.inverso()); 
    }

    //Método obtener módulo
    @Override
    public double modulo (){
        //código que corresponde a la suma de los cuadrados (a^2 + b^2).
        double sumaCuadrados = Math.pow(this.real,2) + Math.pow(this.imaginaria,2); 
        //código que nos regresa la raíz de la suma de los cuadrados (fórmula para obtener el módulo de un complejo).
        return Math.sqrt(sumaCuadrados);     
    }

    //Método que permite saber si dos complejos son iguales.
    @Override
    public boolean esIgual (Complejo otro){
        //creamos un nuevo número complejo para comparar.
        Complejo complejo = new Complejo(); 
        //código condicional que nos permite saber si a = c y b = d, de cumplirse los complejos entonces son iguales.
        if (this.real == otro.getReal() && this.imaginaria == otro.getImaginaria()){
            return true; 
        }else{
            return false;
        }
    }

    //Método que devuelve una cadena que representa al complejo que invoca el método.
    public String muestra (){
        return "(" + this.real + "," + this.imaginaria + "i" + ")";
    }


    /* Método toString que nos permitirá mostrar la información completa de las instancias creadas (complejos), es decir,
     * nos mostrará el resultado de cada métodos (que son principalmente operaciones) usados en ellos */
    @Override
    public String toString(){
        return "(" + this.real + "," + this.imaginaria + "i" + ")";
    }

//PARTE DE EJECUCIÓN DEL PROGRAMA

    public static void main(String[] args) {
        //crear instancias de objetos tipo complejo
        Complejo comp1 = new Complejo(5,10);
        Complejo comp2 = new Complejo(2,8);

        System.out.println("Lo siguiente son dos complejos con los que trabajaremos: " );
        System.out.println("-Primer complejo: " + comp1);
        System.out.println("-Segundo complejo: " + comp2 + "\n");

        System.out.println("*** A continuación se muestran diversas funciones aplicadas a los complejos ***" + "\n");
        System.out.println("-Suma de los complejos: " + comp1.suma(comp2) + "\n");
        System.out.println("-Multiplicación del los complejos: " + comp1.multiplica(comp2) + "\n");
        System.out.println("-Elevar al cuadrado al primer complejo: " + comp1.cuadrado() + "\n");
        System.out.println("-Elevar al cubo al primer complejo: " + comp1.cubo() + "\n");
        System.out.println("-Conjugado del primer complejo: " + comp1.conjugado() + "\n");
        System.out.println("-Inverso del segundo complejo: " + comp2.inverso() + "\n");
        System.out.println("-División de los complejos: " + comp1.divide(comp2) + "\n");
        System.out.println("-Módulo del segundo complejo: " + comp2.modulo() + "\n");
        System.out.println("-¿Los complejos " + comp1 + " y " + comp2 + " son iguales?: " + comp1.esIgual(comp2) + "\n");
        }
}
