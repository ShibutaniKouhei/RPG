package rpg;

public class Character {
	private int hp;
	private String name;

	public Character(int hp, String name) {
		super();
		this.hp = hp;
		this.name = name;
	}

	public void introduce(){
		System.out.println("私は"+ this.name+"です。");
		System.out.println("HP:"+ this.hp);
	}

	public void attack(Character c){
		System.out.println(this.name+"の攻撃！");
		c.damage(5);
	}

	public void damage(int power){
		System.out.println(this.name+"は、"+power+"ポイントのダメージを受けた！");
		this.hp -= power;
	}

	public int getHp() {
		return hp;
	}

	public String getName() {
		return name;
	}



}
