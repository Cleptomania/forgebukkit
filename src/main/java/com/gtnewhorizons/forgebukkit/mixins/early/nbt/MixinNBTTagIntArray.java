package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagIntArray;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagIntArray.class)
public class MixinNBTTagIntArray extends MixinNBTBase {

    @Shadow
    private int[] intArray;

    @Override
    public String crucible_toString() {
        StringBuilder sb = new StringBuilder("[I;");

        for (int i = 0; i < this.intArray.length; i++) {
            if (i != 0) {
                sb.append(',');
            }

            sb.append(this.intArray[i]);
        }

        return sb.append(']').toString();
    }

}
