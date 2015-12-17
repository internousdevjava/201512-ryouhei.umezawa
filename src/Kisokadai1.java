import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class Kisokadai1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int x = 0, y = 0;
		boolean kuku = true;

		while (kuku) {
			try {
				System.out.print("1～100の間の整数を入力して下さい: x = ");
				str = br.readLine();
				x = Integer.parseInt(str);
				if (x == 0 || x >= 101) {
					System.out.println("やり直してください");
					continue;

				} else {
					System.out.print("もうひとつ、1~100の間の整数を入力して下さい: y = ");
				}
				str = br.readLine();
				y = Integer.parseInt(str);
				if (y == 0 || y >= 101) {
					System.out.println("やり直してください");
					continue;
				} else {
				}
				break;
			} catch (NumberFormatException nfe) {
			}
		}

		for (int a = 1; a <= x; a++) {
			for (int b = 1; b <= y; b++) {

				System.out.printf(" %5d", a * b);
			}
			System.out.println();
		}

	}

}
