/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Arrays;
public class Week4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {12,24,36,48,50};
	int key = 36;
    int res = Arrays.binarySearch(array,key);
	if (res < 0)
		System.out.println("Element not found!");
	else
		System.out.println("Element found at index: "+res);

    }
    
}
