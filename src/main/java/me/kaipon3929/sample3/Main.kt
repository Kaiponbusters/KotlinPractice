package me.kaipon3929.sample3

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {
    override fun onEnable() {
        logger.info("プラグインが起動したよ")
        server.pluginManager.registerEvents(EventListener, this)
    }

    override fun onDisable() {
        logger.info("プラグインが停止したよ")
    }
}