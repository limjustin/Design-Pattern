package DesignPattern.factory_method;

import java.util.Calendar;

public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
        ElevatorScheduler scheduler = null;

        switch (strategyID) {
            case RESPONSE_TIME :
                scheduler = ResponseTimeScheduler.getScheduler();
                break;
            case THROUGHPUT :
                scheduler = ThroughputScheduler.getScheduler();
                break;
            case DYNAMIC :
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12)
                    scheduler = ResponseTimeScheduler.getScheduler();
                else
                    scheduler = ThroughputScheduler.getScheduler();
                break;
        }
        return scheduler;
    }
}
