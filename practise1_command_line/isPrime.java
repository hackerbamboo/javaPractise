class isPrime{

	public boolean isPrime(int n){
		for (int i = 2; i < n ; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void printPrime(int n){
		isPrime isprime = new isPrime();
		boolean[] primeArray = new boolean[n+1];

		for (int i = 2; i <= n; i++) {
			primeArray[i] = true;
		}

		for (int i=2; i<=n; i++) {
			if (!isprime.isPrime(i)) {
				primeArray[i] = false;
			}
		}


		for (int i=2; i <=n; i++) {
			System.out.println("number "+i+" is a prime number: " + primeArray[i]);
		}
	}

	public static int[][] pascalTriangle(int n){
		int[][] pt = new int[n][];
		for (int i = 0; i < n; i++) {
			pt[i] = new int[i+1];
			pt[i][0] = 1;
			for (int j=1; j < i;  j++) {
				pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];
			}
			pt[i][i] = 1;
		}
		return pt;
	}
	

}