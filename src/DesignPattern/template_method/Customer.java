package DesignPattern.template_method;

public class Customer {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println("Prepare coffee recipe..");
        coffee.prepareRecipe();
    }
}
