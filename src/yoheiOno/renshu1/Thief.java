package yoheiOno.renshu1;

public class Thief {
	String name;
	int hp;
	int mp;

	public Thief(String name, int hp, int mp) {
		this(name,hp);
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		this(name);
		this.hp = hp;
		this.mp = 5;
	}

	public Thief(String name) {
		this.name = name;
		this.hp = 40;
		this.mp = 5;
	}
}


/*
実行結果
25:25
45:45

理由
t.hpはbaseHpを参照しているため、内容は同じものになる。
*/