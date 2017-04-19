/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifthirdbitis0or1;

/**
 *
 * @author semka
 */
 
public class HelloWorld
{
      public static void main(String[] args) 
      {
            int bit = 3;
            int num = 000; 
            
            int result = (num >>> (bit - 1)) & 1;
            System.out.println(result );
      }
}