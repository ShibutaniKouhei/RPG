package rpg;

public class Knight extends Character{
	private int power;

	public Knight(int hp, String name, int power) {
		super(hp, name);
		this.power = power;
	}

	@Override
	public void introduce(){
		System.out.println("私は"+ this.getName());
		System.out.println("HP:"+ this.getHp());
	}

	@Override
	public void attack(Character c) {
		super.attack(c);
		this.powerAttack(c);

	}
	public void powerAttack(Character c){
		System.out.println(this.getName()+"の追加攻撃。");
		System.out.println(this.getName()+"は力強く攻撃した！");
		c.damage(this.power);
	}


}
