package com.gtnewhorizons.forgebukkit.mixins.early.nbt;

import com.gtnewhorizons.forgebukkit.Util;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

@Mixin(NBTTagCompound.class)
public class MixinNBTTagCompound extends MixinNBTBase {

    @Shadow
    private Map<String, NBTBase> tagMap;

    @Unique
    private static final Pattern ALLOWED_CHARS = Pattern.compile("[A-Za-z0-9._+-]+");

    @Override
    public String crucible_toString() {
        StringBuilder sb = new StringBuilder("{");
        Collection<String> keys = this.tagMap.keySet();
        for (String key : keys) {
            if (sb.length() != 1) {
                sb.append(',');
            }

            sb.append(handleString(key)).append(':').append(this.tagMap.get(key).crucible_toString());
        }
        return sb.append('}').toString();
    }

    protected static String handleString(String value) {
        return ALLOWED_CHARS.matcher(value).matches() ? value : Util.scapeString(value);
    }

}
