package cades.fatweaks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemChimicherrychanga extends ItemFood {
	
	public ItemChimicherrychanga(){
		super(10,false);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("chimicherrychanga");
		setTextureName("fatweaks:chimicherrychanga");
	}
	
}
