public class BT7 {
  // private int size;//kich thuoc co cua mang
   private int maxSize;
   private int top;//vi tri 
   private BT7node[] stack;//Mang stack

public BT7(int MaxSize) {//int Maxsize: kich thuoc cua mang 
    //this.size = 0;
    this.maxSize=MaxSize;
    this.top = -1;
    this.stack = new BT7node[MaxSize];//khai bao mang co bao nhiu phan tu node
}
public void push(BT7node node){
    if(this.isFull()){
        System.out.println("Stack is Full:\n");
        return;
    }
this.top++;//tang len 1 size
this.stack[this.top]=node;//vitri moi cua new node
}
public BT7node pop(){
    if(this.isEmpty()){
        System.out.println("Stack is empty!\n");
        return null;
    }
    BT7node node=this.stack[this.top];
    this.top--;
    return node;
}
public BT7node peek(){
    if(this.isEmpty()){
        System.out.println("Stack is empty!\n");
        return null;
    }
    return this.stack[this.top];
}
public boolean isEmpty(){
    return this.top==-1;
}
public boolean isFull(){
    return this.top+1==this.maxSize;//kich thuoc size =MaxSize=> stack FULL
}
public void print(){
    System.out.println("Stack:\n");
    System.out.println("Data="+" ");
    
    for(int i=0;i<=this.top;i++){
        this.stack[i].printData();
       
    }
}
}
