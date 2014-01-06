/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class MainLinkList {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        list.displayList();
        
        list.delete(20);
        list.displayList();
    }
    
}
