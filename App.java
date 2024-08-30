import java.lang.Math;
import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        int vez=0;

        System.out.printf("Informe o valor 'A': ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.printf("Informe o valor 'B': ");
        b = sc.nextInt();
        sc.nextLine();

        System.out.printf("Informe o valor 'C': ");
        c = sc.nextInt();
        sc.nextLine();

        int x1 = calcula(a,b,c,vez);
        vez=1;
        int x2 = calcula(a,b,c,vez);

        System.out.println("x1: " + x1 + " x2: " + x2);

        sc.close();
    }

    public static int calcula(int a, int b, int c, int vez){
        
        int delta = (int) ((Math.pow(b, 2)) - 4*a*c);
        int x=0;

        if (vez==0){
            x = (int) ((-b + Math.sqrt(delta))/2*a);
        }else{
            x = (int) ((-b - Math.sqrt(delta))/2*a);
        }

        return x;
    }
}
