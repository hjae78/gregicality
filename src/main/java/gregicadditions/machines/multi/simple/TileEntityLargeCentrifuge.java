package gregicadditions.machines.multi.simple;

import gregicadditions.GAConfig;
import gregicadditions.GAMaterials;
import gregicadditions.item.GAMetaBlocks;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.render.ICubeRenderer;
import gregtech.api.unification.material.type.Material;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityElectricBlastFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;

import static gregicadditions.GAMaterials.Tumbaga;

public class TileEntityLargeCentrifuge extends LargeSimpleRecipeMapMultiblockController {


	private static final MultiblockAbility<?>[] ALLOWED_ABILITIES = {MultiblockAbility.IMPORT_ITEMS, MultiblockAbility.EXPORT_ITEMS, MultiblockAbility.IMPORT_FLUIDS, MultiblockAbility.EXPORT_FLUIDS, MultiblockAbility.INPUT_ENERGY};


	public TileEntityLargeCentrifuge(ResourceLocation metaTileEntityId) {
		super(metaTileEntityId, RecipeMaps.CENTRIFUGE_RECIPES, GAConfig.multis.largeCentrifuge.euPercentage, GAConfig.multis.largeCentrifuge.durationPercentage, GAConfig.multis.largeCentrifuge.chancedBoostPercentage, GAConfig.multis.largeCentrifuge.stack);
	}

	@Override
	public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
		return new TileEntityLargeCentrifuge(metaTileEntityId);
	}

	@Override
	protected BlockPattern createStructurePattern() {
		return FactoryBlockPattern.start()
				.aisle("XXX", "XXX", "XXX")
				.aisle("XXX", "X#X", "XXX")
				.aisle("XXX", "XSX", "XXX")
				.setAmountAtLeast('L', 9)
				.where('S', selfPredicate())
				.where('L', statePredicate(getCasingState()))
				.where('X', statePredicate(getCasingState()).or(abilityPartPredicate(ALLOWED_ABILITIES)))
				.where('C', MetaTileEntityElectricBlastFurnace.heatingCoilPredicate())
				.where('#', isAirPredicate())
				.build();
	}

	private static final Material defaultMaterial = Tumbaga;
	public static final Material casingMaterial = getCasingMaterial(defaultMaterial, GAConfig.multis.largeCentrifuge.casingMaterial);


	public IBlockState getCasingState() {
		return GAMetaBlocks.getMetalCasingBlockState(casingMaterial);
	}

	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
		return GAMetaBlocks.METAL_CASING.get(casingMaterial);
	}

}
