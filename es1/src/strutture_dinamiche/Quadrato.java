package strutture_dinamiche;

import java.util.Scanner;

public class Quadrato {

	private int lato;

	public Quadrato() {
		this.lato=lato;
	}

	public Quadrato(int lato) {

		this.lato=lato;
	}

	public void setLato(int lato) {
		this.lato=lato;
	}
	public int getLato() {
		return lato;
	}

	public void inserimento() {
		Scanner KB=new Scanner (System.in);
		int lato;
		System.out.println("inserisci lato");
		lato=KB.nextInt();
		setLato(lato);
	}
	public void visualizza() {
		System.out.println("---QUADRATO---");
		System.out.println("--lato:"+ lato +"--");
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + lato + "]";
	}


	//inserimento input e visualizza
}
