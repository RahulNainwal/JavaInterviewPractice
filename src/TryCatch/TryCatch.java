package TryCatch;

public class TryCatch {
	public static void main(String[] args) {
		System.out.println("Condition where finally not executed");
		try{
			int x = 10/0;
			System.out.println("Within try block Running...");
			System.exit(0);
		}catch (Exception e) {
			System.out.println(e);
			
		}
		finally{
			System.out.println("Final Method is running..");
		}
	}

}
