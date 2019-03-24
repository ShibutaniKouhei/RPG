package rpg;

public class Chracter {
	public int hp;
	public String name;

	public void introduce(){
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp);
	}

	public void attack(Chracter c){
		System.out.println(this.name+"の攻撃！");
		c.damage(5);
	}

	public void damage(int power){
		System.out.println(this.name+"は、"+power+"ポイントのダメージを受けた！");
		this.hp -= power;
	}

}
