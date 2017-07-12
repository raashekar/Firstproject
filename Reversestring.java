/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author Rajashekerreddi
 */
public class Reversestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="raasheker";
        int len=s.length();
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        // TODO code application logic here
    }
    
}
