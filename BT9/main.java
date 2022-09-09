public class main {
    public static void main(String[] args){
        System.out.println("Queue-Java\n");

        BT9 queue= new BT9(9);
        queue.enqueue(new NodeBT9(1));
        queue.enqueue(new NodeBT9(4));
        queue.enqueue(new NodeBT9(108));
        queue.enqueue(new NodeBT9(708));
        queue.enqueue(new NodeBT9(900));
        queue.enqueue(new NodeBT9(1008));
        queue.enqueue(new NodeBT9(202));
        queue.enqueue(new NodeBT9(1080));
        queue.enqueue(new NodeBT9(1098));
        
        System.out.println("\n");
        //test firt queue     
        queue.print();
        queue.enqueue(new NodeBT9(1048));
        NodeBT9 newnode= queue.dequeue();
        if(newnode!=null){
            System.out.println("Dequeue:");
            newnode.printData();
        }
        /*
        NodeBT9 newnode2= queue.dequeue();
        if(newnode2!=null){
            System.out.println("Dequeue:");
            newnode2.printData();
        }*/
        System.out.println("\n");
        //after dequeue two node
        queue.print();
        //enqueue a new node
        queue.enqueue(new NodeBT9(1048));
        queue.print();

    }
}
