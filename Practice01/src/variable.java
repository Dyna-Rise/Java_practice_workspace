public class variable {
	//	エントリーポイント
	public static void main(String[] args) {
		//変数宣言
		int age = 30;
		double price = 19.99;
		boolean isActive = true;
		String name = "Jone"; //先頭大文字
		
		final int MaxValue = 100; //定数constに相当
		
		//暗黙的型付け C#も使える
		// ※ローカル変数にのみ適用、メソッド引数などには不可
		var count = 1000;
		
		//コンソール出力
		//C# .NET Console.WriteLine()
		//C# Unity Debug.Log()
		System.out.println("Age:" + age);
		System.out.println("Price:" + price);
		System.out.println("Is Active:" + isActive);
		System.out.println("Name:" + name);
		
		//配列の宣言と初期化
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		//配列の中身を繰り返し構文を使って
		//全部足してコンソールに結果を表示しなさい。
		//足し算をまとめる用の変数sumを用いること
		//繰り返し構文はC#と同じとする
		
		int sum = 0; //Javaでは初期化をするべし
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		System.out.println("配列の合計" + sum);
		
	}
}
