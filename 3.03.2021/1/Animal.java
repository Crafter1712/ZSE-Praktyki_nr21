package pl.Skalinski;

public class Animal {
    protected String name;
    protected String color;
    protected String makeSound;

    public String helloAnimal(){
        return makeSound + " I am " + name + " my color is " + color;

    }
    public Animal getAnimal(){
        return new Animal();
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void  setColor(String color){
        this.color = color;
    }

}
