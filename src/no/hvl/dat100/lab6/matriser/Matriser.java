package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i<matrise.length; i++) {
			for(int n = 0; n<matrise[i].length; n++) {
				System.out.print(matrise[i][n]);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng = "";
		for(int i = 0; i<matrise.length; i++) {
			for(int n = 0; n<matrise[i].length; n++) {
				streng += matrise[i][n] + " ";
			}
			streng += "\n ";
		}
		
		return streng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int teller = 0;
		
		for(int i = 0; i<matrise.length; i++) {
			for(int n = 0; n<matrise[i].length; n++) {
				 teller ++;
			}
		}
		
		int[][] x = new int[matrise.length][teller];
		
		for(int k = 0; k<matrise.length; k++) {
			for(int l = 0; l<matrise[k].length; l++) {
				x[k][l] = matrise[k][l] * tall;
			}	
		}
			
			return x;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean sjekk = true;
		
		//Hvis a og b ikke er like lange, er de i alle fall ikke like, så da er det ikke vits å sjekke mer.
		if(a.length == b.length) {
			for(int i = 0; i<a.length; i++) {
				if(!(a[i].length == b[i].length)) {
					return false;
				} 
			}
		} else {
			return false;
		}
		
		for(int n = 0; n<a.length; n++) {
			for(int m = 0; m<a[n].length; m++) {
				if(!(a[n][m] == b[n][m])) {
					sjekk = false;
				}
			}
		}
		
		if(sjekk) {
			return true;
		} else {
			return false;
		}

	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int teller = 0;
		
		// Ganske lik som 'skaler'. Forskjellen er hva som skal plasseres i den nye tabellen.
		for(int i = 0; i<matrise.length; i++) {
			for(int n = 0; n<matrise[i].length; n++) {
				 teller ++;
			}
		}
		
		int[][] x = new int[matrise.length][teller];
		
		for(int k = 0; k<matrise.length; k++) {
			for(int l = 0; l<matrise[k].length; l++) {
				x[l][k] = matrise[k][l];
			}	
		}
			return x;
	}
	

	// f) Frivillig/vanskelig
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO 
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
