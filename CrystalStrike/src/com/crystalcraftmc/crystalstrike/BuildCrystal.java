package com.crystalcraftmc.crystalstrike;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;




public class BuildCrystal {
	
	private World baseLocation; 
	private int xBaseLocation, yBaseLocation, zBaseLocation;
	//private final LightningStrikeEvent event;
	
	public BuildCrystal(final LightningStrikeEvent e){
		baseLocation = e.getLightning().getLocation().getWorld();
		xBaseLocation = e.getLightning().getLocation().getBlockX();
		yBaseLocation = e.getLightning().getLocation().getBlockY();
		zBaseLocation = e.getLightning().getLocation().getBlockZ();
		//event = e;
	}
	/**
	 * Constructs the smaller Crystal
	 * @author dellman135; stevoism; jFlory7; Ephesus
	 */
	public void firstCrystal(){
        
        /*int [] xCords = {baseLocation.getBlockX(), baseLocation.getBlockX()-1, baseLocation.getBlockX()+1, baseLocation.getBlockX(), baseLocation.getBlockX(), baseLocation.getBlockX()+1,
        		         baseLocation.getBlockX()-1, baseLocation.getBlockX()-1, baseLocation.getBlockX()+1, baseLocation.getBlockX(), baseLocation.getBlockX()};
        
        int [] yCords = {baseLocation.getBlockY(), baseLocation.getBlockY(), baseLocation.getBlockY(), baseLocation.getBlockY(), baseLocation.getBlockY(), baseLocation.getBlockY(),
	                     baseLocation.getBlockY(), baseLocation.getBlockY(), baseLocation.getBlockY(), baseLocation.getBlockY()+1, baseLocation.getBlockY()-1};
        
        int [] zCords = {baseLocation.getBlockZ(), baseLocation.getBlockZ(), baseLocation.getBlockZ(), baseLocation.getBlockZ()+1, baseLocation.getBlockZ()-1, baseLocation.getBlockZ()+1,
	                     baseLocation.getBlockZ()+1, baseLocation.getBlockZ()-1, baseLocation.getBlockZ()-1, baseLocation.getBlockZ(), baseLocation.getBlockZ()};
        */
		
        int [] xCords = {xBaseLocation, xBaseLocation-1, xBaseLocation+1, xBaseLocation, xBaseLocation, xBaseLocation+1,
		         xBaseLocation-1, xBaseLocation-1, xBaseLocation+1, xBaseLocation, xBaseLocation};

        int [] yCords = {yBaseLocation, yBaseLocation, yBaseLocation, yBaseLocation, yBaseLocation, yBaseLocation,
                yBaseLocation, yBaseLocation, yBaseLocation, yBaseLocation+1, yBaseLocation-1};

        int [] zCords = {zBaseLocation, zBaseLocation, zBaseLocation, zBaseLocation+1, zBaseLocation-1, zBaseLocation+1,
                zBaseLocation+1, zBaseLocation-1, zBaseLocation-1, zBaseLocation, zBaseLocation};
        
        Material [] mats = {Material.CHEST, Material.PACKED_ICE, Material.PACKED_ICE, Material.PACKED_ICE, Material.PACKED_ICE, Material.ICE, Material.ICE, Material.ICE, Material.ICE, Material.OBSIDIAN, Material.OBSIDIAN};
        
        for(int index = 0; index < xCords.length; index++) {
        	baseLocation.getBlockAt(xCords[index], yCords[index], zCords[index]).setType(mats[index]);
        }
        
        /*
        //Adding items to the chest...how do we want to do this?
        Block block = baseLocation.getBlock();
        Chest chest = (Chest)block.getState();
        Inventory inv = chest.getInventory();
        
        List<ItemStack> items = new ArrayList<ItemStack>();
        items.add(new ItemStack(Material.DIAMOND_SWORD, 1));
        items.add(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
        items.add(new ItemStack(Material.ENDER_PEARL, 16));
        
        inv.addItem(items.get(0), items.get(1), items.get(2));*/
	}
	
	
	/**
	 * Constructs the second Crystal
	 * @author dellman135; stevoism; jFlory7; Ephesus
	 */
	/*
	public void secondCrystal(){
		 event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 6, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 5, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 5, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 4, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ() - 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 4, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 4, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 3, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.ICE);        
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() + 3, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() + 1, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.CHEST);//Center
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() + 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY(), baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY(), baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.GLOWSTONE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY(), baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() - 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 1, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() - 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 2).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 2, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() - 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() - 2).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 2, baseLocation.getBlockY() - 2, baseLocation.getBlockZ() + 1).setType(Material.ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() - 1, baseLocation.getBlockY() - 3, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);        
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 2, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 3, baseLocation.getBlockZ() - 1).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 3, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX() + 1, baseLocation.getBlockY() - 3, baseLocation.getBlockZ() + 1).setType(Material.OBSIDIAN);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 3, baseLocation.getBlockZ()).setType(Material.PACKED_ICE);
         event.getLightning().getLocation().getWorld().getBlockAt(baseLocation.getBlockX(), baseLocation.getBlockY() - 4, baseLocation.getBlockZ()).setType(Material.OBSIDIAN);
         
         //Adding items to the chest...how do we want to do this?
         Block block = baseLocation.getBlock();
         Chest chest = (Chest)block.getState();
         Inventory inv = chest.getInventory();
         
         List<ItemStack> items = new ArrayList<ItemStack>();
         items.add(new ItemStack(Material.DIAMOND_SWORD, 1));
         items.add(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
         items.add(new ItemStack(Material.ENDER_PEARL, 16));
         
         inv.addItem(items.get(0), items.get(1), items.get(2));
	}*/
}
