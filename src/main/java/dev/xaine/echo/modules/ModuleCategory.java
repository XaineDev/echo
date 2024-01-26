package dev.xaine.echo.modules;

public enum ModuleCategory {
    COMBAT("Combat"),
    MOVEMENT("Movement"),
    PLAYER("Player"),
    RENDER("Render"),
    EXPLOIT("Exploit"),
    MISC("Misc"),
    HIDDEN("Hidden", false);

    public static final ModuleCategory[] VALUES = values();

    final String name;
    final boolean display;

    ModuleCategory(String name, boolean display) {
        this.name = name;
        this.display = display;
    }
    ModuleCategory(String name) {
        this.name = name;
        this.display = true;
    }

    @Override
    public String toString() {
        return name;
    }
}
