package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import com.gtnewhorizons.forgebukkit.Util;
import net.minecraft.nbt.NBTTagString;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagString.class)
public abstract class MixinNBTTagString extends MixinNBTBase {

    @Shadow
    private String data;

    @Override
    public String crucible_toString() {
        return Util.scapeString(this.data);
    }
}
