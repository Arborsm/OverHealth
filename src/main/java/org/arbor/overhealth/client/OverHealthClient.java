package org.arbor.overhealth.client;

import io.github.fabricators_of_create.porting_lib.event.client.OverlayRenderCallback;
import net.fabricmc.api.ClientModInitializer;
import org.arbor.overhealth.ExtraHeartRenderHandler;

public class OverHealthClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        OverlayRenderCallback.EVENT.register(new ExtraHeartRenderHandler()::renderHealthbar);
    }
}
