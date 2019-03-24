package rpg;

public class Thief extends Character{

	public Thief(int hp, String name) {
		super(hp, name);
	}

	@Override
	public void introduce() {
		System.out.println("私は"+ this.getName()+"だ！");
		System.out.println("HP:"+ this.getHp());
	}

	@Override
	public void attack(Character c) {
		super.attack(c);
		steal(c);
	}

	public void steal(Character c){
		System.out.println(this.getName()+"は、"+c.getName()+"からアイテムを盗んだ");
	}
}
