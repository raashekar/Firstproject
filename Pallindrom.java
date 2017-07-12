/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallindrom;

/**
 *
 * @author Rajashekerreddi
 */
public class Pallindrom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="noon";
        for (int i=0,j=s.length()-1;i<=j;i++,j--)
        {
           
                if(s.charAt(i)!=s.charAt(j))
                {
                     System.out.println("not palli");
                }
                else
                {
                     System.out.println("pallin");
                }
            }
        }
        
        // TODO code application logic here
    }
    

