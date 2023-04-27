package net.project.gms.decorator;

import java.util.List;
import java.util.ArrayList;

public class YogaProgram implements Program {
    @Override
    public String getName() {
        return "Yoga Program";
    }

    @Override
    public double getBaseCost() {
        return 40.00;
    }

    @Override
    public List<String> getIncludedFeatures() {
        List<String> features = new ArrayList<>();
        features.add("Access to yoga mats and props");
        features.add("Access to group yoga classes");
        features.add("Custom yoga plans");
        return features;
    }
}
