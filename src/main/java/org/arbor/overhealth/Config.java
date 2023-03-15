package org.arbor.overhealth;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.BooleanValue EXTRA_HEART_RENDERER;
    public static final ForgeConfigSpec CLIENT_SPEC;

    static {
        ForgeConfigSpec.Builder client = new ForgeConfigSpec.Builder();

        // client options
        EXTRA_HEART_RENDERER = client
                .comment(
                        "If true, enables the Mantle heart renderer, which stacks hearts by changing the color instead of vertically stacking them.",
                        "Mod authors: this config is not meant for compatibility with your heart renderer, cancel the RenderGameOverlayEvent.Pre event and our logic won't run")
                .translation("config.overhealth.extraHeartRenderer")
                .define("extraHeartRenderer", true);
        CLIENT_SPEC = client.build();
    }
}
