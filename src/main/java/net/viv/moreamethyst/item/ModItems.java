package net.viv.moreamethyst.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.viv.moreamethyst.MoreAmethyst;

import static net.minecraft.world.item.Items.registerItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreAmethyst.MOD_ID);

    // Registers all shards

    private static DeferredItem<Item> registerAmethystShard(String colour) {
        return ITEMS.register("amethyst_shard_" + colour,
                () -> new Item((new Item.Properties())));
    }
    public static final DeferredItem<Item> AMETHYST_SHARD_RED = registerAmethystShard("red");
    public static final DeferredItem<Item> AMETHYST_SHARD_ORANGE = registerAmethystShard("orange");
    public static final DeferredItem<Item> AMETHYST_SHARD_YELLOW = registerAmethystShard("yellow");
    public static final DeferredItem<Item> AMETHYST_SHARD_LIME = registerAmethystShard("lime");
    public static final DeferredItem<Item> AMETHYST_SHARD_GREEN = registerAmethystShard("green");
    public static final DeferredItem<Item> AMETHYST_SHARD_CYAN = registerAmethystShard("cyan");
    public static final DeferredItem<Item> AMETHYST_SHARD_LIGHT_BLUE = registerAmethystShard("light_blue");
    public static final DeferredItem<Item> AMETHYST_SHARD_BLUE = registerAmethystShard("blue");
    public static final DeferredItem<Item> AMETHYST_SHARD_MAGENTA = registerAmethystShard("magenta");
    public static final DeferredItem<Item> AMETHYST_SHARD_PINK = registerAmethystShard("pink");
    public static final DeferredItem<Item> AMETHYST_SHARD_WHITE = registerAmethystShard("white");
    public static final DeferredItem<Item> AMETHYST_SHARD_LIGHT_GRAY = registerAmethystShard("light_gray");
    public static final DeferredItem<Item> AMETHYST_SHARD_GRAY = registerAmethystShard("gray");
    public static final DeferredItem<Item> AMETHYST_SHARD_BLACK = registerAmethystShard("black");
    public static final DeferredItem<Item> AMETHYST_SHARD_BROWN = registerAmethystShard("brown");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}