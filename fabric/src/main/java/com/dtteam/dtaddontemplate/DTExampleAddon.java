package com.dtteam.dtaddontemplate;

import com.dtteam.dynamictrees.registry.*;
import net.fabricmc.api.ModInitializer;

public class DTExampleAddon implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.init();
    }
}
