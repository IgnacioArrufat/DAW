import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada	= new Scanner(System.in);

		int n;
		int m;
				
System.out.println("Introduce un numero");
  n = entrada.nextInt(); 	 
  
  System.out.println("Introduce otro numero");
  m = entrada.nextInt();
 
  if (n>m)
	  
  System.out.println("Es el mayor " + n );
  
  if (m>n)
	  
  System.out.println("Es el mayor " + m );
  
  
	}

}
