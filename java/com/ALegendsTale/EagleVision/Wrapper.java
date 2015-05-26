package com.ALegendsTale.EagleVision;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class Wrapper 
{
	public volatile static Wrapper INSTANCE = new Wrapper();
	
	public Minecraft minecraft()
	{
		return Minecraft.getMinecraft();
	}

	public EntityPlayerSP player()
	{
		return Minecraft.getMinecraft().thePlayer;
	}
	
	public WorldClient world()
	{
		return Minecraft.getMinecraft().theWorld;
	}
	
	public GameSettings mcSettings()
	{
		return Minecraft.getMinecraft().gameSettings;
	}
	
	public FontRenderer fontRenderer()
	{
		return Minecraft.getMinecraft().fontRendererObj;
	}
	
	public void addChatMessage(String tosend)
	{
		ChatStyle cs = new ChatStyle();
		cs.setColor(EnumChatFormatting.LIGHT_PURPLE);
		IChatComponent chatcomponent = new ChatComponentText(tosend);
		chatcomponent.setChatStyle(cs);
		player().addChatMessage(chatcomponent);
	}
}