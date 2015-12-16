import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Kisokadai3 {

	public static void main(String[] args) throws IOException {
		/// 数字を選んでもらい、指定された数字なら実行
		int cmd;
		while (true) {
			System.out.println("選択肢を選んでください");
			System.out.println("1.新規作成/編集 2.終了");
			new InputStreamReader(System.in);


			/// 1が選択された場合
			switch (cmd) {
			case 1:
				System.out.println("フォルダを作成をします");
				System.out.println("フォルダ名を入力してください");
				System.out.println("以下の用にファイル名を入力してください");
				System.out.println("c:¥¥tmp¥¥newfile.txt");

				String fln = null;
				File newfile = new File(fln);

				File dir = new File(newfile.getParent());
				/// もしファイルが無い場合
				if (dir.exists()) {
					System.out.println("ファイルがありません" + newfile.getPath());
					dir.mkdirs();
					System.out.println("ファイル作成をします");

					/// もしファイルができた場合
					try {
						if (newfile.createNewFile()) {
							System.out.println(fln + "ファイルの作成完了");
						} else {
							System.out.println(fln + "ファイルを開きます");

							/// 編集モード！
							System.out.println("<編集モード>");
							System.out.println("1.	書き込み　2．読み込み　3.メインメニューヘ");
							/// 選択肢
								continue;

							switch (cmd) {
							case 1:

								/// 書き込みモード！
								System.out.println("<書き込みモード>");
								System.out.println("1.上書き　2.追記　3.終了");

								/// 上書きモードを選択の場合

								switch (cmd) {