package dev.xaine.echo.screen;


import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

public class EchoCompactUI extends Screen {

    Screen parent;

    public EchoCompactUI(Screen parent) {
        super(Component.literal("Echo Compact UI"));
        this.parent = parent;
    }

    @Override
    public void render(@NotNull GuiGraphics graphics, int p_281550_, int p_282878_, float p_282465_) {
        super.render(graphics, p_281550_, p_282878_, p_282465_);
        graphics.fill(0, 0, this.width, this.height, 0x11000000);
    }

    @Override
    public boolean keyPressed(int p_96552_, int p_96553_, int p_96554_) {
        return super.keyPressed(p_96552_, p_96553_, p_96554_);
    }
}
