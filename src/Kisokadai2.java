import java.util.Random;
import java.util.Scanner;

public class Kisokadai2 {
	     private static Scanner sc;

		public static void main(String[] args) {
	          sc = new Scanner(System.in);
	          Random rnd = new Random();

	          int number = rnd.nextInt(101);

	          System.out.println("数当てゲームを開始します。");
	          System.out.println("0 ～ 100 の間の数を当ててください");

	          int x;
	          do {
	               System.out.print("その数は？");
	               x = sc.nextInt();

	          if (number > x)
	               if ((number - x) <= 100 && (number - x) >= 50)
	                    System.out.println("まだまだ上の数字です。");
	               else if ((number - x) <= 49 && (number - x) >= 30)
	                    System.out.println("まだ上の数字です。");
	               else if ((number - x) <= 29 && (number - x) >= 10)
	                    System.out.println("もう少し上です。");
	               else if ((number - x) <= 9 && (number - x) >= 5)
	                    System.out.println("おしい！！もう少し上。");
	               else if ((number - x) <= 4 && (number - x) >= 1)
	                    System.out.println("その差はわずか！！！上！");

	          if (number < x)
	               if ((x - number) <= 100 && (x - number) >= 50)
	                    System.out.println("まだまだ下の数字です。");
	               else if ((x - number) <= 49 && (x - number) >= 30)
	                    System.out.println("まだ下の数字です。");
	               else if ((x - number) <= 29 && (x - number) >= 10)
	                    System.out.println("もう少し下です。");
	               else if ((x - number) <= 9 && (x - number) >= 5)
	                    System.out.println("おしい！！もう少し下。");
	               else if ((x - number) <= 4 && (x - number) >= 1)
	                    System.out.println("その差はわずか！！！下！");
	          } while (number != x);

	          System.out.println("当たりです！！");
	     }
	}