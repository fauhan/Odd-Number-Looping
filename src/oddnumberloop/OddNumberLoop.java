/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumberloop;

/**
 *
 * @author fauhan.pugar
 */
public class OddNumberLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=99; i++)
        {
            if (i%2 !=0)
                System.out.print(i + " ");
            if(i%10 == 0)
                System.out.println();
        }
    }
    
}
