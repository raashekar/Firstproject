/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseword;
import java.util.*;
/**
 *
 * @author Rajashekerreddi
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="Hadoop File System";
        String rev="";
        StringBuilder sb=new StringBuilder(s);
        StringTokenizer st=new StringTokenizer(sb.reverse().toString());
         System.out.print("reverse word is:");
        while(st.hasMoreElements())
        {
           StringBuilder sb1=new StringBuilder(st.nextToken());
           
            System.out.print(" "+sb1.reverse());
        }
       
        // TODO code application logic here
    }
    
}
