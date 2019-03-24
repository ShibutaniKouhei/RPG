package rpg;

public class Thief extends Chracter{
	public int speed;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name+"だ！");
		System.out.println("HP:"+ this.hp);
	}

	@Override
	public void attack(Chracter c) {
		super.attack(c);
		System.out.println(this.name+"は、"+c.name+"からアイテムを盗んだ");
	}
}
