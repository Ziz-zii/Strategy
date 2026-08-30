public class Dog extends Pet {

    public Dog (String name){
        this.name = name;
        this.soundIn = new StrategyDogSound();
        }
        public void setName (String name){this.name = name;}
    }

