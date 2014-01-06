/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class MainKuyruk {
    public static void main(String[] args) {
        Kuyruk test = new Kuyruk(5);
        
        test.insert(10);
        test.insert(20);
        test.insert(30);
        test.insert(40);
        test.insert(50);
        
       while(!test.isEmpty()){
           System.out.println(test.remove());
       }
        
       
    }
    
}
