// Dragon.java
public class Dragon extends Monster {
	//コンストラクタ
	public Dragon() {
		//親クラス(Monster)のコンストラクタを利用
		//名前、体力、攻撃力、防御力、報酬経験値
		super("ドラゴン", 250, 30, 10, 500);
	}

	// ドラゴン固有の行動
	public void BreathAttack(GameCharacter target) {
		System.out.println(GetName() + "は炎のブレスで" + target.GetName() + "を攻撃！");
		target.TakeDamage(GetAttack() * 2); // 強力な攻撃
	}

	@Override
	public void DisplayStatus() {
		super.DisplayStatus();
		System.out.println("特徴: 強力なブレス攻撃に注意");
	}
}