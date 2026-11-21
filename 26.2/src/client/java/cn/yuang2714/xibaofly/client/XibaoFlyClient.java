package cn.yuang2714.xibaofly.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * 26.2 loader entrypoint: only the loader-facing initializer lives here.
 */
public class XibaoFlyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        XibaoCore.initClient();
    }
}
