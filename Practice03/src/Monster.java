
// Monster.java
public class Monster extends GameCharacter { // GameCharacterを継承
    private int rewardExp;   // 倒したときの経験値

    public Monster(String name, int health, int attack, int defense, String weakness, int rewardExp) {
        super(name, health, attack, defense); // 親クラスのコンストラクタを呼び出す
        this.rewardExp = rewardExp;
        System.out.println(name + "が目の前に現れました！");
    }

    public int getRewardExp() {
        return rewardExp;
    }

    // オーバーライドの準備
    @Override
    public void DisplayStatus() {
        super.DisplayStatus(); // 親クラスのdisplayStatsを呼び出す
        System.out.println("報酬経験値: " + rewardExp);
    }
}