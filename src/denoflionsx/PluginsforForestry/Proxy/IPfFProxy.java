package denoflionsx.PluginsforForestry.Proxy;

import denoflionsx.PluginsforForestry.Plugins.LiquidRoundup.Blocks.LRLiquidBlock;

public interface IPfFProxy {
    
    public void print(String msg);
    
    public void registerClientSide();
    
    public void registerLiquidBlock(String name, LRLiquidBlock b);
    
}
