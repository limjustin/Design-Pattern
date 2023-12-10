package DesignPattern.factory_method;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<Elevator> controllers;
    private SchedulingStrategyID strategyID;

    // 주어진 수만큼 Elevator 생성
    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<Elevator>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            Elevator controller = new Elevator(i + 1);
            controllers.add(controller);
        }

        setStrategyID(strategyID);
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }

    // 요청에 따라 엘리베이터를 선택하고 이동
    public void requestElevator(int destination) {
        // 주어진 전략 ID에 해당되는 ElevatorScheduler를 사용
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler + " is selected");


        // ThroughputScheduler 이용하여 엘리베이터 선택
        int selectedElevator = scheduler.selectElevator(this, destination);
        // 선택된 엘리베이터 이동
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
