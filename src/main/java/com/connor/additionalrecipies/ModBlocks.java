package com.connor.additionalrecipies;
import com.connor.additionalrecipies.Blocks.*;
import net.minecraft.block.Block;

public final class ModBlocks {
	public static Block orangeBlock;
	public static Block smasher;
	public static void init(){
		orangeBlock= new OrangeBlock();
		smasher = new Smasher();
	}
}