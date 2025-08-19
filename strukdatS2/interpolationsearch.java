public class interpolationsearch {

	public static int interpolationsearch(int arr[], int low, int high, int key){
		int pos;

		if (low <= high && key >= arr[low] && key <= arr[high]) {
			pos = low
				+ (((high - low) / (arr[high] - arr[low]))
					* (key - arr[low]));

			if (arr[pos] == key)
				return pos;

			if (arr[pos] < key)
				return interpolationsearch(arr, pos + 1, high, key);

			if (arr[pos] > key)
				return interpolationsearch(arr, low, pos - 1, key);
		}
		return -1;
	}

	public static void main(String[] args){
		int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21 };
		int n = arr.length;
		int key = 13;
		int index = interpolationsearch(arr, 0, n - 1, key);

		if (index != -1)
			System.out.println("Element berada di index ke :"+ index);
		else
			System.out.println("Element tidak ada.");
	}
}
