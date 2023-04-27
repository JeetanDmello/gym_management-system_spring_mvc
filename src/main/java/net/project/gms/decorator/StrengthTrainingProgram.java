package net.project.gms.decorator;

import java.util.List;
import java.util.ArrayList;

public class StrengthTrainingProgram implements Program {
    @Override
    public String getName() {
        return "Strength Training Program";
    }

    @Override
    public double getBaseCost() {
        return 50.00;
    }

    @Override
    public List<String> getIncludedFeatures() {
        List<String> features = new ArrayList<>();
        features.add("Access to gym equipment");
        features.add("Access to group classes");
        features.add("Custom workout plans");
        return features;
    }
}
