package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTTagByteArray;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(NBTTagByteArray.class)
public class MixinNBTTagByteArray extends MixinNBTBase {

    @Shadow
    private byte[] byteArray;

    @Override
    public String crucible_toString() {
        StringBuilder sb = new StringBuilder("[B;");

        for (int i = 0; i < this.byteArray.length; i++) {
            if (i != 0) {
                sb.append(',');
            }

            sb.append(this.byteArray[i]).append('B');
        }

        return sb.append(']').toString();
    }

}
