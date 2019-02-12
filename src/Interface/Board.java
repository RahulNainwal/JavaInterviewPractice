package Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
	public static void main(String[] args) {
		Player player = new Player();
		PlayerId pi = new PlayerId();
		ArrayList<String> list = new ArrayList<>();
		System.out.println(player.playing11(list));
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println(player.playerCode(list, list2)+" "+player.playerCode(list, list2).size());
		
	}
}
