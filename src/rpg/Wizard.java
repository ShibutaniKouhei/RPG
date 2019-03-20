package rpg;


public class Wizard {
	public String name;
	public int hp;
	public int mp;

	public void damege(int power){
		System.out.println(this.name+"は、"+power+"ポイントのダメージを受けた！");
		this.hp -= power;
	}

	public void introduce(){
		System.out.println("私は"+ this.name+"です。");
		System.out.println("体力:"+this.hp+"魔力:"+this.mp);
	}

	public void attack(Enemy e){
		System.out.println(this.name+"の攻撃！");
		e.damage(5);

	}

}
