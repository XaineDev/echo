package dev.xaine.echo.values.impl;

import dev.xaine.echo.values.Value;

import java.util.Arrays;
import java.util.List;

public class DropdownValue extends Value<List<Value<?>>> {

    public DropdownValue(String valueName, List<Value<?>> defaultValue) {
        super(valueName, defaultValue);
    }

    public DropdownValue(String valueName, Value<?>... values) {
        super(valueName, Arrays.asList(values));
    }
}
