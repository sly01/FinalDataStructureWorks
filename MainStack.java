/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class MainStack {

    public static void main(String[] args) {
        Stack test = new Stack(5);

        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        test.push(50);
        
        System.out.println(test.peek());
        
        System.out.println("----Tum liste-----");
        while(!test.isEmpty()){
           test.boyutAll();
           int value = test.pop();
            System.out.println(value);
        }
        
        
        System.out.println("-------liste sonu---");
        
        
        
        
    }
}
