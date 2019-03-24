package rpg;

public class Enemy extends Chracter{

	@Override
	public void introduce() {
		System.out.println(this.name + "が現れた！");
		System.out.println("HP:"+ this.hp);
	}


}
