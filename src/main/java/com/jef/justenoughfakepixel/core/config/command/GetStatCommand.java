package com.jef.justenoughfakepixel.core.config.command;

import com.jef.justenoughfakepixel.core.config.command.SimpleCommand;
import com.jef.justenoughfakepixel.utils.StatUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.item.ItemStack;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetStatCommand extends SimpleCommand {

    private static final Minecraft mc = Minecraft.getMinecraft();
    private static final String PREFIX = "\u00a73[GS]\u00a7b ";

    private static final List<String> SUBCOMMANDS = Arrays.asList(
            "strength", "health", "defense", "intelligence",
            "truedefense", "critchance", "critdamage",
            "healthregen", "farmingfortune"
    );

    @Override
    public String getName() { return "getstat"; }

    @Override
    public String getUsage() { return "/getstat <stat>"; }

    @Override
    public void execute(ICommandSender sender, String[] args) {
        if (args.length == 0) {
            sender.addChatMessage(new ChatComponentText("&cUsage: /getstat <stat>"));
            return;
        }

        ItemStack stack = mc.thePlayer != null ? mc.thePlayer.getHeldItem() : null;
        if (stack == null) {
            sender.addChatMessage(new ChatComponentText("&cHold an item to fetch stats."));
            return;
        }

        String stat = args[0].toLowerCase();
        float value = 0;

        switch (stat) {
            case "strength":      value = StatUtils.parseStatTotal(stack, "Strength"); break;
            case "health":        value = StatUtils.parseStatTotal(stack, "Health"); break;
            case "defense":       value = StatUtils.parseStatTotal(stack, "Defense"); break;
            case "intelligence":  value = StatUtils.parseStatTotal(stack, "Intelligence"); break;
            case "truedefense":   value = StatUtils.parseStatTotal(stack, "True Defense"); break;
            case "critchance":    value = StatUtils.parseStatTotal(stack, "Crit Chance"); break;
            case "critdamage":    value = StatUtils.parseStatTotal(stack, "Crit Damage"); break;
            case "healthregen":   value = StatUtils.parseStatTotal(stack, "Health Regen"); break;
            default:
                sender.addChatMessage(new ChatComponentText("&cUnknown stat: " + stat));
                return;
        }

        sender.addChatMessage(new ChatComponentText(stat + ": " + value));
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}