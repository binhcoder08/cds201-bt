
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BINH
 */
public class MyList {

    Node head;

    public MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void clear() {
        this.head = null;
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info);
            System.out.print(" ");
            p = p.next;
        }

    }

    void loadData(int k) {
        Random genertor = new Random();
        for (int i = 0; i < k; i++) {
            int number = genertor.nextInt(1000);
            addFirst(number);
        }
    }

    private void addFirst(int n) {
        Node p = new Node(n);
        p.next = head;
        head = p;
    }

    private void addLast(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
    }
    private void addPod(int n,int k) {
        Node newNode = new Node(n);
        Node p=head;
        for(int i =1;i<k-1;i++){
            p=p.next;
        }
        newNode.next=p.next;
        p.next=newNode;
        
    }

    void f1() {
        System.out.print("link list: ");
        this.traverse();
    }

    void f2() {
        System.out.println("before: ");

        this.traverse();
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        addLast(num);
        System.out.println("after: ");
        this.traverse();
    }
    void f3() {
        System.out.println("before: ");

        this.traverse();
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter posion : ");
        int pod = sc1.nextInt();
        if(pod==0){
            addFirst(num);
        }
        addPod(num,pod);
        System.out.println("after: ");
        this.traverse();
    }
     void f4() {
        System.out.print("before: ");
        this.traverse();
        System.out.println("\n");
        
         Node p = head;
         if(head!=null){
         if(p.next==null){
             head=null;
             return;
         }
         else{
        while (p.next.next != null) {
            p = p.next;
        }}
          p.next = null;
         }
       
        System.out.print("after: ");
        this.traverse();
    }
      void f5() {
        System.out.print("before: ");
        this.traverse();
        System.out.println("\n");
       if(head!=null){
           head=head.next;
       }
        System.out.print("after: ");
        this.traverse();
    }
}
