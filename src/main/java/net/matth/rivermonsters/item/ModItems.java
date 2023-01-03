package net.matth.rivermonsters.item;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RiverMonsters.MOD_ID);

    public static final RegistryObject<Item> STEEL_KNIFE = ITEMS.register("steel_knife", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    public static final RegistryObject<Item> GOLIATH_TIGERFISH = ITEMS.register("goliath_tigerfish", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static final RegistryObject<ForgeSpawnEggItem> GOLIATH_TIGERFISH_SPAWN_EGG = ITEMS.register("goliath_tigerfish_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GOLIATH_TIGER,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.COURSE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
