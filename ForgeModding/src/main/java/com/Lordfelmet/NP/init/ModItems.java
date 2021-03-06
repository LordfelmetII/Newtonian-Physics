package com.Lordfelmet.NP.init;

import com.Lordfelmet.NP.item.ItemMechanicalPencil;
import com.Lordfelmet.NP.item.ItemNP;
import com.Lordfelmet.NP.reference.Names;
import com.Lordfelmet.NP.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemNP mechanicalPencil = new ItemMechanicalPencil();

    public static void init()
    {
        GameRegistry.registerItem(mechanicalPencil, Names.Items.MECH_PENCIL);
    }
}
