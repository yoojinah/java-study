package ch05.accessModifier;

public class Animal {
//    var name string;      // protected
//    var Name string;      // public

    private String name;
    protected void eat() {
        System.out.println(("the animal is eating"));
    }
}
