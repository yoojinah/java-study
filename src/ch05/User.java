package ch05;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void userInformation() {
        System.out.println("이름은 :"+name);
        System.out.println("나이는 :"+age);
        System.out.println("email은 :"+email);
    }

   

    public void ageUp() {
        age++;
    }

//    public int ageUp() {
//        int increase;
//        increase = age++;
//        return increase;
//    }
//
//    User user1 = new User("asdf", 13,@asdfm);
//    User user2 = new User("asdf", 11,@asdfm);
//    int a = user1.ageUp();
//    int b =user2.ageUp();
//    increaseAddAge(a, b);
}
