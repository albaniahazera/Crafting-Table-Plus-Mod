package com.alhazera25.craftingtableplus;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.CookingBookCategory;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return "Crafting Table Plus Recipes";
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                HolderGetter<Item> itemGetter = provider.lookupOrThrow(Registries.ITEM);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.BARRIER)
                        .pattern("BGB")
                        .pattern("GRG")
                        .pattern("BGB")
                        .define('G', Items.GLASS)
                        .define('B', Items.BEDROCK)
                        .define('R', Items.DYE.red())
                        .unlockedBy("has_glass", has(Items.GLASS))
                        .unlockedBy("has_bedrock", has(Items.BEDROCK))
                        .unlockedBy("has_red_dye", has(Items.DYE.red()))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.BEDROCK)
                        .pattern("NIN")
                        .pattern("SDS")
                        .pattern("NIN")
                        .define('N', Items.NETHERITE_BLOCK)
                        .define('I', Items.IRON_BLOCK)
                        .define('S', Items.STONE)
                        .define('D', Items.DIAMOND_BLOCK)
                        .unlockedBy("has_netherite_block", has(Items.NETHERITE_BLOCK))
                        .unlockedBy("has_iron_block", has(Items.IRON_BLOCK))
                        .unlockedBy("has_stone", has(Items.STONE))
                        .unlockedBy("has_diamond_block", has(Items.DIAMOND_BLOCK))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.REDSTONE, Items.BELL)
                        .pattern("SSS")
                        .pattern("G G")
                        .pattern("G G")
                        .define('G', Items.GOLD_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy("has_stick", has(Items.STICK))
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.CAVE_SPIDER_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("SCS")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('S', Items.SPIDER_EYE)
                        .define('C', Items.COBWEB)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .unlockedBy("has_cobweb", has(Items.COBWEB))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.CREEPER_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("GGG")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('G', Items.GUNPOWDER)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_gunpowder", has(Items.GUNPOWDER))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET)
                        .pattern("NNN")
                        .pattern("N N")
                        .pattern("   ")
                        .define('N', Items.IRON_NUGGET)
                        .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE)
                        .pattern("N N")
                        .pattern("NNN")
                        .pattern("NNN")
                        .define('N', Items.IRON_NUGGET)
                        .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS)
                        .pattern("NNN")
                        .pattern("N N")
                        .pattern("N N")
                        .define('N', Items.IRON_NUGGET)
                        .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS)
                        .pattern("N N")
                        .pattern("N N")
                        .pattern("   ")
                        .define('N', Items.IRON_NUGGET)
                        .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.COBWEB)
                        .pattern("S S")
                        .pattern(" S ")
                        .pattern("S S")
                        .define('S', Items.STRING)
                        .unlockedBy("has_string", has(Items.STRING))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR)
                        .pattern("D D")
                        .pattern("DDD")
                        .pattern("D D")
                        .define('D', Items.DIAMOND)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.ELYTRA)
                        .pattern("PLP")
                        .pattern("S S")
                        .pattern("P P")
                        .define('P', Items.PHANTOM_MEMBRANE)
                        .define('L', Items.LEAD)
                        .define('S', Items.SLIME_BALL)
                        .unlockedBy("has_phantom_membrane", has(Items.PHANTOM_MEMBRANE))
                        .unlockedBy("has_lead", has(Items.LEAD))
                        .unlockedBy("has_slime_ball", has(Items.SLIME_BALL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                        .pattern("GGG")
                        .pattern("GAG")
                        .pattern("GGG")
                        .define('G', Items.GOLD_BLOCK)
                        .define('A', Items.APPLE)
                        .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                        .unlockedBy("has_apple", has(Items.APPLE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.ENDERMITE_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("EPE")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('P', Items.ENDER_PEARL)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_gunpowder", has(Items.ENDER_PEARL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.GHAST_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("GFG")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('G', Items.GHAST_TEAR)
                        .define('F', Items.FIRE_CHARGE)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR))
                        .unlockedBy("has_fire_charge", has(Items.FIRE_CHARGE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR)
                        .pattern("G G")
                        .pattern("GGG")
                        .pattern("G G")
                        .define('G', Items.GOLD_INGOT)
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.HEART_OF_THE_SEA)
                        .pattern("PCP")
                        .pattern("CDC")
                        .pattern("PCP")
                        .define('P', Items.PRISMARINE_SHARD)
                        .define('C', Items.PRISMARINE_CRYSTALS)
                        .define('D', Items.DIAMOND)
                        .unlockedBy("has_prismarine_shard", has(Items.PRISMARINE_SHARD))
                        .unlockedBy("has_prismarine_crystals", has(Items.PRISMARINE_CRYSTALS))
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR)
                        .pattern("I I")
                        .pattern("III")
                        .pattern("I I")
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.LIGHT, 16)
                        .pattern("BRB")
                        .pattern("BLB")
                        .pattern("BBB")
                        .define('B', Items.BARRIER)
                        .define('R', Items.REDSTONE_BLOCK)
                        .define('L', Items.REDSTONE_LAMP)
                        .unlockedBy("has_barrier", has(Items.BARRIER))
                        .unlockedBy("has_redstone_block", has(Items.REDSTONE_BLOCK))
                        .unlockedBy("has_redstone_lamp", has(Items.REDSTONE_LAMP))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.MAGMA_CUBE_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("MCM")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('M', Items.MAGMA_BLOCK)
                        .define('C', Items.MAGMA_CREAM)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_magma_block", has(Items.MAGMA_BLOCK))
                        .unlockedBy("has_magma_cream", has(Items.MAGMA_CREAM))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.PHANTOM_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("PPP")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('P', Items.PHANTOM_MEMBRANE)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_phantom_membrane", has(Items.PHANTOM_MEMBRANE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SHULKER_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("SSS")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('S', Items.SHULKER_SHELL)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_shulker_shell", has(Items.SHULKER_SHELL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SKELETON_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("BKB")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('B', Items.BONE)
                        .define('K', Items.BONE_BLOCK)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_bone", has(Items.BONE))
                        .unlockedBy("has_bone_block", has(Items.BONE_BLOCK))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SLIME_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("SSS")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('S', Items.SLIME_BALL)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_slime", has(Items.SLIME_BALL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.SOUL_SAND, 4)
                        .pattern("LSL")
                        .pattern("SLS")
                        .pattern("LSL")
                        .define('L', Items.LAPIS_LAZULI)
                        .define('S', Items.SAND)
                        .unlockedBy("has_lapis_lazuli", has(Items.LAPIS_LAZULI))
                        .unlockedBy("has_sand", has(Items.SAND))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SPIDER_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("SYS")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('S', Items.STRING)
                        .define('Y', Items.SPIDER_EYE)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_string", has(Items.STRING))
                        .unlockedBy("has_spider_eye", has(Items.SPIDER_EYE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.AMETHYST_CLUSTER)
                        .pattern(" A ")
                        .pattern("AAA")
                        .pattern("   ")
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy("has_amethyst_shard", has(Items.AMETHYST_SHARD))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.BLAZE_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("RPR")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('R', Items.BLAZE_ROD)
                        .define('P', Items.BLAZE_POWDER)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_blaze_rod", has(Items.BLAZE_ROD))
                        .unlockedBy("has_blaze_powder", has(Items.BLAZE_POWDER))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.ENDERMAN_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("PPP")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('P', Items.ENDER_PEARL)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_ender_pearl", has(Items.ENDER_PEARL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.GILDED_BLACKSTONE)
                        .pattern("NBN")
                        .pattern("BNB")
                        .pattern("NBN")
                        .define('N', Items.GOLD_NUGGET)
                        .define('B', Items.BLACKSTONE)
                        .unlockedBy("has_gold_nugget", has(Items.GOLD_NUGGET))
                        .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.SPAWNER)
                        .pattern("III")
                        .pattern("I I")
                        .pattern("III")
                        .define('I', Items.IRON_BARS)
                        .unlockedBy("has_iron_bars", has(Items.IRON_BARS))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.SPONGE)
                        .pattern("YYY")
                        .pattern("YHY")
                        .pattern("YYY")
                        .define('Y', Items.WOOL.yellow())
                        .define('H', Items.HORN_CORAL)
                        .unlockedBy("has_yellow_wool", has(Items.WOOL.yellow()))
                        .unlockedBy("has_horn_coral", has(Items.HORN_CORAL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.STRIDER_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("SCS")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('S', Items.STRING)
                        .define('C', Items.MAGMA_CREAM)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_string", has(Items.STRING))
                        .unlockedBy("has_magma_cream", has(Items.MAGMA_CREAM))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.TOTEM_OF_UNDYING)
                        .pattern("ESE")
                        .pattern("SLS")
                        .pattern(" S ")
                        .define('E', Items.ENCHANTED_GOLDEN_APPLE)
                        .define('S', Items.SOUL_SAND)
                        .define('L', Items.LAPIS_LAZULI)
                        .unlockedBy("has_enchanted_golden_apple", has(Items.ENCHANTED_GOLDEN_APPLE))
                        .unlockedBy("has_soul_sand", has(Items.SOUL_SAND))
                        .unlockedBy("has_lapis_lazuli", has(Items.LAPIS_LAZULI))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.COMBAT, Items.TRIDENT)
                        .pattern(" II")
                        .pattern(" PI")
                        .pattern("P  ")
                        .define('I', Items.IRON_INGOT)
                        .define('P', Items.PRISMARINE_SHARD)
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .unlockedBy("has_prismarine_shard", has(Items.PRISMARINE_SHARD))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.WITHER_SKELETON_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("BCB")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('B', Items.BONE)
                        .define('C', Items.COAL)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_bone", has(Items.BONE))
                        .unlockedBy("has_coal", has(Items.COAL))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.ZOMBIE_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("RRR")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('R', Items.ROTTEN_FLESH)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.ARMADILLO_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("AAA")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('A', Items.ARMADILLO_SCUTE)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_armadillo_scute", has(Items.ARMADILLO_SCUTE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.IRON_GOLEM_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("III")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.WARDEN_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("SSS")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('S', Items.SCULK_CATALYST)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_sculk_catalyst", has(Items.SCULK_CATALYST))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.BREEZE_SPAWN_EGG)
                        .pattern("EEE")
                        .pattern("BBB")
                        .pattern("EEE")
                        .define('E', Items.EGG)
                        .define('B', Items.BREEZE_ROD)
                        .unlockedBy("has_egg", has(Items.EGG))
                        .unlockedBy("has_breeze_rod", has(Items.BREEZE_ROD))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.HEAVY_CORE)
                        .pattern("DND")
                        .pattern("NIN")
                        .pattern("DND")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_INGOT)
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("DDD")
                        .pattern("SNS")
                        .pattern("DDD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('S', Items.SANDSTONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_sandstone", has(Items.SANDSTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.EYE_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("EDE")
                        .pattern("DND")
                        .pattern("EDE")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('E', Items.END_STONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_end_stone", has(Items.END_STONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.HOST_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("TDT")
                        .pattern("TND")
                        .pattern("TDT")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('T', Items.TERRACOTTA)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_terracotta", has(Items.TERRACOTTA))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .pattern("NDN")
                        .pattern("NDN")
                        .pattern("NNN")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERRACK)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_netherrack", has(Items.NETHERRACK))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.RAISER_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("DTT")
                        .pattern("TNT")
                        .pattern("TDD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('T', Items.TERRACOTTA)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_terracotta", has(Items.TERRACOTTA))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("TTD")
                        .pattern("TNT")
                        .pattern("DTT")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('T', Items.TERRACOTTA)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_terracotta", has(Items.TERRACOTTA))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("TTT")
                        .pattern("DND")
                        .pattern("DTD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('T', Items.TERRACOTTA)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_terracotta", has(Items.TERRACOTTA))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("SDE")
                        .pattern("SNS")
                        .pattern("EDS")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('E', Items.ECHO_SHARD)
                        .define('S', Items.COBBLED_DEEPSLATE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_echo_shard", has(Items.ECHO_SHARD))
                        .unlockedBy("has_cobbled_deepslate", has(Items.COBBLED_DEEPSLATE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.WARD_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("DSD")
                        .pattern("SNS")
                        .pattern("SDS")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('S', Items.COBBLED_DEEPSLATE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_deepslate", has(Items.COBBLED_DEEPSLATE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("BBB")
                        .pattern("DND")
                        .pattern("BBB")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('B', Items.BLACKSTONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("PPP")
                        .pattern("PNP")
                        .pattern("DPD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('P', Items.PRISMARINE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_prismarine", has(Items.PRISMARINE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.VEX_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("DSD")
                        .pattern("DNS")
                        .pattern("SDD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('S', Items.COBBLESTONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.COAST_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("DSS")
                        .pattern("SNS")
                        .pattern("SDD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('S', Items.COBBLESTONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("SDS")
                        .pattern("DND")
                        .pattern("SDS")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('S', Items.COBBLESTONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.WILD_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("SDS")
                        .pattern("SNS")
                        .pattern("SSS")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('S', Items.MOSSY_COBBLESTONE)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_mossy_cobblestone", has(Items.MOSSY_COBBLESTONE))
                        .save(recipeOutput);

                ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, Items.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE)
                        .pattern("DPD")
                        .pattern("PNP")
                        .pattern("DPD")
                        .define('D', Items.DIAMOND)
                        .define('N', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .define('P', Items.PURPUR_BLOCK)
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .unlockedBy("has_smithing_template", has(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                        .unlockedBy("has_purpur_block", has(Items.PURPUR_BLOCK))
                        .save(recipeOutput);


                // SHAPELESS
                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, Items.BONE_MEAL)
                        .requires(Items.WATER_BUCKET)
                        .requires(Items.ROTTEN_FLESH)
                        .requires(Items.POISONOUS_POTATO)
                        .unlockedBy("has_water", has(Items.WATER_BUCKET))
                        .unlockedBy("has_rotten_flash", has(Items.ROTTEN_FLESH))
                        .unlockedBy("has_poisonous_potato", has(Items.POISONOUS_POTATO))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, Items.CLAY)
                        .requires(Items.WATER_BUCKET)
                        .requires(Items.DIRT)
                        .requires(Items.BONE_MEAL)
                        .unlockedBy("has_water", has(Items.WATER_BUCKET))
                        .unlockedBy("has_dirt", has(Items.DIRT))
                        .unlockedBy("has_bone_meal", has(Items.BONE_MEAL))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_NYLIUM)
                        .requires(Items.NETHERRACK)
                        .requires(Items.CRIMSON_FUNGUS)
                        .unlockedBy("has_netherrack", has(Items.NETHERRACK))
                        .unlockedBy("has_crimson_fungus", has(Items.CRIMSON_FUNGUS))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, Items.GLOWSTONE_DUST)
                        .requires(Items.SUGAR)
                        .requires(Items.REDSTONE)
                        .requires(Items.GOLD_INGOT)
                        .unlockedBy("has_sugar", has(Items.SUGAR))
                        .unlockedBy("has_redstone", has(Items.REDSTONE))
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, Items.DYE.green())
                        .requires(Items.DYE.yellow())
                        .requires(Items.DYE.blue())
                        .unlockedBy("has_dye_yellow", has(Items.DYE.yellow()))
                        .unlockedBy("has_dye_blue", has(Items.DYE.blue()))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, Items.GUNPOWDER, 3)
                        .requires(Items.COAL)
                        .requires(Items.SULFUR)
                        .requires(Items.GRAVEL)
                        .unlockedBy("has_coal", has(Items.COAL))
                        .unlockedBy("has_sulfur", has(Items.SULFUR))
                        .unlockedBy("has_gravel", has(Items.GRAVEL))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.MYCELIUM)
                        .requires(Items.GRASS_BLOCK)
                        .requires(Items.BROWN_MUSHROOM)
                        .unlockedBy("has_grass_block", has(Items.GRASS_BLOCK))
                        .unlockedBy("has_brown_mushroom", has(Items.BROWN_MUSHROOM))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.OBSIDIAN)
                        .requires(Items.WATER_BUCKET)
                        .requires(Items.LAVA_BUCKET)
                        .unlockedBy("has_water_bucket", has(Items.WATER_BUCKET))
                        .unlockedBy("has_lava_bucket", has(Items.LAVA_BUCKET))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.PODZOL)
                        .requires(Items.GRASS_BLOCK)
                        .requires(Items.DEAD_BUSH)
                        .requires(Items.ROTTEN_FLESH)
                        .unlockedBy("has_grass_block", has(Items.GRASS_BLOCK))
                        .unlockedBy("has_dead_bush", has(Items.DEAD_BUSH))
                        .unlockedBy("has_rotten_flesh", has(Items.ROTTEN_FLESH))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.CRYING_OBSIDIAN)
                        .requires(Items.OBSIDIAN)
                        .requires(Items.GHAST_TEAR)
                        .unlockedBy("has_obsidian", has(Items.OBSIDIAN))
                        .unlockedBy("has_ghast_tear", has(Items.GHAST_TEAR))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.FOOD, Items.HONEY_BOTTLE)
                        .requires(Items.HONEYCOMB)
                        .requires(Items.GLASS_BOTTLE)
                        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
                        .unlockedBy("has_glass_bottle", has(Items.GLASS_BOTTLE))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, Items.SLIME_BALL)
                        .requires(Items.HONEYCOMB)
                        .requires(Items.DYE.green())
                        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
                        .unlockedBy("has_green_dye", has(Items.DYE.green()))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_NYLIUM)
                        .requires(Items.NETHERRACK)
                        .requires(Items.WARPED_FUNGUS)
                        .unlockedBy("has_netherrack", has(Items.NETHERRACK))
                        .unlockedBy("has_warped_fungus", has(Items.WARPED_NYLIUM))
                        .save(recipeOutput);

                ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.DECORATIONS, Items.WITHER_ROSE, 3)
                        .requires(Items.ROSE_BUSH)
                        .requires(Items.WITHER_SKELETON_SKULL)
                        .unlockedBy("has_rose_bush", has(Items.ROSE_BUSH))
                        .unlockedBy("has_wither_skeleton_skull", has(Items.WITHER_SKELETON_SKULL))
                        .save(recipeOutput);

                // COOKING
                SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(Items.GILDED_BLACKSTONE), // 1. Ingredient
                        RecipeCategory.MISC,                   // 2. RecipeCategory
                        CookingBookCategory.MISC,             // 3. CookingBookCategory
                        Items.GOLD_INGOT,                     // 4. ItemLike Output
                        1.0F,                                 // 5. Experience (float)
                        100                                   // 6. Cooking Time (int)
                ).unlockedBy("has_gilded", has(Items.GILDED_BLACKSTONE)).save(recipeOutput);

            }
        };
    }
}