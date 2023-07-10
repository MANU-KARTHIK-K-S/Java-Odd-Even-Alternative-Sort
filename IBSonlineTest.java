import java.util.Arrays;

public class IBSonlineTest {
    public void genArray(int size, int[] arry) {
        Arrays.sort(arry);
        int eve = 0, odd = 1;
        int countEve = 0;
        int countOdd = 0;
        for (int i : arry) {
            if (i % 2 == 0)
                countEve++;
            else
                countOdd++;

        }
        try {
            boolean flag = switch ((int) (Math.abs(countEve - countOdd))) {
                case 1 -> true;
                case 2 -> true;
                case 0 -> true;
                default -> false;
            };
            if (!(flag))
                throw new Manu("Incompactable no of eve and odd");
        } catch (Manu e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            return;
        }
        int temp[] = new int[size];
        for (int i : arry) {
            if (i % 2 == 0) {
                temp[eve] = i;
                eve += 2;
                // countEve--;
            } else {
                if ((odd) > (size - 1)) {
                    temp[size - 2] = temp[size - 1];
                    temp[size - 1] = i;
                } else {
                    temp[odd] = i;
                    odd += 2;
                }
                // countEve++;
            }
        }
        System.out.print("Size of the array: " + size + "\n{");
        for (int i : temp) {
            if (i != temp[size - 1]) {
                System.out.print(i + ",");
            } else {
                System.out.println(i + "}");
            }
        }
    }
}

class Manu extends Exception {
    public Manu(String message) {
        super(message);
    }
}
