import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");

        for (int i = 0; i < list.size(); ++i) {
            String var = list.get(i);
            System.out.println("for문 : " + var);
        }

        for (String var : list) {
            System.out.println("for in문 : " + var);
        }
    }
}
