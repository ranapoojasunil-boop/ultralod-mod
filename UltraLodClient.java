package com.ultralod;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UltraLodClient implements ClientModInitializer {
    public static final String MOD_ID = "ultralod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Ultra LOD Mod initialized successfully on mobile! Ready to render distant horizons.");
    }
}
