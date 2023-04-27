package net.project.gms.decorator;

import java.util.List;
import java.util.ArrayList;

public class NutritionPlanDecorator extends ProgramDecorator {
    public NutritionPlanDecorator(Program program) {
        super(program);
    }

    @Override
    protected List<String> getAdditionalFeatures() {
        List<String> features = new ArrayList<>();
        features.add("Personalized nutrition plan");
        return features;
    }
}