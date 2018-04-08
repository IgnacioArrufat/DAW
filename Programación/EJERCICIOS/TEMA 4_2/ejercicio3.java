import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);
        
		int a;
        int b;
       
System.out.println("Introduce un numero");
 a = entrada.nextInt(); 
        
System.out.println("Introduce otro numero");
 b = entrada.nextInt();
 
   if (a > b)
 System.out.println("" + a + "," + b);
   
   if (b > a)
 System.out.println("" + b + "," + a);
	    
	}

}
