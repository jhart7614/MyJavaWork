public class PeerProgramming1 {

	public static void main(String[] args) {

		System.out.println(method1(23));

	}

	static String method1(int a) {

		int b = a;

		for (int i = 1; i <= a; i++) {

			if (a == i) {
				return b + " = " + a + "!";
			}

			a = a / i;
		}
		return "NONE";

	}

}
