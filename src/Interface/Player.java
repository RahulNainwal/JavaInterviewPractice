package Interface;

import java.util.ArrayList;

public class Player implements Playing11 {

	@Override
	public ArrayList<String> playing11(ArrayList<String> list) {
		list.add("sachin");
		list.add("Viru");
		list.add("Gautam");
		list.add("Raina");
		list.add("dhoni");
		return list;
	}

	@Override
	public ArrayList<PlayerId> playerCode(ArrayList<String> list2, ArrayList<Integer> list3) {
		PlayerId pi = new PlayerId();
		ArrayList<PlayerId> playerid = new ArrayList<>();
		int id = 101;
		for (String s : list2) {
			pi.setName(s);
			pi.setId(id);
			id++;
			playerid.add(pi);
		}
		/*
		 * for(Integer i:list3){ pi.setId(i); }
		 */
		return playerid;
	}

}
