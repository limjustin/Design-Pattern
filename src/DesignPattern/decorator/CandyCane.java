package DesignPattern.decorator;

public class CandyCane extends TreeDecorator {
    public CandyCane(Tree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public void display() {
        super.display();
        decorateCandyCane();
    }

    private void decorateCandyCane() {
        System.out.println("Decorate CandyCane ornament");
    }
}
