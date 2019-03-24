package rpg;

public class CharacterApp {

	public static void main(String[] args) {
		//剣士をインスタンス化して情報を代入
		Knight knight = new Knight(150,"剣士",10);

		//泥棒をインスタン化して情報を代入
		Thief thief = new Thief(100,"泥棒");

		//魔法使いをインスタンス化して情報を代入
		Wizard wizard = new Wizard(100,"魔法使い",50);

		//敵をインスタンス化して情報を代入
		Enemy enemy = new Enemy(200,"敵");

		//剣士の行動
		knight.introduce();
		knight.attack(enemy);

		//泥棒の行動
		thief.introduce();
		thief.attack(enemy);

		//魔法使いの行動
		wizard.introduce();
		wizard.attack(enemy);

		//敵の攻撃
		enemy.introduce();
		enemy.attack(knight);
	}

}
