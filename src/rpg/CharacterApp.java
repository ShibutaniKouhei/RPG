package rpg;

import java.util.Random;

public class CharacterApp {

	public static void main(String[] args) {
		/*Character c = new Character();抽象クラスのインスタンス化NG*/

		Character[] players = new Character[3];
		//剣士をインスタンス化して情報を代入
		players[0] = new Knight(20,"剣士",10);
		//泥棒をインスタン化して情報を代入
		players[1] = new Thief(15,"泥棒");
		//魔法使いをインスタンス化して情報を代入
		players[2] = new Wizard(15,"魔法使い",50);

		//敵をインスタンス化して情報を代入
		Character enemy = new Enemy(100,"敵");
		enemy.introduce();

		//playerの自己紹介
		for(int i = 0; i < players.length; i++){
			players[i].introduce();
		}
		//敵がプレイヤー攻撃するための乱数
		Random rnd = new Random();

		while(true){
			if(players[0].isDead() && players[1].isDead() && players[2].isDead()){
				System.out.println("GameOver");
				break;
			}else if(enemy.isDead()){
				System.out.println("Clear!");
				break;
			}else{
				for(int i = 0; i < players.length; i++){
					//playerが死んでいたら攻撃できないように条件分岐
					if(players[i].isDead()){
						continue;
					}else{
						players[i].attack(enemy);
					}
					System.out.println("敵の残り体力"+enemy.getHp());
				}
				//プレイヤーの数だけ乱数生成
				int value = rnd.nextInt(players.length);
				//敵が死んでいるplayerを攻撃できないように条件分岐
				if(players[value].isDead()){
					System.out.println(enemy.getName()+"は"+players[value].getName()+"を攻撃しようとしたが既に死んでいる。");
					continue;
				}else{
					enemy.attack(players[value]);
					System.out.println(players[value].getName() + "の残り体力" + players[value].getHp());
				}
			}
		}
	}
}
