

class program{

	
	public static void main(String[] args) {
		int i  = 0;
		isPrime m = new isPrime();
		for (i=2; i <= 10; i++) {
			if (m.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}