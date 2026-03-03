package DecoratorPattern;

import DecoratorPattern.Base.ExtravaganzaPizza;
import DecoratorPattern.Base.MargheritaPizza;
import DecoratorPattern.Base.PizzaBase;
import DecoratorPattern.Decorators.CheeseToppingDecorator;
import DecoratorPattern.Decorators.OliveToppingDecorator;

public class Main {
    public static void main(String[] args) {
        PizzaBase pizza1 = new CheeseToppingDecorator(new MargheritaPizza());
        PizzaBase pizza2 = new OliveToppingDecorator(new CheeseToppingDecorator(new ExtravaganzaPizza())); 

        System.out.println(pizza1.cost());
        System.out.println(pizza2.cost());
    }
    
}
