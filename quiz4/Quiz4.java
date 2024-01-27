

package com.mycompany.quiz4;



public class Quiz4 {

    public static void main(String[] args) {
        Customer c1=new Customer(05,"Muhammet");        //3  tane customer  nesnesi oluşturdum ve ardından onları 
        Customer c2=new Customer(12,"Furkan");          //kuyruğa attım
        Customer c3=new Customer(2002,"Durmaz");
        CustomerQueue c4 =new CustomerQueue();
        c4.add(c1);
        c4.add(c2);
        c4.add(c3);
        System.out.print("Kuyruk icerigi soyledir:");      //Kuyruğa attıktan sonraki halini yazdırdım
        c4.printElements();
        System.out.println("");
        int uzunluk = c4.size();
        for (int i =0 ; i<uzunluk;i++){                     //daha sonra kuyruğun uzunluğunu kullanarak kuyruğu boşalttım
            c4.remove();
                 }    
        System.out.print("Kuyrugun icinin bosaltilmis hali:");
        c4.printElements();
        System.out.println("");
                                                                    //boşaltılmış halini yazdırdım
        Customer c5=new Customer(02,"Pinar");
        Customer c6=new Customer(11,"Duman");        
        c4.add(c6);                                         // daha sonra yeni nesneleri oluşturdum onları kuyruğua attım
        c4.add(c5);
        System.out.print("Peek yapmadan onceki kuyruk icerigi:");
        c4.printElements();                                             // peek yaptım ve silinmediğini gösterdim
        System.out.println("");

        c4.peek();
        System.out.println(c4.peek()+" =peek");
        System.out.print("Peek yapildiktan sonraki kuyruk icerigi:");
        
        c4.printElements();
        
    }
}
