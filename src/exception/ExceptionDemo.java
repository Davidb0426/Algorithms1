package exception;

public class ExceptionDemo {

	
	
	
	
	
	public static void main(String[] args) {
		int b=7;
		int c=0;

		try {
//			int k=b/c;
			int arr[] = new int[5];
			System.out.println(arr[7]);
//			System.out.println(k);
		} catch(ArithmeticException et) {
			System.out.println("I caught the Arithmetic Exception");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("I caught the Index Out Of Bounds Exception");
		} finally{
			// it executes irrespective of exception thwron or not
			System.out.println("delete cookies");
		}
	}

}
