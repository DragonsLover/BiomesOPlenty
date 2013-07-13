package biomesoplenty.worldgen;

import java.util.Random;

import biomesoplenty.api.Blocks;
import biomesoplenty.configuration.BOPBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRealRedwood2 extends WorldGenerator
{
    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        while (var1.isAirBlock(var3 + 5, var4, var5 + 5) && var4 > 2)
        {
            --var4;
        }

        int var6 = var1.getBlockId(var3 + 5, var4, var5 + 5);

        if (var6 != Block.grass.blockID)
        {
            return false;
        }
        else
        {
            for (int var7 = -2; var7 <= 2; ++var7)
            {
                for (int var8 = -2; var8 <= 2; ++var8)
                {
                    if (var1.isAirBlock(var3 + var7 + 5, var4 - 1, var5 + var8 + 5) && var1.isAirBlock(var3 + var7 + 5, var4 - 2, var5 + var8 + 5))
                    {
                        return false;
                    }
                }
            }

			var1.setBlock(var3 + 0, var4 + 5, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 0, var4 + 5, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 0, var4 + 6, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 6, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 6, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 6, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 7, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 7, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 8, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 8, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 9, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 1, var4 + 10, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 4, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 5, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 5, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 6, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 7, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 8, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 8, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 10, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 11, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 12, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 12, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 2, var4 + 14, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 4, var5 + 1, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 4, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 6, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 7, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 7, var5 + 9, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 8, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 10, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 10, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 11, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 11, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 12, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 13, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 14, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 3, var4 + 15, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 0, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 4, var4 + 3, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 4, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 4, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 5, var5 + 0, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 5, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 6, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 7, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 8, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 8, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 9, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 10, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 11, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 11, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 12, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 12, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 12, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 13, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 13, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 14, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 15, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 16, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 17, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 4, var4 + 18, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 0, var5 + 4, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 0, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 0, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 1, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 1, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 2, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 2, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 3, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 3, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 3, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 4, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 4, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 4, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 4, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 4, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 0, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 1, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 9, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 5, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 6, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 6, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 6, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 6, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 6, var5 + 11, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 7, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 7, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 7, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 7, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 7, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 8, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 8, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 8, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 9, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 9, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 10, var5 + 9, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 11, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 11, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 11, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 11, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 12, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 12, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 12, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 13, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 13, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 14, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 14, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 15, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 15, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 15, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 15, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 16, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 16, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 17, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 17, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 5, var4 + 17, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 18, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 5, var4 + 18, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 0, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 0, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 0, var5 + 7, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 1, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 1, var5 + 6, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 2, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 3, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 4, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 4, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 4, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 5, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 6, var5 + 1, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 6, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 6, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 6, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 6, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 6, var5 + 11, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 7, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 7, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 7, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 7, var5 + 9, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 7, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 8, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 9, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 9, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 10, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 10, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 11, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 6, var4 + 11, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 13, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 13, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 15, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 16, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 16, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 16, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 17, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 18, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 6, var4 + 19, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 0, var5 + 5, Blocks.logs3.get().blockID, 0, 2);
			var1.setBlock(var3 + 7, var4 + 3, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 3, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 4, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 5, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 5, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 5, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 6, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 6, var5 + 9, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 7, var5 + 2, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 7, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 7, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 7, var5 + 11, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 8, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 9, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 9, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 11, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 11, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 14, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 15, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 15, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 7, var4 + 17, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 3, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 4, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 5, var5 + 3, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 6, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 6, var5 + 9, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 6, var5 + 10, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 8, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 9, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 10, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 10, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 12, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 12, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 8, var4 + 13, var5 + 5, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 9, var4 + 5, var5 + 7, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 9, var4 + 6, var5 + 4, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 9, var4 + 6, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 9, var4 + 6, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 9, var4 + 7, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 9, var4 + 8, var5 + 6, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 10, var4 + 6, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
			var1.setBlock(var3 + 10, var4 + 7, var5 + 8, Blocks.leavesColorized.get().blockID, 3, 2);
            return true;
        }
    }
}