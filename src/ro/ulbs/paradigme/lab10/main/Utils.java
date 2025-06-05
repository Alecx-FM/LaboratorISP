package ro.ulbs.paradigme.lab10.main;

import ro.ulbs.paradigme.lab10.dataprocessing.StepCountStrategy;
import ro.ulbs.paradigme.lab10.dataprocessing.impl.BasicStepCountStrategy;
import ro.ulbs.paradigme.lab10.dataprocessing.impl.FilteredStepCountStrategy;

public class Utils {
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static int getClientId() {
        return 42;
    }

    public static StepCountStrategy getStrategy(String type) {
        if (FILTERED_STRATEGY.equalsIgnoreCase(type)) {
            return new FilteredStepCountStrategy();
        } else {
            return new BasicStepCountStrategy();
        }
    }
}
