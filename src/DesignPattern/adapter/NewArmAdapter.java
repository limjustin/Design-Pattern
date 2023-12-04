package DesignPattern.adapter;

public class NewArmAdapter implements ArmCore {

    private final NewArm newArm;

    public NewArmAdapter(NewArm newArm) {
        this.newArm = newArm;
    }

    @Override
    public void up() {
        newArm.lift();
    }

    @Override
    public void down() {
        newArm.fall();
    }
}
