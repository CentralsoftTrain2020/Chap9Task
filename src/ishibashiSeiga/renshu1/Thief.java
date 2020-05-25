package ishibashiSeiga.renshu1;

public class Thief {

	String name;
	int hp;
	int mp;

	public Thief(String name,int hp,int mp) {

		this.name = name;
		this.hp = hp;
		this.mp = mp;

	}

	public Thief(String name,int hp) {

		this(name,hp,5);

	}

	public Thief(String name) {

		this(name,40);

	}

}



//練習9-2

/*
10行目はpublic Thief(String name,int hp)を参照する
11行目で25:25が表示される
12行目は２行目を参照
13行目は5行目を参照
結果、14行目で25:35が表示される
*/
