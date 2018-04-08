import java.util.Scanner;

public class Ejercicio7c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada	= new Scanner(System.in);

		int a;
		int b;
		int c;
				
  System.out.println("Introduce un numero");
  a = entrada.nextInt(); 	 
  
  System.out.println("Introduce otro numero");
  b = entrada.nextInt();
   
  System.out.println("Introduce otro numero");
  c = entrada.nextInt();
 
  if (a>b)  
  System.out.println("El maximo es " + a );
  
  if (a<b)  
  System.out.println("El maximo es " + b );
  
  if (c>=a && c>=b)  
  System.out.println("El maximo es " + c );
	}

}
