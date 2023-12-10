package DesignPattern.factory_method;

public class ThroughputScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler = new ThroughputScheduler();

    private ThroughputScheduler() {}

    public static ElevatorScheduler getScheduler() {
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination) {
        return 0;  // 0번째 인덱스에 있는 엘리베이터 반환
    }
}
