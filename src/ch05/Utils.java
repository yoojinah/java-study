package ch05;

public class Utils {


    public int sumArray(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        return sum;
    }

    public int findMax(int c, int d) {
        int result = 0;

        if (c > d) {
            result = c;
        } else if(d > c) {
            result = d;
        }
        return result;
    }

    public int summ(int a, int b) {

        return a + b;
    }

//    public String nana(String[] ) {
//        String haha = "";
//
//        return ;
//    }














}
