package rush.recursos.bloqueadores;

import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import rush.configuracoes.Locations;

public class BloquearSubirNoTetoNether implements Listener {

	@EventHandler(ignoreCancelled = true)
	public void aoTeleportar(PlayerTeleportEvent e) {
		if (e.getTo().getWorld().getEnvironment() == Environment.NETHER && e.getTo().getY() > 124.0D) {
			e.getPlayer().teleport(Locations.spawn);
			e.setCancelled(true);
		}
	}
}