package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import com.gtnewhorizons.forgebukkit.ICrucibleString;
import net.minecraft.nbt.NBTBase;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(NBTBase.class)
public abstract class MixinNBTBase implements ICrucibleString {}
