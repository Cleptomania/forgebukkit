package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagEnd;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagEnd.class)
public abstract class MixinNBTTagEnd extends MixinNBTBase {

    @Shadow
    public abstract String toString();

    @Override
    public String crucible_toString() {
        return this.toString();
    }
}
