package DesignPattern.decorator;

public class Bauble extends TreeDecorator {
    public Bauble(Tree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public void display() {
        super.display();
        decorateBauble();
    }

    private void decorateBauble() {
        System.out.println("Decorate Bauble ornament");
    }
}
