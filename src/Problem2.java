import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int temp = scanner.nextInt();

		int[] arr = new int[temp];

		for (int i = 0; i < temp; i++) {

			arr[i] = scanner.nextInt();
		}

		checkTrip(arr);
	}

	private static void checkTrip(int[] arr) {

		int temp = arr[0] + arr[1];
		for (int i = 2; i < arr.length - 1 ; i++) {

			temp += arr[i];
			if (temp == 0){
				System.out.println(arr[i - 2] + ", " + arr[i-1] + ", " + arr[i]);
			}
			temp -= arr[i - 2];
		}
	}
}
