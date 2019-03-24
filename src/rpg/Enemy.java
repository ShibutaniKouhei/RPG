package rpg;

public class Enemy extends Character{

	public Enemy(int hp, String name) {
		super(hp, name);
	}

	@Override
	public void introduce() {
		System.out.println(this.getName() + "が現れた！");
		System.out.println("HP:"+ this.getHp());
	}


}
