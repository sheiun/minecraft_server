package net.minecraft.server;

public class BlockHardenedClay extends Block {

    public BlockHardenedClay() {
        super(Material.STONE);
        this.a(CreativeModeTab.b);
    }

    public MaterialMapColor c(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return MaterialMapColor.r;
    }
}
