package gregicadditions.capabilities.impl;

import gregicadditions.GAValues;
import gregtech.api.capability.impl.MultiblockRecipeLogic;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;


public class GAMultiblockRecipeLogic extends MultiblockRecipeLogic {

    public GAMultiblockRecipeLogic(RecipeMapMultiblockController tileEntity) {
        super(tileEntity);
    }

    @Override
    protected int[] calculateOverclock(int EUt, long voltage, int duration) {
        int numMaintenanceProblems = (this.metaTileEntity instanceof GARecipeMapMultiblockController) ?
                ((GARecipeMapMultiblockController) metaTileEntity).getNumProblems() : 0;
        System.out.println("numMaintenanceProblems " + numMaintenanceProblems);

        double maintenanceDurationMultiplier = 1.0 + (0.1 * numMaintenanceProblems);
        int durationModified = (int) (duration * maintenanceDurationMultiplier);
        System.out.println("durationModified " + durationModified);

        if (!allowOverclocking) {
            return new int[]{EUt, durationModified};
        }
        boolean negativeEU = EUt < 0;
        int tier = getOverclockingTier(voltage);
        if (GAValues.V[tier] <= EUt || tier == 0)
            return new int[]{EUt, durationModified};
        if (negativeEU)
            EUt = -EUt;
        if (EUt <= 16) {
            int multiplier = EUt <= 8 ? tier : tier - 1;
            int resultEUt = EUt * (1 << multiplier) * (1 << multiplier);
            int resultDuration = durationModified / (1 << multiplier);
            return new int[]{negativeEU ? -resultEUt : resultEUt, resultDuration};
        } else {
            int resultEUt = EUt;
            double resultDuration = durationModified;
            //do not overclock further if duration is already too small
            while (resultDuration >= 3 && resultEUt <= GAValues.V[tier - 1]) {
                resultEUt *= 4;
                resultDuration /= 2.8;
            }
            return new int[]{negativeEU ? -resultEUt : resultEUt, (int) Math.ceil(resultDuration)};
        }
    }

    @Override
    protected void completeRecipe() {
        super.completeRecipe();
        RecipeMapMultiblockController controller = (RecipeMapMultiblockController) getMetaTileEntity();
        if (controller instanceof GARecipeMapMultiblockController) {
            GARecipeMapMultiblockController gaController = (GARecipeMapMultiblockController) controller;
            if (gaController.hasMuffler()) {
                gaController.outputRecoveryItems();
            }
        }
    }

    @Override
    protected void trySearchNewRecipe() {
        if (this.metaTileEntity instanceof GARecipeMapMultiblockController &&
                ((GARecipeMapMultiblockController) this.metaTileEntity).getNumProblems() > 5)
            return;

        super.trySearchNewRecipe();
    }
}
