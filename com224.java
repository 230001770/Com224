/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test;
import java.util.Scanner;
import java.util.Arrays;


public class com224 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(findProductIndex ());
        
    }
    public static int findProductIndex (){
 Scanner obj = new Scanner(System.in) ;
 System.out.print("pushing in ");
int productId = obj.nextInt();
int[] productIDs = {104,105,106,107,101,102,103};
    return Arrays.binarySearch(productIDs, productId); 
    }
    
}