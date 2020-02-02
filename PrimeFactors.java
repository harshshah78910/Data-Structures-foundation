
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PrimeFactors().primeFactors(36);
	}

	private void primeFactors(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			int count = 0;
			while (n % i == 0) {
				n = n / i;
				count++;
			}
			if (count != 0)
				System.out.println("( " + i + " " + count + " )");
		}
		if (n != 1) {
			System.out.println("( " + n + " 1 )");
		}
	}

}
