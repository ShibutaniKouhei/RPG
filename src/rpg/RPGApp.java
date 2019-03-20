package rpg;

public class RPGApp {

	public static void main(String[] args) {
		//インスタンス化
		Wizard wizard = new Wizard();
		Enemy enemy = new Enemy();

		//魔法使いの情報を代入
		wizard.name = "魔法使い";
		wizard.hp = 50;
		wizard.mp = 100;

		//敵の情報を代入
		enemy.name = "コウモリ";
		enemy.hp = 30;
		//introduce()を呼び出して自己紹介
		wizard.introduce();

		//敵からの攻撃
		enemy.attack(wizard);

		//魔法使いの攻撃
		wizard.attack(enemy);
	}

}
