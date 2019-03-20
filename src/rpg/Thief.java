package rpg;

public class Thief extends Chracter{
	public int speed;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name+"だ！");
		System.out.println("HP:"+ this.hp);
	}

	@Override
	public void attack(Enemy e) {
		super.attack(e);
		System.out.println(this.name+"は、"+e.name+"からアイテムを盗んだ");
	}

	@Override
	public void damege(int power) {
		// TODO 自動生成されたメソッド・スタブ
		super.damege(power);
	}



}
