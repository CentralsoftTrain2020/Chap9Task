package sodaiSakai.rensyu1;


public class Thief {
	String name;
	int hp;
	int mp;

	//�ȉ��R���X�g���N�^
	public Thief(String name) {
		this(name,40);
	}

	public Thief(String name,int hp) {
		this(name,hp,5);
	}

	public Thief(String name,int hp,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

}