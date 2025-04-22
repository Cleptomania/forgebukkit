package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin(NBTTagList.class)
public class MixinNBTTagList extends MixinNBTBase {

    @Shadow
    private List tagList;

    @Override
    public String crucible_toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < this.tagList.size(); i++) {
            if (i != 0) {
                sb.append(',');
            }

            sb.append(((NBTBase) this.tagList.get(i)).crucible_toString());
        }

        return sb.append(']').toString();
    }

}
