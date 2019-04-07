package rpg;

public interface Moveable{
	void move(Character c);
	void introduce();
	boolean isDead();
	String getName();
	int getHp();
}
