package rpg;

public class Knight extends Character{
	private int power;	//力

	//コンストラクタ
	public Knight(int hp, String name, int power) {
		super(hp, name);
		this.power = power;
	}

	//自己紹介のオーバーライド
	@Override
	public void introduce(){
		System.out.println("私は"+ this.getName());
		System.out.println("HP:"+ this.getHp());
	}

	//攻撃のオーバーライド
	@Override
	public void attack(Character c) {
		System.out.println(this.getName()+"の攻撃！");
		c.damage(5);
		this.powerAttack(c);

	}

	//追加攻撃のメソッド
	public void powerAttack(Character c){
		System.out.println(this.getName()+"の追加攻撃。");
		System.out.println(this.getName()+"は力強く攻撃した！");
		c.damage(this.power);
	}


}
