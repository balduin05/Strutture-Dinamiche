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
		
		
		// AGGIUNTA ELEMENTO IN UN DETERMINATO INDICE:
		// N.B => Non si devono lasciare buchi
		
		v.add(0, new Quadrato(100));  // aggiunta numero 100 all'indice 0
		v.add(6, new Quadrato(250));  // aggiunta numero 250 all'indice 6
		v.add(7, new Quadrato(500));  // Errore: lasci il buco se prima non hai aggiunto all'indice 6 un numero!
		
		// VISUALIZZAZIONE ForEach
		
		System.out.println();
		System.out.println(" - VISUALIZZAZIONE ForEach - ");
		System.out.println();
		
		for(Quadrato q:v) {
			System.out.println(q);  // sarebbe la richiamata al toString()
			
		}
		
		
		// CANCELLAZIONE remove  da (size - 1)
		
		System.out.println();
		System.out.println(" - CANCELLAZIONE ELEMENTO NELL'INDICE 0 - ");
		v.remove(0);
		
		System.out.println();
		System.out.println(v);
	
		System.out.println();
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		
		
		// IMPONGO LA CAPACITA' A QUANTI ELEMENTI SONO STATI INSERITI:
		
		System.out.println();
		System.out.println(" - trimToSize() - ");
		
		v.trimToSize();
		System.out.println();
		System.out.println(v);
		
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		

	}

}
