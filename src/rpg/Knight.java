package rpg;

public class Knight extends Chracter{
	public int power;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name);
		System.out.println("HP:"+ this.hp);
	}

	@Override
	public void attack(Chracter c) {
		super.attack(c);
		this.powerAttack(c);

	}
	public void powerAttack(Chracter c){
		System.out.println(this.name+"は力強く攻撃した！");
		c.damage(this.power);
	}


}
