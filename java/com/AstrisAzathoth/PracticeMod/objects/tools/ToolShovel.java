package com.AstrisAzathoth.PracticeMod.objects.tools;

import com.AstrisAzathoth.PracticeMod.Main;
import com.AstrisAzathoth.PracticeMod.init.ModItems;
import com.AstrisAzathoth.PracticeMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel
{
	public ToolShovel(String name, ToolMaterial material) {
			super (material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(CreativeTabs.TOOLS);

			ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
