package rpg;

import java.util.Random;

public class CharacterApp {

	public static void main(String[] args) {
		/*Character c = new Character();抽象クラスのインスタンス化NG*/

		Moveable[] players = new Moveable[4];
		//剣士をインスタンス化して情報を代入
		players[0] = new Knight(20,"剣士",10);
		//泥棒をインスタン化して情報を代入
		players[1] = new Thief(15,"泥棒");
		//魔法使いをインスタンス化して情報を代入
		players[2] = new Wizard(15,"魔法使い",50);
		//どらえもんをインスタンス化して代入
		players[3] = new Doraemon("どらえもん",0);

		//敵をインスタンス化して情報を代入
		Moveable[] enemys = new Moveable[2];
		enemys[0] = new Enemy(60,"敵A");
		enemys[1] = new Enemy(60,"敵B");

		//playerの自己紹介
		for(int i = 0; i < players.length; i++){
			players[i].introduce();
		}

		//enemyの自己紹介
		for(int i = 0; i < enemys.length; i++){
			enemys[i].introduce();
		}
		//敵がプレイヤー攻撃するための乱数
		Random rnd = new Random();

		while(true){
			//GameOver判定
			if(players[0].isDead() && players[1].isDead() && players[2].isDead()){
				System.out.println("GameOver");
				break;
			//Clear判定
			}else if(enemys[0].isDead() && enemys[1].isDead()){
				System.out.println("Clear!");
				break;
			}else{
				//player攻撃ターン
				for(int i = 0; i < players.length; i++){
					//敵の数だけ乱数生成
					int enemyNum = rnd.nextInt(enemys.length);
					//死んでいるplyerとどらえもんは攻撃できない
					if(players[i].isDead()){
						continue;
					}else if(players[i].getName().equals(players[3].getName())){
						System.out.println("どらえもんは帰ってしまった。");
						continue;
					}else{
						//playerが死んでいるenemyを攻撃できないように条件分岐
						if(enemys[enemyNum].isDead()){
							System.out.println(players[i].getName()+"は"+ enemys[enemyNum].getName()+"を攻撃しようとしたが既に死んでいる。");
							continue;
						}else{
							players[i].move((Character)enemys[enemyNum]);
							System.out.println(enemys[enemyNum].getName()+"の残り体力"+enemys[enemyNum].getHp());
						}
					}
				}
				//enemy攻撃ターン
				for(int i = 0; i < enemys.length; i++){
					//プレイヤーの数だけ乱数生成
					int playerNum = rnd.nextInt(players.length);

					if(players[playerNum].getName().equals(players[3].getName())){
						System.out.println(enemys[i].getName()+"はどらえもんを攻撃できない");
						continue;
					}
					//死んでいるenemyは攻撃できない
					if(enemys[i].isDead()){
						continue;
					}else{
						//enemyが死んでいるplayerを攻撃できないように条件分岐
						if(players[playerNum].isDead()){
							System.out.println(enemys[i].getName()+"は"+players[playerNum].getName()+"を攻撃しようとしたが既に死んでいる。");
							continue;
						}else{
							enemys[i].move((Character)players[playerNum]);
							System.out.println(players[playerNum].getName() + "の残り体力" + players[playerNum].getHp());
						}
					}
				}
			}
		}
	}
}
