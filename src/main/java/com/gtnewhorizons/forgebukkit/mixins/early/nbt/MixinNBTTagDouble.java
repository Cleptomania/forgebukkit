package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagDouble;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagDouble.class)
public abstract class MixinNBTTagDouble extends MixinNBTBase {

    @Shadow
    public abstract String toString();

    @Override
    public String crucible_toString() {
        return this.toString();
    }
}
