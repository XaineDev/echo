package dev.xaine.echo.values.impl;

import dev.xaine.echo.values.Value;

public class BooleanValue extends Value<Boolean> {
    public BooleanValue(String settingName, boolean enabled) {
        super(settingName, enabled);
    }
    public void toggleValue() {
        super.setCurrentValue(!super.getCurrentValue());
    }
}
