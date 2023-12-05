package DesignPattern.template_method;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee..");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk in Coffee..");
    }
}
