package rpg;


public class Wizard extends Chracter{
	public int mp;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp + "MP:" + this.mp);
	}

	@Override
	public void attack(Enemy e) {
		// TODO 自動生成されたメソッド・スタブ
		super.attack(e);
	}

	@Override
	public void damege(int power) {
		// TODO 自動生成されたメソッド・スタブ
		super.damege(power);
	}



}
