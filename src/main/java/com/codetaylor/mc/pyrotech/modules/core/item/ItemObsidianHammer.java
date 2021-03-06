package com.codetaylor.mc.pyrotech.modules.core.item;

import com.codetaylor.mc.athenaeum.reference.ModuleMaterials;
import com.codetaylor.mc.pyrotech.modules.core.ModuleCoreConfig;
import com.codetaylor.mc.pyrotech.modules.core.item.spi.ItemHammerBase;

import java.util.Collections;

public class ItemObsidianHammer
    extends ItemHammerBase {

  public static final String NAME = "obsidian_hammer";

  public ItemObsidianHammer() {

    super(ModuleMaterials.OBSIDIAN, Collections.emptySet());
    this.setMaxDamage(ModuleCoreConfig.HAMMERS.OBSIDIAN_HAMMER_DURABILITY);
  }
}
