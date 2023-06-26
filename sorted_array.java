
package array;

        import java.util.Scanner;

public class sorted_array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println("Enter marks :");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        System.out.print("Array :");

        for (int element : marks)
            System.out.print(element + " ");
        boolean a = true;
        for (int i = 0; i < marks.length - 1; i++) {
            if (marks[i] > marks[i + 1]) {
                a = false;
                break;
            }
        }
        if (a)
            System.out.println("\nArray is sorted");
        else
            System.out.println("\nArray is not sorted ");
    }}