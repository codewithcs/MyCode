package DP;

public class CountUniqueBSTs {

	// Structurally unique binary search trees. 
	
	public static void main(String[] args) {
		
		int n = 16; 
		
		//int set[] = { 1, 2, 3, 4 , 5 , 6 } ; 
				
		bottomUp(n) ; 
	}
	
	public static void topDown() {
		
	}
	
	public static void bottomUp(int n) {
		
		int G[] = new int[n+1] ; 
		G[0] = 0 ; G[1] = 1;  // G[2] is 0 by default. s
		
		for(int j=2 ; j<=n ; j++  ) {
			
		for ( int i=1 ; i<= j ; i++ ) {
			G[j] = G[j] + G[i] * G[j-i] ; 
		}
		
		System.out.println("G[" + j + "]: " + G[j]);
		
		}
	}
	
}
