
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 3;
		int p = 3;
		int value = pow(base, p);
		System.out.println(value);
	}

	private static int pow(int base, int p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			int value = pow(base, p / 2);
			return value * value;
		} else {
			return base * pow(base, p - 1);
		}
	}

}
