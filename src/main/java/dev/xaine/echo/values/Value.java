package dev.xaine.echo.values;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Value<Value> {

    @Setter
    protected Value currentValue;
    String valueName;

    public Value(String valueName, Value defaultValue) {
        this.valueName = valueName;
        this.currentValue = defaultValue;
    }

}