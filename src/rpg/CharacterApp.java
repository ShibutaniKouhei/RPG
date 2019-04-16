package rpg;

import java.util.Random;

public class CharacterApp {

	public static void main(String[] args) {
		/*Character c = new Character();抽象クラスのインスタンス化NG*/

		Movable[] players = new Movable[4];
		//剣士をインスタンス化して情報を代入
		players[0] = new Knight(20,"剣士",10);
		//泥棒をインスタン化して情報を代入
		players[1] = new Thief(15,"泥棒");
		//魔法使いをインスタンス化して情報を代入
		players[2] = new Wizard(15,"魔法使い",50);
		//どらえもんをインスタンス化して代入
		players[3] = new Doraemon("どらえもん",0);

		//敵をインスタンス化して情報を代入
		Movable[] enemies = new Movable[2];
		enemies[0] = new Enemy(60,"敵A");
		enemies[1] = new Enemy(60,"敵B");

		//playerの自己紹介
		for(int i = 0; i < players.length; i++){
			if(players[i] instanceof Doraemon){
				((Doraemon) players[i]).introduce();
			}else{
				((Character) players[i]).introduce();
			}
		}

		//enemyの自己紹介
		for(int i = 0; i < enemies.length; i++){
			((Character) enemies[i]).introduce();
		}
		//敵がプレイヤー攻撃するための乱数
		Random rnd = new Random();

		while(true){
			//GameOver判定
			if(((Character) players[0]).isDead() && ((Character) players[1]).isDead() && ((Character) players[2]).isDead()){
				System.out.println("GameOver");
				break;
			//Clear判定
			}else if(((Character) enemies[0]).isDead() && ((Character) enemies[1]).isDead()){
				System.out.println("Clear!");
				break;
			}else{
				//player攻撃ターン
				for(int i = 0; i < players.length; i++){
					//敵の数だけ乱数生成
					int enemyNum = rnd.nextInt(enemies.length);

					//死んでいるplyerとどらえもんは攻撃できない
					if(players[i] instanceof Doraemon){
						//ドラえもんを動かすためだけのインスタンス
						Character doraemonMove = new Enemy(0,"NoName");
						players[i].move(doraemonMove);
						System.out.println("-----------------------------------------");
					}else if(((Character) players[i]).isDead()){
						continue;
					}else{
						//playerが死んでいるenemyを攻撃できないように条件分岐
						if(((Character) enemies[enemyNum]).isDead()){
							System.out.println(((Character) players[i]).getName()+"は"+ ((Character) enemies[enemyNum]).getName()+"を攻撃しようとしたが既に死んでいる。");
							continue;
						}else{
							players[i].move((Character)enemies[enemyNum]);
							System.out.println(((Character) enemies[enemyNum]).getName()+"の残り体力"+((Character) enemies[enemyNum]).getHp());
							System.out.println("-----------------------------------------");
						}
					}
				}
				//enemy攻撃ターン
				for(int i = 0; i < enemies.length; i++){
					//プレイヤーの数だけ乱数生成
					int playerNum = rnd.nextInt(players.length);

					//enemyが死んでいるplayerとどらえもんを攻撃できないように条件分岐
					if(players[playerNum] instanceof Doraemon){
						System.out.println(((Character) enemies[i]).getName()+"はどらえもんを攻撃できない");
						System.out.println("-----------------------------------------");
						continue;
						//死んでいるenemyは攻撃できない
					}else if(((Character) enemies[i]).isDead()){
						System.out.println(((Character) enemies[i]).getName()+"は"+((Character) players[playerNum]).getName()+"を攻撃しようとしたが既に死んでいる。");
						System.out.println("-----------------------------------------");
						continue;
					}else{
						//enemyが死んでいるplayerを攻撃できないように条件分岐
						if(((Character) players[playerNum]).isDead()){
							System.out.println(((Character) enemies[i]).getName()+"は"+((Character) players[playerNum]).getName()+"を攻撃しようとしたが既に死んでいる。");
							continue;
						}else{
							enemies[i].move((Character)players[playerNum]);
							System.out.println(((Character) players[playerNum]).getName() + "の残り体力" + ((Character) players[playerNum]).getHp());
							System.out.println("-----------------------------------------");
						}
					}
				}
			}
		}
	}
}
