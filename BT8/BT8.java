public class BT8 {
    private Node head;
    private int size;//kick thuoc list
    public BT8() {
        this.head =null;
        this.size=0;
    }
    public void push(Node node){
        node.next=this.head;
        this.head=node;//head cot vao node moi
        this.size++;
    }
    public Node pop(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty\n");
            return null;
        }
        Node node=this.head;
        this.head=this.head.next;
        this.size--;
        return node;
    }
    public Node peek(){
        if(this.isEmpty()){
            System.out.println("Stack is Empty!\n");
            return null;
        }
        return this.head;

    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void print(){
        System.out.println("Stack:\n");
        Node node=this.head;
        while(node!=null){
            node.printData();
            node=node.next;
        }
    }

}
