import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada	= new Scanner(System.in);

		int n;
		int r;
				
System.out.println("Introduce un numero");
  n = entrada.nextInt();
  
   r = n%2;
  
  if(r==0) {
 System.out.println("Es par");
  }
  else {
 System.out.println("Es impar");
  }
	}

}
