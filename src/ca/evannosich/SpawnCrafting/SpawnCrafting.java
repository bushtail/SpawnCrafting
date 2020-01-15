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
			pigSpawnerRecipe.setIngredient('@', Material.END_ROD);
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
			cowSpawnerRecipe.setIngredient('@', Material.END_ROD);
			cowSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
			cowSpawnerRecipe.setIngredient('&', Material.BEEF);

			// Chicken

			ItemStack chickenSpawnerItem = new ItemStack(Material.SPAWNER);
			ItemMeta chickenSpawnerMeta = chickenSpawnerItem.getItemMeta();
			chickenSpawnerMeta.setDisplayName("Chicken Spawner");
			BlockStateMeta chickenSpawnerBSM = (BlockStateMeta) chickenSpawnerMeta;
			BlockState chickenSpawnerBS = chickenSpawnerBSM.getBlockState();
			chickenSpawnerBSM.setBlockState(chickenSpawnerBS);
			CreatureSpawner chickenSpawnerCS = (CreatureSpawner) chickenSpawnerBS;
			chickenSpawnerCS.setSpawnedType(EntityType.CHICKEN);
			chickenSpawnerBSM.setBlockState(chickenSpawnerCS);
			chickenSpawnerItem.setItemMeta(chickenSpawnerMeta);
			NamespacedKey chickenSpawnerKey = new NamespacedKey(this, "CHICKENSPAWNER");
			ShapedRecipe chickenSpawnerRecipe = new ShapedRecipe(chickenSpawnerKey, chickenSpawnerItem);
			chickenSpawnerRecipe.shape("@#@", "#&#", "@#@");
			chickenSpawnerRecipe.setIngredient('@', Material.END_ROD);
			chickenSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
			chickenSpawnerRecipe.setIngredient('&', Material.CHICKEN);

			// Sheep

			ItemStack sheepSpawnerItem = new ItemStack(Material.SPAWNER);
			ItemMeta sheepSpawnerMeta = sheepSpawnerItem.getItemMeta();
			sheepSpawnerMeta.setDisplayName("Sheep Spawner");
			BlockStateMeta sheepSpawnerBSM = (BlockStateMeta) sheepSpawnerMeta;
			BlockState sheepSpawnerBS = sheepSpawnerBSM.getBlockState();
			sheepSpawnerBSM.setBlockState(sheepSpawnerBS);
			CreatureSpawner sheepSpawnerCS = (CreatureSpawner) sheepSpawnerBS;
			sheepSpawnerCS.setSpawnedType(EntityType.SHEEP);
			sheepSpawnerBSM.setBlockState(sheepSpawnerCS);
			sheepSpawnerItem.setItemMeta(sheepSpawnerMeta);
			NamespacedKey sheepSpawnerKey = new NamespacedKey(this, "SHEEPSPAWNER");
			ShapedRecipe sheepSpawnerRecipe = new ShapedRecipe(sheepSpawnerKey, sheepSpawnerItem);
			sheepSpawnerRecipe.shape("@#@", "#&#", "@#@");
			sheepSpawnerRecipe.setIngredient('@', Material.END_ROD);
			sheepSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
			sheepSpawnerRecipe.setIngredient('&', Material.MUTTON);

			// Rabbit

			ItemStack rabbitSpawnerItem = new ItemStack(Material.SPAWNER);
			ItemMeta rabbitSpawnerMeta = rabbitSpawnerItem.getItemMeta();
			rabbitSpawnerMeta.setDisplayName("Rabbit Spawner");
			BlockStateMeta rabbitSpawnerBSM = (BlockStateMeta) rabbitSpawnerMeta;
			BlockState rabbitSpawnerBS = rabbitSpawnerBSM.getBlockState();
			rabbitSpawnerBSM.setBlockState(rabbitSpawnerBS);
			CreatureSpawner rabbitSpawnerCS = (CreatureSpawner) rabbitSpawnerBS;
			rabbitSpawnerCS.setSpawnedType(EntityType.RABBIT);
			rabbitSpawnerBSM.setBlockState(rabbitSpawnerCS);
			rabbitSpawnerItem.setItemMeta(rabbitSpawnerMeta);
			NamespacedKey rabbitSpawnerKey = new NamespacedKey(this, "RABBITSPAWNER");
			ShapedRecipe rabbitSpawnerRecipe = new ShapedRecipe(rabbitSpawnerKey, rabbitSpawnerItem);
			rabbitSpawnerRecipe.shape("@#@", "#&#", "@#@");
			rabbitSpawnerRecipe.setIngredient('@', Material.END_ROD);
			rabbitSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
			rabbitSpawnerRecipe.setIngredient('&', Material.RABBIT);

			// Turtle

			ItemStack turtleSpawnerItem = new ItemStack(Material.SPAWNER);
			ItemMeta turtleSpawnerMeta = turtleSpawnerItem.getItemMeta();
			turtleSpawnerMeta.setDisplayName("Turtle Spawner");
			BlockStateMeta turtleSpawnerBSM = (BlockStateMeta) turtleSpawnerMeta;
			BlockState turtleSpawnerBS = turtleSpawnerBSM.getBlockState();
			turtleSpawnerBSM.setBlockState(turtleSpawnerBS);
			CreatureSpawner turtleSpawnerCS = (CreatureSpawner) turtleSpawnerBS;
			turtleSpawnerCS.setSpawnedType(EntityType.TURTLE);
			turtleSpawnerBSM.setBlockState(turtleSpawnerCS);
			turtleSpawnerItem.setItemMeta(turtleSpawnerMeta);
			NamespacedKey turtleSpawnerKey = new NamespacedKey(this, "TURTLESPAWNER");
			ShapedRecipe turtleSpawnerRecipe = new ShapedRecipe(turtleSpawnerKey, turtleSpawnerItem);
			turtleSpawnerRecipe.shape("@#@", "#&#", "@#@");
			turtleSpawnerRecipe.setIngredient('@', Material.END_ROD);
			turtleSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
			turtleSpawnerRecipe.setIngredient('&', Material.SCUTE);

        // Neutral Mobs
        
            // Bee

            ItemStack beeSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta beeSpawnerMeta = beeSpawnerItem.getItemMeta();
            beeSpawnerMeta.setDisplayName("Bee Spawner");
            BlockStateMeta beeSpawnerBSM = (BlockStateMeta) beeSpawnerMeta;
            BlockState beeSpawnerBS = beeSpawnerBSM.getBlockState();
            beeSpawnerBSM.setBlockState(beeSpawnerBS);
            CreatureSpawner beeSpawnerCS = (CreatureSpawner) beeSpawnerBS;
            beeSpawnerCS.setSpawnedType(EntityType.BEE);
            beeSpawnerBSM.setBlockState(beeSpawnerCS);
            beeSpawnerItem.setItemMeta(beeSpawnerMeta);
            NamespacedKey beeSpawnerKey = new NamespacedKey(this, "BEESPAWNER");
            ShapedRecipe beeSpawnerRecipe = new ShapedRecipe(beeSpawnerKey, beeSpawnerItem);
            beeSpawnerRecipe.shape("@#@", "#&#", "@#@");
            beeSpawnerRecipe.setIngredient('@', Material.END_ROD);
            beeSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            beeSpawnerRecipe.setIngredient('&', Material.HONEYCOMB);

            // Panda

            ItemStack pandaSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta pandaSpawnerMeta = pandaSpawnerItem.getItemMeta();
            pandaSpawnerMeta.setDisplayName("Panda Spawner");
            BlockStateMeta pandaSpawnerBSM = (BlockStateMeta) pandaSpawnerMeta;
            BlockState pandaSpawnerBS = pandaSpawnerBSM.getBlockState();
            pandaSpawnerBSM.setBlockState(pandaSpawnerBS);
            CreatureSpawner pandaSpawnerCS = (CreatureSpawner) pandaSpawnerBS;
            pandaSpawnerCS.setSpawnedType(EntityType.PANDA);
            pandaSpawnerBSM.setBlockState(pandaSpawnerCS);
            pandaSpawnerItem.setItemMeta(pandaSpawnerMeta);
            NamespacedKey pandaSpawnerKey = new NamespacedKey(this, "PANDASPAWNER");
            ShapedRecipe pandaSpawnerRecipe = new ShapedRecipe(pandaSpawnerKey, pandaSpawnerItem);
            pandaSpawnerRecipe.shape("@#@", "#&#", "@#@");
            pandaSpawnerRecipe.setIngredient('@', Material.END_ROD);
            pandaSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            pandaSpawnerRecipe.setIngredient('&', Material.BAMBOO);
            
            // Polar Bear

            ItemStack polarBearSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta polarBearSpawnerMeta = polarBearSpawnerItem.getItemMeta();
            polarBearSpawnerMeta.setDisplayName("Polar Bear Spawner");
            BlockStateMeta polarBearSpawnerBSM = (BlockStateMeta) polarBearSpawnerMeta;
            BlockState polarBearSpawnerBS = polarBearSpawnerBSM.getBlockState();
            polarBearSpawnerBSM.setBlockState(polarBearSpawnerBS);
            CreatureSpawner polarBearSpawnerCS = (CreatureSpawner) polarBearSpawnerBS;
            polarBearSpawnerCS.setSpawnedType(EntityType.POLAR_BEAR);
            polarBearSpawnerBSM.setBlockState(polarBearSpawnerCS);
            polarBearSpawnerItem.setItemMeta(polarBearSpawnerMeta);
            NamespacedKey polarBearSpawnerKey = new NamespacedKey(this, "POLARBEARSPAWNER");
            ShapedRecipe polarBearSpawnerRecipe = new ShapedRecipe(polarBearSpawnerKey, polarBearSpawnerItem);
            polarBearSpawnerRecipe.shape("@#@", "#&#", "@#@");
            polarBearSpawnerRecipe.setIngredient('@', Material.END_ROD);
            polarBearSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            polarBearSpawnerRecipe.setIngredient('&', Material.SNOWBALL);

        // Hostile Mobs

            // Zombie
            ItemStack zombieSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta zombieSpawnerMeta = zombieSpawnerItem.getItemMeta();
            zombieSpawnerMeta.setDisplayName("Zombie Spawner");
            BlockStateMeta zombieSpawnerBSM = (BlockStateMeta) zombieSpawnerMeta;
            BlockState zombieSpawnerBS = zombieSpawnerBSM.getBlockState();
            zombieSpawnerBSM.setBlockState(zombieSpawnerBS);
            CreatureSpawner zombieSpawnerCS = (CreatureSpawner) zombieSpawnerBS;
            zombieSpawnerCS.setSpawnedType(EntityType.ZOMBIE);
            zombieSpawnerBSM.setBlockState(zombieSpawnerCS);
            zombieSpawnerItem.setItemMeta(zombieSpawnerMeta);
            NamespacedKey zombieSpawnerKey = new NamespacedKey(this, "ZOMBIESPAWNER");
            ShapedRecipe zombieSpawnerRecipe = new ShapedRecipe(zombieSpawnerKey, zombieSpawnerItem);
            zombieSpawnerRecipe.shape("@#@", "#&#", "@#@");
            zombieSpawnerRecipe.setIngredient('@', Material.END_ROD);
            zombieSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            zombieSpawnerRecipe.setIngredient('&', Material.ROTTEN_FLESH);
            
            // Drowned

            ItemStack drownedSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta drownedSpawnerMeta = drownedSpawnerItem.getItemMeta();
            drownedSpawnerMeta.setDisplayName("Drowned Spawner");
            BlockStateMeta drownedSpawnerBSM = (BlockStateMeta) drownedSpawnerMeta;
            BlockState drownedSpawnerBS = drownedSpawnerBSM.getBlockState();
            drownedSpawnerBSM.setBlockState(drownedSpawnerBS);
            CreatureSpawner drownedSpawnerCS = (CreatureSpawner) drownedSpawnerBS;
            drownedSpawnerCS.setSpawnedType(EntityType.DROWNED);
            drownedSpawnerBSM.setBlockState(drownedSpawnerCS);
            drownedSpawnerItem.setItemMeta(drownedSpawnerMeta);
            NamespacedKey drownedSpawnerKey = new NamespacedKey(this, "DROWNEDSPAWNER");
            ShapedRecipe drownedSpawnerRecipe = new ShapedRecipe(drownedSpawnerKey, drownedSpawnerItem);
            drownedSpawnerRecipe.shape("@#@", "#&#", "@#@");
            drownedSpawnerRecipe.setIngredient('@', Material.END_ROD);
            drownedSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            drownedSpawnerRecipe.setIngredient('&', Material.TRIDENT);

            // Husk

            ItemStack huskSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta huskSpawnerMeta = huskSpawnerItem.getItemMeta();
            huskSpawnerMeta.setDisplayName("Husk Spawner");
            BlockStateMeta huskSpawnerBSM = (BlockStateMeta) huskSpawnerMeta;
            BlockState huskSpawnerBS = huskSpawnerBSM.getBlockState();
            huskSpawnerBSM.setBlockState(huskSpawnerBS);
            CreatureSpawner huskSpawnerCS = (CreatureSpawner) huskSpawnerBS;
            huskSpawnerCS.setSpawnedType(EntityType.HUSK);
            huskSpawnerBSM.setBlockState(huskSpawnerCS);
            huskSpawnerItem.setItemMeta(huskSpawnerMeta);
            NamespacedKey huskSpawnerKey = new NamespacedKey(this, "HUSKSPAWNER");
            ShapedRecipe huskSpawnerRecipe = new ShapedRecipe(huskSpawnerKey, huskSpawnerItem);
            huskSpawnerRecipe.shape("@#@", "#&#", "@#@");
            huskSpawnerRecipe.setIngredient('@', Material.END_ROD);
            huskSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            huskSpawnerRecipe.setIngredient('&', Material.SAND);

            // Zombie Pigman

            ItemStack zombiePigmanSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta zombiePigmanSpawnerMeta = zombiePigmanSpawnerItem.getItemMeta();
            zombiePigmanSpawnerMeta.setDisplayName("Zombie Pigman Spawner");
            BlockStateMeta zombiePigmanSpawnerBSM = (BlockStateMeta) zombiePigmanSpawnerMeta;
            BlockState zombiePigmanSpawnerBS = zombiePigmanSpawnerBSM.getBlockState();
            zombiePigmanSpawnerBSM.setBlockState(zombiePigmanSpawnerBS);
            CreatureSpawner zombiePigmanSpawnerCS = (CreatureSpawner) zombiePigmanSpawnerBS;
            zombiePigmanSpawnerCS.setSpawnedType(EntityType.PIG_ZOMBIE);
            zombiePigmanSpawnerBSM.setBlockState(zombiePigmanSpawnerCS);
            zombiePigmanSpawnerItem.setItemMeta(zombiePigmanSpawnerMeta);
            NamespacedKey zombiePigmanSpawnerKey = new NamespacedKey(this, "ZOMBIEPIGMANSPAWNER");
            ShapedRecipe zombiePigmanSpawnerRecipe = new ShapedRecipe(zombiePigmanSpawnerKey, zombiePigmanSpawnerItem);
            zombiePigmanSpawnerRecipe.shape("@#@", "#&#", "@#@");
            zombiePigmanSpawnerRecipe.setIngredient('@', Material.END_ROD);
            zombiePigmanSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            zombiePigmanSpawnerRecipe.setIngredient('&', Material.GOLDEN_SWORD);

            // Skeleton

            ItemStack skeletonSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta skeletonSpawnerMeta = skeletonSpawnerItem.getItemMeta();
            skeletonSpawnerMeta.setDisplayName("Skeleton Spawner");
            BlockStateMeta skeletonSpawnerBSM = (BlockStateMeta) skeletonSpawnerMeta;
            BlockState skeletonSpawnerBS = skeletonSpawnerBSM.getBlockState();
            skeletonSpawnerBSM.setBlockState(skeletonSpawnerBS);
            CreatureSpawner skeletonSpawnerCS = (CreatureSpawner) skeletonSpawnerBS;
            skeletonSpawnerCS.setSpawnedType(EntityType.SKELETON);
            skeletonSpawnerBSM.setBlockState(skeletonSpawnerCS);
            skeletonSpawnerItem.setItemMeta(skeletonSpawnerMeta);
            NamespacedKey skeletonSpawnerKey = new NamespacedKey(this, "SKELETONSPAWNER");
            ShapedRecipe skeletonSpawnerRecipe = new ShapedRecipe(skeletonSpawnerKey, skeletonSpawnerItem);
            skeletonSpawnerRecipe.shape("@#@", "#&#", "@#@");
            skeletonSpawnerRecipe.setIngredient('@', Material.END_ROD);
            skeletonSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            skeletonSpawnerRecipe.setIngredient('&', Material.BONE);
            
            // Stray

            ItemStack straySpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta straySpawnerMeta = straySpawnerItem.getItemMeta();
            straySpawnerMeta.setDisplayName("Stray Spawner");
            BlockStateMeta straySpawnerBSM = (BlockStateMeta) straySpawnerMeta;
            BlockState straySpawnerBS = straySpawnerBSM.getBlockState();
            straySpawnerBSM.setBlockState(straySpawnerBS);
            CreatureSpawner straySpawnerCS = (CreatureSpawner) straySpawnerBS;
            straySpawnerCS.setSpawnedType(EntityType.STRAY);
            straySpawnerBSM.setBlockState(straySpawnerCS);
            straySpawnerItem.setItemMeta(straySpawnerMeta);
            NamespacedKey straySpawnerKey = new NamespacedKey(this, "STRAYSPAWNER");
            ShapedRecipe straySpawnerRecipe = new ShapedRecipe(straySpawnerKey, straySpawnerItem);
            straySpawnerRecipe.shape("@#@", "#&#", "@#@");
            straySpawnerRecipe.setIngredient('@', Material.END_ROD);
            straySpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            straySpawnerRecipe.setIngredient('&', Material.SPECTRAL_ARROW);
            
            // Wither Skeleton

            ItemStack witherSkeletonSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta witherSkeletonSpawnerMeta = witherSkeletonSpawnerItem.getItemMeta();
            witherSkeletonSpawnerMeta.setDisplayName("Wither Skeleton Spawner");
            BlockStateMeta witherSkeletonSpawnerBSM = (BlockStateMeta) witherSkeletonSpawnerMeta;
            BlockState witherSkeletonSpawnerBS = witherSkeletonSpawnerBSM.getBlockState();
            witherSkeletonSpawnerBSM.setBlockState(witherSkeletonSpawnerBS);
            CreatureSpawner witherSkeletonSpawnerCS = (CreatureSpawner) witherSkeletonSpawnerBS;
            witherSkeletonSpawnerCS.setSpawnedType(EntityType.WITHER_SKELETON);
            witherSkeletonSpawnerBSM.setBlockState(witherSkeletonSpawnerCS);
            witherSkeletonSpawnerItem.setItemMeta(witherSkeletonSpawnerMeta);
            NamespacedKey witherSkeletonSpawnerKey = new NamespacedKey(this, "WITHERSKELETONSPAWNER");
            ShapedRecipe witherSkeletonSpawnerRecipe = new ShapedRecipe(witherSkeletonSpawnerKey, witherSkeletonSpawnerItem);
            witherSkeletonSpawnerRecipe.shape("@#@", "#&#", "@#@");
            witherSkeletonSpawnerRecipe.setIngredient('@', Material.END_ROD);
            witherSkeletonSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            witherSkeletonSpawnerRecipe.setIngredient('&', Material.WITHER_SKELETON_SKULL);
            
            // Spider

            ItemStack spiderSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta spiderSpawnerMeta = spiderSpawnerItem.getItemMeta();
            spiderSpawnerMeta.setDisplayName("Spider Spawner");
            BlockStateMeta spiderSpawnerBSM = (BlockStateMeta) spiderSpawnerMeta;
            BlockState spiderSpawnerBS = spiderSpawnerBSM.getBlockState();
            spiderSpawnerBSM.setBlockState(spiderSpawnerBS);
            CreatureSpawner spiderSpawnerCS = (CreatureSpawner) spiderSpawnerBS;
            spiderSpawnerCS.setSpawnedType(EntityType.SPIDER);
            spiderSpawnerBSM.setBlockState(spiderSpawnerCS);
            spiderSpawnerItem.setItemMeta(spiderSpawnerMeta);
            NamespacedKey spiderSpawnerKey = new NamespacedKey(this, "SPIDERSPAWNER");
            ShapedRecipe spiderSpawnerRecipe = new ShapedRecipe(spiderSpawnerKey, spiderSpawnerItem);
            spiderSpawnerRecipe.shape("@#@", "#&#", "@#@");
            spiderSpawnerRecipe.setIngredient('@', Material.END_ROD);
            spiderSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            spiderSpawnerRecipe.setIngredient('&', Material.SPIDER_EYE);

            // Cave Spider

            ItemStack caveSpiderSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta caveSpiderSpawnerMeta = caveSpiderSpawnerItem.getItemMeta();
            caveSpiderSpawnerMeta.setDisplayName("Cave Spider Spawner");
            BlockStateMeta caveSpiderSpawnerBSM = (BlockStateMeta) caveSpiderSpawnerMeta;
            BlockState caveSpiderSpawnerBS = caveSpiderSpawnerBSM.getBlockState();
            caveSpiderSpawnerBSM.setBlockState(caveSpiderSpawnerBS);
            CreatureSpawner caveSpiderSpawnerCS = (CreatureSpawner) caveSpiderSpawnerBS;
            caveSpiderSpawnerCS.setSpawnedType(EntityType.CAVE_SPIDER);
            caveSpiderSpawnerBSM.setBlockState(caveSpiderSpawnerCS);
            caveSpiderSpawnerItem.setItemMeta(caveSpiderSpawnerMeta);
            NamespacedKey caveSpiderSpawnerKey = new NamespacedKey(this, "CAVESPIDERSPAWNER");
            ShapedRecipe caveSpiderSpawnerRecipe = new ShapedRecipe(caveSpiderSpawnerKey, caveSpiderSpawnerItem);
            caveSpiderSpawnerRecipe.shape("@#@", "#&#", "@#@");
            caveSpiderSpawnerRecipe.setIngredient('@', Material.END_ROD);
            caveSpiderSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            caveSpiderSpawnerRecipe.setIngredient('&', Material.FERMENTED_SPIDER_EYE);
            
            // Creeper

            ItemStack creeperSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta creeperSpawnerMeta = creeperSpawnerItem.getItemMeta();
            creeperSpawnerMeta.setDisplayName("Creeper Spawner");
            BlockStateMeta creeperSpawnerBSM = (BlockStateMeta) creeperSpawnerMeta;
            BlockState creeperSpawnerBS = creeperSpawnerBSM.getBlockState();
            creeperSpawnerBSM.setBlockState(creeperSpawnerBS);
            CreatureSpawner creeperSpawnerCS = (CreatureSpawner) creeperSpawnerBS;
            creeperSpawnerCS.setSpawnedType(EntityType.CREEPER);
            creeperSpawnerBSM.setBlockState(creeperSpawnerCS);
            creeperSpawnerItem.setItemMeta(creeperSpawnerMeta);
            NamespacedKey creeperSpawnerKey = new NamespacedKey(this, "CREEPERSPAWNER");
            ShapedRecipe creeperSpawnerRecipe = new ShapedRecipe(creeperSpawnerKey, creeperSpawnerItem);
            creeperSpawnerRecipe.shape("@#@", "#&#", "@#@");
            creeperSpawnerRecipe.setIngredient('@', Material.END_ROD);
            creeperSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            creeperSpawnerRecipe.setIngredient('&', Material.GUNPOWDER);

            // Slime

            ItemStack slimeSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta slimeSpawnerMeta = slimeSpawnerItem.getItemMeta();
            slimeSpawnerMeta.setDisplayName("Slime Spawner");
            BlockStateMeta slimeSpawnerBSM = (BlockStateMeta) slimeSpawnerMeta;
            BlockState slimeSpawnerBS = slimeSpawnerBSM.getBlockState();
            slimeSpawnerBSM.setBlockState(slimeSpawnerBS);
            CreatureSpawner slimeSpawnerCS = (CreatureSpawner) slimeSpawnerBS;
            slimeSpawnerCS.setSpawnedType(EntityType.SLIME);
            slimeSpawnerBSM.setBlockState(slimeSpawnerCS);
            slimeSpawnerItem.setItemMeta(slimeSpawnerMeta);
            NamespacedKey slimeSpawnerKey = new NamespacedKey(this, "SLIMESPAWNER");
            ShapedRecipe slimeSpawnerRecipe = new ShapedRecipe(slimeSpawnerKey, slimeSpawnerItem);
            slimeSpawnerRecipe.shape("@#@", "#&#", "@#@");
            slimeSpawnerRecipe.setIngredient('@', Material.END_ROD);
            slimeSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            slimeSpawnerRecipe.setIngredient('&', Material.SLIME_BALL);

            // Magma Cube

            ItemStack magmaCubeSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta magmaCubeSpawnerMeta = magmaCubeSpawnerItem.getItemMeta();
            magmaCubeSpawnerMeta.setDisplayName("Magma Cube Spawner");
            BlockStateMeta magmaCubeSpawnerBSM = (BlockStateMeta) magmaCubeSpawnerMeta;
            BlockState magmaCubeSpawnerBS = magmaCubeSpawnerBSM.getBlockState();
            magmaCubeSpawnerBSM.setBlockState(magmaCubeSpawnerBS);
            CreatureSpawner magmaCubeSpawnerCS = (CreatureSpawner) magmaCubeSpawnerBS;
            magmaCubeSpawnerCS.setSpawnedType(EntityType.MAGMA_CUBE);
            magmaCubeSpawnerBSM.setBlockState(magmaCubeSpawnerCS);
            magmaCubeSpawnerItem.setItemMeta(magmaCubeSpawnerMeta);
            NamespacedKey magmaCubeSpawnerKey = new NamespacedKey(this, "MAGMACUBESPAWNER");
            ShapedRecipe magmaCubeSpawnerRecipe = new ShapedRecipe(magmaCubeSpawnerKey, magmaCubeSpawnerItem);
            magmaCubeSpawnerRecipe.shape("@#@", "#&#", "@#@");
            magmaCubeSpawnerRecipe.setIngredient('@', Material.END_ROD);
            magmaCubeSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            magmaCubeSpawnerRecipe.setIngredient('&', Material.MAGMA_CREAM);

            // Blaze

            ItemStack blazeSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta blazeSpawnerMeta = blazeSpawnerItem.getItemMeta();
            blazeSpawnerMeta.setDisplayName("Blaze Spawner");
            BlockStateMeta blazeSpawnerBSM = (BlockStateMeta) blazeSpawnerMeta;
            BlockState blazeSpawnerBS = blazeSpawnerBSM.getBlockState();
            blazeSpawnerBSM.setBlockState(blazeSpawnerBS);
            CreatureSpawner blazeSpawnerCS = (CreatureSpawner) blazeSpawnerBS;
            blazeSpawnerCS.setSpawnedType(EntityType.BLAZE);
            blazeSpawnerBSM.setBlockState(blazeSpawnerCS);
            blazeSpawnerItem.setItemMeta(blazeSpawnerMeta);
            NamespacedKey blazeSpawnerKey = new NamespacedKey(this, "BLAZESPAWNER");
            ShapedRecipe blazeSpawnerRecipe = new ShapedRecipe(blazeSpawnerKey, blazeSpawnerItem);
            blazeSpawnerRecipe.shape("@#@", "#&#", "@#@");
            blazeSpawnerRecipe.setIngredient('@', Material.END_ROD);
            blazeSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            blazeSpawnerRecipe.setIngredient('&', Material.BLAZE_ROD);

            // Phantom

            ItemStack phantomSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta phantomSpawnerMeta = phantomSpawnerItem.getItemMeta();
            phantomSpawnerMeta.setDisplayName("Phantom Spawner");
            BlockStateMeta phantomSpawnerBSM = (BlockStateMeta) phantomSpawnerMeta;
            BlockState phantomSpawnerBS = phantomSpawnerBSM.getBlockState();
            phantomSpawnerBSM.setBlockState(phantomSpawnerBS);
            CreatureSpawner phantomSpawnerCS = (CreatureSpawner) phantomSpawnerBS;
            phantomSpawnerCS.setSpawnedType(EntityType.PHANTOM);
            phantomSpawnerBSM.setBlockState(phantomSpawnerCS);
            phantomSpawnerItem.setItemMeta(phantomSpawnerMeta);
            NamespacedKey phantomSpawnerKey = new NamespacedKey(this, "PHANTOMSPAWNER");
            ShapedRecipe phantomSpawnerRecipe = new ShapedRecipe(phantomSpawnerKey, phantomSpawnerItem);
            phantomSpawnerRecipe.shape("@#@", "#&#", "@#@");
            phantomSpawnerRecipe.setIngredient('@', Material.END_ROD);
            phantomSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            phantomSpawnerRecipe.setIngredient('&', Material.PHANTOM_MEMBRANE);

            // Witch

            ItemStack witchSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta witchSpawnerMeta = witchSpawnerItem.getItemMeta();
            witchSpawnerMeta.setDisplayName("Witch Spawner");
            BlockStateMeta witchSpawnerBSM = (BlockStateMeta) witchSpawnerMeta;
            BlockState witchSpawnerBS = witchSpawnerBSM.getBlockState();
            witchSpawnerBSM.setBlockState(witchSpawnerBS);
            CreatureSpawner witchSpawnerCS = (CreatureSpawner) witchSpawnerBS;
            witchSpawnerCS.setSpawnedType(EntityType.WITCH);
            witchSpawnerBSM.setBlockState(witchSpawnerCS);
            witchSpawnerItem.setItemMeta(witchSpawnerMeta);
            NamespacedKey witchSpawnerKey = new NamespacedKey(this, "WITCHSPAWNER");
            ShapedRecipe witchSpawnerRecipe = new ShapedRecipe(witchSpawnerKey, witchSpawnerItem);
            witchSpawnerRecipe.shape("@#@", "#&#", "@#@");
            witchSpawnerRecipe.setIngredient('@', Material.END_ROD);
            witchSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            witchSpawnerRecipe.setIngredient('&', Material.GLASS_BOTTLE);

            // Enderman

            ItemStack endermanSpawnerItem = new ItemStack(Material.SPAWNER);
            ItemMeta endermanSpawnerMeta = endermanSpawnerItem.getItemMeta();
            endermanSpawnerMeta.setDisplayName("Enderman Spawner");
            BlockStateMeta endermanSpawnerBSM = (BlockStateMeta) endermanSpawnerMeta;
            BlockState endermanSpawnerBS = endermanSpawnerBSM.getBlockState();
            endermanSpawnerBSM.setBlockState(endermanSpawnerBS);
            CreatureSpawner endermanSpawnerCS = (CreatureSpawner) endermanSpawnerBS;
            endermanSpawnerCS.setSpawnedType(EntityType.ENDERMAN);
            endermanSpawnerBSM.setBlockState(endermanSpawnerCS);
            endermanSpawnerItem.setItemMeta(endermanSpawnerMeta);
            NamespacedKey endermanSpawnerKey = new NamespacedKey(this, "ENDERMANSPAWNER");
            ShapedRecipe endermanSpawnerRecipe = new ShapedRecipe(endermanSpawnerKey, endermanSpawnerItem);
            endermanSpawnerRecipe.shape("@#@", "#&#", "@#@");
            endermanSpawnerRecipe.setIngredient('@', Material.END_ROD);
            endermanSpawnerRecipe.setIngredient('#', Material.IRON_BARS);
            endermanSpawnerRecipe.setIngredient('&', Material.ENDER_PEARL);

        // Add Recipes

		Bukkit.addRecipe(pigSpawnerRecipe);
		Bukkit.addRecipe(cowSpawnerRecipe);
		Bukkit.addRecipe(chickenSpawnerRecipe);
		Bukkit.addRecipe(sheepSpawnerRecipe);
		Bukkit.addRecipe(rabbitSpawnerRecipe);
		Bukkit.addRecipe(turtleSpawnerRecipe);
		Bukkit.addRecipe(beeSpawnerRecipe);
		Bukkit.addRecipe(pandaSpawnerRecipe);
		Bukkit.addRecipe(polarBearSpawnerRecipe);
		Bukkit.addRecipe(zombieSpawnerRecipe);
		Bukkit.addRecipe(drownedSpawnerRecipe);
		Bukkit.addRecipe(huskSpawnerRecipe);
		Bukkit.addRecipe(zombiePigmanSpawnerRecipe);
		Bukkit.addRecipe(skeletonSpawnerRecipe);
		Bukkit.addRecipe(straySpawnerRecipe);
		Bukkit.addRecipe(witherSkeletonSpawnerRecipe);
		Bukkit.addRecipe(spiderSpawnerRecipe);
		Bukkit.addRecipe(caveSpiderSpawnerRecipe);
		Bukkit.addRecipe(creeperSpawnerRecipe);
		Bukkit.addRecipe(slimeSpawnerRecipe);
		Bukkit.addRecipe(magmaCubeSpawnerRecipe);
		Bukkit.addRecipe(blazeSpawnerRecipe);
		Bukkit.addRecipe(phantomSpawnerRecipe);
		Bukkit.addRecipe(witchSpawnerRecipe);
		Bukkit.addRecipe(endermanSpawnerRecipe);

	}

	@Override
	public void onDisable() {

	}
}
