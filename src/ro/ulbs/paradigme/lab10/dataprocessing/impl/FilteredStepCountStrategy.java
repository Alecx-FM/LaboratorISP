package ro.ulbs.paradigme.lab10.dataprocessing.impl;

import ro.ulbs.paradigme.lab10.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab10.storage.SensorData;

public class FilteredStepCountStrategy implements StepCountStrategy {
    private int totalSteps = 0;

    @Override
    public void consumeMessage(SensorData data) {
        long oneMinuteAgo = System.currentTimeMillis() - 60000;
        if (data.getStepsCount() > 0 && data.getTimestamp() >= oneMinuteAgo && data.getStepsCount() <= 1000) {
            totalSteps += data.getStepsCount();
        }
    }

    @Override
    public int getTotalSteps() {
        return totalSteps;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered";
    }
}