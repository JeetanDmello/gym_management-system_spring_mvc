package net.project.gms.decorator;

import java.util.ArrayList;
import java.util.List;

public class CardioProgram implements Program {
    @Override
    public String getName() {
        return "Cardio Program";
    }

    @Override
    public double getBaseCost() {
        return 45.00;
    }

    @Override
    public List<String> getIncludedFeatures() {
        List<String> features = new ArrayList<>();
        features.add("Access to cardio equipment");
        features.add("Access to group classes");
        features.add("Custom workout plans");
        return features;
    }
}
