package com.connor.additionalrecipies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.connor.additionalrecipies.Blocks.GUIs;
import com.connor.additionalrecipies.Blocks.GuiSmasher;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	 @Override
	    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        return null;
	    }

	    @Override
	    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        if(ID == GUIs.SMASHER.ordinal()) return new GuiSmasher(player, world, x, y, z);
	        else return null;
	    }
}