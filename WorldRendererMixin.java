package com.ultralod.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(CallbackInfo ci) {
        // यह हर फ्रेम पर दूर के चंक्स को लोड रखने का बेस ट्रिगर पॉइंट है
    }
}
