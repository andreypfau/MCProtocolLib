package com.github.steveice10.mc.protocol.packet.ingame.clientbound;

import com.github.steveice10.mc.protocol.data.game.entity.metadata.ItemStack;
import com.github.steveice10.mc.protocol.data.game.recipe.CraftingBookCategory;
import com.github.steveice10.mc.protocol.data.game.recipe.Ingredient;
import com.github.steveice10.mc.protocol.data.game.recipe.Recipe;
import com.github.steveice10.mc.protocol.data.game.recipe.RecipeType;
import com.github.steveice10.mc.protocol.data.game.recipe.data.CookedRecipeData;
import com.github.steveice10.mc.protocol.data.game.recipe.data.ShapedRecipeData;
import com.github.steveice10.mc.protocol.data.game.recipe.data.ShapelessRecipeData;
import com.github.steveice10.mc.protocol.data.game.recipe.data.SmithingTransformRecipeData;
import com.github.steveice10.mc.protocol.data.game.recipe.data.StoneCuttingRecipeData;
import com.github.steveice10.mc.protocol.packet.PacketTest;
import org.junit.Before;

public class ServerDeclareRecipesTest extends PacketTest {
    @Before
    public void setup() {
        this.setPackets(
                new ClientboundUpdateRecipesPacket(
                        new Recipe[]{
                                new Recipe(
                                        RecipeType.CRAFTING_SHAPELESS,
                                        "minecraft:Recipe1",
                                        new ShapelessRecipeData(
                                                "Group1",
                                                CraftingBookCategory.MISC,
                                                new Ingredient[]{
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(0)
                                                        })
                                                },
                                                new ItemStack(10)
                                        )
                                ),
                                new Recipe(
                                        RecipeType.CRAFTING_SHAPED,
                                        "minecraft:Recipe2",
                                        new ShapedRecipeData(
                                                2,
                                                3,
                                                "Group2",
                                                CraftingBookCategory.BUILDING,
                                                new Ingredient[]{
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(1)
                                                        }),
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(2)
                                                        }),
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(3)
                                                        }),
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(4)
                                                        }),
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(5)
                                                        }),
                                                        new Ingredient(new ItemStack[]{
                                                                new ItemStack(6)
                                                        })
                                                },
                                                new ItemStack(20),
                                                true
                                        )
                                ),
                                new Recipe(
                                        RecipeType.SMELTING,
                                        "minecraft:Recipe3",
                                        new CookedRecipeData(
                                                "Group3",
                                                CraftingBookCategory.EQUIPMENT,
                                                new Ingredient(new ItemStack[]{
                                                        new ItemStack(7)
                                                }),
                                                new ItemStack(30),
                                                10.5f,
                                                10
                                        )
                                ),
                                new Recipe(
                                        RecipeType.STONECUTTING,
                                        "minecraft:Recipe4",
                                        new StoneCuttingRecipeData(
                                                "Group4",
                                                new Ingredient(new ItemStack[]{
                                                        new ItemStack(8),
                                                        new ItemStack(9)
                                                }),
                                                new ItemStack(40)
                                        )
                                ),
                                new Recipe(
                                        RecipeType.SMITHING_TRANSFORM,
                                        "minecraft:Recipe5",
                                        new SmithingTransformRecipeData(
                                                new Ingredient(new ItemStack[]{
                                                        new ItemStack(10)
                                                }),
                                                new Ingredient(new ItemStack[]{
                                                        new ItemStack(11)
                                                }),
                                                new Ingredient(new ItemStack[]{
                                                        new ItemStack(12)
                                                }),
                                                new ItemStack(13)
                                        )
                                )
                        }
                )
        );
    }
}
