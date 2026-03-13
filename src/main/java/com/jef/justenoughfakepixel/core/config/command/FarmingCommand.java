package com.jef.justenoughfakepixel.core.config.command;
import com.jef.justenoughfakepixel.utils.FarmingUtils;
import com.jef.justenoughfakepixel.utils.ItemStackUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

public class FarmingCommand extends CommandBase {
    @Override
    public String getCommandName() {
        return "fetchnbttagcomp";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/fetchnbttagcomp";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {

        EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;

        if (player == null || player.getHeldItem() == null) {
            sender.addChatMessage(new ChatComponentText("You are not holding anything."));
            return;
        }
        ItemStack currently_held = player.getHeldItem();
        sender.addChatMessage(new ChatComponentText(
                FarmingUtils.FarmingFortuneParaser(currently_held)));
    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}