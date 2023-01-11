import java.util.HashMap;
import java.util.Objects;

public class UniqueEmailAddresses929 {

    public int numUniqueEmails(String[] emails) {
        HashMap<String,String> temp = new HashMap<>();
        int counter = 0;
        for (String email : emails) {
            String[] str = email.split("@");
            str[0] = str[0].replaceAll("\\.", "");
            String[] str1 = str[0].split("\\+");
            if (temp.containsKey(str[1])) {
                if (!(Objects.equals(temp.get(str[1]), str1[0]))) {
                    counter++;
                }
            } else {
                temp.put(str[1], str1[0]);
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        UniqueEmailAddresses929 t = new UniqueEmailAddresses929();
        System.out.println(t.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
