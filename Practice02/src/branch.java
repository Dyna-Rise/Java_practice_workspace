import java.util.Random;
import java.util.Scanner;

public class branch {
	public static void main(String[] args) {

		String userInput; //初期化しなくてもOK

		do {
			//ユーザーが半か丁かを入力
			System.out.println("半なら1、丁なら2を入力してください");

			//C#(.NET) staticメソッド
			//string prediction = Console.ReadLine();

			//JavaはScannerクラスのnext() 非static
			//System.in　キーボードから受けた情報
			Scanner scanner = new Scanner(System.in);
			String prediction = scanner.next();

			//if文は基本的にC#と同じ
			//文字列比較はequal()なので注意が必要

			if (prediction.equals("1")) {
				userInput = "半";
			} else if (prediction.equals("2")) {
				userInput = "丁";
			} else {
				userInput = "無効";
				System.out.println("無効な入力です");
			}
		} while (userInput.equals("無効"));

		//ランダムな数字 //Radomクラスのインスタンス
		Random rand = new Random();

		//サイコロの目1-6のランダムな数字
		int dice = rand.nextInt(6); //0～5のランダム
		dice++; //1～6の範囲に調整

		//1-3を引いていたら"半!"
		//4-6を引いていたら"丁!"
		//とコンソールに出るif文プログラム
		String result;
		if (dice >= 4) {
			result = "丁";
		} else {
			result = "半";
		}
		System.out.println(result + "！");

		//「あたり！」か「はずれ…」を
		//コンソールに述べるif文
		if (userInput.equals(result)) {
			System.out.println("あたり!");
		} else {
			System.out.println("はずれ…");
		}

	}
}
