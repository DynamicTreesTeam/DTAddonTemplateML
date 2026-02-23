package com.dtteam.dtaddontemplate;

import com.dtteam.dynamictrees.registry.*;
import com.dtteam.dynamictrees.api.*;
import net.fabricmc.api.*;

public class DTEntryPoint implements DynamicTreesAddonEntrypoint {

    @Override
    public void onDynamicTreesPreSetup() {
        DynamicTreesAddonEntrypoint.setupAddon(Constants.MODID);
    }
}
