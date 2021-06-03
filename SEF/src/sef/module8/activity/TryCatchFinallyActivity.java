package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	try {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan(); //this Failed
		System.out.println("You are visitor number 100");
	} catch (Exception e){}
}
public void catchMeIfYouCan() {
	try {
		int[] arr = {0, 1, 2, 3, 4, 5};
		for (int i = 0; i <= 10; i++) {
			System.out.println(arr[i]);
			// other codes which can also throw exceptions
		}
	}
	catch (Exception e)
	{
		System.out.println("catch block"+100/0);
	}

finally {
		System.out.println("finally block");
		System.out.println("This should get printed even if there is an exception");
	}
}
}
