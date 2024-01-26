package dev.xaine.echo.modules;

import dev.xaine.echo.Echo;
import dev.xaine.echo.values.Value;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ModuleBase {
    protected final Minecraft mc = Minecraft.getInstance();
    protected final LocalPlayer player = mc.player;

    @Getter
    private final String name;
    @Getter
    private final String description;
    @Getter
    private final ModuleCategory category;

    @Setter
    @Getter
    private String displayName;
    @Setter
    @Getter
    private int key;
    @Getter
    private boolean enabled;

    private final List<Value<?>> valueList = new ArrayList<>();

    protected ModuleBase() {
        Module annotation = getClass().getAnnotation(Module.class);
        if(annotation == null) {
            throw new IllegalStateException("Instantiating Module "+getClass().getName()+" Without Annotation");
        }

        this.name = annotation.name();
        this.description = annotation.description();
        this.category = annotation.category();

        this.displayName = annotation.displayName();
        this.key = annotation.key();
    }

    protected void onEnable() {
        Echo.INSTANCE.getEventBus().register(this);
    }
    protected void onDisable() {
        Echo.INSTANCE.getEventBus().unregister(this);
    }

    public void toggleModule() {
        this.enabled = !this.enabled;
        if(this.enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }
    public void setEnabled(boolean enabled) {
        if(this.enabled == enabled) return;
        this.enabled = !this.enabled;
        if(this.enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }
    public void forceEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Value<?>> getValues() {
        return valueList;
    }
    public void setValues(Value<?>... values) {
        this.valueList.addAll(Arrays.asList(values));
    }

    public String getModuleName() {
        return this.name;
    }
}
