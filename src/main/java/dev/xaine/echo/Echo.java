package dev.xaine.echo;

import dev.xaine.echo.util.crypt.Crypt;
import dev.xaine.echo.util.crypt.EchoCrypt;
import dev.xaine.echo.util.logging.CryptFileLogger;
import dev.xaine.echo.util.logging.DevelopmentLogger;
import dev.xaine.echo.util.logging.Logger;
import dev.xaine.echo.util.system.ECHO_EXIT_VALUES;
import lombok.Getter;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Echo.MODID)
public class Echo {
    public static final Echo INSTANCE = new Echo();
    public static final String MODID = "echo";

    @Getter
    private final Crypt crypt = new EchoCrypt();
    @Getter
    private final Logger logger = new DevelopmentLogger();

    public Echo() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener((final FMLDedicatedServerSetupEvent e) -> {
            System.exit(ECHO_EXIT_VALUES.INVALID_LOAD_STATE.getValue());
        });
    }

    private void setup(final FMLClientSetupEvent event) {
        // register mod settings
        event.enqueueWork(() -> {

        });


    }

}
