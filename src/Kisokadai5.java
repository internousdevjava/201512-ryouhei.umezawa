import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kisokadai5 {

	public static void main(String[] args)

	int cmd;
	while (true) {
		System.out.println("メニュー");
		System.out.println("コマンド入力");
		System.out.println("1.作成+開く2.終了");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine();
			cmd = Integer.parseInt(buf);
			switch (cmd) {
			case 1:
}
		}