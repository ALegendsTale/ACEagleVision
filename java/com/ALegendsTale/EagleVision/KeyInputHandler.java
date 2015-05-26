package com.ALegendsTale.EagleVision;

import org.lwjgl.input.Keyboard;

import com.ALegendsTale.EagleVision.Modules.FriendsList;
import com.ALegendsTale.EagleVision.Modules.FullBright;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
	private int i;
	
	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		//Turns on
		break1: if (KeyBind.EVkey.isPressed()) {
			//Turn on FullBright
			FullBright.EnableMod();
			while (Minecraft.getMinecraft().entityRenderer.isShaderActive() ? !(Minecraft
					.getMinecraft().entityRenderer.getShaderGroup()
					.getShaderGroupName()
					.equals("minecraft:shaders/post/creeper.json")) : true) {
				Minecraft.getMinecraft().entityRenderer.activateNextShader();
				if (Minecraft.getMinecraft().entityRenderer.getShaderGroup()
						.getShaderGroupName()
						.equals("minecraft:shaders/post/creeper.json")) {
					break break1;
				}
			}
			//Turns off
			if (Minecraft.getMinecraft().entityRenderer.getShaderGroup()
					.getShaderGroupName()
					.equals("minecraft:shaders/post/creeper.json")) {
				//Turn off FullBright
				FullBright.DisableMod();
				for (i = 0; i < 2; i++) {
					Minecraft.getMinecraft().entityRenderer
							.activateNextShader();
				}
				i = 0;
				Wrapper.INSTANCE.world().provider.registerWorld(Wrapper.INSTANCE.world());
			}
		}

		break2: if (KeyBind.FriendCheckKey.isPressed()) {
//			Minecraft.getMinecraft().thePlayer.setCurrentItemOrArmor(1, null);
//			Minecraft.getMinecraft().thePlayer.setCurrentItemOrArmor(2, null);
//			Minecraft.getMinecraft().thePlayer.setCurrentItemOrArmor(3, null);
//			Minecraft.getMinecraft().thePlayer.setCurrentItemOrArmor(4, null);
			FriendsList.friends();
//			if(!Minecraft.getMinecraft().thePlayer.isInvisible()){
//			Minecraft.getMinecraft().thePlayer.setInvisible(true);
//			Wrapper.INSTANCE.addChatMessage("Setting Invisible");
//			break break2;
//			}
//			if(Minecraft.getMinecraft().thePlayer.isInvisible())
//			Minecraft.getMinecraft().thePlayer.setInvisible(false);
		}
	}
}
