package DesignPattern.factory_method;

public class Elevator {
    private int id;  // 엘리베이터 ID
    private int currentFloor;  // 현재 층

    public Elevator(int id) {
        this.id = id;
        currentFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.print("| Elevator ID #" + id + " | Floor : " + currentFloor);

        // 주어진 목적지 층으로 엘리베이터 이동
        currentFloor = destination;
        System.out.println(" --> " + currentFloor);
    }
}
