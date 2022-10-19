import java.time.LocalDateTime;
import java.util.Date;

public class program {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Date date = new Date();
        System.out.println(date);
        System.out.println(LocalDateTime.now());

        int[] arr = new int[]{1,1,0,1,1,1};
        int count = 0;
        int res = 0;
        for (int item: arr) {
            if (item == 1) {
                count++;
                res = count;
            }
            else {
                if (res < count) res = count;
                count = 0;
            }
        }
        System.out.println(res);

    }
}
