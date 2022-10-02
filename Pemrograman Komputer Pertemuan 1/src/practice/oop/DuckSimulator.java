/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

/**
 *
 * @author ACER
 */
public class DuckSimulator {
    
    public static void main(String[] args) {
        
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I'cant fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();
        
        Duck model = new ModelDuck();
        
        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();
        
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
