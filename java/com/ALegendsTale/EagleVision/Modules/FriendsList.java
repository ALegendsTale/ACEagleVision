package com.ALegendsTale.EagleVision.Modules;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class FriendsList {

	public static String EntityList;

	public static void friends() {
		ChatStyle cs = new ChatStyle();
		ChatStyle csmid = new ChatStyle();
		cs.setColor(EnumChatFormatting.RED);
		csmid.setColor(EnumChatFormatting.GOLD);
		IChatComponent start = new ChatComponentText("Friends List Starting Check...");
		IChatComponent geko = new ChatComponentText("GekoGirl is here!");
		IChatComponent charmander = new ChatComponentText("ItsCharmander is here!");
		IChatComponent conscious = new ChatComponentText("Conscious_I_am is here!");
		IChatComponent tuba = new ChatComponentText("Tube_Chick is here!");
		IChatComponent nothing = new ChatComponentText("No one is here! :(");
		IChatComponent ending = new ChatComponentText("Ending Check...");
		start.setChatStyle(cs);
		geko.setChatStyle(csmid);
		charmander.setChatStyle(csmid);
		conscious.setChatStyle(csmid);
		tuba.setChatStyle(csmid);
		nothing.setChatStyle(csmid);
		ending.setChatStyle(cs);
		Minecraft.getMinecraft().thePlayer.addChatMessage(start);
		int listsize = Minecraft.getMinecraft().theWorld.playerEntities.size();
		for (int i = 0; i < listsize; i++) {
			System.out.println(Minecraft.getMinecraft().theWorld.playerEntities.get(i));
		}

		Minecraft.getMinecraft();
		EntityList = Minecraft.getMinecraft().theWorld.playerEntities.toString();
		if (EntityList.contains("GekoGirl") || EntityList.contains("ItsCharmander") || EntityList.contains("Conscious_I_am") || EntityList.contains("Tuba_Chick")) {
			if (EntityList.contains("GekoGirl")) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(geko);
			}
			if (EntityList.contains("ItsCharmander")) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(charmander);
			}
			if (EntityList.contains("Conscious_I_am")) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(conscious);
			}
			if (EntityList.contains("Tuba_Chick")) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(tuba);
			}
		} else {
			Minecraft.getMinecraft().thePlayer.addChatMessage(nothing);
		}
		Minecraft.getMinecraft().thePlayer.addChatMessage(ending);
	}
}
