package ml.jozefpeeterslaan72wuustwezel.pepsimc.common.item;

import ml.jozefpeeterslaan72wuustwezel.pepsimc.common.block.PepsiMcBlock;
import ml.jozefpeeterslaan72wuustwezel.pepsimc.common.block.fluid.PepsiMcFluid;
import ml.jozefpeeterslaan72wuustwezel.pepsimc.common.effect.PepsiMcEffect;
import ml.jozefpeeterslaan72wuustwezel.pepsimc.core.util.soundevent.PepsiMcSoundEvent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PepsiMcItem {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "pepsimc");
	
	public static final RegistryObject<BeverageItem> PEPSI_CAN = ITEMS.register("pepsi_can", ()-> new BeverageItem(new Item.Properties()
			.tab(CreativeModeTab.TAB_FOOD)
			.craftRemainder(net.minecraft.world.item.Items.BUCKET)
			.food(new FoodProperties.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.LUCK, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DIG_SPEED, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.REGENERATION, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600, 2),1)
					.effect(()->new MobEffectInstance(PepsiMcEffect.INSOMNIA.get(), 1600), .3f)
					.build()
					).fireResistant()));
	
	public static final RegistryObject<BeverageItem> PEPSI_BOTTLE = ITEMS.register("pepsi_bottle", ()-> new BeverageItem(new Item.Properties()
			.tab(CreativeModeTab.TAB_FOOD)
			.craftRemainder(net.minecraft.world.item.Items.BUCKET)
			.food(new FoodProperties.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.HEALTH_BOOST, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.LUCK, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DIG_SPEED, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.REGENERATION, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1600, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1600, 2),1)
					.effect(()->new MobEffectInstance(PepsiMcEffect.INSOMNIA.get(), 1600), .3f)
					.build()
					).fireResistant()));
	
	public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_FOOD)
			.food(new FoodProperties.Builder()
					.effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1),1)
					.nutrition(2)
					.saturationMod(.2f)
					.build()
			).fireResistant()));
	
	public static final RegistryObject<Item> PHOSPHORIC_ACID = ITEMS.register("phosphoric_acid", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<Item> CAFFEINE = ITEMS.register("caffeine", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC).food(new FoodProperties.Builder()
					.nutrition(0)
					.saturationMod(0)
					.effect(()->new MobEffectInstance(PepsiMcEffect.INSOMNIA.get(), 3200), 1)
					.build()
					)));
	
	public static final RegistryObject<Item> STEVIA = ITEMS.register("stevia", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC)));
	
	public static final RegistryObject<Item> PEPSI_MAN_TUNE_DISC = ITEMS.register("pepsi_man_tune_disc", ()-> new RecordItem(1,()->PepsiMcSoundEvent.PEPSI_MAN_TUNE.get(),new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE).stacksTo(1)));
	
	public static final RegistryObject<BeverageItem> PEPSI_MAX_BOTTLE = ITEMS.register("pepsi_max_bottle", ()-> new BeverageItem(new Item.Properties()
			.tab(CreativeModeTab.TAB_FOOD)
			.craftRemainder(net.minecraft.world.item.Items.BUCKET)
			.food(new FoodProperties.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.HEALTH_BOOST, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.LUCK, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DIG_SPEED, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.REGENERATION, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800, 2),1)
					.effect(()->new MobEffectInstance(PepsiMcEffect.INSOMNIA.get(), 1600), .3f)
					.build()
			).fireResistant()));
	
	public static final RegistryObject<BeverageItem> PEPSI_MAX_CAN = ITEMS.register("pepsi_max_can", ()-> new BeverageItem(new Item.Properties()
			.tab(CreativeModeTab.TAB_FOOD)
			.craftRemainder(net.minecraft.world.item.Items.BUCKET)
			.food(new FoodProperties.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_BOOST, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.HEALTH_BOOST, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.LUCK, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DIG_SPEED, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.REGENERATION, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 2),1)
					.effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800, 2),1)
					.effect(()->new MobEffectInstance(PepsiMcEffect.INSOMNIA.get(), 1600), .3f)
					.build())));

	

	public static final RegistryObject<Item> PEPSITE_INGOT = ITEMS.register("pepsite_ingot", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MATERIALS)
			.fireResistant())); 
	
	public static final RegistryObject<Item> PEPSI_LABEL = ITEMS.register("pepsi_label", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<Item> PEPSI_MAX_LABEL = ITEMS.register("pepsi_max_label", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<Item> EMPTY_BOTTLE = ITEMS.register("empty_bottle", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<Item> EMPTY_CAN = ITEMS.register("empty_can", ()-> new Item(new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<Item> PEPSI_FLUID_BUCKET = ITEMS.register("pepsi_bucket", ()-> new BucketItem(()->PepsiMcFluid.PEPSI_FLUID.get(),new Item.Properties()
			.tab(CreativeModeTab.TAB_MATERIALS)
			.stacksTo(16))); 
	public static final RegistryObject<Item> PEPSI_MAX_FLUID_BUCKET = ITEMS.register("pepsi_max_bucket", ()-> new BucketItem(()->PepsiMcFluid.PEPSI_MAX_FLUID.get(),new Item.Properties()
			.tab(CreativeModeTab.TAB_MATERIALS)
			.stacksTo(16))); 
	
	//blockItems
	
	public static final RegistryObject<Item> STEVIA_SEEDS = ITEMS.register("stevia_seeds", ()-> new BlockItem(PepsiMcBlock.STEVIA_CROP.get(),new Item.Properties()
			.tab(CreativeModeTab.TAB_MISC))); 
	
	public static final RegistryObject<BlockItem> PEPSITE_BLOCK = ITEMS.register("pepsite_block", ()-> new BlockItem(PepsiMcBlock.PEPSITEBLOCK.get(), new Item.Properties()
			.tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
			.fireResistant()));
	
	public static final RegistryObject<BlockItem> STEVIA_PLANT = ITEMS.register("stevia_plant", ()-> new BlockItem(PepsiMcBlock.STEVIA_PLANT.get(), new Item.Properties()
			.tab(CreativeModeTab.TAB_DECORATIONS)));
	
	public static final RegistryObject<BlockItem> PEPSITE_ORE = ITEMS.register("pepsite_ore", ()-> new BlockItem(PepsiMcBlock.PEPSITEORE.get(), new Item.Properties()
			.tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
			.fireResistant()));
	
	public static final RegistryObject<BlockItem> BOTTLER = ITEMS.register("bottler", ()-> new BlockItem(PepsiMcBlock.BOTTLER.get(), new Item.Properties()
			.tab(CreativeModeTab.TAB_DECORATIONS)));
	
	
	public static void register(IEventBus bus) {
		ITEMS.register(bus);
	
	}

	
}
