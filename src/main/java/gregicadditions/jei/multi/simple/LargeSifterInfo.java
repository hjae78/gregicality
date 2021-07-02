package gregicadditions.jei.multi.simple;

import com.google.common.collect.Lists;
import gregicadditions.GAValues;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.machines.GATileEntities;
import gregicadditions.machines.multi.simple.TileEntityLargeSifter;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockMultiblockCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockInfoPage;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;

import java.util.ArrayList;
import java.util.List;

public class LargeSifterInfo extends MultiblockInfoPage {
	@Override
	public MultiblockControllerBase getController() {
		return GATileEntities.LARGE_SIFTER;
	}

	@Override
	public List<MultiblockShapeInfo> getMatchingShapes() {
		ArrayList<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
			shapeInfo.add(MultiblockShapeInfo.builder()
					.aisle("XXXXX", "PXXXP", "XXXXX")
					.aisle("XXXXX", "X###X", "XGGGX")
					.aisle("XXXXX", "X###X", "XGGGX")
					.aisle("XXXXX", "X###X", "XGGGX")
					.aisle("XIMOX", "PXSXP", "XXEXX")
					.where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GAValues.HV], EnumFacing.SOUTH)
					.where('S', GATileEntities.LARGE_SIFTER, EnumFacing.SOUTH)
					.where('G', MetaBlocks.MUTLIBLOCK_CASING.getState(BlockMultiblockCasing.MultiblockCasingType.GRATE_CASING))
					.where('M', GATileEntities.MAINTENANCE_HATCH[0], EnumFacing.SOUTH)
					.where('X', TileEntityLargeSifter.casingState)
					.where('#', Blocks.AIR.getDefaultState())
					.where('I', MetaTileEntities.ITEM_IMPORT_BUS[GAValues.LV], EnumFacing.SOUTH)
					.where('O', MetaTileEntities.ITEM_EXPORT_BUS[GAValues.LV], EnumFacing.SOUTH)
					.where('P', GAMetaBlocks.PISTON_CASING.getDefaultState())
					.build());


		return Lists.newArrayList(shapeInfo);
	}

	@Override
	public String[] getDescription() {
		return new String[]{};
	}

	@Override
	public float getDefaultZoom() {
		return 0.9f;
	}
}
