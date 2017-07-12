/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dupicatecharacters;

/**
 *
 * @author Rajashekerreddi
 */
public class Dupicatecharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="vivan";
        String rep="";
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
        char c=s.charAt(i);
        if(s.indexOf(c,i+1)>0 && rep.indexOf(c)==-1)
        {
             rep=rep+c;
        }
        // TODO code application logic here
    }
        System.out.println(rep);
    
}
}
