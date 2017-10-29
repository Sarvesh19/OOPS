public class TestArrayAdditions {

	public int[] add(int arr1[], int arr2[]) {
		int l = Math.max(arr1.length, arr2.length);
		int i = arr1.length - 1;
		int[] result = new int[l];
		int j = arr2.length - 1;
		int c = 0;
		l--;
		while (i >= 0 && j >= 0) {
			
		}

		return null;
	}

	public static void main(String[] args) {
		int arr1[] = { 9, 9, 9, 9, 9, 9, 9 };
		int arr2[] = { 1, 6, 8, 2, 6, 7 };
		ArrayAddition aa = new ArrayAddition();
		int result[] = aa.add(arr1, arr2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}
}
