package com.dtteam.dtaddontemplate;


import com.dtteam.dynamictrees.block.leaves.*;
import com.dtteam.dynamictrees.block.soil.*;
import com.dtteam.dynamictrees.data.*;
import com.dtteam.dynamictrees.registry.*;
import com.dtteam.dynamictrees.tree.family.*;
import com.dtteam.dynamictrees.tree.species.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.*;

@Mod(Constants.MODID)
public class DTExampleAddon {

    public DTExampleAddon(IEventBus eventBus) {
        CommonClass.init();
        eventBus.addListener(this::gatherData);
        NeoForgeRegistryHandler.setup(Constants.MODID, eventBus);
    }

    private void gatherData(final GatherDataEvent event) {
        GatherDataHelper.gatherAllData(Constants.MODID, event,
                SoilProperties.REGISTRY,
                Family.REGISTRY,
                Species.REGISTRY,
                LeavesProperties.REGISTRY
        );
    }
}