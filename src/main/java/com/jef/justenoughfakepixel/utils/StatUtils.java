package com.jef.justenoughfakepixel.utils;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.client.Minecraft;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StatUtils {

    private static final Minecraft mc = Minecraft.getMinecraft();

    private static List<String> getTooltip(ItemStack stack) {
        EntityPlayerSP player = mc.thePlayer;
        if (stack == null || player == null) return null;
        return stack.getTooltip(player, false);
    }

    public static float parseStatTotal(ItemStack stack, String keyword) {
        List<String> tooltip = getTooltip(stack);
        if (tooltip == null) return 0;
        Float Final_stat = 0f;

        for (String line : tooltip) {
            line = line.replaceAll("§.", "");
            Pattern pattern = Pattern.compile("([A-Za-z\\s]+):\\s*([+-]?\\d+)");
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                if (matcher.group(1).trim() == keyword){
                    String baseValue = matcher.group(2);
                    Final_stat = Float.parseFloat(baseValue);
                    break;
                }
            }
        }
        return Final_stat;
    }

    public static float getHealth(ItemStack stack) {
        return parseStatTotal(stack, "Health");
    }

    public static float getDefense(ItemStack stack) {
        return parseStatTotal(stack, "Defense");
    }

    public static float getSpeed(ItemStack stack) {
        return parseStatTotal(stack, "Speed");
    }

    public static float getFarmingFortune(ItemStack stack) {
        return parseStatTotal(stack, "Farming Fortune");
    }

    public static float getStrength(ItemStack stack) {
        return parseStatTotal(stack, "Strength");
    }

    public static float getCritChance(ItemStack stack) {
        return parseStatTotal(stack, "Crit Chance");
    }

    public static float getCritDamage(ItemStack stack) {
        return parseStatTotal(stack, "Crit Damage");
    }

    public static float getIntelligence(ItemStack stack) {
        return parseStatTotal(stack, "Intelligence");
    }

    public static float getTrueDefense(ItemStack stack) {
        return parseStatTotal(stack, "True Defense");
    }

    public static float getHealthRegen(ItemStack stack) {
        return parseStatTotal(stack, "Health Regen");
    }

    public static float getMagicFind(ItemStack stack) {
        return parseStatTotal(stack, "Magic Find");
    }

    public static float getMiningSpeed(ItemStack stack) {
        return parseStatTotal(stack, "Mining Speed");
    }

    public static float getMiningFortune(ItemStack stack) {
        return parseStatTotal(stack, "Mining Fortune");
    }

    public static float getPristine(ItemStack stack) {
        return parseStatTotal(stack, "Pristine");
    }
}
