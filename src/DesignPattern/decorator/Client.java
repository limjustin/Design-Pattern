package DesignPattern.decorator;

public class Client {
    public static void main(String[] args) {
        Tree tree = new FirTree();
        tree = new Bauble(tree);
        tree = new Bauble(tree);
        tree = new CandyCane(tree);
        tree = new Star(tree);
        tree.display();
    }
}
