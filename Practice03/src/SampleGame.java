
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
		
		
		
		
		System.out.println("--- 次の戦闘！ ---");

		Dragon dragon = new Dragon();
		dragon.DisplayStatus(); // ドラゴンでオーバーライドされたdisplayStatsを呼び出し
		
		System.out.println();
		System.out.println("--- 戦闘開始！ ---");

		System.out.println("\n==" + hero.GetName() + " vs " + dragon.GetName() + "==");
		while (hero.isAlive() && dragon.isAlive()) {
			// 勇者 vs ドラゴン
			if (hero.isAlive()) {
				System.out.println();

				hero.PlayerAttack(dragon, "光の剣"); // オーバーロードされた特定の武器による攻撃
				if (dragon.isAlive()) {
					hero.PlayerAttack(dragon, 30, "ファイアボール"); // オーバーロードされた魔法攻撃
				}

				if (dragon.isAlive()) {
					dragon.BreathAttack(hero); // ドラゴン固有の強力な攻撃
				}

				if (!dragon.isAlive()) {
					hero.GainExperience(dragon.GetRewardExp());
				}
			}
		}

		System.out.println("\n--- 戦闘終了 ---");

		hero.DisplayStatus(); // 最終的な勇者のステータス
	}
}
