package com.willowworks.chipped;

import net.fabricmc.api.ModInitializer;

public class FabricChipped implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Chipped.init();
    }
}
