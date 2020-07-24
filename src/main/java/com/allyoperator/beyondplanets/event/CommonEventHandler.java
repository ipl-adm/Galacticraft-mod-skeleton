package com.allyoperator.beyondplanets.event;

@EventBusSubscriber(value = {Side.CLIENT, Side.SERVER}, modid = Reference.MOD_ID)
public final class CommonEventHandler {
    
    // This is where we will store the methods that will register our blocks for us
    // since this is a final class we create whats called a private empty "constructor"
    // this was we don't accidently create an instance of this class. We only want to call
    // the methods inside of it
    
    private CommonEventHandler() {}
    
    
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
       // event.getRegistry().register();
        
    }
    
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        // event.getRegistry().register();
    }
    
	/**
	 *
	 * @param block The Block.
	 * @param name The Name.
	 * @return The Block
	 */
	private static Block setupBlock(final Block block, final String name) {
		block.setRegistryName(name);
		block.setUnlocalizedName(ExampleMod.MODID + "." + name);

		return block;
	}

	/**
	 *
	 * @param block The Block.
	 * @return The ItemBlock.
	 */
	private static ItemBlock setupItemBlock(final Block block) {
		final ItemBlock itemBlock = new ItemBlock(block);
		final ResourceLocation name = block.getRegistryName();
		itemBlock.setRegistryName(name);

		return itemBlock;
	}

	/**
	 *
	 * @param item The Item.
	 * @param name The Name.
	 * @return The Item.
	 */
	private static Item setupItem(final Item item, final String name) {
		item.setRegistryName(name);
		item.setUnlocalizedName(ExampleMod.MODID + "." + name);

		return item;
	}
}
