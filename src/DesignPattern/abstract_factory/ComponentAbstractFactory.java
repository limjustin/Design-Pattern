package DesignPattern.abstract_factory;

public interface ComponentAbstractFactory {
    public Button createButton();
    public CheckBox createCheckBox();
    public TextEdit createTextEdit();
}
