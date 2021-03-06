package dev.latvian.kubejs.core.mixin;

import dev.latvian.kubejs.client.ClientProperties;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author LatvianModder
 */
@Mixin(Minecraft.class)
public abstract class MinecraftMixin
{
	@Inject(method = "func_230149_ax_", at = @At("HEAD"), remap = false, cancellable = true)
	private void getWindowTitle(CallbackInfoReturnable<String> ci)
	{
		String s = ClientProperties.get().title;

		if (!s.isEmpty())
		{
			ci.setReturnValue(s);
		}
	}
}