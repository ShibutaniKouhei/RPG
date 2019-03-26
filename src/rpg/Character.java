package rpg;

public class Character {
	private int hp;	//HP
	private String name;	//名前

	//コンストラクタ
	public Character(int hp, String name) {
		this.hp = hp;
		this.name = name;
	}

	//自己紹介のメソッド
	public void introduce(){
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp);
	}

	//攻撃用のメソッド
	public void attack(Character c){
		System.out.println(this.name+"の攻撃！");
		c.damage(5);
	}

	//キャラクターがダメージを負うメソッド
	public void damage(int power){
		System.out.println(this.name+"は、"+power+"ポイントのダメージを受けた！");
		this.hp -= power;
	}

	//getter
	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}



}
