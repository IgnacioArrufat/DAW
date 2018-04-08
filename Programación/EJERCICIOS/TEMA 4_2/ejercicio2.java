import java.util.Scanner;

public class ejercicio2 {

      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  
 Scanner entrada	= new Scanner(System.in);
        
		int a;
        int b;
       
System.out.println("Introduce un numero");
 a = entrada.nextInt(); 
        
System.out.println("Introduce otro numero");
 b = entrada.nextInt();
 
   if (a % b == 0) {
 System.out.println("El numero:  " + b + ", es muliplo de; " + a);
       } 
   else { 
 System.out.println("El numero:  " + b + ", no es muliplo de; " + a);    	  
       }	
   
   if (b % a == 0) {
System.out.println("El numero:  " + a + ", es muliplo de; " + a);
	    } else { 
System.out.println("El numero:  " + a + ", no es muliplo de; " + a);    	  
	         }	    
 
	}

}
