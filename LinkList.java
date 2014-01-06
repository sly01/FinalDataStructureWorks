/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class LinkList {

    public Link first;

    public LinkList() {
        first = null;
    }

    public void insertFirst(int data){
    Link newLink = new Link(data);
    newLink.next = first;
    first = newLink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    public Link find(int key){
        Link current = first;
        while(current.data != key){
            if (current.next == null) {
                return null;
            }
            else
                current = current.next;
        }
        return current;
    }
    
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        
        while(current.data != key){
            if (current.next == null) {
                return null;
            }
            else{
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            current.next = first;
        }
        else{
            previous.next = current.next;
        }
        return current;
    }
    
    
    public boolean isEmpty() {

        return (first == null);
    }
}
