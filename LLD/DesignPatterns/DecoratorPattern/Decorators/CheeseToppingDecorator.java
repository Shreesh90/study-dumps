package DesignPatterns.DecoratorPattern.Decorators;

import DesignPatterns.DecoratorPattern.Base.PizzaBase;

public class CheeseToppingDecorator extends ToppingDecorator {

    PizzaBase pizzaBase;
    public CheeseToppingDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public int cost() {
        // System.out.println("Cost of Cheese topping: 19");
        return pizzaBase.cost() + 19;
    }
    
}
