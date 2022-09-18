package Singleton.Singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class_Singleton {
	
	
	    // Static variable reference of single_instance
	    // of type Singleton
	    private static Class_Singleton single_instance = null;
	  
	    // Declaring a variable of type String
	    public String s;
	  
	    // Constructor
	    // Here we will be creating private constructor
	    // restricted to this class itself
	    private Class_Singleton()
	    {
	        s = "Hello I am a string part of Singleton class";
	    }
	  
	    // Static method
	    // Static method to create instance of Singleton class
	  
	    public static Class_Singleton getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new Class_Singleton();
	        
	        return single_instance;
	    }
	 
}
