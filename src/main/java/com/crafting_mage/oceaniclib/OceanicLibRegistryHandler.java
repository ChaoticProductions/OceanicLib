package com.crafting_mage.oceaniclib;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OceanicLibRegistryHandler {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OceanicLib.modid);
	
	public static final ItemGroup MORESEAFOODFOODS = new ItemGroup("moreseafoodFoods"){
	    @Override
	    public ItemStack createIcon(){
	        return new ItemStack(Items.KELP);
	    }
	};
	
	
    public static final RegistryObject<Item> KELP_FIBER = ITEMS.register("kelp_fiber", () ->
    	new Item(new Item.Properties().group(ItemGroup.MATERIALS)));	
    
    public static final RegistryObject<Item> KELP_STRING = ITEMS.register("kelp_string", () ->
	    new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    
    
    
    public static final RegistryObject<Item> SURVIVAL_KNIFE = ITEMS.register("survival_knife", () ->
		new SwordItem(ItemTier.STONE, 3, -1.2F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    
    @SuppressWarnings("deprecation")
	public static final RegistryObject<Item> KELP_ = ITEMS.register("squid_tentacle", () ->
		new Item(new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
				.hunger(4)
				.saturation(1.5f)
				.setAlwaysEdible()
				.effect(new EffectInstance(Effects.WATER_BREATHING, 20*7, 1), 1)
				.build()
	)));
    
}
