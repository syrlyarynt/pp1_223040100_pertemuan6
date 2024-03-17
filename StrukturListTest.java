/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author syrly
 */
public class StrukturListTest {
    
    // Latihan 2
//    public static void main(String[] args) {
//        // 1. Create list dengan keyword new
//        StrukturList myList = new StrukturList();
//        
//        // 2. Tambah elemen 5 di akhir list
//        myList.addTail(5);
//        
//        // 3. Tambah elemen 4 di akhir list
//        myList.addTail(4);
//        
//        // 4. Tambah elemen 6 di akhir list
//        myList.addTail(6);
//        
//        // 5. Tampilkan elemen list
//         System.out.print("List Elements: ");
//         myList.displayElement();
//         System.out.println("");
//        
//        // 6. Cari elemen bernilai 6
//        boolean found = myList.find(6);
//        System.out.println("Apakah elemen bernilai 6 ditemukan? " + found); // Output: true
//
//    }
//    
    // Latihan 4
    public static void main(String[] args) {
       // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();
        
        // 2. Tambah elemen sehingga elemen list berisi (7, 6, 4, 2, 3)
        myList.addTail(7);
        myList.addTail(6);
        myList.addTail(4);
        myList.addTail(2);
        myList.addTail(3);
        
        // 3. Tampilkan elemen list
        System.out.print("List elements: ");
        myList.displayElement();
        System.out.println(); // New line for clarity
        
        // 4. Tampilkan size elemen list
        System.out.println("Size of the list: " + myList.size());
    }
}
