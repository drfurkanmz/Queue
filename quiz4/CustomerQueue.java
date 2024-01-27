
package com.mycompany.quiz4;

import java.util.LinkedList;


public class CustomerQueue {
    
    LinkedList list= new LinkedList<>();

    public CustomerQueue() {
    }
    
    public void add (Customer c){ //customer sınıfından nesne alan bi void tipli metot tanımladım
        list.add(c);
        
        
    }
    
    public Customer remove(){
        return  (Customer) list.remove();       //remove ve peek metotlarını yazarken customer tipinde değiştirdim
    }

    public Customer peek(){
        return (Customer) list.peek();
    }

    public void printElements(){                //listeyi yazdırmak için ilk önce listenin uzunluğunu buldum ardından uzunluk kadar for döngüsü yazdırdım  
        int eleman =list.size();
        
        for (int i =0; i<eleman ;i++){
            System.out.print(list.get(i)+" ");
        
            
        }
    }                                           
    public int size(){
        int size=list.size();
        return size;
    
    }

    private LinkedList getQueueLinkedList(){
        return list;
        
    }
    
}
