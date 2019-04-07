package rpg;

public class Enemy extends Character implements Moveable{

	public Enemy(int hp, String name) {
		super(hp, name);
	}

	@Override
	public void introduce() {
		System.out.println(this.getName() + "が現れた！");
		System.out.println("HP:"+ this.getHp());
	}

	@Override
	public void attack(Character c) {
		System.out.println(this.getName()+"の攻撃！");
		c.damage(10);
	}
}
