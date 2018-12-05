package Interface;

public class Operations implements InterfaceClass{

	@Override
	public int add(int x, int y) {
		int z = x +y;
		return z;
	}

	@Override
	public int substract(int m, int n) {
		int o = m+n;
		return o;
	}

}
