package net.viv.moreamethyst.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeItemTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreAmethyst.MOD_ID);

    public static final Supplier<CreativeModeTab> MORE_AMETHYST_ITEMS_TAB = CREATIVE_MODE_TAB.register("more_amethyst_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST_SHARD_RED.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "more_amethyst_blocks_tab"))
                    .title(Component.translatable("creativetab.moreamethyst.moreamethyst_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.AMETHYST_SHARD_RED);

                    }).build());

    public static final Supplier<CreativeModeTab> MORE_AMETHYST_BLOCKS_TAB = CREATIVE_MODE_TAB.register("more_amethyst_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AMETHYST_BLOCK_RED.get()))
                    .title(Component.translatable("creativetab.moreamethyst.moreamethyst_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.AMETHYST_BLOCK_RED);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
