package strutture_dinamiche;

import java.util.Vector;

public class Esempio1 {

	public static void main(String[] args) {
		
//		Vector<Quadrato> v = new Vector<Quadrato>();
//		
//		System.out.println("Capacity: " + v.capacity());
//		System.out.println("Size: " + v.size());
		
		Vector<Quadrato> v = new Vector<Quadrato>(3, 3);  // posso inserire la capacità nel costruttore e raddoppia ogni volta che la capacità aumenta se non specificato, oppure posso mettere un incrementatore dopo la capacità (3, 3) aumenta di + 3 
		
		System.out.println(" PRIMA ");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		
		v.add(new Quadrato(3));  // 3 = lato
		v.add(new Quadrato(5));  // 5 = lato
		
		System.out.println(" + 2 ");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		
		v.add(new Quadrato(4)); 
		v.add(new Quadrato(6));  
		
		System.out.println(" + 2 ");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		
		v.add(new Quadrato(1));
		
		System.out.println(" + 1 ");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		
		v.add(new Quadrato(1));
		v.add(new Quadrato(1));
		v.add(new Quadrato(1));
		
		System.out.println(" + 3 ");
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Size: " + v.size());
		
		System.out.println();
		for(int i = 0; i < v.size(); i++) {
			// System.out.println(v.elementAt(i));
			System.out.println(v.get(i));
		}
		
		
	}

}
