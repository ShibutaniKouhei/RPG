package rpg;

public class ChracterApp {

	public static void main(String[] args) {
		//剣士をインスタンス化して情報を代入
		Knight knight = new Knight();
		knight.hp = 150;
		knight.name = "剣士";
		knight.power = 10;

		//泥棒をインスタン化して情報を代入
		Thief thief = new Thief();
		thief.hp = 100;
		thief.name = "泥棒";

		//魔法使いをインスタンス化して情報を代入
		Wizard wizard = new Wizard();
		wizard.hp = 100;
		wizard.mp = 50;
		wizard.name = "魔法使い";

		//敵をインスタンス化して情報を代入
		Enemy enemy = new Enemy();
		enemy.hp = 200;
		enemy.name = "敵";

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
