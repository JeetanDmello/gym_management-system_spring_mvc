package net.project.gms.decorator;

import java.util.List;

public interface Program {
	String getName();
    double getBaseCost();
    List<String> getIncludedFeatures();
}
