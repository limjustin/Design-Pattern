package DesignPattern.template_method;

public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing Tea..");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon in Tea..");
    }
}
