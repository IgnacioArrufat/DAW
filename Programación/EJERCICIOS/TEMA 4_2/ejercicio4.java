import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada	= new Scanner(System.in);
        
		int a;
        int b;
        int c;
        int max=0;
        int med=0;
        int min=0;
        
 System.out.println("Introduce un numero");
 a = entrada.nextInt(); 
        
 System.out.println("Introduce otro numero");
 b = entrada.nextInt();
 
 System.out.println("Introduce otro numero");
 c = entrada.nextInt();
 
   if (a > b && a>c) {
	   max=a;
	     
	   if (b>c) {
        med=b;
        min=c;
        
  } else {
	 min=b;
	 med=c;	 
  }
        		   
   }
   if (b > a && b>c) {
	   max=b;
	     
	   if (a>c) {
        med=a;
        min=c;
        
  } else {
	 min=a;
	 med=c;	 
  }
        		   
   }
   if (c > b && c>a) {
	   max=a;
	     
	   if (b>a) {
        med=b;
        min=a;
        
  } else {
	 min=b;
	 med=a;	 
  }
        		   
   }
   
   
System.out.println(max +"," +med+ "," +min);
   
   
   
	}

}
