public class BT9 {
    
    private int head;// the first node
    private int MaxSize;//maxsize of Array
    private int size;//size current of Array;
    private int tail;//the epmty node
    private NodeBT9[] queue; //create a array of queue
    public BT9(int MaxSize) {
        this.head = 0;
        this.MaxSize = MaxSize;
        this.size = 0;
        this.tail = 0;
        this.queue = new NodeBT9[MaxSize];

    }
    public void enqueue(NodeBT9 a){
        if(this.isFull()){
            System.out.println("Queue is Full!\n");
            return;
        }
        else{
            this.size++;
        this.queue[this.tail]=a;//tail at new node
        this.tail++;
        if(this.tail==this.MaxSize){
            this.tail=0;
        }
        }
    }
    public NodeBT9 dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!\n");
            return null;
        }else{
            this.size--;
            NodeBT9 a= this.queue[this.head];
            this.head++;
            return a;
        }
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==this.MaxSize;
    }
    public void print(){
        System.out.println("===>Queue:");
        if(this.isEmpty()){
            System.out.println("Queue is Empty!\n");
            return;
        }else{
            int temp= this.head;
            while(true){
                
                this.queue[temp].printData();
                temp++;
                if(temp==this.MaxSize){
                    temp=0;
                }
                if (temp==this.tail){
                    break;
                }
            }
            for(int i=0;i<this.MaxSize;i++){
                if(this.queue[i]!=null)
                {
                    System.out.println("i="+i+" :");
                    this.queue[i].printData();
                }
            }
        }
    }
    
}
