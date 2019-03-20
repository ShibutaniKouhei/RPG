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
		thief.speed = 30;

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

		//敵の攻撃
		enemy.attack(knight);
	}

}
