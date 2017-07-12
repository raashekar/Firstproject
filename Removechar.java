/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removechar;

/**
 *
 * @author Rajashekerreddi
 */
public class Removechar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="james cosling";
        String s2="james";
        String s3="";
        int i=0;
        if(s1.length()<s2.length())
        {
            s1=s1+s2;
        
        s1=s1.substring(s2.length());
        s2=s1.substring(0,(s1.length()-s2.length()));
        }
        while(i<s1.length())
        {
            char c=s1.charAt(i);
            if(s2.indexOf(c)==-1)
            s3=s3+c;
            i++;
        }
        System.out.println(s3);
        // TODO code application logic here
    }
    
}
