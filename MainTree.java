/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class MainTree {

    public static void main(String[] args) {
        Tree test = new Tree();

        test.insert(10);
        test.insert(20);
        test.insert(30);
        test.insert(40);
        test.insert(35);
        test.insert(38);
        test.insert(45);
        test.insert(90);
        test.insert(72);
        
        Node find = test.find(38);
        if (find != null) {
            System.out.println("Deger bulundu");
        }
        else
            System.out.println("Deger bulunamadi");
        
        System.out.println("Min is "+ test.findMin().data);
        System.out.println("Max is "+ test.findMax().data);
    }
}
