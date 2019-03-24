package rpg;


public class Wizard extends Chracter{
	public int mp;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp + "MP:" + this.mp);
	}
}
