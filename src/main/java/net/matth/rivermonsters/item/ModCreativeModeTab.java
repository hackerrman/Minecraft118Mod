package net.matth.rivermonsters.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab COURSE_TAB = new CreativeModeTab("modtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(moditems.GOLIATH_TIGERFISH.get());
        }
    };
}
