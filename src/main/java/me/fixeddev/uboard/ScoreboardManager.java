package me.fixeddev.uboard;

import me.fixeddev.uboard.builder.ScoreboardBuilder;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.Optional;

public interface ScoreboardManager {
    Optional<ScoreboardObjective> getScoreboard(String name);

    void registerScoreboard(ScoreboardObjective objective, Scoreboard usedScoreboard);

    void removeScoreboard(ScoreboardObjective objective);

    ScoreboardBuilder newScoreboard(String name);

    ScoreboardBuilder newScoreboard(String name, Scoreboard scoreboard);

    Optional<Scoreboard> getBackingScoreboard(ScoreboardObjective objective);

    ScoreboardManager stopUpdating(ScoreboardObjective scoreboard);

    ScoreboardManager startUpdating(ScoreboardObjective scoreboard);

    ScoreboardManager setToPlayer(Player player, ScoreboardObjective scoreboard);

    ScoreboardManager removeScoreboard(Player player);

    /**
     * Stops the updating tasks for this manager.
     */
    void stop();
}
