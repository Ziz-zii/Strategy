
void main() {

    Pet cat = new Cat("Мурзик");
    Pet dog = new Dog("Шарик");

    System.out.println(cat.name+":");
    cat.sound();
    System.out.println(dog.name+":");
    dog.sound();
}
