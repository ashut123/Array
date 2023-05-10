import java.util.Scanner;



public class First{
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int size = t.nextInt();
        int A[] = new int[size];
        int a[] = {1,2,3,54};
        
        for(int i=0;i<size;i++){
            A[i]=t.nextInt();
        }
        // how to print array
        for(int i=0;i<size;i++){
            System.out.print(A[i] + " ");

        }
        System.out.println(A.length);
        
        
    }

}