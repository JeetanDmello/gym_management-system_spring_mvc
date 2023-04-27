package net.project.gms.decorator;

import java.util.List;
import java.util.ArrayList;

public abstract class ProgramDecorator implements Program {
    private Program program;

    public ProgramDecorator(Program program) {
        this.program = program;
    }

    @Override
    public String getName() {
        return program.getName();
    }

    @Override
    public double getBaseCost() {
        return program.getBaseCost();
    }

    @Override
    public List<String> getIncludedFeatures() {
        List<String> features = new ArrayList<>(program.getIncludedFeatures());
        features.addAll(getAdditionalFeatures());
        return features;
    }

    protected abstract List<String> getAdditionalFeatures();
}
