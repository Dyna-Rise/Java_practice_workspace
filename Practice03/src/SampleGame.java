
public class SampleGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("--- 冒険の始まり ---");

		//Playerの実体（インスタンス）化
		Player hero = new Player("勇者", 250, 30, 15, 1, "ブロードソード");
		hero.DisplayStatus();

		System.out.println();

		// モンスターのインスタンス化 (GameCharacterを継承 -> Monsterを継承)
		Goblin goblin = new Goblin();
		goblin.DisplayStatus(); // ゴブリンでオーバーライドされたdisplayStatsを呼び出し

		System.out.println();

		System.out.println("--- 戦闘開始！ ---");

		// 勇者 vs ゴブリン
		System.out.println("\n==" + hero.GetName() + " vs " + goblin.GetName() + " ==");
		
		while (hero.isAlive() && goblin.isAlive()) {
			hero.Attack(goblin); // 通常攻撃
			if (!goblin.isAlive()) {
				hero.
				GainExperience(goblin.GetRewardExp());
				break;
			}
			goblin.Attack(hero); // ゴブリンの通常攻撃

			System.out.println();
		}
		
		System.out.println();
	}
}
