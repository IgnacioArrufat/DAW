import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);

		int n;
				
System.out.println("Introduce un valor");
  n = entrada.nextInt(); 	 
  
  if (n>=0 && n<=11)
  System.out.println("Buenos dias");

  if (n>=12 && n<=20)	  
  System.out.println("Buenas tardes");
  
  if (n>=21 && n<=24)  
  System.out.println("Buenas noches");
	}

}
