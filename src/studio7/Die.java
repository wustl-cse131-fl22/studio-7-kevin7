package studio7;

import java.util.Scanner;

public class Die {
	
	private int dieSize;
	private int dieRoll;
	
	public Die(int dieSize) {
		this.dieSize = dieSize;
		dieRoll =(int) (Math.random() * dieSize) + 1;
	}
	
	public int getDie() {
		return dieRoll;
	}
	
	public void print(Die x) {
		System.out.println("Your die size is " + x.dieSize);
		System.out.println("You rolled " + x.dieRoll);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of die: ");
		int dieSize = in.nextInt();
		Die a = new Die(dieSize);
		
		a.print(a);
	}

}
