package de.teamlapen.godlyvampirism;

import de.teamlapen.vampirism.config.VampirismConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
@Mod(GodlyVampirismMod.MODID)
public class GodlyVampirismMod {
    
    public static final String MODID = "godly-vampirism";
    private static final Logger LOGGER = LogManager.getLogger();
    public static GodlyVampirismMod instance;
    
    public GodlyVampirismMod(){
        instance = this;
    }
    
    public void setup(FMLCommonSetupEvent event){
        VampirismConfig.SERVER.unlockAllSkills.set(true);
        VampirismConfig.BALANCE
    }
    

}
