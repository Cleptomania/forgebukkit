package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagShort;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagShort.class)
public abstract class MixinNBTTagShort extends MixinNBTBase {

    @Shadow
    public abstract String toString();

    @Override
    public String crucible_toString() {
        return this.toString();
    }
}
