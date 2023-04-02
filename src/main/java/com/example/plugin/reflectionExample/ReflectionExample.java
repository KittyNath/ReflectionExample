package com.example.plugin.reflectionExample;

import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Method;

public class ReflectionExample extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            Class<?> fmlCommonHandlerClass = Class.forName("net.minecraftforge.fml.common.FMLCommonHandler");
            Class<?> minecraftServerClass = Class.forName("net.minecraft.server.MinecraftServer");
            Class<?> playerListClass = Class.forName("net.minecraft.server.management.PlayerList");

            Method getMinecraftServerInstanceMethod = fmlCommonHandlerClass.getDeclaredMethod("getMinecraftServerInstance");
            Method getPlayerListMethod = minecraftServerClass.getDeclaredMethod("getPlayerList");
            Method getPlayersMethod = playerListClass.getDeclaredMethod("func_181057_v");
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}
