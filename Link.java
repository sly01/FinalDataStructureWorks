/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class Link {
    
    public int data;
    public Link next;

    public Link(int id) {
        data = id;
    }
    
    public void displayLink(){
        System.out.println("Data = " + data);
    }
    
    
}
