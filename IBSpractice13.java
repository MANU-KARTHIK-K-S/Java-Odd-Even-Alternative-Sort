import java.util.Scanner;

public class IBSpractice13 {
    public static void main(String[] args) {
        IBSonlineTest obj = new IBSonlineTest();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        obj.genArray(size, array);

    }
}
