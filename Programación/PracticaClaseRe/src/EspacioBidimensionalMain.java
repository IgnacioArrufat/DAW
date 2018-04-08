
public class EspacioBidimensionalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Espaciobidimensional puntoA = new Espaciobidimensional(8,12);
		Espaciobidimensional origen = new Espaciobidimensional();
		Espaciobidimensional puntoB = new Espaciobidimensional(3.5,5.1);
		Espaciobidimensional puntoC = new Espaciobidimensional(2,3.2);
		
		
		System.out.println("Distancia entre origen y punto A (8,12) = "+puntoA.distancia(origen));
		
		
		System.out.println("El punto mas lejano al punto A es "+puntoA.lejano(puntoB, puntoC).getx()+", "+puntoA.lejano(puntoB, puntoC).gety());
		
		
		System.out.println("La suma es " +puntoA.suma(puntoC).getx()+", "+puntoA.suma(puntoC).gety());
		
		
	}

}
