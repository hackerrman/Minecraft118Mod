package net.matth.rivermonsters;

import net.matth.rivermonsters.block.ModBlocks;
import net.matth.rivermonsters.entity.client.GiantStingrayRenderer;
import net.matth.rivermonsters.entity.client.GoliathTigerRenderer;
import net.matth.rivermonsters.entity.ModEntityTypes;
import net.matth.rivermonsters.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RiverMonsters.MOD_ID)
public class RiverMonsters {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mccourse";

    public RiverMonsters() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModEntityTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntityTypes.GOLIATH_TIGER.get(), GoliathTigerRenderer::new);
        EntityRenderers.register(ModEntityTypes.GIANT_STINGRAY.get(), GiantStingrayRenderer::new);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }

}
