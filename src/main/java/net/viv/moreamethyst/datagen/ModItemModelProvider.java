package net.viv.moreamethyst.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreAmethyst.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.AMETHYST_SHARD_RED.get());
        basicItem(ModItems.AMETHYST_SHARD_ORANGE.get());
        basicItem(ModItems.AMETHYST_SHARD_YELLOW.get());
        basicItem(ModItems.AMETHYST_SHARD_LIME.get());
        basicItem(ModItems.AMETHYST_SHARD_GREEN.get());
        basicItem(ModItems.AMETHYST_SHARD_CYAN.get());
        basicItem(ModItems.AMETHYST_SHARD_LIGHT_BLUE.get());
        basicItem(ModItems.AMETHYST_SHARD_BLUE.get());
        basicItem(ModItems.AMETHYST_SHARD_MAGENTA.get());
        basicItem(ModItems.AMETHYST_SHARD_PINK.get());
        basicItem(ModItems.AMETHYST_SHARD_WHITE.get());
        basicItem(ModItems.AMETHYST_SHARD_LIGHT_GRAY.get());
        basicItem(ModItems.AMETHYST_SHARD_GRAY.get());
        basicItem(ModItems.AMETHYST_SHARD_BLACK.get());
        basicItem(ModItems.AMETHYST_SHARD_BROWN.get());

    }
}
