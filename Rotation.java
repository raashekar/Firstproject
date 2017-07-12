/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotation;

/**
 *
 * @author Rajashekerreddi
 */
public class Rotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="raasheker";
        String s2="hekerraas";
        String s3="";
        if(s1.length()!=s2.length())
        {
            System.out.println("not rotation");
        }
        s3=s1+s1;
        if(s3.contains(s2))
        {
            System.out.println("rotation");
        }
        else
        {
            System.out.println("no rotation");
        }
        // TODO code application logic here
    }
    
}
