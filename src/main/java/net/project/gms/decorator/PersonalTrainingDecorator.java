package net.project.gms.decorator;

import java.util.List;
import java.util.ArrayList;

public class PersonalTrainingDecorator extends ProgramDecorator {
    public PersonalTrainingDecorator(Program program) {
        super(program);
    }
    
    @Override
    public double getBaseCost() {
        return 60.00;
    }

    @Override
    protected List<String> getAdditionalFeatures() {
        List<String> features = new ArrayList<>();
        features.add("One-on-one personal training sessions");
        return features;
    }
}