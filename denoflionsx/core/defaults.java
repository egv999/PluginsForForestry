package denoflionsx.core;

public class defaults {

    public static void setup() {


        core.config.addDefault("[PluginsForForestry Config File]");
        core.config.addDefault("pluginForestry_Enabled=true");
        core.config.addDefault("pluginBetterFarming_Enabled=true");
        core.config.addDefault("pluginBuildcraft_Enabled=true");
        core.config.addDefault("pluginMineFactoryReloaded_Enabled=true");
        core.config.addDefault("pluginAdvancedPowerSystems_Enabled=true");
        core.config.addDefault("pluginIc2_Enabled=true");
        core.config.addDefault("pluginEE_Enabled=true");
        core.config.addDefault("pluginRedPower_Enabled=true");
        core.config.addDefault("EnableBC2TankIntegration=false");
        core.config.addDefault("Verbose=true");
        core.config.addDefault("UpdateCheck=true");
        core.config.writeConfig();
    }
}