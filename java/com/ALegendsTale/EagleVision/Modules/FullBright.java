package com.ALegendsTale.EagleVision.Modules;

import com.ALegendsTale.EagleVision.Wrapper;

public class FullBright {
	
	public static void EnableMod(){
		float[] bright = Wrapper.INSTANCE.world().provider.getLightBrightnessTable();
		
		for(int i = 0; i < bright.length; i++){
			bright[i] = 1.0F;
		}
	}
	
	public static void DisableMod(){
		Wrapper.INSTANCE.world().provider.registerWorld(Wrapper.INSTANCE.world());
	}
	
}
