import java.util.ArrayList;
import java.util.List;

public class Sqrt {

        public static int mySqrt(int x) {
            double y = 0.5 * Math.log(x);
            int i = 1;
            // complexity sqrt(n)
            while(y > (Math.log(i))){
                i++;
            }
            if(y == Math.log(i))
                return i;
            else
                return i-1;
        }


    public static void main(String[] args) {
        System.out.println(mySqrt(5));
    }

}
