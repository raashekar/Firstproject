/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstring;

/**
 *
 * @author Rajashekerreddi
 */
public class SortString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="agriculture";
        char c[]=s.toCharArray();
        for(int i=0;i<(c.length-1);i++)
        {
            for(int j=i+1;j>0;j--)
            {
               if(c[j]<c[j-1])
               {
                   char temp=c[j-1];
                    c[j-1]=c[j];
                    c[j]=temp;
            }
             
        }
        // TODO code application logic here
    }
        s=String.valueOf(c);
 
    System.out.println("sort the  word is:"+s);
    
}
}
