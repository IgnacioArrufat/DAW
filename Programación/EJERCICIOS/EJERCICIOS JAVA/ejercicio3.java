import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada	= new Scanner(System.in);

		float a;
		float b;
		
System.out.println("Introduce cateto 1");
   a= entrada.nextInt();
   
System.out.println("Introduce cateto 2");
   b= entrada.nextInt();   
  
 float A=(float) Math.sqrt(a*a+b*b);

System.out.println("El area vale " + A+".");
		
	}

}
