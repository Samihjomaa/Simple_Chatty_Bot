import java.util.Scanner;

class Main {
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int a=0, b=0, c=0;

         for (int i=1; i <= n; i++){
             int products = scan.nextInt();

             if (products == 0){
                 a+=1;
             }
             else if (products == 1){
                 b+=1;
             }
             else {
                 c+=1;
             }
         }

         System.out.print(a+ " "+ b+ " "+c);

 
    }
}
