package mathclass;

/*
 * The java.lang.Math.round() is a built-in math function which returns the closest long to the argument.
 */
public class TestFour {
	public static void main(String[] args) {
		// float numbers
		float x = 4567.9874f;

		// find the closest int for these floats
		System.out.println(Math.round(x));

		float y = -3421.134f;
		float f = 5.2f, g = 5.9f;
		System.out.println(Math.round(f)+" "+Math.round(f));

		// find the closest int for these floats
		System.out.println(Math.round(y));

		double positiveInfinity = Double.POSITIVE_INFINITY;

		// returns the Integer.MAX_VALUE value when
		System.out.println(Math.round(positiveInfinity));
	}
}
