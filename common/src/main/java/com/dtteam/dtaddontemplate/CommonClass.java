package com.dtteam.dtaddontemplate;

import com.dtteam.dtaddontemplate.init.BlockInit;
import com.dtteam.dtaddontemplate.init.EntityInit;
import com.dtteam.dtaddontemplate.init.ItemInit;
import com.dtteam.dtaddontemplate.init.TagInit;
import com.dtteam.dtaddontemplate.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class CommonClass {

    public static void init() {
        ItemInit.loadClass();
        BlockInit.loadClass();
        EntityInit.loadClass();
        TagInit.loadClass();
    }
}