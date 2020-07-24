package com.allyoperator.beyondplanets;

import com.allyoperator.beyondplanets.proxy.CommonProxy;
import com.allyoperator.beyondplanets.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = Reference.DEPS, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class BeyondPlanets {


	@Mod.Instance(Reference.MOD_ID)
	public static BeyondPlanets instance;

	@SidedProxy(clientSide = Reference.CPROXY, serverSide = Reference.SPROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

		
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {


		proxy.init(event);
	}

	@Mod.EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		
		
		proxy.postInit(event);
	}

}
