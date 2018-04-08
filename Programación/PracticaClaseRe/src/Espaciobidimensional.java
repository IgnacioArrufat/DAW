
public class Espaciobidimensional {
	
	// Variables
		private double x, y;

		// contructor por defecto

		public Espaciobidimensional() {
			this.x = 0;
			this.y = 0;

		}

		// constructor por parametros

		public Espaciobidimensional (double x, double y) {
			this.x = x;
			this.y = y;
		}
		// métodos get

		public double getx() {
			return x;
		}

		public double gety() {
			return y;
		}

		public Espaciobidimensional suma(Espaciobidimensional objeto) {
			Espaciobidimensional resultado = new Espaciobidimensional();
			
			resultado.x = this.x + objeto.x;
			resultado.y = this.y + objeto.y;
			
			return resultado;
		}
		
		public double distancia (Espaciobidimensional objeto) {
			double resultado;
			
			resultado = Math.sqrt((this.x - objeto.x)*(this.x - objeto.x) + (this.y - objeto.y)*(this.y - objeto.y));
			
			return resultado;
			
		}
		
		public Espaciobidimensional lejano (Espaciobidimensional objeto1, Espaciobidimensional objeto2) {
			Espaciobidimensional resultado = new Espaciobidimensional();
			double dist;
			
			dist = distancia (objeto1);
			
			if (dist > distancia (objeto2)) {
				resultado.x = objeto1.x;
				resultado.y = objeto1.y;
			}
			
			else {
				resultado.x = objeto2.x;
				resultado.y = objeto2.y;
			}
			
			return resultado;
			
		}
		

		
		
}
