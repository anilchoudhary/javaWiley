package day3_arrays;

public class Integer_wrapper {
	public static void main(String[] args) {                  
        Integer obj = 333;   
        
        int i = obj.intValue();  
        System.out.println("Value of i is: " + i);  
        
        
        
        int x = 9;
        System.out.println("Number = " + x);
        System.out.println("Binary Representation of x = " + Integer.toBinaryString(x)); 
  
        System.out.println("By reversing we get = " + Integer.reverse(x));
        System.out.println("Binary Representation of reverse x = " + Integer.toBinaryString(Integer.reverse(x))); 
      }
}
