package mipaquete;

/**
 * Nos permite hacer operaciones simples con los números por ejemplo sumar, restar, multiplicar etc.
 * 
 * @author SHERAZ
 * @version (1.0)
 */
public class Operaciones {

	/*
	 * Variable que nos indica el salario minimo interprofesional
	 */
	private static double SMI = 5322.234;
	
	/**
	 * En esta clase tenemos dos variable de tipo entero a y b
	 */
	private int a;
	private int b;
	
	/**
	 * Constructor de la clase Operaciones que inicializa todos los valores a 0
	 */
	public Operaciones(){
		a = 0;
		b = 0;
	}
	
	/**
	 * Constructor de la clase Operaciones
	 * @param a variable numérica
	 * @param b variable numérica
	 */
	public Operaciones(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Nos devuelve la suma de las variables a y b
	 * 
	 * @return suma La suma de las variables a y b
	 * Contrario al método {@link #calculaResta()}
	 * @since 0.5
	 */
	public int calculaSuma()
	{
		int suma = a + b;
		return suma;
	}
	
	/**
	 * Nos devuelve la resta entre las variables a y b
	 * 
	 * @return resta La resta de las variables a y b
	 * Contrario al método {@link #calculaSuma())}
	 * @since 0.5
	 */
	public int calculaResta()
	{
		int resta = a - b;
		return resta;
	}
	
	/**
	 * Nos devuelve la multiplicación entre las variables a, b y parametro
	 * 
	 * @param parametro
	 * @return total El total de la multiplicación entre a, b y parametro
	 * @since 1.0
	 */
	public int multiplicaNumero(int parametro)
	{
		int total = a * b * parametro;
		return total;
	}
	}
	

	

