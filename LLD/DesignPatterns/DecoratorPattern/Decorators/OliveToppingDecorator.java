package DesignPatterns.DecoratorPattern.Decorators;

import DesignPatterns.DecoratorPattern.Base.PizzaBase;

public class OliveToppingDecorator extends ToppingDecorator {
    PizzaBase pizzaBase;
    public OliveToppingDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public int cost() {
        // System.out.println("Cost of Olive topping: 39");
        return pizzaBase.cost() + 39;
    }
}
