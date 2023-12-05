package DesignPattern.template_method;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();
    public abstract void addCondiments();
    public void boilWater() {
        System.out.println("Boiling water..");
    }
    public void pourInCup() {
        System.out.println("Pouring in cup..");
    }
}
