package com.allyoperator.beyondplanets.proxy;

public class CommonProxy {
    
	// uncomment this if you have ore generation
	// private static WorldGenerator worldGen = new WorldGenerator();
    
    public void preInit(FMLPreInitializationEvent event) {
		// if you've got any Ore Generation uncomment the following line
		// and import the "oregen.WorldGenerator" class
		// GameRegistry.registerWorldGenerator(new WorldGenerator(), 100);
    }
    
	public void init(FMLInitializationEvent event) {s
		// if you have any ore generation, you want to do something like the following for all
		// of your ores:
		// worldGen.addBlock( block, minHeight, maxHeight, dimension, spawn-size );
		// 'dimension'should be one of:
		// WorldGenerator.DIMENSION_OVERWORLD
		// WorldGenerator.DIMENSION_NETHER
		// WorldGenerator.DIMENSION_END
		//   or
		// WorldGenerator.DIMENSION_ANY_OVERWORLD
		// -- the first three are specific to the named dimensions - the last will
		// spawn in any "Overworld" type dimension.
		
		
    }
    
	public void postInit(final FMLPostInitializationEvent event) {
		//
	}
	
	public World getWorld() {
		return null;
	}
}
