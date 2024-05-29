package ex4;

import java.util.Date;

public class TestDataUtils {

    public static void main(String[] args) {

        Date today = new Date();
        String essai = DateUtils.format(today);

        System.out.println(essai);

    }
}
