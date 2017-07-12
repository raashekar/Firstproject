/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostreapeterdchar;

/**
 *
 * @author Rajashekerreddi
 */
public class Mostreapeterdchar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="dough couting";
        String s1="";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
                if(count>max){
                    s1=Character.toString(s.charAt(i));
                max=count;
                             }
            else if(count==max)
            {
                    s1=s1+Character.toString(s.charAt(i));
                    
            }
            
        // TODO code application logic here
        }
    System.out.println(s1);
}
}
