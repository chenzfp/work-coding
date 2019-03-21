package common;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Author chenzf
 * @Description
 * @Date 2019/3/21 13:44
 */
public class Test {

    public static void main(String[] args) {
        int a = 10;
        double b = a >> 2;
        System.out.println(b);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(b));
        BigDecimal bigDecimal = new BigDecimal(b);
        System.out.println(bigDecimal);
        System.out.println(a/4);

    }

}
