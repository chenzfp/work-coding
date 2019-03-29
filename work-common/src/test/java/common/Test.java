package common;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author chenzf
 * @Description
 * @Date 2019/3/21 13:44
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        /*Integer integer = list.stream().map(i -> i * 3).reduce((sum) -> sum + 0).get();
        System.out.println(integer);*/

    }

    public static void filter(List<String> list, Predicate<String> condition) {

        list.forEach(i -> {
            if (condition.test(i)) {
                System.out.print(i + " ");
            }
        });
    }

}
