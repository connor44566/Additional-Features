package com.connor.additionalrecipies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import com.connor.additionalrecipies.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemOrangeFood extends ItemFood {

	private String name = "orangefood";
	
	public ItemOrangeFood(int heal, float saturation, boolean wolfMeat) {
		
		super(heal, saturation, wolfMeat);		
		setUnlocalizedName(Constants.MODID + "." + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(this, name);
	}
}
