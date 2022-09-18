package Singleton.Singleton;

public class Class_2 {
	
	public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
		Class_Singleton x = Class_Singleton.getInstance();
		
        // Instantiating Singleton class with variable y
		Class_Singleton y = Class_Singleton.getInstance();
  
        // Instantiating Singleton class with variable z
		Class_Singleton z = Class_Singleton.getInstance();
  
        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());
		
	System.out.println("Latest added code");
		
  
        // Condition check
        if (x == y && y == z) {
  
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }

}
