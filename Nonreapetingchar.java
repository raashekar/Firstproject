/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonreapetingchar;

/**
 *
 * @author Rajashekerreddi
 */
public class Nonreapetingchar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="nirmalya kumar";
        int index=0;
        char c[]=s.toCharArray();
        boolean status=false;
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j]){
                    status=false;
                break;}
                else
                {
                    status=true;
                index=i;
            }
        }
        if(status){
             System.out.println("Non-reapeting char is:"+c[index]);
        break;
        // TODO code application logic here
    }
    
}
    }
}
