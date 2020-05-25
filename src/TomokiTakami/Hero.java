
public class Hero {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name+"の攻撃");
		System.out.println("5のダメージを受けた");

	}
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {

		this("朝霞");
	}
}

