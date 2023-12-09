package DesignPattern.decorator;

public class Star extends TreeDecorator {
    public Star(Tree decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public void display() {
        super.display();
        decorateStar();
    }

    private void decorateStar() {
        System.out.println("Decorate Star ornament");
    }
}
