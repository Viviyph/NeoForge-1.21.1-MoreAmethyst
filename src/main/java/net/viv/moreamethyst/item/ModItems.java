package net.viv.moreamethyst.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.viv.moreamethyst.MoreAmethyst;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreAmethyst.MOD_ID);

    public static final DeferredItem<Item> AMETHYST_SHARD_RED = ITEMS.register("amethyst_shard_red", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}