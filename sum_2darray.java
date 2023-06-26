package array;

//import java.util.Scanner;
//
//public class sum_2darray {
//    public static void main(String[] args) {
//        System.out.println("Enter value of matrix 1 :");
//        int [][]a  = new int [2][3];
//
//
//        Scanner sc = new Scanner(System.in);
//
//
//        a[0][0] = sc.nextInt();
//        a[0][1] = sc.nextInt();
//       a[0][2] = sc.nextInt();
//        a[1][0] =sc.nextInt();
//       a[1][1] = sc.nextInt();
//       a[1][2] = sc.nextInt();
//        System.out.print("Matrix 1 :\n");
//        for(int i=0;i< a.length;i++){
//            for(int j=0;j<a[i].length;j++)
//            {
//                System.out.print(a [i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//
//
//        }
//
//        System.out.println("Enter value of matrix 2 :");
//        int [][]b  = new int [2][3];
//        Scanner sc1 = new Scanner(System.in);
//
//        b[0][0] = sc1.nextInt();
//        b[0][1] = sc1.nextInt();
//        b[0][2] = sc1.nextInt();
//        b[1][0] =sc1.nextInt();
//        b[1][1] = sc1.nextInt();
//        b[1][2] = sc1.nextInt();
//        System.out.print("Matrix 2 :\n");
//        for(int i=0;i< b.length;i++){
//            for(int j=0;j<b[i].length;j++)
//            {
//                System.out.print(b [i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//
//        }
//        for(int i=0;i< a.length;i++){
//            for(int j=0;j<a[i].length;j++)
//
//            others.result[i][j] = { {0,0,0},{0,0,0}};
//                others.result[i][j] = a [i][j] + b [i][j];
//                System.out.println(others.result [i][i]);
//
//
//
//            }
//}




import java.util.Scanner;
public class sum_2darray {
    public static void main(String[] args) {
        int p, q, m, n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        m = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        n = s.nextInt();
        if (p == m && q == n) {
            int a[][] = new int[p][q];
            int b[][] = new int[m][n];
            int c[][] = new int[m][n];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println("");
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < q; k++) {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Addition would not be possible");
        }
    }
}