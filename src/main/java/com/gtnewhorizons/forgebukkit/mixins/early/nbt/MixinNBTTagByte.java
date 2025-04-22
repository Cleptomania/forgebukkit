package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagByte;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagByte.class)
public abstract class MixinNBTTagByte extends MixinNBTBase {

    @Shadow
    public abstract String toString();

    @Override
    public String crucible_toString() {
        return this.toString();
    }
}
