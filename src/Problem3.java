import java.util.Locale;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		System.out.println(checkPali(str));
	}

	private static boolean checkPali(String str) {

		str = str.toLowerCase();
		for (int i = 0; i < str.length() / 2; i++) {

			if (str.charAt(i) != str.charAt( str.length() - 1 - i)){

				return false;
			}
		}

		return true;
	}
}
