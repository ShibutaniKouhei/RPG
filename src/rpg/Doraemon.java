package rpg;

public class Doraemon implements Moveable{

	private String name;
	private int hp;
	private int count = 0;
	public Doraemon(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}


	@Override
	public void introduce() {
		System.out.println("僕どらえもん！");
	}


	public void move(Character c){
		if(this.count == 0){
			introduce();
		}else if(this.count >= 1){
			System.out.println("どらえもんは帰っていった。");
		}
		this.count++;
	}

	@Override
	public boolean isDead() {

		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getHp() {
		return hp;
	}


}
