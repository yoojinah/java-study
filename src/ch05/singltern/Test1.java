package ch05.singltern;

import ch05.singltern.Singleton;

public class Test1 {
    public void test(){
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        int[] sss = {1,2,3,4,5};
        s1.multifly(sss);
    }
}
