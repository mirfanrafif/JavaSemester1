package jobsheet8;

import com.oracle.webservices.internal.api.message.MessageContextFactory;

public class Queue {
    int max, size, front, rear;
    int [] q;

    public Queue(int m){
        max = m;
        create();
    }
    
    void create(){
        q = new int [max];
        size = 0;
        front = rear = -1;
    }
    
    boolean isEmpty(){
        return size==0;
    }
    
    boolean isFull(){
        return size==max;
    }
    
    void enQueue(int data){
        if (isFull()) {
            System.out.println("Penuh");
        }else{
            if (isEmpty()){
                front=rear=0;
            }else{
                if (rear==max-1) {
                    rear=0;
                }else{
                    rear++;
                }
            }
        q[rear] = data;
        size++;
        }
    }
    
    int deQueue(){
        int data = 0;
        if (isEmpty()) {
            System.out.println("Kosong");
        }else{
            data = q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if (front == max-1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    
    void print(){
        if (isEmpty()) {
            System.out.println("Kosong");
        }else{
            int i = front;
            while (i!=rear) {                
                System.out.println(q[i]+" ");
                i = (i+1) % max;
            }
            
            System.out.println(q[i]+ " ");
            System.out.println("Jumlah antrian = "+ size);
        }
    }
    
    void printFront(){
        System.out.println(q[front]+ " ");
    }
    
    void printRear(){
        System.out.println(q[rear] + " ");
    }
    
    void printPosition(int data){
        int i = 0;
        int x = -1;
        while (i < rear) {            
            if (q[i] == data) {
                x = i;
            }
            
            i++;
        }
        
        if (x==-1) {
            System.out.println("Tidak ketemu");
        }else{
            System.out.println("Ada di posisi "+ x);
        }
    }
    
    void printDatabyPos(int pos){
        System.out.println(q[pos] + " ");
    }
}
