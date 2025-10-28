
public class GameCharacter {
	//カプセル化したフィールド
	String name; //キャラクターの名前
	int health; //体力
	int currentHealth; //戦闘中のリアルタイム体力
	int attack; //攻撃力
	int defense; //防御力

	//コンストラクタ
	public GameCharacter(String name, int health, int attack, int defense) {
		this.name = name;
		this.health = health;
		currentHealth = this.health;
		this.attack = attack;
		this.defense = defense;
	}

	//	ステータス表示メソッド
	public void DisplayStatus() {
		System.out.println("【"+ name + "】");
		System.out.print("HP:" + health + "/");
		System.out.print("攻撃力:" + attack + "/");
		System.out.println("防御力:" + defense);
	}
	
	//攻撃メソッド
	public void Attack(GameCharacter target) {
		System.out.print(name + "の攻撃！ -->");
		target.TakeDamage(attack); //相手は変数attackの力でダメージを負う
	}
	
	//被ダメージメソッド
	public void TakeDamage(int attack) {
		
	}

}
