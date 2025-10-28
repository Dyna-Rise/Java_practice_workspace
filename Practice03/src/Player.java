//GameCharacterを継承 Javaだと「extends」となる
public class Player extends GameCharacter{
	int level; //レベル
	int experience; //経験値
	int nextLevel = 150; //次のレベルまでの経験値
	String weapon; //所持武器

	//プレイヤーのコンストラクタ
	public Player(String name,int health,int attack,int defense,String weapon) {
		super(name, health, attack, defense); //親クラスのコンストラクタを利用
 		level = 1; //初期レベルは1
		this.weapon = weapon; //引数の情報を変数に代入
		experience = 0; //経験値は0
	}
	
    // 経験値取得メソッド
    public void GainExperience(int exp) {
        experience += exp;
        System.out.println(
        		GetName() + "は" + exp + "の経験値を獲得しました。\n合計経験値: " + experience);
        // レベルアップのロジックなどをここに追加
        while(experience >= nextLevel) {
        	experience -= nextLevel;
        	level++;
        	health += 50;
        	attack += 8;
        	defense += 5;
        }
    }
    
    // オーバーライド //@Override書くのを推奨※ポリモフィズム対策
    @Override 
    public void DisplayStatus() {
        super.DisplayStatus(); // 親クラスのdisplayStatsを呼び出す
        System.out.print("レベル: " + level + "/");
        System.out.println("これまでの経験値: " + experience);
        System.out.println("装備武器: " + weapon);
    }
    
    // オーバーロード 攻撃メソッド1: 特定の武器で攻撃
    public void attack(GameCharacter target, String specificWeapon) {
        System.out.println(specificWeapon + "で攻撃！");
        int bonusDamage = 5; // 特定の武器による追加ダメージ
        target.TakeDamage(GetAttack() + bonusDamage);
    }

    // オーバーロードされた攻撃メソッド2: 魔法攻撃 (引数の型が異なる)
    public void attack(GameCharacter target, int magicPower, String spellName) {
        System.out.println("魔法攻撃" + spellName + "！");
        target.TakeDamage(magicPower);
    }
}
