package rpg;

public class Enemy {
	public int hp;
	public String name;

	public void introduce(){
		System.out.println("私は"+ this.name+"です。");
		System.out.println("体力:"+this.hp);
	}
	public void damage(int power){
		System.out.println(this.name+"は、"+ power+ "ポイントのダメージを受けた！");
		this.hp -= power;
	}
	public void attack(Chracter c){
		System.out.println(this.name+"の攻撃！");
		c.damege(10);
	}

}
