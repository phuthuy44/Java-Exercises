import java.util.Scanner;

public class Glosbe {
    private static int n;
    private static int m;
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("So da hien co:");
        n=sc.nextInt();//số đá có
        System.out.println("So da toi da co the boc");
        m=sc.nextInt();//số đá tối đa có thể bóc
        while( true ){
            Userplay();
            if( n == 0 ){
                System.out.println(" You win! ");
                return;
            }
            showGlosbe();
            Botplay();
            if( n == 0 ){
                System.out.println("You lose!");
                return;
            }
            showGlosbe();
        }
    }
    public static void Userplay(){
        System.out.println("So da ban muon boc:");
        int x = sc.nextInt();
        if( x > m || x > n ){
            System.out.println("Fail!.Moi nhap lai!");
            Userplay();
        }
        n -= x;

    }
    public static void showGlosbe(){
        System.out.println("So da con lai:"+ n );
    }
    public static void Botplay(){
        if(n % (m+1) == 0){//n=6 ,m=5 
            System.out.println("Bot boc 1 viên");
            n--;
        }else{
            int x = n % (m+1);
            System.out.println("Bot boc :" + x);
            n -= x;
        }
    }
}
