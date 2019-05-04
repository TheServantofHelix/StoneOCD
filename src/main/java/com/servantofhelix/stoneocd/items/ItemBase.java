package com.servantofhelix.stoneocd.items;

import com.servantofhelix.stoneocd.Main;
import com.servantofhelix.stoneocd.init.ModItems;
import com.servantofhelix.stoneocd.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
