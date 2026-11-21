package cn.yuang2714.xibaofly.client.mixin;

import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import cn.yuang2714.xibaofly.client.XibaoDisconnectedScreen;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.Minecraft;

/**
 * 26.1 keeps screen state on {@link Minecraft} ({@code Minecraft#setScreen});
 * 26.2 moved it to {@code Gui}. Everything else lives in common.
 */
@Mixin(Minecraft.class)
public abstract class ScreenMixin {
    @Shadow
    public abstract void setScreen(@Nullable Screen screen);

    @Inject(method = "setScreen", at = @At("HEAD"), cancellable = true)
    public void xibao$replaceDisconnectedScreen(Screen screen, CallbackInfo ci) {
        if (screen instanceof DisconnectedScreen dScreen && !(screen instanceof XibaoDisconnectedScreen)) {
            setScreen(new XibaoDisconnectedScreen(
                    dScreen.parent,
                    dScreen.getTitle(),
                    dScreen.details,
                    dScreen.buttonText
            ));
            ci.cancel();
        }
    }
}
