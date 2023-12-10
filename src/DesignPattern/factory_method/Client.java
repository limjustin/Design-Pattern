package DesignPattern.factory_method;

public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler
                = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10);

        ElevatorManager emWithThroughputScheduler
                = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
        emWithThroughputScheduler.requestElevator(10);

        ElevatorManager emWithDynamicScheduler
                = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10);
    }
}
