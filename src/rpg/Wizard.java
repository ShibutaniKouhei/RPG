package rpg;


public class Wizard extends Chracter{
	public int mp;

	@Override
	public void introduce() {
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp + "MP:" + this.mp);
	}

	@Override
	public void attack(Chracter c) {
		super.attack(c);
	}

	public void flame(Chracter c){
		System.out.println(this.name + "は追加で炎を撃った！");
		if(this.mp >= 5){
			c.damage(15);
			this.mp -= 5;
		}else{
			System.out.println("MPが足りません！");
		}
	}
}
