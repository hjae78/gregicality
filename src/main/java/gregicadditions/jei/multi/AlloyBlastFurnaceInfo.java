package gregicadditions.jei.multi;

import gregicadditions.GAValues;
import gregicadditions.item.GAHeatingCoil;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.item.metal.MetalCasing1;
import gregicadditions.item.metal.MetalCasing2;
import gregicadditions.jei.GAMultiblockShapeInfo;
import gregicadditions.machines.GATileEntities;
import gregtech.api.metatileentity.multiblock.MultiblockControllerBase;
import gregtech.common.blocks.BlockWireCoil;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gregtech.integration.jei.multiblock.MultiblockInfoPage;
import gregtech.integration.jei.multiblock.MultiblockShapeInfo;
import net.minecraft.util.EnumFacing;

import java.util.ArrayList;
import java.util.List;

import static gregicadditions.item.GAMetaBlocks.METAL_CASING_1;
import static gregicadditions.item.GAMetaBlocks.METAL_CASING_2;

public class AlloyBlastFurnaceInfo extends MultiblockInfoPage {

    @Override
    public MultiblockControllerBase getController() {
        return GATileEntities.ALLOY_BLAST_FURNACE;
    }

    @Override
    public List<MultiblockShapeInfo> getMatchingShapes() {
        List<MultiblockShapeInfo> shape = new ArrayList<>();
        for (BlockWireCoil.CoilType coilType : BlockWireCoil.CoilType.values()) {
            if (coilType.equals(BlockWireCoil.CoilType.SUPERCONDUCTOR) || coilType.equals(BlockWireCoil.CoilType.FUSION_COIL))
                continue;

            shape.add(GAMultiblockShapeInfo.builder().aisle("#EXX#", "#ccc#", "#ccc#", "#XXX#")
                    .aisle("MXXXX", "cCCCc", "cCCCc", "XXXXX")
                    .aisle("SXXXO", "cCACc", "cCACc", "XXmXX")
                    .aisle("IXXXX", "cCCCc", "cCCCc", "XXXXX")
                    .aisle("#OXX#", "#ccc#", "#ccc#", "#XXX#")
                    .where('O', MetaTileEntities.FLUID_EXPORT_HATCH[4], EnumFacing.WEST)
                    .where('I', MetaTileEntities.ITEM_IMPORT_BUS[4], EnumFacing.WEST)
                    .where('S', GATileEntities.ALLOY_BLAST_FURNACE, EnumFacing.WEST)
                    .where('M', GATileEntities.MAINTENANCE_HATCH[0], EnumFacing.WEST)
                    .where('C', MetaBlocks.WIRE_COIL.getState(coilType))
                    .where('c', METAL_CASING_2.getState(MetalCasing2.CasingType.STABALLOY))
                    .where('X', METAL_CASING_1.getState(MetalCasing1.CasingType.ZIRCONIUM_CARBIDE))
                    .where('m', GATileEntities.MUFFLER_HATCH[GAValues.HV], EnumFacing.UP)
                    .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GAValues.EV], EnumFacing.EAST)
                    .build());
        }
        for (GAHeatingCoil.CoilType coilType : GAHeatingCoil.CoilType.values()) {

            shape.add(GAMultiblockShapeInfo.builder().aisle("#EXX#", "#ccc#", "#ccc#", "#XXX#")
                    .aisle("MXXXX", "cCCCc", "cCCCc", "XXXXX")
                    .aisle("SXXXO", "cCACc", "cCACc", "XXmXX")
                    .aisle("IXXXX", "cCCCc", "cCCCc", "XXXXX")
                    .aisle("#OXX#", "#ccc#", "#ccc#", "#XXX#")
                    .where('O', MetaTileEntities.FLUID_EXPORT_HATCH[4], EnumFacing.WEST)
                    .where('I', MetaTileEntities.ITEM_IMPORT_BUS[4], EnumFacing.WEST)
                    .where('S', GATileEntities.ALLOY_BLAST_FURNACE, EnumFacing.WEST)
                    .where('M', GATileEntities.MAINTENANCE_HATCH[0], EnumFacing.WEST)
                    .where('C', GAMetaBlocks.HEATING_COIL.getState(coilType))
                    .where('c', METAL_CASING_2.getState(MetalCasing2.CasingType.STABALLOY))
                    .where('X', METAL_CASING_1.getState(MetalCasing1.CasingType.ZIRCONIUM_CARBIDE))
                    .where('m', GATileEntities.MUFFLER_HATCH[GAValues.HV], EnumFacing.UP)
                    .where('E', MetaTileEntities.ENERGY_INPUT_HATCH[GAValues.EV], EnumFacing.EAST)
                    .build());
        }

        return shape;
    }

    @Override
    public String[] getDescription() {
        return new String[]{};
    }
}
