package rpg;

public class Thief extends Character{

	//コンストラクタ
	public Thief(int hp, String name) {
		super(hp, name);
	}

	//自己紹介のオーバーライド
	@Override
	public void introduce() {
		System.out.println("私は"+ this.getName()+"だ！");
		System.out.println("HP:"+ this.getHp());
	}

	//攻撃のオーバーライド
	@Override
	public void attack(Character c) {
		super.attack(c);
		steal(c);
	}

	//攻撃の際に相手から追加で盗む
	public void steal(Character c){
		System.out.println(this.getName()+"は、"+c.getName()+"からアイテムを盗んだ");
	}
}
