package strutture_dinamiche;

import java.util.Vector;

public class Esempio2 {

	public static void main(String[] args) {
		
		// DICHIARAZIONE:
		
		Vector<Quadrato> v = new Vector<Quadrato>(3, 2);
		
		
		// CREAZIONE:
		
		for(int i = 0; i < 5; i++) {
			int lato = (int)(Math.random()*10+1);
			Quadrato q = new Quadrato(lato);
			v.add(q);
			
		}
		
		
		// VISUALIZZAZIONE STANDARD:
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));  // N.B!  Non esiste il v[i]
			
		}
		
		
		// VISUALIZZAZIONE toString():
		
		System.out.println();
		System.out.println(" - v.toString() - ");
		System.out.println(v);
		
		
		// VISUALIZZAZIONE ForEach
		
		System.out.println();
		System.out.println(" - VISUALIZZAZIONE ForEach - ");
		System.out.println();
		
		for(Quadrato q:v) {
			System.out.println(q);  // sarebbe la richiamata al toString()
			
		}
		

	}

}
