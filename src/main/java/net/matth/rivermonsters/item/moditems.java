package net.matth.rivermonsters.item;

import net.matth.rivermonsters.rivermonsters;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, rivermonsters.MOD_ID);

    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    public static final RegistryObject<Item> GOLIATH_TIGERFISH = ITEMS.register("goliath_tigerfish", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
