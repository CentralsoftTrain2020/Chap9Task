package yoshikiSaito.renshu1;

public class Thief {
	String name;
	int hp;
	int mp;

	public Thief(String name, int hp, int mp) {
		this(name, hp);
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		this(name);
		this.hp = hp;
	}

	public Thief(String name) {
		this.name = name;

	}

}
