package DesignPattern.factory_method;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler = new ResponseTimeScheduler();

    private ResponseTimeScheduler() {}

    public static ElevatorScheduler getScheduler() {
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination) {
        return 1;  // 1번째 인덱스에 있는 엘리베이터 반환
    }
}
