package ex;

public class Dog extends Animal{
    private String breed;   //견종
    public Dog(String name, int age, String breed) {
        super(name,age);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }


}
