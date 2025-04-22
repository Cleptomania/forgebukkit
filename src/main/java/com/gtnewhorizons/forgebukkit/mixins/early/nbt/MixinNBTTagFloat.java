package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagFloat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagFloat.class)
public abstract class MixinNBTTagFloat extends MixinNBTBase {

    @Shadow
    public abstract String toString();

    @Override
    public String crucible_toString() {
        return this.toString();
    }
}
