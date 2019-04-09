package rpg;

public class Doraemon implements Movable{

	private String name;
	private int hp;
	private int count = 0;
	public Doraemon(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

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

}
