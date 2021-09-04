import java.util.*;

public class Problem1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();


		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			int temp = scanner.nextInt();

			if (temp > 0 && map.containsKey(temp)){

				map.put(temp, map.get(temp) + 1);
			}else if (temp > 0){

				map.put(temp, 1);
			}
		}

		maxOutput(map, n, k);
	}

	private static int maxOutput(HashMap<Integer, Integer> map, int n, int k) {

		Set<Integer> set = map.keySet();
		Integer[] arr = (Integer[]) set.toArray();
		int temp = 0;
		int max = 0;

		for (int i = 0; i < k; i++) {
			if (max + arr[arr.length - 1 - i] > max){

			}
		}

		return 0;
	}

}
