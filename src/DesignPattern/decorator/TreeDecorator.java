package DesignPattern.decorator;

public abstract class TreeDecorator implements Tree {
    private Tree decoratedTree;

    public TreeDecorator(Tree decoratedTree) {
        this.decoratedTree = decoratedTree;
    }

    @Override
    public void display() {
        decoratedTree.display();
    }
}
