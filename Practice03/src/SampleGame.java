
public class SampleGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

		System.out.println("--- 冒険の始まり ---");

		//Playerの実体（インスタンス）化
		Player hero = new Player("勇者", 250, 30, 15, 1, "ブロードソード");
		hero.DisplayStatus();
		
		System.out.println();
	}

}
