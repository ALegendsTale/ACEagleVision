package com.ALegendsTale.EagleVision;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBind
{
	public static KeyBinding EVkey;
	public static KeyBinding FriendCheckKey;
	
	public static void init(){
		EVkey = new KeyBinding("Eagle Vision", Keyboard.KEY_V, "key.categories.gameplay");
		ClientRegistry.registerKeyBinding(EVkey);
		
		FriendCheckKey = new KeyBinding("Test", Keyboard.KEY_F, "key.categories.gameplay");
		ClientRegistry.registerKeyBinding(FriendCheckKey);
	}
	
}