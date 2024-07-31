package CollegeJAVA.Day_02;

 class Animal {
    void eat(){
        System.out.println("all Animal can eat");
    }
 }

 class Dog extends Animal{
     void bark(){
         System.out.println("Dogs are barking");
     }
 }

 class AnimalTest{
     public static void main(String[] args){
         Dog d1 = new Dog();
         d1.eat();
         d1.bark();
     }
 }
