public class Cat extends Pet{

    public Cat (String name){
        this.name = name;
        this.soundIn = new StrategyCatSound();
    }
    public void setName (String name){this.name = name;}
}
