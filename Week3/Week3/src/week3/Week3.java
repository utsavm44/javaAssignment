/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Str = "Utsav";
		 
		 
		String reversed = reverseString(Str);
		System.out.println("Reversed string is: " + reversed);
    }
    //Method take string parameter and check string is empty or not
	public static String reverseString(String newstr)
	{
		if (newstr.isEmpty()){
		 System.out.println("String Empty");	
		 return newstr;
		}
		//Calling Function Recursively
		System.out.println("String passing in Recursive Function: "+newstr.substring(1));
		return reverseString(newstr.substring(1)) + newstr.charAt(0);
	}
}
