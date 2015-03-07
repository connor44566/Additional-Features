package com.connor.additionalrecipies;
import net.minecraft.item.Item;
public class ModItems {
	public static Item orangeFood;
	public static void init(){
		orangeFood = new ItemOrangeFood(4, 0.3f, false);
	}
}
