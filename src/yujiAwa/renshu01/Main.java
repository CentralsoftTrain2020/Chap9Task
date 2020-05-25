package yujiAwa.renshu01;

public class Main {

	public static void main(String[] args) {
	int baseHp = 25;
	Thief t = new Thief("アサカ",baseHp);
	System.out.println(baseHp + " : " + t.hp);
	heal(baseHp);
	heal(t);
	System.out.println(baseHp + " : " + t.hp);
	}

	public static void heal(int hp) {
		hp += 10;
	}
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	/*
	 9行目は14行目のメソッドを実行していて、引数としてbaseHpに入っている25の値そのものを渡す
	 わけではなくコピーして値を渡しているため（値渡し)呼び出し元のmain関数内では変数の値が変更されない。
	 10行目は17行目のメソッドを呼び出し実行している。こちらはクラス型の変数なので
	 値そのものをコピーするのではなくアドレスの先頭番地を渡すため(参照渡し)、＋10された値が表示される。
	 */

}
