package com.allyoperator.beyondplanets.event;


@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Reference.MOD_ID)
public final class ClientEventHandler {
    
    private ClientEventHandler() {}
    
	/**
	 *
	 * @param event The Event.
	 */
	@SubscribeEvent
	public static void registerModels(final ModelRegistryEvent event) {
	    
	    // TODO
		registerModel(Item.getItemFromBlock(ExampleModBlocks.EXAMPLE_BLOCK));
		registerFluidRender(ExampleModBlocks.EXAMPLE_FLUID, ExampleModFluids.EXAMPLE_FLUID);
		registerModel(ExampleModItems.EXAMPLE_ITEM);
	}

	/**
	 *
	 * @param item The Item.
	 */
	private static void registerModel(final Item item) {
		ModelLoader.setCustomModelResourceLocation(item,
				0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}