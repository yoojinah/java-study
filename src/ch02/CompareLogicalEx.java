package ch02;

public class CompareLogicalEx {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;


        boolean p = true;
        boolean q = false;

        boolean result = (p && q) || (!q && !p);
        System.out.println(!p && !q);
    }
}
