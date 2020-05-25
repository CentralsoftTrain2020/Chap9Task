package ishibashiSeiga.renshu1;

public class Main {

	public static void main(String[] args) {

		/*
		//勇者を生成
		Hero h = new Hero("[勇者]");

		//お化けキノコ1を生成
		monstar m1 = new monstar("[メイプル]");

		//お化けキノコ2を生成
		monstar m2 = new monstar("[シュガー]");

		//聖職者クレリックを生成
		Cleric c = new Cleric("[クレリック]");

		//魔法使いウィザードを生成
		Wizard w = new Wizard("[ウィザード]");
		
		*/

		//冒険者Thiefを生成
		Thief t = new Thief("[Thief]",40,5);


		//System.out.println("勇者"+h.name+"を生み出しました！");
		//System.out.println("モンスター"+m1.name+"を生み出しました！");
		//System.out.println("モンスター"+m2.name+"を生み出しました！");
		//System.out.println("聖職者"+c.name+"を生み出しました！");
		System.out.println("冒険者"+t.name+"を生み出しました！");
		System.out.println("");

		/*
		//アクション
		h.slip();
		h.sit(5);
		c.selfAid();
		int z = c.pray(3);
		m1.run();
		m2.run();
		w.heal(h);

		//戻り値確認
		System.out.println(z);
		
		*/
	}

}


