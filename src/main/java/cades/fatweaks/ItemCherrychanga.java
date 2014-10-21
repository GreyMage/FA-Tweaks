package cades.fatweaks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCherrychanga extends ItemFood {

	public ItemCherrychanga(){
		super(6,false);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("cherrychanga");
		setTextureName("fatweaks:cherrychanga");
	}
	
}
