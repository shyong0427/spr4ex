package pack.model;

public class Gugudan {
	public int[] guguCalc(int dan) {
		int gugudan[] = new int[9];
		
		for(int i = 0; i < 9; i++) {
			gugudan[i] = dan * (i + 1);
		}
		
		return gugudan;
	}
}