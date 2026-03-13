package com.jef.justenoughfakepixel.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;

public class FarmingUtils {

    Minecraft mc = Minecraft.getMinecraft();
    EntityPlayerSP client = mc.thePlayer;

    public static String FarmingFortuneParaser(ItemStack Gear){
        String stats = ItemStackUtils.getSkyblockId(Gear)+ " " + ItemStackUtils.getNbtFromItemStack(Gear);
        System.out.println(stats);
        return stats;
    }
    public static void FetchInv(){
    }

    public static float ProfitCalculation(float FF){
        return FF;
    }
}
