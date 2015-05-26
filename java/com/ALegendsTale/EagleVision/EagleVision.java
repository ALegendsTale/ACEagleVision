package com.ALegendsTale.EagleVision;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
//import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_Name, version = Reference.VERSION, canBeDeactivated = true)
public class EagleVision {
	
//	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
//	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit (FMLPreInitializationEvent event){
		FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		KeyBind.init();
	}
	
	@EventHandler
	public void Init (FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public void postInit (FMLPostInitializationEvent event){
		
	}
}
