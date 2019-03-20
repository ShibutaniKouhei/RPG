package rpg;

public class Knight extends Chracter{
	public int power;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name);
		System.out.println("HP:"+ this.hp);
	}

	@Override
	public void attack(Enemy e) {
		super.attack(e);
		this.powerAttack(e);

	}
	public void powerAttack(Enemy e){
		System.out.println(this.name+"は力強く攻撃した！");
		e.damage(power);
	}


}
