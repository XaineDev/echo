package dev.xaine.echo.mixin;

import dev.xaine.echo.screen.EchoCompactUI;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.OptionsScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {
    protected TitleScreenMixin(Component title) {
        super(title);
    }

    @Inject(method = "init", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/gui/TitleScreenModUpdateIndicator;init(Lnet/minecraft/client/gui/screens/TitleScreen;Lnet/minecraft/client/gui/components/Button;)Lnet/minecraftforge/client/gui/TitleScreenModUpdateIndicator;"))
    protected void init(CallbackInfo ci) {
        int l = this.height / 4 + 48;
        addRenderableWidget(Button.builder(Component.literal("Echo UI"), (button) -> {
            if (this.minecraft != null) {
                this.minecraft.setScreen(new EchoCompactUI(this));
            }
        }).bounds(this.width / 2 + 104, l, 98, 20).build());
    }
}
