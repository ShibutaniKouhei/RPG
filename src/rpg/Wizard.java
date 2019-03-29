package rpg;


public class Wizard extends Character{
	private int mp;	//MP

	//コンストラクタ
	public Wizard(int hp, String name, int mp) {
		super(hp, name);
		this.mp = mp;
	}

	//自己紹介のオーバーライド
	@Override
	public void introduce() {
		System.out.println("私は"+ this.getName()+"です。");
		System.out.println("HP:"+ this.getHp() + "MP:" + this.mp);
	}

	//攻撃のオーバーライド
	@Override
	public void attack(Character c) {
		System.out.println(this.getName()+"の攻撃！");
		c.damage(5);
		flame(c);
	}

	//追加攻撃の魔法
	public void flame(Character c){
		System.out.println(this.getName()+"の追加攻撃。");
		System.out.println(this.getName() + "は炎を撃った！");
		if(this.mp >= 5){
			c.damage(15);
			this.mp -= 5;
		}else{
			System.out.println("MPが足りません！");
		}
	}
}
