private static int[] reverseArray(int[] a) {

		if (a.length == 0)
			return null;
		int lastIndex = a.length - 1;
		int i = 0;
		while (i < a.length / 2) {
			int temp = a[i];
			a[i] = a[lastIndex];
			a[lastIndex] = temp;
			i++;
			lastIndex--;
		}

		return a;
	}
