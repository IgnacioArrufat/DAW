

import java.util.*;

public class GestionTemperaturas {
	// Variable global
	static final int DIAS = 30;
	
	// Muestra el menú
	public static void mostrarMenu(){
		System.out.println();
		System.out.println("*-------------------MENÚ-------------------*");
		System.out.println("1. Rellenar temperaturas");
		System.out.println("2. Mostrar temperaturas del mes");
		System.out.println("3. Mostrar temperatura media del mes");
		System.out.println("4. Mostrar día o días más calurosos del mes");
		System.out.println("5. Salir");
		System.out.println();
		System.out.println("Introduce una opción:");
		System.out.println("*------------------------------------------*");
		System.out.println();
	}
	
	// Muestra el submenú para continuar
	public static boolean subMenuContinuar() {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		char opcion;

		System.out.println("¿Desea realizar la misma operación? [S/N]");
		opcion = entrada.next().charAt(0);
		if (opcion == 'N' || opcion == 'n')
			continuar = false;
		return continuar;
	}
		
	// Rellena temperaturas
	// Parameters: ArrayList<TemperaturasMes>
	public static void rellenarTemperaturas(ArrayList<TemperaturasMes> lista){
		Scanner entrada = new Scanner(System.in);
		
		if(lista.size() < DIAS){
			System.out.println("Introduce el día del mes:");
			int diaMes = entrada.nextInt();
			
			System.out.println("Introduce el día de la semana:");
			entrada.nextLine(); // limpiamos el buffer
			String diaSemana = entrada.nextLine();
			
			System.out.println("Introduce la temperatura media:");
			double temperatura = entrada.nextDouble();
			
			lista.add(new TemperaturasMes(diaMes,diaSemana,temperatura));
		}
	}
	
	// Muestra una temperatura por pantalla con formato
	// Parameters: TemperaturasMes
	public static void imprimirTemperatura(TemperaturasMes dia){
		System.out.println("El " + dia.getDiaSemana() + " día " + dia.getDiaMes()
					+ " hizo una temperatura de " + dia.getTemperaturaMedia());
	}
		
	
	// Calcula la temperatura media de las introducidas en el mes
	// Parameters: ArrayList<TemperaturasMes>
	// Returns: la temperatura media (double)
	public static double calcularTemperaturaMedia(ArrayList<TemperaturasMes> lista){
		double temperaturaMediaMes = 0;
		
		Iterator<TemperaturasMes> iteradorLista = lista.iterator();
		
		while(iteradorLista.hasNext()){
			temperaturaMediaMes = temperaturaMediaMes + iteradorLista.next().getTemperaturaMedia();
		}
		
		return temperaturaMediaMes/lista.size();
	}
	
	// Calcula la temperatura más alta de las introducidas en el mes
	// Parameters: ArrayList<TemperaturasMes>
	// Returns: la temperatura más alta (double)
	public static double temperaturaMasAlta(ArrayList<TemperaturasMes> lista) {
		// Asignamos un valor mínimo a temperaturaMasAlta
		double temperaturaMasAlta = Integer.MIN_VALUE;

		Iterator<TemperaturasMes> iteradorLista = lista.iterator();
		
		while (iteradorLista.hasNext()) {
			double temperaturaAux = iteradorLista.next().getTemperaturaMedia();
			if (temperaturaAux > temperaturaMasAlta) {
				temperaturaMasAlta = temperaturaAux;
			}
		}

		return temperaturaMasAlta;
	}
	
	
	// Busca los días más calurosos 
	// Parameters: ArrayList<TemperaturasMes>
	// Returns: ArrayList<TemperaturasMes> (Los días que tuvierion las temperaturas más altas) 
	public static ArrayList<TemperaturasMes> temperaturasMasAltas(ArrayList<TemperaturasMes> lista) {	
		// Calculamos la temperatura más alta 
		double temperaturaMasAlta = temperaturaMasAlta(lista);
		
		// Nuevo ArrayList para las temperaturas más altas
		ArrayList<TemperaturasMes> altasTemperaturas = new ArrayList<TemperaturasMes>();
		
		Iterator<TemperaturasMes> iteradorLista = lista.iterator();
		
		while (iteradorLista.hasNext()) {
			TemperaturasMes diaAux = iteradorLista.next();

			if (diaAux.getTemperaturaMedia() == temperaturaMasAlta) {
				altasTemperaturas.add(diaAux);
			}
		}
		return altasTemperaturas;
	}
	
	
/***********************************************************************************/	
	
	
	public static void main(String[] args) {
		ArrayList<TemperaturasMes> agosto = new ArrayList<TemperaturasMes>();
		ArrayList<TemperaturasMes> altasTemperaturasAgosto = new ArrayList<TemperaturasMes>();
		
		Scanner entrada = new Scanner(System.in);
		boolean salir = false;
		
		do{
			// Menú
			mostrarMenu();

			// Leemos opción
			int opcion = entrada.nextInt();

			// Gestionar opcines del menú
			switch (opcion) {
			
			// Rellenar temperaturas
			case 1:{
				boolean continuar = true;
				// Se introducen temperaturas hasta que el usuario decide no
				// continuar
				do {
					rellenarTemperaturas(agosto);
					continuar = subMenuContinuar();
				} while (continuar);
			}
				break;

			// Mostrar temperaturas de mes
			case 2:
				System.out.println("El mes de Agosto tuvimos las siguientes temperaturas:");
				mostrarTemperaturas(agosto);
				break;

			// Mostrar temperatura media del mes
			case 3:
				System.out.println("La temperatura media del mes ha sido: " + calcularTemperaturaMedia(agosto));
				break;

			// Mostrar día o días más calurosos del mes
			case 4:
				altasTemperaturasAgosto = temperaturasMasAltas(agosto);
				System.out.println("El día o días más calurosos fueron:");
				mostrarTemperaturas(altasTemperaturasAgosto);
				break;
			
			// Salir
			case 5:
				salir = true;
				System.out.println("Saliendo");
				break;
			
			default:
				System.out.println("Opción no válida.");
			}
		}while(!salir);
	}
}
