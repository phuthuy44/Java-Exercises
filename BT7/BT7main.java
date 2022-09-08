public class BT7main {
    public static void main(String[] args){
        System.out.println("Stack-Java\n");
        BT7 stack= new BT7(6);
        stack.push(new BT7node(12));
        stack.push(new BT7node(20));
        stack.push(new BT7node(7));

        stack.print();

        BT7node node= stack.peek();
        if(node!=null){
            System.out.println("=>Peek:");
            node.printData();
        }

        BT7node node2= stack.pop();
        if(node!=null){
            System.out.println("=>Pop:");
            node.printData();
        }
        stack.print();
    }
}
