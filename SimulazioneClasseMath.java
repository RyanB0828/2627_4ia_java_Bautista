public class Main{
	public static void main(String[] args) {
		//Istanzio l'oggetto perche i metodi non sono statici
		SimulaMath PrimaSim = new SimulaMath();

		System.out.println("Potenza 2 elevato a 3 : " + PrimaSim.pow(2,3));
		System.out.println("Radice di 9 : " +PrimaSim.sqrt(9));
	}
}
public class SimulaMath {
	//Operazione per calcolare la potenza
	public double pow(double base, int esponente){
		double risultato = 1.0;

		for(int i=0; i<espontente; i++){
			risultato = risultato * base;
		}
		return risultato;
	}

	//Operazione per calcolare la radice quadrata di x
	public double sqrt(double x){
		if(x<0){
			
			return -1;
			
		}
		double i=0;
		while(i*i<x){
			i = i + 1;
		}

		return i;
		
	}
	
}
