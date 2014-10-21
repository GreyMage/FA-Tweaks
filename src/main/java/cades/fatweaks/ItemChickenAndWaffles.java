package cades.fatweaks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemChickenAndWaffles extends ItemFood {
	
	public ItemChickenAndWaffles(){
		super(15,false);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("chickenandwaffles");
		setTextureName("fatweaks:chickenandwaffles");
	}
	
}
