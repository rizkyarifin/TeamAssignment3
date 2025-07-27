package com.stackqueue;

/**
 * TUGAS ANGGOTA 2: Dwi Rizky Fitriana
 * 
 * Implementasi Stack menggunakan Linked List
 * Bobot: Bagian dari 10% Case 1
 * 
 * TODO YANG HARUS DIKERJAKAN:
 * 1. Buat inner class Node untuk menyimpan data dan pointer
 * 2. Implementasikan method push(), pop(), peek(), isEmpty()
 * 3. Test dengan memasukkan berbagai operator dan operand
 */
public class LinkedListStack {
    
    /**
     * Class untuk menyimpan data dan referensi ke node berikutnya
     */
    private class Node {
       char data;
       Node next;

       public Node(char data) {
           this.data = data;
           this.next = null;
       }
    }
    
    private Node top; // Pointer ke node teratas
    
    // Constructor - sudah selesai, tidak perlu diubah
    public LinkedListStack() {
        this.top = null;
    }
    
    /**
     * Method untuk menambahkan elemen ke stack
     * @param item karakter yang akan ditambahkan
     */
    public void push(char item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }
    
    /**
     * Method untuk mengambil dan menghapus elemen teratas dari stack
     * @return karakter teratas dari stack
     */
    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong");
        }

        char data = top.data;
        top = top.next;
        return data;
    }
    
    /**
     * Method untuk melihat elemen teratas tanpa menghapusnya
     * @return karakter teratas dari stack
     */
    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack kosong");
        }

        return top.data;
    }
    
    /**
     * Method untuk mengecek apakah stack kosong
     * @return true jika stack kosong, false jika tidak
     */
    public boolean isEmpty() {
        return top == null;
    }
    
    // Method untuk debugging - sudah selesai, tidak perlu diubah
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}