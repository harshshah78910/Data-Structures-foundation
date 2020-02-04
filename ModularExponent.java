
public class ModularExponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find X^N mod M

		System.out.println(findExponentModular(5, 3, 7));
	}

	private static int findExponentModular(int x, int n, int m) {
		if (n == 0)
			return 1;
		else if (n % 2 == 0) {
			int value = findExponentModular(x, n / 2, m);
			return (value * value) % m;
		} else {
			return ((x % m) * findExponentModular(x, n - 1, m)) % m;
		}
	}

}
