import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Promise
 * Date: 2024-03-03 17:44
 * Description:
 */


public class TestParam {
    @Test
    public void test1() throws NullPointerException {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("唱");
        hobbies.add("跳");
        hobbies.add("rap");
        hobbies.add("篮球");
        System.out.println(hobbies);
    }
}
