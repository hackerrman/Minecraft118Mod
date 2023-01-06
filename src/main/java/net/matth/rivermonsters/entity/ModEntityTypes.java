package net.matth.rivermonsters.entity;

import net.matth.rivermonsters.entity.custom.*;
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

    public static final RegistryObject<EntityType<BowfinEntity>> BOWFIN = ENTITY_TYPES.register("bowfin",
            () -> EntityType.Builder.of(BowfinEntity::new, MobCategory.WATER_CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(RiverMonsters.MOD_ID, "bowfin").toString()));
    public static final RegistryObject<EntityType<AlligatorGarEntity>> ALLIGATOR_GAR = ENTITY_TYPES.register("alligator_gar",
            () -> EntityType.Builder.of(AlligatorGarEntity::new, MobCategory.WATER_CREATURE)
                    .sized(1.1f, 0.6f)
                    .build(new ResourceLocation(RiverMonsters.MOD_ID, "alligator_gar").toString()));

    public static final RegistryObject<EntityType<GreenlandSharkEntity>> GREENLAND_SHARK = ENTITY_TYPES.register("greenland_shark",
            () -> EntityType.Builder.of(GreenlandSharkEntity::new, MobCategory.WATER_CREATURE)
                    .sized(1.8f, 1.4f)
                    .build(new ResourceLocation(RiverMonsters.MOD_ID, "greenland_shark").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
