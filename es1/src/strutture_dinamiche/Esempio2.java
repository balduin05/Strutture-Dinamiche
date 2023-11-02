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
		
		
		// VISUALIZZA:
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			
		}

	}

}
