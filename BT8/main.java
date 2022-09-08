public class main {
    public static void main(String[] args){
      // TODO document why this method is empty
        BT8 stack=new BT8();
        stack.push(new Node(9));
        stack.push(new Node(10));
        stack.push(new Node(90));
        stack.push(new Node(56));
        stack.push(new Node(60));

        stack.print();

        Node node2 = stack.peek();
        if(node2!=null){
            System.out.println("PEEK:");
            node2.printData();
        }
        //stack.print();

        Node node = stack.pop();
        if(node!=null){
            System.out.println("POP:");
            node.printData();
        }
        stack.print();
        

    }
}
