import java.util.Scanner;

public class MainDiagonal {
    public static int MainDiagonalSum(int arr[][]){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int val=MainDiagonalSum(arr);
        System.out.println("the value is : "+val);
    }
}