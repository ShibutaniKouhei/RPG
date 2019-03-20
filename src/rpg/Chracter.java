package rpg;

public class Chracter {
	public int hp;
	public String name;

	public void introduce(){
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp);
	}

	public void attack(Enemy e){
		System.out.println(this.name+"の攻撃！");
		e.damage(5);
	}

	public void damege(int power){
		System.out.println(this.name+"は、"+power+"ポイントのダメージを受けた！");
		this.hp -= power;
	}

}
