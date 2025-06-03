package sukkiri_java.chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice16 {
	public static void main(String[] args) {
//		practice16_2();
		practice16_3();
	}
	
	public static void practice16_2() {
		Hero saito = new Hero("Saito");
		Hero suzuki = new Hero("Suzuki");
		ArrayList<Hero> list = new ArrayList<>();
		list.add(saito);
		list.add(suzuki);
		
		for (Hero hero : list) {
			System.out.println(hero.getName());
		}
	}
	
	public static void practice16_3() {
		Hero saito = new Hero("Saito");
		Hero suzuki = new Hero("Suzuki");
		
		Map<Hero, Integer> map = new HashMap<>();
		map.put(saito, 3);
		map.put(suzuki, 7);
		
		for(Hero h : map.keySet()) {
			System.out.printf("%s beats %d enemies.\n", h.getName(), map.get(h));
		}
	}
}
  