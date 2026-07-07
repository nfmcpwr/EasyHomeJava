package net.nfmcpwr.EasyHomeJava;

import android.content.Context;

public class ConfigStore
{
    public static Config Config = null;

    public static void CheckAndLoad(Context context, Config config) throws SecurityException
    {
        if (ConfigStore.Config == null)
        {
            ConfigStore.Config = net.nfmcpwr.EasyHomeJava.Config.Load(context);
        }
    }
}
