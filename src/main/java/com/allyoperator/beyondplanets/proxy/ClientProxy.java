package com.allyoperator.beyondplanets.proxy;

public class ClientProxy extends CommonProxy {
    
	@Override
	public void preInit(final FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	@Override
	public void init(final FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(final FMLPostInitializationEvent event) {
		super.postInit(event);
	}

	public World getWorld() {
		return Minecraft.getMinecraft().world;
	}
    
}
