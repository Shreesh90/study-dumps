package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Base.ExtravaganzaPizza;
import DesignPatterns.DecoratorPattern.Base.MargheritaPizza;
import DesignPatterns.DecoratorPattern.Base.PizzaBase;
import DesignPatterns.DecoratorPattern.Decorators.CheeseToppingDecorator;
import DesignPatterns.DecoratorPattern.Decorators.OliveToppingDecorator;

public class Main {
    public static void main(String[] args) {
        PizzaBase pizza1 = new CheeseToppingDecorator(new MargheritaPizza());
        PizzaBase pizza2 = new OliveToppingDecorator(new CheeseToppingDecorator(new ExtravaganzaPizza())); 

        System.out.println(pizza1.cost());
        System.out.println(pizza2.cost());
    }
    
}
