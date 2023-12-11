package DesignPattern.composite.shape;

public class Main {
    public static void main(String[] args) {
        // 도형을 생성할 때 다음 좌표를 활용할 것
        // 왼쪽은 도형에서 사용할 좌표, 오른쪽은 도형의 이름을 나타냄
        // coordinates             // shape name
        int[] coords = { 36, 33, 66, 53,            // R1
                24, 22, 31, 34, 22, 35,    // T1
                27, 35, 57, 55,            // g1_R1
                36, 60, 66, 80,            // g1_R2
                29, 30, 30, 48, 30, 43,    // g1_T1
                31, 39, 31, 48, 45, 11 };  // g1_T2

        // Selectable을 저장할 수 있는 ArrayList를 생성하고, Rectangle R1, Triangle T1을 추가
        // Group을 생성하고 Rectangle g1_R1, g1_R2을 그룹에 추가
        // 그룹에 Triangle g1_T1, g1_T2를 추가,
        // 생성된 그룹을 ArrayList에 추가

        // ArrayList에 있는 각 Selectable의 정보를 화면에 출력하고,
        // 좌표 (20, 20), (30, 30), (40, 40)이 BoundingBox애 포함되는지 출력

        int[] coords1 = {36, 33, 66, 53};
        int[] coords2 = {24, 22, 31, 34, 22, 35};
        int[] coords3 = {27, 35, 57, 55};
        int[] coords4 = {36, 60, 66, 80};
        int[] coords5 = {29, 30, 30, 48, 30, 43};
        int[] coords6 = {31, 39, 31, 48, 45, 11};

        Shape R1 = new Rectangle("R1", coords1, 1);
        R1.print();
        R1.isSelected(20, 20);
        R1.isSelected(30, 30);
        R1.isSelected(40, 40);

        Shape T1 = new Triangle("T1", coords2, 1);
        T1.print();
        T1.isSelected(20, 20);
        T1.isSelected(30, 30);
        T1.isSelected(40, 40);

        Shape G1R1 = new Rectangle("g1_R1", coords3, 1);
        Shape G1R2 = new Rectangle("g1_R2", coords4, 1);
        Shape G1T1 = new Triangle("g1_T1", coords5, 1);
        Shape G1T2 = new Triangle("g1_T2", coords6, 1);

        Group group = new Group("Group 1");
        group.addShape(G1R1);
        group.addShape(G1R2);
        group.addShape(G1T1);
        group.addShape(G1T2);
        group.print();
        group.isSelected(20, 20);
        group.isSelected(30, 30);
        group.isSelected(40, 40);

    }
}
