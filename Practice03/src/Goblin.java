// Goblin.java
public class Goblin extends Monster {

	//コンストラクタ
	public Goblin() {
    	//親クラス(Monster)のコンストラクタを利用
		//名前、体力、攻撃力、防御力、報酬経験値
        super("ゴブリン", 30, 18, 3, 10);
    }

    @Override
    public void DisplayStatus() {
        super.DisplayStatus();
        System.out.println("特徴: 弱い");
    }
}
