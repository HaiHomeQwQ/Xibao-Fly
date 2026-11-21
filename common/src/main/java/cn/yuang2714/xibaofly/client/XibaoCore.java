package cn.yuang2714.xibaofly.client;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.yuang2714.xibaofly.client.config.FileBasedConfig;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;

/**
 * Version-independent client setup: config bootstrap, sound registration and the BGM
 * handles. Each version project's {@code ClientModInitializer} calls
 * {@link #initClient()}; this class contains no loader entrypoint of its own.
 */
public final class XibaoCore {
    public static final String MOD_ID = "xibao-fly";
    public static final Logger LOGGER = LoggerFactory.getLogger("XibaoFly");
    public static Music xibao;
    public static Music beibao;

    private XibaoCore() {
    }

    public static void initClient() {
        LOGGER.info("initializing xibao-fly");
        try {
            FileBasedConfig.write(FileBasedConfig.read());
        } catch (IOException e) {
            throw new IllegalStateException("Failed to initialize config system.", e);
        }

        SoundEvent xibaoEvent = Registry.register(
                BuiltInRegistries.SOUND_EVENT,
                Identifier.fromNamespaceAndPath(MOD_ID, "bgm.xibao"),
                SoundEvent.createVariableRangeEvent(
                        Identifier.fromNamespaceAndPath(MOD_ID, "bgm.xibao")
                )
        );
        XibaoCore.xibao = new Music(
                Holder.direct(xibaoEvent),
                0,
                0,
                true
        );

        SoundEvent beibaoEvent = Registry.register(
                BuiltInRegistries.SOUND_EVENT,
                Identifier.fromNamespaceAndPath(MOD_ID, "bgm.beibao"),
                SoundEvent.createVariableRangeEvent(
                        Identifier.fromNamespaceAndPath(MOD_ID, "bgm.beibao")
                )
        );
        XibaoCore.beibao = new Music(
                Holder.direct(beibaoEvent),
                0,
                0,
                true
        );
    }
}
