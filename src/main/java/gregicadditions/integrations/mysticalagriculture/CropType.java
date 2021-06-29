package gregicadditions.integrations.mysticalagriculture;

import com.blakebr0.cucumber.registry.ModRegistry;
import com.blakebr0.mysticalagradditions.MysticalAgradditions;
import crafttweaker.annotations.ModOnly;
import crafttweaker.annotations.ZenRegister;
import gregicadditions.Gregicality;
import gregicadditions.integrations.mysticalagriculture.block.MaterialBlockCrop;
import gregicadditions.integrations.mysticalagriculture.items.ItemTierSeed;
import gregtech.api.unification.material.type.Material;
import net.minecraftforge.fml.common.Optional;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import java.util.HashMap;
import java.util.Map;

import static gregicadditions.GAMaterials.QuartzSand;
import static gregicadditions.GAMaterials.*;
import static gregicadditions.integrations.mysticalagriculture.items.MysticalAgricultureItems.CROPS;
import static gregicadditions.integrations.mysticalagriculture.items.MysticalAgricultureItems.ESSENCES;
import static gregtech.api.unification.material.Materials.*;

@ZenClass("mods.gtadditions.mystical.Crop")
@ZenRegister
@ModOnly(MysticalAgradditions.MOD_ID)
public final class CropType {

    public static final Map<Material, ItemTierSeed> SEEDS = new HashMap<>();

    @ZenMethod("addCrop")
    @Optional.Method(modid = Gregicality.MODID)
    public static void addCrop(Material material, int tier) {
        final ModRegistry registry = MysticalCommonProxy.REGISTRY;

        MaterialBlockCrop materialBlockCrop = new MaterialBlockCrop(material.toString() + ".crop", material);
        materialBlockCrop.setRegistryName("gregtech:crop_" + material.toString());


        ItemTierSeed itemTierSeed = new ItemTierSeed(materialBlockCrop, material, tier);
        materialBlockCrop.setCrop(ESSENCES.get(material));
        materialBlockCrop.setSeed(itemTierSeed);

        SEEDS.put(material, itemTierSeed);

        registry.register(itemTierSeed, material.toString() + "_seeds");

        registry.addOre(itemTierSeed, "listAllSeed");

    }

    public static void init() {

        SEEDS.put(Aluminium, new ItemTierSeed(CROPS.get(Aluminium), Aluminium, 3));
        SEEDS.put(Americium, new ItemTierSeed(CROPS.get(Americium), Americium, 7));
        SEEDS.put(Antimony, new ItemTierSeed(CROPS.get(Antimony), Antimony, 2));
        SEEDS.put(Arsenic, new ItemTierSeed(CROPS.get(Arsenic), Arsenic, 2));
        SEEDS.put(Barium, new ItemTierSeed(CROPS.get(Barium), Barium, 2));
        SEEDS.put(Beryllium, new ItemTierSeed(CROPS.get(Beryllium), Beryllium, 2));
        SEEDS.put(Bismuth, new ItemTierSeed(CROPS.get(Bismuth), Bismuth, 2));
        SEEDS.put(Boron, new ItemTierSeed(CROPS.get(Boron), Boron, 1));
        SEEDS.put(Caesium, new ItemTierSeed(CROPS.get(Caesium), Caesium, 2));
        SEEDS.put(Calcium, new ItemTierSeed(CROPS.get(Calcium), Calcium, 2));
        SEEDS.put(Carbon, new ItemTierSeed(CROPS.get(Carbon), Carbon, 2));
        SEEDS.put(Cadmium, new ItemTierSeed(CROPS.get(Cadmium), Cadmium, 2));
        SEEDS.put(Cerium, new ItemTierSeed(CROPS.get(Cerium), Cerium, 2));
        SEEDS.put(Chrome, new ItemTierSeed(CROPS.get(Chrome), Chrome, 3));
        SEEDS.put(Cobalt, new ItemTierSeed(CROPS.get(Cobalt), Cobalt, 2));
        SEEDS.put(Copper, new ItemTierSeed(CROPS.get(Copper), Copper, 2));
        SEEDS.put(Dysprosium, new ItemTierSeed(CROPS.get(Dysprosium), Dysprosium, 2));
        SEEDS.put(Erbium, new ItemTierSeed(CROPS.get(Erbium), Erbium, 2));
        SEEDS.put(Europium, new ItemTierSeed(CROPS.get(Europium), Europium, 7));
        SEEDS.put(Gadolinium, new ItemTierSeed(CROPS.get(Gadolinium), Gadolinium, 2));
        SEEDS.put(Gallium, new ItemTierSeed(CROPS.get(Gallium), Gallium, 3));
        //SEEDS.put(Gold, new ItemTierSeed(CROPS.get(Gold), Gold, 4));
        SEEDS.put(Holmium, new ItemTierSeed(CROPS.get(Holmium), Holmium, 2));
        SEEDS.put(Indium, new ItemTierSeed(CROPS.get(Indium), Indium, 5));
        SEEDS.put(Iridium, new ItemTierSeed(CROPS.get(Iridium), Iridium, 6));
        //SEEDS.put(Iron, new ItemTierSeed(CROPS.get(Iron), Iron, 2));
        SEEDS.put(Lanthanum, new ItemTierSeed(CROPS.get(Lanthanum), Lanthanum, 2));
        SEEDS.put(Lead, new ItemTierSeed(CROPS.get(Lead), Lead, 1));
        SEEDS.put(Lithium, new ItemTierSeed(CROPS.get(Lithium), Lithium, 2));
        SEEDS.put(Lutetium, new ItemTierSeed(CROPS.get(Lutetium), Lutetium, 2));
        SEEDS.put(Magnesium, new ItemTierSeed(CROPS.get(Magnesium), Magnesium, 2));
        SEEDS.put(Manganese, new ItemTierSeed(CROPS.get(Manganese), Manganese, 2));
        SEEDS.put(Molybdenum, new ItemTierSeed(CROPS.get(Molybdenum), Molybdenum, 2));
        SEEDS.put(Neodymium, new ItemTierSeed(CROPS.get(Neodymium), Neodymium, 3));
        SEEDS.put(Darmstadtium, new ItemTierSeed(CROPS.get(Darmstadtium), Darmstadtium, 8));
        SEEDS.put(Nickel, new ItemTierSeed(CROPS.get(Nickel), Nickel, 2));
        SEEDS.put(Niobium, new ItemTierSeed(CROPS.get(Niobium), Niobium, 2));
        SEEDS.put(Osmium, new ItemTierSeed(CROPS.get(Osmium), Osmium, 6));
        SEEDS.put(Palladium, new ItemTierSeed(CROPS.get(Palladium), Palladium, 6));
        SEEDS.put(Phosphorus, new ItemTierSeed(CROPS.get(Phosphorus), Phosphorus, 2));
        SEEDS.put(Platinum, new ItemTierSeed(CROPS.get(Platinum), Platinum, 6));
        SEEDS.put(Potassium, new ItemTierSeed(CROPS.get(Potassium), Potassium, 2));
        SEEDS.put(Praseodymium, new ItemTierSeed(CROPS.get(Praseodymium), Praseodymium, 3));
        SEEDS.put(Promethium, new ItemTierSeed(CROPS.get(Promethium), Promethium, 2));
        SEEDS.put(Rubidium, new ItemTierSeed(CROPS.get(Rubidium), Rubidium, 2));
        SEEDS.put(Samarium, new ItemTierSeed(CROPS.get(Samarium), Samarium, 2));
        SEEDS.put(Scandium, new ItemTierSeed(CROPS.get(Scandium), Scandium, 2));
        SEEDS.put(Silicon, new ItemTierSeed(CROPS.get(Silicon), Silicon, 2));
        //SEEDS.put(Silver, new ItemTierSeed(CROPS.get(Silver), Silver, 2));
        SEEDS.put(Sodium, new ItemTierSeed(CROPS.get(Sodium), Sodium, 2));
        SEEDS.put(Strontium, new ItemTierSeed(CROPS.get(Strontium), Strontium, 2));
        SEEDS.put(Sulfur, new ItemTierSeed(CROPS.get(Sulfur), Sulfur, 2));
        SEEDS.put(Tantalum, new ItemTierSeed(CROPS.get(Tantalum), Tantalum, 2));
        SEEDS.put(Tellurium, new ItemTierSeed(CROPS.get(Tellurium), Tellurium, 2));
        SEEDS.put(Terbium, new ItemTierSeed(CROPS.get(Terbium), Terbium, 2));
        SEEDS.put(Thorium, new ItemTierSeed(CROPS.get(Thorium), Thorium, 2));
        SEEDS.put(Thulium, new ItemTierSeed(CROPS.get(Thulium), Thulium, 2));
        //SEEDS.put(Tin, new ItemTierSeed(CROPS.get(Tin), Tin, 2));
        SEEDS.put(Titanium, new ItemTierSeed(CROPS.get(Titanium), Titanium, 4));
        SEEDS.put(Tungsten, new ItemTierSeed(CROPS.get(Tungsten), Tungsten, 5));
        SEEDS.put(Vanadium, new ItemTierSeed(CROPS.get(Vanadium), Vanadium, 2));
        SEEDS.put(Ytterbium, new ItemTierSeed(CROPS.get(Ytterbium), Ytterbium, 2));
        SEEDS.put(Yttrium, new ItemTierSeed(CROPS.get(Yttrium), Yttrium, 2));
        SEEDS.put(Zinc, new ItemTierSeed(CROPS.get(Zinc), Zinc, 2));
        SEEDS.put(Almandine, new ItemTierSeed(CROPS.get(Almandine), Almandine, 2));
        SEEDS.put(Andradite, new ItemTierSeed(CROPS.get(Andradite), Andradite, 2));
        SEEDS.put(AnnealedCopper, new ItemTierSeed(CROPS.get(AnnealedCopper), AnnealedCopper, 3));
        SEEDS.put(Asbestos, new ItemTierSeed(CROPS.get(Asbestos), Asbestos, 2));
        SEEDS.put(Ash, new ItemTierSeed(CROPS.get(Ash), Ash, 2));
        SEEDS.put(BatteryAlloy, new ItemTierSeed(CROPS.get(BatteryAlloy), BatteryAlloy, 2));
        SEEDS.put(BlueTopaz, new ItemTierSeed(CROPS.get(BlueTopaz), BlueTopaz, 2));
        SEEDS.put(Brass, new ItemTierSeed(CROPS.get(Brass), Brass, 2));
        //SEEDS.put(Bronze, new ItemTierSeed(CROPS.get(Bronze), Bronze, 2));
        SEEDS.put(Calcite, new ItemTierSeed(CROPS.get(Calcite), Calcite, 2));
        SEEDS.put(Cassiterite, new ItemTierSeed(CROPS.get(Cassiterite), Cassiterite, 2));
        SEEDS.put(Chalcopyrite, new ItemTierSeed(CROPS.get(Chalcopyrite), Chalcopyrite, 2));
        SEEDS.put(Chromite, new ItemTierSeed(CROPS.get(Chromite), Chromite, 2));
        SEEDS.put(Cinnabar, new ItemTierSeed(CROPS.get(Cinnabar), Cinnabar, 2));
        //SEEDS.put(Coal, new ItemTierSeed(CROPS.get(Coal), Coal, 2));
        SEEDS.put(Cobaltite, new ItemTierSeed(CROPS.get(Cobaltite), Cobaltite, 2));
        SEEDS.put(Cooperite, new ItemTierSeed(CROPS.get(Cooperite), Cooperite, 2));
        SEEDS.put(Cupronickel, new ItemTierSeed(CROPS.get(Cupronickel), Cupronickel, 2));
        SEEDS.put(DarkAsh, new ItemTierSeed(CROPS.get(DarkAsh), DarkAsh, 2));
        //SEEDS.put(Diamond, new ItemTierSeed(CROPS.get(Diamond), Diamond, 4));
        SEEDS.put(Electrum, new ItemTierSeed(CROPS.get(Electrum), Electrum, 4));
        //SEEDS.put(Emerald, new ItemTierSeed(CROPS.get(Emerald), Emerald, 4));
        SEEDS.put(Galena, new ItemTierSeed(CROPS.get(Galena), Galena, 2));
        SEEDS.put(Garnierite, new ItemTierSeed(CROPS.get(Garnierite), Garnierite, 2));
        SEEDS.put(GreenSapphire, new ItemTierSeed(CROPS.get(GreenSapphire), GreenSapphire, 2));
        SEEDS.put(Grossular, new ItemTierSeed(CROPS.get(Grossular), Grossular, 1));
        SEEDS.put(Ilmenite, new ItemTierSeed(CROPS.get(Ilmenite), Ilmenite, 2));
        SEEDS.put(Rutile, new ItemTierSeed(CROPS.get(Rutile), Rutile, 2));
        SEEDS.put(Bauxite, new ItemTierSeed(CROPS.get(Bauxite), Bauxite, 2));
        SEEDS.put(MagnesiumChloride, new ItemTierSeed(CROPS.get(MagnesiumChloride), MagnesiumChloride, 2));
        SEEDS.put(Invar, new ItemTierSeed(CROPS.get(Invar), Invar, 2));
        SEEDS.put(Kanthal, new ItemTierSeed(CROPS.get(Kanthal), Kanthal, 3));
        SEEDS.put(Lazurite, new ItemTierSeed(CROPS.get(Lazurite), Lazurite, 2));
        SEEDS.put(Magnalium, new ItemTierSeed(CROPS.get(Magnalium), Magnalium, 2));
        SEEDS.put(Magnesite, new ItemTierSeed(CROPS.get(Magnesite), Magnesite, 2));
        SEEDS.put(Magnetite, new ItemTierSeed(CROPS.get(Magnetite), Magnetite, 2));
        SEEDS.put(Molybdenite, new ItemTierSeed(CROPS.get(Molybdenite), Molybdenite, 2));
        SEEDS.put(Nichrome, new ItemTierSeed(CROPS.get(Nichrome), Nichrome, 4));
        SEEDS.put(Phosphate, new ItemTierSeed(CROPS.get(Phosphate), Phosphate, 2));
        SEEDS.put(PigIron, new ItemTierSeed(CROPS.get(PigIron), PigIron, 2));
        SEEDS.put(Plastic, new ItemTierSeed(CROPS.get(Plastic), Plastic, 3));
        SEEDS.put(Epoxid, new ItemTierSeed(CROPS.get(Epoxid), Epoxid, 4));
        SEEDS.put(Silicone, new ItemTierSeed(CROPS.get(Silicone), Silicone, 3));
        SEEDS.put(Polycaprolactam, new ItemTierSeed(CROPS.get(Polycaprolactam), Polycaprolactam, 4));
        SEEDS.put(Polytetrafluoroethylene, new ItemTierSeed(CROPS.get(Polytetrafluoroethylene), Polytetrafluoroethylene, 5));
        SEEDS.put(Powellite, new ItemTierSeed(CROPS.get(Powellite), Powellite, 2));
        SEEDS.put(Pyrite, new ItemTierSeed(CROPS.get(Pyrite), Pyrite, 2));
        SEEDS.put(Pyrolusite, new ItemTierSeed(CROPS.get(Pyrolusite), Pyrolusite, 2));
        SEEDS.put(Pyrope, new ItemTierSeed(CROPS.get(Pyrope), Pyrope, 2));
        SEEDS.put(RockSalt, new ItemTierSeed(CROPS.get(RockSalt), RockSalt, 2));
        SEEDS.put(Rubber, new ItemTierSeed(CROPS.get(Rubber), Rubber, 3));
        SEEDS.put(Ruby, new ItemTierSeed(CROPS.get(Ruby), Ruby, 2));
        SEEDS.put(Salt, new ItemTierSeed(CROPS.get(Salt), Salt, 2));
        SEEDS.put(Saltpeter, new ItemTierSeed(CROPS.get(Saltpeter), Saltpeter, 2));
        SEEDS.put(Sapphire, new ItemTierSeed(CROPS.get(Sapphire), Sapphire, 2));
        SEEDS.put(Scheelite, new ItemTierSeed(CROPS.get(Scheelite), Scheelite, 2));
        SEEDS.put(SiliconDioxide, new ItemTierSeed(CROPS.get(SiliconDioxide), SiliconDioxide, 2));
        SEEDS.put(Sodalite, new ItemTierSeed(CROPS.get(Sodalite), Sodalite, 2));
        SEEDS.put(SodiumSulfide, new ItemTierSeed(CROPS.get(SodiumSulfide), SodiumSulfide, 2));
        SEEDS.put(Fireclay, new ItemTierSeed(CROPS.get(Fireclay), Fireclay, 2));
        SEEDS.put(Coke, new ItemTierSeed(CROPS.get(Coke), Coke, 3));
        SEEDS.put(SolderingAlloy, new ItemTierSeed(CROPS.get(SolderingAlloy), SolderingAlloy, 2));
        SEEDS.put(Spessartine, new ItemTierSeed(CROPS.get(Spessartine), Spessartine, 2));
        SEEDS.put(Sphalerite, new ItemTierSeed(CROPS.get(Sphalerite), Sphalerite, 2));
        SEEDS.put(StainlessSteel, new ItemTierSeed(CROPS.get(StainlessSteel), StainlessSteel, 4));
        SEEDS.put(Steel, new ItemTierSeed(CROPS.get(Steel), Steel, 3));
        SEEDS.put(Stibnite, new ItemTierSeed(CROPS.get(Stibnite), Stibnite, 2));
        SEEDS.put(Tanzanite, new ItemTierSeed(CROPS.get(Tanzanite), Tanzanite, 2));
        SEEDS.put(Tetrahedrite, new ItemTierSeed(CROPS.get(Tetrahedrite), Tetrahedrite, 2));
        SEEDS.put(TinAlloy, new ItemTierSeed(CROPS.get(TinAlloy), TinAlloy, 2));
        SEEDS.put(Topaz, new ItemTierSeed(CROPS.get(Topaz), Topaz, 2));
        SEEDS.put(Tungstate, new ItemTierSeed(CROPS.get(Tungstate), Tungstate, 2));
        SEEDS.put(Ultimet, new ItemTierSeed(CROPS.get(Ultimet), Ultimet, 4));
        SEEDS.put(Uvarovite, new ItemTierSeed(CROPS.get(Uvarovite), Uvarovite, 2));
        SEEDS.put(VanadiumGallium, new ItemTierSeed(CROPS.get(VanadiumGallium), VanadiumGallium, 4));
        SEEDS.put(WroughtIron, new ItemTierSeed(CROPS.get(WroughtIron), WroughtIron, 3));
        SEEDS.put(Wulfenite, new ItemTierSeed(CROPS.get(Wulfenite), Wulfenite, 2));
        SEEDS.put(YttriumBariumCuprate, new ItemTierSeed(CROPS.get(YttriumBariumCuprate), YttriumBariumCuprate, 4));
        SEEDS.put(Quartzite, new ItemTierSeed(CROPS.get(Quartzite), Quartzite, 2));
        SEEDS.put(Graphite, new ItemTierSeed(CROPS.get(Graphite), Graphite, 3));
        SEEDS.put(Graphene, new ItemTierSeed(CROPS.get(Graphene), Graphene, 3));
        SEEDS.put(Jasper, new ItemTierSeed(CROPS.get(Jasper), Jasper, 2));
        SEEDS.put(Osmiridium, new ItemTierSeed(CROPS.get(Osmiridium), Osmiridium, 6));
        SEEDS.put(Tenorite, new ItemTierSeed(CROPS.get(Tenorite), Tenorite, 2));
        SEEDS.put(Cuprite, new ItemTierSeed(CROPS.get(Cuprite), Cuprite, 2));
        SEEDS.put(Bornite, new ItemTierSeed(CROPS.get(Bornite), Bornite, 2));
        SEEDS.put(Chalcocite, new ItemTierSeed(CROPS.get(Chalcocite), Chalcocite, 2));
        SEEDS.put(Enargite, new ItemTierSeed(CROPS.get(Enargite), Enargite, 2));
        SEEDS.put(Tennantite, new ItemTierSeed(CROPS.get(Tennantite), Tennantite, 2));
        SEEDS.put(PhosphorousPentoxide, new ItemTierSeed(CROPS.get(PhosphorousPentoxide), PhosphorousPentoxide, 2));
        SEEDS.put(SodiumHydroxide, new ItemTierSeed(CROPS.get(SodiumHydroxide), SodiumHydroxide, 2));
        SEEDS.put(Quicklime, new ItemTierSeed(CROPS.get(Quicklime), Quicklime, 2));
        SEEDS.put(SodiumBisulfate, new ItemTierSeed(CROPS.get(SodiumBisulfate), SodiumBisulfate, 2));
        SEEDS.put(GalliumArsenide, new ItemTierSeed(CROPS.get(GalliumArsenide), GalliumArsenide, 3));
        SEEDS.put(Potash, new ItemTierSeed(CROPS.get(Potash), Potash, 2));
        SEEDS.put(SodaAsh, new ItemTierSeed(CROPS.get(SodaAsh), SodaAsh, 2));
        SEEDS.put(IndiumGalliumPhosphide, new ItemTierSeed(CROPS.get(IndiumGalliumPhosphide), IndiumGalliumPhosphide, 5));
        SEEDS.put(FerriteMixture, new ItemTierSeed(CROPS.get(FerriteMixture), FerriteMixture, 3));
        SEEDS.put(NickelZincFerrite, new ItemTierSeed(CROPS.get(NickelZincFerrite), NickelZincFerrite, 3));
        SEEDS.put(Magnesia, new ItemTierSeed(CROPS.get(Magnesia), Magnesia, 3));
        SEEDS.put(PolyphenyleneSulfide, new ItemTierSeed(CROPS.get(PolyphenyleneSulfide), PolyphenyleneSulfide, 5));
        SEEDS.put(SiliconeRubber, new ItemTierSeed(CROPS.get(SiliconeRubber), SiliconeRubber, 5));
        SEEDS.put(Polydimethylsiloxane, new ItemTierSeed(CROPS.get(Polydimethylsiloxane), Polydimethylsiloxane, 5));
        SEEDS.put(Polystyrene, new ItemTierSeed(CROPS.get(Polystyrene), Polystyrene, 5));
        SEEDS.put(StyreneButadieneRubber, new ItemTierSeed(CROPS.get(StyreneButadieneRubber), StyreneButadieneRubber, 5));
        SEEDS.put(ReinforcedEpoxyResin, new ItemTierSeed(CROPS.get(ReinforcedEpoxyResin), ReinforcedEpoxyResin, 4));
        SEEDS.put(BorosilicateGlass, new ItemTierSeed(CROPS.get(BorosilicateGlass), BorosilicateGlass, 3));
        SEEDS.put(PolyvinylChloride, new ItemTierSeed(CROPS.get(PolyvinylChloride), PolyvinylChloride, 3));
        //SEEDS.put(Oilsands, new ItemTierSeed(CROPS.get(Oilsands), Oilsands, 2));
        SEEDS.put(RareEarth, new ItemTierSeed(CROPS.get(RareEarth), RareEarth, 2));
        SEEDS.put(Perlite, new ItemTierSeed(CROPS.get(Perlite), Perlite, 2));
        SEEDS.put(Borax, new ItemTierSeed(CROPS.get(Borax), Borax, 2));
        SEEDS.put(Lignite, new ItemTierSeed(CROPS.get(Lignite), Lignite, 2));
        SEEDS.put(Olivine, new ItemTierSeed(CROPS.get(Olivine), Olivine, 2));
        SEEDS.put(Opal, new ItemTierSeed(CROPS.get(Opal), Opal, 2));
        SEEDS.put(Amethyst, new ItemTierSeed(CROPS.get(Amethyst), Amethyst, 2));
        SEEDS.put(Diatomite, new ItemTierSeed(CROPS.get(Diatomite), Diatomite, 2));
        SEEDS.put(Niter, new ItemTierSeed(CROPS.get(Niter), Niter, 2));
        SEEDS.put(Apatite, new ItemTierSeed(CROPS.get(Apatite), Apatite, 2));
        SEEDS.put(SterlingSilver, new ItemTierSeed(CROPS.get(SterlingSilver), SterlingSilver, 3));
        SEEDS.put(RoseGold, new ItemTierSeed(CROPS.get(RoseGold), RoseGold, 3));
        SEEDS.put(BlackBronze, new ItemTierSeed(CROPS.get(BlackBronze), BlackBronze, 3));
        SEEDS.put(BismuthBronze, new ItemTierSeed(CROPS.get(BismuthBronze), BismuthBronze, 3));
        SEEDS.put(BlackSteel, new ItemTierSeed(CROPS.get(BlackSteel), BlackSteel, 3));
        SEEDS.put(RedSteel, new ItemTierSeed(CROPS.get(RedSteel), RedSteel, 3));
        SEEDS.put(BlueSteel, new ItemTierSeed(CROPS.get(BlueSteel), BlueSteel, 3));
        SEEDS.put(DamascusSteel, new ItemTierSeed(CROPS.get(DamascusSteel), DamascusSteel, 3));
        SEEDS.put(TungstenSteel, new ItemTierSeed(CROPS.get(TungstenSteel), TungstenSteel, 5));
        SEEDS.put(RedAlloy, new ItemTierSeed(CROPS.get(RedAlloy), RedAlloy, 2));
        SEEDS.put(CobaltBrass, new ItemTierSeed(CROPS.get(CobaltBrass), CobaltBrass, 2));
        SEEDS.put(Phosphor, new ItemTierSeed(CROPS.get(Phosphor), Phosphor, 2));
        SEEDS.put(Basalt, new ItemTierSeed(CROPS.get(Basalt), Basalt, 2));
        SEEDS.put(GarnetRed, new ItemTierSeed(CROPS.get(GarnetRed), GarnetRed, 2));
        SEEDS.put(GarnetYellow, new ItemTierSeed(CROPS.get(GarnetYellow), GarnetYellow, 2));
        //SEEDS.put(Marble, new ItemTierSeed(CROPS.get(Marble), Marble, 2));
        SEEDS.put(Redrock, new ItemTierSeed(CROPS.get(Redrock), Redrock, 2));
        SEEDS.put(PotassiumFeldspar, new ItemTierSeed(CROPS.get(PotassiumFeldspar), PotassiumFeldspar, 2));
        SEEDS.put(Biotite, new ItemTierSeed(CROPS.get(Biotite), Biotite, 2));
        SEEDS.put(GraniteBlack, new ItemTierSeed(CROPS.get(GraniteBlack), GraniteBlack, 2));
        //SEEDS.put(GraniteRed, new ItemTierSeed(CROPS.get(GraniteRed), GraniteRed, 2));
        SEEDS.put(Chrysotile, new ItemTierSeed(CROPS.get(Chrysotile), Chrysotile, 2));
        SEEDS.put(Realgar, new ItemTierSeed(CROPS.get(Realgar), Realgar, 2));
        SEEDS.put(VanadiumMagnetite, new ItemTierSeed(CROPS.get(VanadiumMagnetite), VanadiumMagnetite, 2));
        SEEDS.put(BasalticMineralSand, new ItemTierSeed(CROPS.get(BasalticMineralSand), BasalticMineralSand, 2));
        SEEDS.put(GraniticMineralSand, new ItemTierSeed(CROPS.get(GraniticMineralSand), GraniticMineralSand, 2));
        SEEDS.put(GarnetSand, new ItemTierSeed(CROPS.get(GarnetSand), GarnetSand, 2));
        SEEDS.put(Bastnasite, new ItemTierSeed(CROPS.get(Bastnasite), Bastnasite, 2));
        SEEDS.put(Pentlandite, new ItemTierSeed(CROPS.get(Pentlandite), Pentlandite, 2));
        SEEDS.put(Spodumene, new ItemTierSeed(CROPS.get(Spodumene), Spodumene, 2));
        SEEDS.put(Pollucite, new ItemTierSeed(CROPS.get(Pollucite), Pollucite, 2));
        SEEDS.put(Lepidolite, new ItemTierSeed(CROPS.get(Lepidolite), Lepidolite, 2));
        SEEDS.put(Glauconite, new ItemTierSeed(CROPS.get(Glauconite), Glauconite, 2));
        SEEDS.put(GlauconiteSand, new ItemTierSeed(CROPS.get(GlauconiteSand), GlauconiteSand, 2));
        SEEDS.put(Vermiculite, new ItemTierSeed(CROPS.get(Vermiculite), Vermiculite, 2));
        SEEDS.put(Bentonite, new ItemTierSeed(CROPS.get(Bentonite), Bentonite, 2));
        SEEDS.put(FullersEarth, new ItemTierSeed(CROPS.get(FullersEarth), FullersEarth, 2));
        SEEDS.put(Pitchblende, new ItemTierSeed(CROPS.get(Pitchblende), Pitchblende, 2));
        SEEDS.put(Monazite, new ItemTierSeed(CROPS.get(Monazite), Monazite, 2));
        SEEDS.put(Malachite, new ItemTierSeed(CROPS.get(Malachite), Malachite, 2));
        SEEDS.put(Mirabilite, new ItemTierSeed(CROPS.get(Mirabilite), Mirabilite, 2));
        SEEDS.put(Mica, new ItemTierSeed(CROPS.get(Mica), Mica, 2));
        SEEDS.put(Trona, new ItemTierSeed(CROPS.get(Trona), Trona, 2));
        SEEDS.put(Barite, new ItemTierSeed(CROPS.get(Barite), Barite, 2));
        SEEDS.put(Gypsum, new ItemTierSeed(CROPS.get(Gypsum), Gypsum, 2));
        SEEDS.put(Alunite, new ItemTierSeed(CROPS.get(Alunite), Alunite, 2));
        SEEDS.put(Dolomite, new ItemTierSeed(CROPS.get(Dolomite), Dolomite, 2));
        SEEDS.put(Wollastonite, new ItemTierSeed(CROPS.get(Wollastonite), Wollastonite, 2));
        SEEDS.put(Zeolite, new ItemTierSeed(CROPS.get(Zeolite), Zeolite, 2));
        SEEDS.put(Kyanite, new ItemTierSeed(CROPS.get(Kyanite), Kyanite, 2));
        SEEDS.put(Kaolinite, new ItemTierSeed(CROPS.get(Kaolinite), Kaolinite, 2));
        SEEDS.put(Talc, new ItemTierSeed(CROPS.get(Talc), Talc, 2));
        SEEDS.put(Soapstone, new ItemTierSeed(CROPS.get(Soapstone), Soapstone, 2));
        //SEEDS.put(Concrete, new ItemTierSeed(CROPS.get(Concrete), Concrete, 3));
        SEEDS.put(IronMagnetic, new ItemTierSeed(CROPS.get(IronMagnetic), IronMagnetic, 3));
        SEEDS.put(SteelMagnetic, new ItemTierSeed(CROPS.get(SteelMagnetic), SteelMagnetic, 3));
        SEEDS.put(NeodymiumMagnetic, new ItemTierSeed(CROPS.get(NeodymiumMagnetic), NeodymiumMagnetic, 4));
        SEEDS.put(TungstenCarbide, new ItemTierSeed(CROPS.get(TungstenCarbide), TungstenCarbide, 6));
        SEEDS.put(VanadiumSteel, new ItemTierSeed(CROPS.get(VanadiumSteel), VanadiumSteel, 4));
        SEEDS.put(HSSG, new ItemTierSeed(CROPS.get(HSSG), HSSG, 3));
        SEEDS.put(HSSE, new ItemTierSeed(CROPS.get(HSSE), HSSE, 4));
        SEEDS.put(HSSS, new ItemTierSeed(CROPS.get(HSSS), HSSS, 5));
        SEEDS.put(Naquadah, new ItemTierSeed(CROPS.get(Naquadah), Naquadah, 6));
        SEEDS.put(NaquadahAlloy, new ItemTierSeed(CROPS.get(NaquadahAlloy), NaquadahAlloy, 7));
        SEEDS.put(NaquadahEnriched, new ItemTierSeed(CROPS.get(NaquadahEnriched), NaquadahEnriched, 7));
        SEEDS.put(Naquadria, new ItemTierSeed(CROPS.get(Naquadria), Naquadria, 8));
        SEEDS.put(Tritanium, new ItemTierSeed(CROPS.get(Tritanium), Tritanium, 8));
        SEEDS.put(Duranium, new ItemTierSeed(CROPS.get(Duranium), Duranium, 8));
        SEEDS.put(Meat, new ItemTierSeed(CROPS.get(Meat), Meat, 3));
        SEEDS.put(Neutronium, new ItemTierSeed(CROPS.get(Neutronium), Neutronium, 8));
        //SEEDS.put(Pyrotheum,new ItemTierSeed(CROPS.get(Pyrotheum),Pyrotheum,4));
        SEEDS.put(EglinSteelBase, new ItemTierSeed(CROPS.get(EglinSteelBase), EglinSteelBase, 3));
        SEEDS.put(EglinSteel, new ItemTierSeed(CROPS.get(EglinSteel), EglinSteel, 4));
        SEEDS.put(Grisium, new ItemTierSeed(CROPS.get(Grisium), Grisium, 4));
        SEEDS.put(Inconel625, new ItemTierSeed(CROPS.get(Inconel625), Inconel625, 4));
        SEEDS.put(MaragingSteel250, new ItemTierSeed(CROPS.get(MaragingSteel250), MaragingSteel250, 4));
        SEEDS.put(Potin, new ItemTierSeed(CROPS.get(Potin), Potin, 3));
        SEEDS.put(Staballoy, new ItemTierSeed(CROPS.get(Staballoy), Staballoy, 4));
        SEEDS.put(HastelloyN, new ItemTierSeed(CROPS.get(HastelloyN), HastelloyN, 4));
        SEEDS.put(Tumbaga, new ItemTierSeed(CROPS.get(Tumbaga), Tumbaga, 3));
        SEEDS.put(Stellite, new ItemTierSeed(CROPS.get(Stellite), Stellite, 4));
        SEEDS.put(Talonite, new ItemTierSeed(CROPS.get(Talonite), Talonite, 4));
        SEEDS.put(MVSuperconductorBase, new ItemTierSeed(CROPS.get(MVSuperconductorBase), MVSuperconductorBase, 3));
        SEEDS.put(HVSuperconductorBase, new ItemTierSeed(CROPS.get(HVSuperconductorBase), HVSuperconductorBase, 4));
        SEEDS.put(EVSuperconductorBase, new ItemTierSeed(CROPS.get(EVSuperconductorBase), EVSuperconductorBase, 5));
        SEEDS.put(IVSuperconductorBase, new ItemTierSeed(CROPS.get(IVSuperconductorBase), IVSuperconductorBase, 6));
        SEEDS.put(LuVSuperconductorBase, new ItemTierSeed(CROPS.get(LuVSuperconductorBase), LuVSuperconductorBase, 7));
        SEEDS.put(ZPMSuperconductorBase, new ItemTierSeed(CROPS.get(ZPMSuperconductorBase), ZPMSuperconductorBase, 8));
        SEEDS.put(UVSuperconductorBase, new ItemTierSeed(CROPS.get(UVSuperconductorBase), UVSuperconductorBase, 8));
        SEEDS.put(Enderium, new ItemTierSeed(CROPS.get(Enderium), Enderium, 3));
        SEEDS.put(QuartzSand, new ItemTierSeed(CROPS.get(QuartzSand), QuartzSand, 2));
        SEEDS.put(Massicot, new ItemTierSeed(CROPS.get(Massicot), Massicot, 2));
        //SEEDS.put(Cryotheum,new ItemTierSeed(CROPS.get(Cryotheum),Cryotheum,3));
        SEEDS.put(Blizz, new ItemTierSeed(CROPS.get(Blizz), Blizz, 3));
        SEEDS.put(Nitinol60, new ItemTierSeed(CROPS.get(Nitinol60), Nitinol60, 4));
        SEEDS.put(BabbittAlloy, new ItemTierSeed(CROPS.get(BabbittAlloy), BabbittAlloy, 4));
        SEEDS.put(HG1223, new ItemTierSeed(CROPS.get(HG1223), HG1223, 4));
        SEEDS.put(IncoloyMA956, new ItemTierSeed(CROPS.get(IncoloyMA956), IncoloyMA956, 4));
        SEEDS.put(Zirconium, new ItemTierSeed(CROPS.get(Zirconium), Zirconium, 5));
        SEEDS.put(CubicZirconia, new ItemTierSeed(CROPS.get(CubicZirconia), CubicZirconia, 6));
        SEEDS.put(Prasiolite, new ItemTierSeed(CROPS.get(Prasiolite), Prasiolite, 4));
        SEEDS.put(YttriumOxide, new ItemTierSeed(CROPS.get(YttriumOxide), YttriumOxide, 1));
        SEEDS.put(MagnetoResonatic, new ItemTierSeed(CROPS.get(MagnetoResonatic), MagnetoResonatic, 7));
        SEEDS.put(ZirconiumCarbide, new ItemTierSeed(CROPS.get(ZirconiumCarbide), ZirconiumCarbide, 6));
        SEEDS.put(Zirkelite, new ItemTierSeed(CROPS.get(Zirkelite), Zirkelite, 2));
        SEEDS.put(PlatinumMetallicPowder, new ItemTierSeed(CROPS.get(PlatinumMetallicPowder), PlatinumMetallicPowder, 3));
        SEEDS.put(PalladiumMetallicPowder, new ItemTierSeed(CROPS.get(PalladiumMetallicPowder), PalladiumMetallicPowder, 3));
        SEEDS.put(Ruthenium, new ItemTierSeed(CROPS.get(Ruthenium), Ruthenium, 6));
        SEEDS.put(RarestMetalResidue, new ItemTierSeed(CROPS.get(RarestMetalResidue), RarestMetalResidue, 3));
        SEEDS.put(IrMetalResidue, new ItemTierSeed(CROPS.get(IrMetalResidue), IrMetalResidue, 3));
        SEEDS.put(Rhodium, new ItemTierSeed(CROPS.get(Rhodium), Rhodium, 6));
        SEEDS.put(RhodiumPlatedPalladium, new ItemTierSeed(CROPS.get(RhodiumPlatedPalladium), RhodiumPlatedPalladium, 7));
        SEEDS.put(Polybenzimidazole, new ItemTierSeed(CROPS.get(Polybenzimidazole), Polybenzimidazole, 5));
        SEEDS.put(Polonium, new ItemTierSeed(CROPS.get(Polonium), Polonium, 4));
        SEEDS.put(Copernicium, new ItemTierSeed(CROPS.get(Copernicium), Copernicium, 6));
        SEEDS.put(PreciousMetal, new ItemTierSeed(CROPS.get(PreciousMetal), PreciousMetal, 3));
        SEEDS.put(UraniumRadioactive.getMaterial(), new ItemTierSeed(CROPS.get(UraniumRadioactive.getMaterial()), UraniumRadioactive.getMaterial(), 4));
//        SEEDS.put(FLiNaK,new ItemTierSeed(CROPS.get(FLiNaK),FLiNaK,5));
//        SEEDS.put(FLiBe,new ItemTierSeed(CROPS.get(FLiBe),FLiBe,5));
//        SEEDS.put(LeadBismuthEutectic,new ItemTierSeed(CROPS.get(LeadBismuthEutectic),LeadBismuthEutectic,5));
        SEEDS.put(Francium, new ItemTierSeed(CROPS.get(Francium), Francium, 4));
        SEEDS.put(Radium, new ItemTierSeed(CROPS.get(Radium), Radium, 4));
        SEEDS.put(Actinium, new ItemTierSeed(CROPS.get(Actinium), Actinium, 4));
        SEEDS.put(Hafnium, new ItemTierSeed(CROPS.get(Hafnium), Hafnium, 4));
        SEEDS.put(Rhenium, new ItemTierSeed(CROPS.get(Rhenium), Rhenium, 4));
        SEEDS.put(Technetium, new ItemTierSeed(CROPS.get(Technetium), Technetium, 4));
        SEEDS.put(Thallium, new ItemTierSeed(CROPS.get(Thallium), Thallium, 4));
        SEEDS.put(Germanium, new ItemTierSeed(CROPS.get(Germanium), Germanium, 4));
        SEEDS.put(Selenium, new ItemTierSeed(CROPS.get(Selenium), Selenium, 4));
        SEEDS.put(Iodine, new ItemTierSeed(CROPS.get(Iodine), Iodine, 4));
        SEEDS.put(Astatine, new ItemTierSeed(CROPS.get(Astatine), Astatine, 4));
        SEEDS.put(AbyssalAlloy, new ItemTierSeed(CROPS.get(AbyssalAlloy), AbyssalAlloy, 5));


    }


}
