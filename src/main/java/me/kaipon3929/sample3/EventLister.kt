package me.kaipon3929.sample3

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

object EventListener: Listener {
    @EventHandler
    fun on(e: PlayerJoinEvent) {
        val p = e.player
        e.joinMessage = "${p.displayName}がサーバーに参加しました！"
    }
    @EventHandler
    fun on(e:PlayerQuitEvent) {
        val p = e.player
        e.quitMessage = "${p.displayName}がサーバーから退出しました！"
    }
}