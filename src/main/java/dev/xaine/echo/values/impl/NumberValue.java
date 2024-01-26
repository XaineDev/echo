package dev.xaine.echo.values.impl;

import dev.xaine.echo.values.Value;
import lombok.Getter;
import lombok.Setter;

@Getter
public class NumberValue extends Value<Double> {

    private final double increment;
    @Setter
    private double min;
    @Setter
    private double max;

    public NumberValue(String name, double value, double min, double max, double increment) {
        super(name, value);
        this.min = min;
        this.max = max;
        this.increment = increment;
    }

    public long getLong() {
        return currentValue.longValue();
    }
    public double getDouble() {
        return currentValue;
    }
    public float getFloat() {
        return currentValue.floatValue();
    }
    public int getInt() {
        return currentValue.intValue();
    }

    public void increment(boolean positive) {
        double newValue = positive ? currentValue + increment : currentValue - increment;
        if (newValue > max) {
            newValue = max;
        }
        if (newValue < min) {
            newValue = min;
        }
        setCurrentValue( newValue );
    }

}
