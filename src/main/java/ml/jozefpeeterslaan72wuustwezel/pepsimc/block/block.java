package ml.jozefpeeterslaan72wuustwezel.pepsimc.block;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import ml.jozefpeeterslaan72wuustwezel.pepsimc.block.fluid.fluid;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class block {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "pepsimc");

	
			// regular blocks
	public static final RegistryObject<Block> PEPSITEBLOCK = BLOCKS.register("pepsite_block", 
			()-> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL).harvestLevel(2).strength(5, 1200).sound(SoundType.METAL).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE)));
	
	public static final RegistryObject<Block> PEPSITEORE = BLOCKS.register("pepsite_ore", 
			()-> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).strength(4.5f, 15).sound(SoundType.STONE).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE)));

	
			// special blocks

	public static final RegistryObject<FlowingFluidBlock> PEPSI_FLUID_BLOCK = BLOCKS.register("pepsi", 
			()-> new FlowingFluidBlock(()->fluid.PEPSI_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).strength(100f).noDrops()));
	
	public static final RegistryObject<FlowingFluidBlock> PEPSI_MAX_FLUID_BLOCK = BLOCKS.register("pepsi_max", 
			()-> new FlowingFluidBlock(()->fluid.PEPSI_MAX_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).strength(100f).noDrops()));
	
	public static final RegistryObject<Block> BOTTLER = BLOCKS.register("bottler",bottler::new);


}
