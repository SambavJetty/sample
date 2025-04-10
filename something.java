# This file is MovingStatistic which is part of the moving-average project.
package core;

public interface MovingStatistic {
    double add(double value);
    
    double getCurrentValue();
    
    int getCurrentCount();
}