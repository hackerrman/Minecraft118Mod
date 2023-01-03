package net.matth.rivermonsters.entity;

import net.matth.rivermonsters.entity.custom.GiantStingrayEntity;
import net.matth.rivermonsters.entity.custom.GoliathTigerEntity;
import net.matth.rivermonsters.RiverMonsters;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, RiverMonsters.MOD_ID);

    public static final RegistryObject<EntityType<GoliathTigerEntity>> GOLIATH_TIGER = ENTITY_TYPES.register("goliath_tiger",
            () -> EntityType.Builder.of(GoliathTigerEntity::new, MobCategory.WATER_CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(RiverMonsters.MOD_ID, "goliath_tiger").toString()));

    public static final RegistryObject<EntityType<GiantStingrayEntity>> GIANT_STINGRAY = ENTITY_TYPES.register("giant_stingray",
            () -> EntityType.Builder.of(GiantStingrayEntity::new, MobCategory.WATER_CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(RiverMonsters.MOD_ID, "giant_stingray").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
