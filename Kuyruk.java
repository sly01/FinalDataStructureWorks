/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author erkoc
 */
public class Kuyruk {
    
    private int size;
    private int[] maxSize;
    private int on;
    private int arka;
    private int elemanSayisi;

    public Kuyruk(int boyut) {
    
        size = boyut;
        maxSize = new int[size];
        on = 0;
        arka = -1;
        elemanSayisi = 0;   
    }
    
    public void insert(int j){
        if(arka == size - 1 ){
            arka = -1;
        }
        maxSize[++arka] = j;
        elemanSayisi++;
    }
    
    public int remove(){
        int temp = maxSize[on++];
        if(on == size){
            on = 0;
        }
        elemanSayisi--;
        return temp;
    }
    
    public int peek(){
        return maxSize[on];
    }
    public boolean isEmpty(){
        return ( elemanSayisi == 0 );
    }
    public boolean isFull(){
        return (elemanSayisi == size);
    }
    public int adet(){
        return elemanSayisi;
    }
   
    
}
