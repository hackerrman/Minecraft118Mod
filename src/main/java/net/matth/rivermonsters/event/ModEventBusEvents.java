package net.matth.rivermonsters.event;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.GoliathTigerEntity;
import net.matth.rivermonsters.entity.ModEntityTypes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RiverMonsters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.GOLIATH_TIGER.get(), GoliathTigerEntity.setAttributes());
    }
}
