public class QuickSortTest {

	static int partition(int[] arr, int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 14, 4, 85, 47, -58, 4 };
		// partition(arr,0,5);
		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
