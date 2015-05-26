package com.ALegendsTale.EagleVision.Modules;

import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.opengl.GL11;

import com.ALegendsTale.EagleVision.Wrapper;

public class PlayerEsp {
	
//	public static void esp(){
//		for (Object o : Wrapper.INSTANCE.world().loadedEntityList) {
//			if (o instanceof EntityPlayer) {
//				EntityPlayer entityplayer = (EntityPlayer) o;
//				if (!(entityplayer instanceof NewEntity)
//						&& !(entityplayer instanceof EntityOtherPlayerMP)) {
//					AltAxisAlignedBB abb = AltAxisAlignedBB.getBoundingBox(
//							1, (double) entityplayer.yOffset, 1,
//							(double) entityplayer.yOffset, 2, 1);
//					double x = entityplayer.lastTickPosX
//							+ (entityplayer.posX - entityplayer.lastTickPosX)
//							- RenderManager.renderPosX - 0.5;
//					double y = entityplayer.lastTickPosY
//							+ (entityplayer.posY - entityplayer.lastTickPosY)
//							- RenderManager.renderPosY;
//					double z = entityplayer.lastTickPosZ
//							+ (entityplayer.posZ - entityplayer.lastTickPosZ)
//							- RenderManager.renderPosZ - 0.5;
//					GL11.glPushMatrix();
//					GL11.glTranslated(x, y, z);
//					GL11.glColor4f(0.27F, 0.70F, 0.92F, 1.0F);
//					RenderingHelper.startDrawingESPs(abb, 0.27F, 0.70F,
//							0.92F);
//					GL11.glPopMatrix();
//				}
//			}
//		}
//	}
	
}
