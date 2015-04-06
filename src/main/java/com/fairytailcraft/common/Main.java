package com.fairytailcraft.common;

import com.fairytailcraft.helpers.References;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)
public class Main
{    
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent)
	{		
	}
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}