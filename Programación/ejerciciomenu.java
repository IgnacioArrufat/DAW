package clases;
import java.util.Scanner;

public class menu {

	public static void intercambiar (int a, int b) {
		int aux = 0;
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("El valor de la variable a es " + a + " y el valor de b es " + b);
	}
	
	//Crear funcion2
	
	public static void potencia (int n, int base)
	{	
		int resultado = (int) Math.pow(base, n);
		
		System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
		
	}
	
	//Crear funcion3
	
	public static void multiplicar (int c) {
		  for (int i=0;i<=10;i++) {
		     System.out.println(i + " x " + c + " = " 
		       +  (i*c));
		  }
	}
	
	//Crear funcion4
	
	public static void mayor (int a, int b, int c) {
		int mayor, menor;
		
		if (a>b) {
			if (a>c) {
				mayor = a;
			}else {
				mayor = c;
			}
			
			if (b>c) {
				menor = c;
			}else {
				menor = b;
			}
		}else {
			if (b>c) {
				mayor = b;
			}else {
				mayor = c;
			}
			
			if (a>c) {
				menor = c;
			}else {
				menor = a;
			}
		}
		
		System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		Scanner teclado = new Scanner (System.in);
		do { 			
			System.out.println("1.Intercambiar valores \n" 
							+ "2.Calcular potencia \n" 
							+ "3.Mostrar tabla de multiplicar \n" 
							+ "4.Calcular el mayor \n" 
							+ "5.Salir \n");
			opcion = teclado.nextInt();
			
			switch (opcion) {

			case 1: 
				int a, b;
				System.out.println("Introduzca el valor de a :");
				a = teclado.nextInt();
				System.out.println("Introduzca el valor de b :");
				b = teclado.nextInt();
				intercambiar(a,b);
				
				break;
			case 2: 
				int base, n;
				System.out.println("Ingrese la base: ");
				base = teclado.nextInt();
				System.out.println("Ingrese el exponente");
				n = teclado.nextInt();
				potencia(n,base);
				
				break;
			case 3:
				int c;
				System.out.println("Ingrese el numero que quieres multiplicar");
				c = teclado.nextInt();
				multiplicar(c);
				
				break;
			case 4:
				int i, j, d;
				System.out.println("Introduce el primer numero: ");
				i = teclado.nextInt();

				System.out.println("Introduce el segundo numero: ");
				j = teclado.nextInt();

				System.out.println("Introduce el tercer numero: ");
				d = teclado.nextInt();
				mayor(i,j,d);
				
				break;

			}
		} while (opcion != 5);
		
	}

}
