
public class Node {
    Mahasiswa m;
    Node prev, next;
    
    Node(Node prev, Mahasiswa data,Node next){
        this.prev = prev;
        this.m = data;
        this.next = next;
    }
    
}
