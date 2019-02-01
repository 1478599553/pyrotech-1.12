package com.codetaylor.mc.pyrotech.modules.tech.basic;

import com.codetaylor.mc.athenaeum.util.ArrayHelper;
import com.codetaylor.mc.pyrotech.modules.core.ModuleCore;
import com.codetaylor.mc.pyrotech.modules.core.ModuleCoreConfig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.config.Config;

@Config(modid = ModuleCore.MOD_ID, name = ModuleCore.MOD_ID + "/" + "module.tech.Basic")
public class ModuleTechBasicConfig {

  // ---------------------------------------------------------------------------
  // - Worktable Common
  // ---------------------------------------------------------------------------

  public static WorktableCommon WORKTABLE_COMMON = new WorktableCommon();

  public static class WorktableCommon {

    @Config.Comment({
        "Any recipe that you can complete in a vanilla crafting table can also",
        "be completed in this mod's worktables.",
        "",
        "If this list is not empty, only the recipes listed here will be allowed.",
        "",
        "The whitelist takes priority over the blacklist.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] RECIPE_WHITELIST = new String[0];

    @Config.Comment({
        "Any recipe that you can complete in a vanilla crafting table can also",
        "be completed in this mod's worktables.",
        "",
        "If this list is not empty, recipes listed here will be disallowed.",
        "",
        "The whitelist takes priority over the blacklist.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] RECIPE_BLACKLIST = {
        "minecraft:chest"
    };
  }

  // ---------------------------------------------------------------------------
  // - Worktable
  // ---------------------------------------------------------------------------

  public static Worktable WORKTABLE = new Worktable();

  public static class Worktable {

    @Config.Comment({
        "The number of hammer hits required to complete a craft.",
        "Range: [1, +int]",
        "Default: " + 4
    })
    public int HITS_PER_CRAFT = 4;

    @Config.Comment({
        "The amount of damage applied to the tool per craft.",
        "Range: [0, +int]",
        "Default: " + 2
    })
    public int TOOL_DAMAGE_PER_CRAFT = 2;

    @Config.Comment({
        "The maximum stack size for each slot in the crafting grid.",
        "Range: [1, 64]",
        "Default: " + 1
    })
    public int GRID_MAX_STACK_SIZE = 1;

    @Config.Comment({
        "The maximum stack size for each slot in the shelf.",
        "Range: [1, 64]",
        "Default: " + 1
    })
    public int SHELF_MAX_STACK_SIZE = 1;

    @Config.Comment({
        "If true, the worktable has durability and will break after the configured",
        "number of crafts completed.",
        "Default: " + true
    })
    public boolean USES_DURABILITY = true;

    @Config.Comment({
        "The number of crafts that the worktable can perform before it breaks.",
        "This is only relevant if the `USES_DURABILITY` flag is true.",
        "Range: [1, +int]",
        "Default: " + 64
    })
    public int DURABILITY = 64;

    @Config.Comment({
        "How much exhaustion to apply per hit.",
        "Range: [0, 40]",
        "Default: " + 1
    })
    public double EXHAUSTION_COST_PER_HIT = 1;

    @Config.Comment({
        "How much exhaustion to apply per completed craft.",
        "Range: [0, 40]",
        "Default: " + 0
    })
    public double EXHAUSTION_COST_PER_CRAFT_COMPLETE = 0;

    @Config.Comment({
        "Minimum amount of hunger the player needs to use.",
        "Range: [0, 20]",
        "Default: 3"
    })
    public int MINIMUM_HUNGER_TO_USE = 3;
  }

  // ---------------------------------------------------------------------------
  // - Stone Worktable
  // ---------------------------------------------------------------------------

  public static StoneWorktable STONE_WORKTABLE = new StoneWorktable();

  public static class StoneWorktable {

    @Config.Comment({
        "The number of hammer hits required to complete a craft.",
        "Range: [1, +int]",
        "Default: " + 1
    })
    public int HITS_PER_CRAFT = 2;

    @Config.Comment({
        "The amount of damage applied to the tool per craft.",
        "Range: [0, +int]",
        "Default: " + 1
    })
    public int TOOL_DAMAGE_PER_CRAFT = 1;

    @Config.Comment({
        "The maximum stack size for each slot in the crafting grid.",
        "Range: [1, 64]",
        "Default: " + 1
    })
    public int GRID_MAX_STACK_SIZE = 32;

    @Config.Comment({
        "The maximum stack size for each slot in the shelf.",
        "Range: [1, 64]",
        "Default: " + 64
    })
    public int SHELF_MAX_STACK_SIZE = 64;

    @Config.Comment({
        "If true, the worktable has durability and will break after the configured",
        "number of crafts completed.",
        "Default: " + false
    })
    public boolean USES_DURABILITY = false;

    @Config.Comment({
        "The number of crafts that the worktable can perform before it breaks.",
        "This is only relevant if the `USES_DURABILITY` flag is true.",
        "Range: [1, +int]",
        "Default: " + (64 * 8)
    })
    public int DURABILITY = 64 * 8;

    @Config.Comment({
        "How much exhaustion to apply per hit.",
        "Range: [0, 40]",
        "Default: " + 0.5
    })
    public double EXHAUSTION_COST_PER_HIT = 0.5;

    @Config.Comment({
        "How much exhaustion to apply per completed craft.",
        "Range: [0, 40]",
        "Default: " + 0
    })
    public double EXHAUSTION_COST_PER_CRAFT_COMPLETE = 0;

    @Config.Comment({
        "Minimum amount of hunger the player needs to use.",
        "Range: [0, 20]",
        "Default: 3"
    })
    public int MINIMUM_HUNGER_TO_USE = 3;
  }

  // ---------------------------------------------------------------------------
  // - Compacting Bin
  // ---------------------------------------------------------------------------

  public static CompactingBin COMPACTING_BIN = new CompactingBin();

  public static class CompactingBin {

    @Config.Comment({
        "Any item with a tool class of shovel is automatically valid.",
        "Use this to add items that you want to be valid that don't have the",
        "shovel tool class. Items you add are assumed to have durability.",
        "",
        "The whitelist takes priority over the blacklist.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] SHOVEL_WHITELIST = new String[0];

    @Config.Comment({
        "Any item with a tool class of shovel is automatically valid.",
        "Use this to remove items that you don't want to be valid.",
        "",
        "The whitelist takes priority over the blacklist.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] SHOVEL_BLACKLIST = new String[0];

    @Config.Comment({
        "The number of output items the compacting bin can hold.",
        "Range: [1, +int)",
        "Default: 4"
    })
    public int MAX_CAPACITY = 4;

    @Config.Comment({
        "The item displayed to represent each harvest level in JEI.",
        "The index into the array is the harvest level, the value at that index",
        "is the displayed item. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] JEI_HARVEST_LEVEL_ITEM = new String[]{
        "pyrotech:crude_shovel",
        "minecraft:stone_shovel",
        "minecraft:iron_shovel",
        "minecraft:diamond_shovel"
    };

    @Config.Comment({
        "The number of uses required per harvest level of the tool used.",
        "The index into the array is the harvest level, the value at that index",
        "is the required number of uses. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "ie. {wood, stone, iron, diamond}",
        "Valid values are in the range: [1,+int]",
        "Default: {4, 3, 2, 1}"
    })
    public int[] TOOL_USES_REQUIRED_PER_HARVEST_LEVEL = new int[]{4, 3, 2, 1};

    @Config.Comment({
        "The amount of damage applied to the tool when a craft completes.",
        "Default: " + 1
    })
    public int TOOL_DAMAGE_PER_CRAFT = 1;

    @Config.Comment({
        "How much exhaustion to apply per hit.",
        "Range: [0, 40]",
        "Default: " + 1
    })
    public double EXHAUSTION_COST_PER_HIT = 1;

    @Config.Comment({
        "How much exhaustion to apply per completed craft.",
        "Range: [0, 40]",
        "Default: " + 0
    })
    public double EXHAUSTION_COST_PER_CRAFT_COMPLETE = 0;

    @Config.Comment({
        "Minimum amount of hunger the player needs to use.",
        "Range: [0, 20]",
        "Default: 3"
    })
    public int MINIMUM_HUNGER_TO_USE = 3;
  }

  // ---------------------------------------------------------------------------
  // - Soaking Pot
  // ---------------------------------------------------------------------------

  public static SoakingPot SOAKING_POT = new SoakingPot();

  public static class SoakingPot {

    @Config.Comment({
        "The maximum stack size that can be placed in the pot.",
        "Range: [1, 64]",
        "Default: " + 4
    })
    public int MAX_STACK_SIZE = 4;

    @Config.Comment({
        "The maximum fluid capacity in millibuckets.",
        "Range: [1, +int]",
        "Default: " + 4000
    })
    public int MAX_FLUID_CAPACITY = 4000;
  }

  // ---------------------------------------------------------------------------
  // - Anvil Common
  // ---------------------------------------------------------------------------

  public static AnvilCommon ANVIL_COMMON = new AnvilCommon();

  public static class AnvilCommon {

    @Config.Comment({
        "These values are used to reduce the number of hits required to complete",
        "a recipe.",
        "",
        "The index into the array is the harvest level, the value at that index",
        "is the hit reduction. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "ie. {wood, stone, iron, diamond}",
        "Default: {0, 1, 2, 3}"
    })
    public int[] HIT_REDUCTION_PER_HAMMER_HARVEST_LEVEL = {0, 1, 2, 3};

    /**
     * Returns the hammer hit reduction for the given hammer resource location,
     * or -1 if the given hammer isn't in the list.
     *
     * @param resourceLocation the hammer
     * @return the hammer hit reduction
     */
    public int getHammerHitReduction(ResourceLocation resourceLocation) {

      int hammerHarvestLevel = ModuleCoreConfig.HAMMERS.getHammerHarvestLevel(resourceLocation);

      if (hammerHarvestLevel > -1) {
        return ArrayHelper.getOrLast(this.HIT_REDUCTION_PER_HAMMER_HARVEST_LEVEL, hammerHarvestLevel);
      }

      return -1;
    }

    @Config.Comment({
        "Use this to add items that you want to be valid for pickaxe recipes.",
        "Items you add are assumed to have durability.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] PICKAXE_WHITELIST = new String[0];

    @Config.Comment({
        "Use this to add items that you want to be invalid for pickaxe recipes.",
        "Items you add are assumed to have durability.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] PICKAXE_BLACKLIST = new String[0];

    @Config.Comment({
        "The pickaxe displayed to represent each harvest level in JEI.",
        "The index into the array is the harvest level, the value at that index",
        "is the displayed item. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] JEI_HARVEST_LEVEL_PICKAXE = new String[]{
        "pyrotech:crude_pickaxe",
        "minecraft:stone_pickaxe",
        "minecraft:iron_pickaxe",
        "minecraft:diamond_pickaxe"
    };
  }

  // ---------------------------------------------------------------------------
  // - Granite Anvil
  // ---------------------------------------------------------------------------

  public static GraniteAnvil GRANITE_ANVIL = new GraniteAnvil();

  public static class GraniteAnvil {

    @Config.Comment({
        "The number of times the block can be hit before applying damage",
        "to the block. The block has a total of four damage stages. This number",
        "represents the number of hits for just one damage stage.",
        "Range: [1, +int]",
        "Default: " + 64
    })
    public int HITS_PER_DAMAGE = 64;

    @Config.Comment({
        "The amount of hits to apply to the anvil damage when hitting a bloom.",
        "Default: " + 4
    })
    @Config.RangeInt(min = 0)
    public int BLOOM_DAMAGE_PER_HIT = 4;

    @Config.Comment({
        "How much exhaustion to apply per hit.",
        "Range: [0, 40]",
        "Default: " + 0.5
    })
    public double EXHAUSTION_COST_PER_HIT = 0.5;

    @Config.Comment({
        "How much exhaustion to apply per completed craft.",
        "Range: [0, 40]",
        "Default: " + 0
    })
    public double EXHAUSTION_COST_PER_CRAFT_COMPLETE = 0;

    @Config.Comment({
        "Minimum amount of hunger the player needs to use.",
        "Range: [0, 20]",
        "Default: 3"
    })
    public int MINIMUM_HUNGER_TO_USE = 3;
  }

  // ---------------------------------------------------------------------------
  // - Iron Plated Anvil
  // ---------------------------------------------------------------------------

  public static IronPlatedAnvil IRON_PLATED_ANVIL = new IronPlatedAnvil();

  public static class IronPlatedAnvil {

    @Config.Comment({
        "The number of times the block can be hit before applying damage",
        "to the block. The block has a total of four damage stages. This number",
        "represents the number of hits for just one damage stage.",
        "Range: [1, +int]",
        "Default: " + 256
    })
    public int HITS_PER_DAMAGE = 256;

    @Config.Comment({
        "The amount of hits to apply to the anvil damage when hitting a bloom.",
        "Default: " + 2
    })
    @Config.RangeInt(min = 0)
    public int BLOOM_DAMAGE_PER_HIT = 2;

    @Config.Comment({
        "How much exhaustion to apply per hit.",
        "Range: [0, 40]",
        "Default: " + 0.5
    })
    public double EXHAUSTION_COST_PER_HIT = 0.5;

    @Config.Comment({
        "How much exhaustion to apply per completed craft.",
        "Range: [0, 40]",
        "Default: " + 0
    })
    public double EXHAUSTION_COST_PER_CRAFT_COMPLETE = 0;

    @Config.Comment({
        "Minimum amount of hunger the player needs to use.",
        "Range: [0, 20]",
        "Default: 3"
    })
    public int MINIMUM_HUNGER_TO_USE = 3;
  }

  // ---------------------------------------------------------------------------
  // - Chopping Block
  // ---------------------------------------------------------------------------

  public static ChoppingBlock CHOPPING_BLOCK = new ChoppingBlock();

  public static class ChoppingBlock {

    @Config.Comment({
        "Any item with a tool class of axe is automatically valid.",
        "Use this to add items that you want to be valid that don't have the",
        "axe tool class. Items you add are assumed to have durability.",
        "",
        "The whitelist takes priority over the blacklist.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] AXE_WHITELIST = new String[0];

    @Config.Comment({
        "Any item with a tool class of axe is automatically valid.",
        "Use this to remove items that you don't want to be valid.",
        "",
        "The whitelist takes priority over the blacklist.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] AXE_BLACKLIST = new String[0];

    @Config.Comment({
        "The number of chops required per harvest level of the axe used.",
        "The index into the array is the harvest level, the value at that index",
        "is the required number of chops. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "ie. {wood, stone, iron, diamond}",
        "Valid values are in the range: [1,+int]",
        "Default: {6, 4, 2, 2}"
    })
    public int[] CHOPS_REQUIRED_PER_HARVEST_LEVEL = new int[]{6, 4, 2, 2};

    @Config.Comment({
        "The recipe result quantity given per harvest level of the axe used.",
        "The index into the array is the harvest level, the value at that index",
        "is the recipe result quantity. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "ie. {wood, stone, iron, diamond}",
        "Valid values are in the range: [0,+int]",
        "Default: {1, 2, 3, 4}"
    })
    public int[] RECIPE_RESULT_QUANTITY_PER_HARVEST_LEVEL = new int[]{1, 2, 3, 4};

    @Config.Comment({
        "The item displayed to represent each harvest level in JEI.",
        "The index into the array is the harvest level, the value at that index",
        "is the displayed item. The array can be expanded as needed.",
        "If the harvest level of the tool used exceeds the array length, the",
        "last element in the array is used.",
        "",
        "String format is a resource location: (domain):(path)"
    })
    public String[] JEI_HARVEST_LEVEL_ITEM = new String[]{
        "pyrotech:crude_axe",
        "minecraft:stone_axe",
        "minecraft:iron_axe",
        "minecraft:diamond_axe"
    };

    @Config.Comment({
        "The chance that a chop will spawn wood chips nearby.",
        "Range: [0, 1]",
        "Default: " + 0.05
    })
    public double WOOD_CHIPS_CHANCE = 0.05;

    @Config.Comment({
        "The number of times the block can be chopped on before applying damage",
        "to the block. The block has a total of six damage stages. This number",
        "represents the number of chops for just one damage stage.",
        "Range: [1, +int]",
        "Default: " + 16
    })
    public int CHOPS_PER_DAMAGE = 16;

    @Config.Comment({
        "How much exhaustion to apply per axe chop.",
        "Range: [0, 40]",
        "Default: " + 1.5
    })
    public double EXHAUSTION_COST_PER_AXE_CHOP = 1.5;

    @Config.Comment({
        "How much exhaustion to apply per shovel scoop.",
        "Range: [0, 40]",
        "Default: " + 0.5
    })
    public double EXHAUSTION_COST_PER_SHOVEL_SCOOP = 0.5;

    @Config.Comment({
        "How much exhaustion to apply per completed craft.",
        "Range: [0, 40]",
        "Default: " + 0
    })
    public double EXHAUSTION_COST_PER_CRAFT_COMPLETE = 0;

    @Config.Comment({
        "Minimum amount of hunger the player needs to use.",
        "Range: [0, 20]",
        "Default: 3"
    })
    public int MINIMUM_HUNGER_TO_USE = 3;
  }

  // ---------------------------------------------------------------------------
  // - Crude Drying Rack
  // ---------------------------------------------------------------------------

  public static CrudeDryingRack CRUDE_DRYING_RACK = new CrudeDryingRack();

  public static class CrudeDryingRack {

    @Config.Comment({
        "speed = speed * SPEED_MODIFIER",
        "Default: " + 0.65
    })
    public double SPEED_MODIFIER = 0.65;
  }

  // ---------------------------------------------------------------------------
  // - Drying Rack
  // ---------------------------------------------------------------------------

  public static DryingRack DRYING_RACK = new DryingRack();

  public static class DryingRack {

    @Config.Comment({
        "speed = speed * SPEED_MODIFIER",
        "Default: " + 1.0
    })
    public double SPEED_MODIFIER = 1.0;
  }

  // ---------------------------------------------------------------------------
  // - Pit Kiln
  // ---------------------------------------------------------------------------

  public static PitKiln PIT_KILN = new PitKiln();

  public static class PitKiln {

    @Config.Comment({
        "Reduce the duration of all recipes by this amount for each adjacent refractory block.",
        "Range: [0, 0.2]",
        "Default: " + 0.1
    })
    public double REFRACTORY_BLOCK_TIME_BONUS = 0.1;

  }

  // ---------------------------------------------------------------------------
  // - Campfire
  // ---------------------------------------------------------------------------

  public static Campfire CAMPFIRE = new Campfire();

  public static class Campfire {

    @Config.Comment({
        "How many ticks to cook food on the campfire.",
        "Default: " + (90 * 20)
    })
    public int COOK_TIME_TICKS = 90 * 20;

    @Config.Comment({
        "The amount of ticks of burn time added to the campfire",
        "for each log consumed.",
        "Default: " + (60 * 2 * 20)
    })
    public int BURN_TIME_TICKS_PER_LOG = 60 * 2 * 20;

    @Config.Comment({
        "How many ticks does it take before the output food becomes burned food.",
        "Default: " + (30 * 20)
    })
    public int BURNED_FOOD_TICKS = 30 * 20;

    @Config.Comment({
        "Set to true if the campfire should be extinguished by rain.",
        "Default: true"
    })
    public boolean EXTINGUISHED_BY_RAIN = true;

    @Config.Comment({
        "The number of ticks that the campfire can be exposed to rain before",
        "it is extinguished.",
        "Default: " + (10 * 20)
    })
    public int TICKS_BEFORE_EXTINGUISHED = 10 * 20;

    @Config.Comment({
        "The chance that the campfire will produce ash when a fuel is consumed.",
        "Range: [0, 1]",
        "Default: " + 0.25
    })
    public double ASH_CHANCE = 0.25;

    @Config.Comment({
        "The chance that the player will be damaged with fire when picking",
        "up a log while the campfire is lit.",
        "Default: " + 0.5
    })
    public double PLAYER_BURN_CHANCE = 0.5;

    @Config.Comment({
        "The amount of damage done to a player when picking up a log while the",
        "campfire is lit.",
        "Default: " + 1.0
    })
    public double PLAYER_LOG_BURN_DAMAGE = 1.0;

    @Config.Comment({
        "The amount of damage done to an entity when walking on top of a lit campfire.",
        "Set to -1 to disable.",
        "Default: " + 1.0
    })
    public double ENTITY_WALK_BURN_DAMAGE = 1.0;
  }

}