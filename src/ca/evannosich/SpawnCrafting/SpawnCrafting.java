package ca.evannosich.SpawnCrafting;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.BlockState;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.inventory.meta.*;
import org.bukkit.plugin.java.JavaPlugin;

import javax.xml.stream.events.Namespace;

public class SpawnCrafting extends JavaPlugin {

    @Override
    public void onEnable() {
        // Passive Mobs

            // Pig

            ItemStack pigSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta pigSpawnerMeta = pigSpawnerItem.getItemMeta();
            pigSpawnerMeta.setDisplayName("Pig Spawner");
            BlockStateMeta pigSpawnerBSM = (BlockStateMeta) pigSpawnerMeta;
            BlockState pigSpawnerBS = pigSpawnerBSM.getBlockState();
            pigSpawnerBSM.setBlockState(pigSpawnerBS);
            CreatureSpawner pigSpawnerCS = (CreatureSpawner) pigSpawnerBS;
            pigSpawnerCS.setSpawnedType(EntityType.PIG);
            pigSpawnerBSM.setBlockState(pigSpawnerCS);
            pigSpawnerItem.setItemMeta(pigSpawnerMeta);
            NamespacedKey pigSpawnerKey = new NamespacedKey(this, "PIGSPAWNER");
            ShapedRecipe pigSpawnerRecipe = new ShapedRecipe(pigSpawnerKey, pigSpawnerItem);
            pigSpawnerRecipe.shape("@#@", "#&#", "@#@");
            pigSpawnerRecipe.setIngredient('@', Material.GHAST_TEAR);
            pigSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            pigSpawnerRecipe.setIngredient('&', Material.PORKCHOP);
            
            // Cow

            ItemStack cowSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta cowSpawnerMeta = cowSpawnerItem.getItemMeta();
            cowSpawnerMeta.setDisplayName("Cow Spawner");
            BlockStateMeta cowSpawnerBSM = (BlockStateMeta) cowSpawnerMeta;
            BlockState cowSpawnerBS = cowSpawnerBSM.getBlockState();
            cowSpawnerBSM.setBlockState(cowSpawnerBS);
            CreatureSpawner cowSpawnerCS = (CreatureSpawner) cowSpawnerBS;
            cowSpawnerCS.setSpawnedType(EntityType.COW);
            cowSpawnerBSM.setBlockState(cowSpawnerCS);
            cowSpawnerItem.setItemMeta(cowSpawnerMeta);
            NamespacedKey cowSpawnerKey = new NamespacedKey(this, "COWSPAWNER");
            ShapedRecipe cowSpawnerRecipe = new ShapedRecipe(cowSpawnerKey, cowSpawnerItem);
            cowSpawnerRecipe.shape("@#@", "#&#", "@#@");
            cowSpawnerRecipe.setIngredient('@', Material.GHAST_TEAR);
            cowSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            cowSpawnerRecipe.setIngredient('&', Material.BEEF);





        // Add Recipes

        Bukkit.addRecipe(pigSpawnerRecipe);
        Bukkit.addRecipe(cowSpawnerRecipe);

    }

    @Override
    public void onDisable() {

    }
}
