package me.fixeddev.uboard.animated;

import me.fixeddev.uboard.Line;
import me.fixeddev.uboard.ScoreboardObjective;

import java.util.ArrayList;
import java.util.List;

public interface AnimatedScoreboardObjective extends ScoreboardObjective {
    AnimatedScoreboardObjective setAnimatedLines(List<AnimatedLine> lines);

    AnimatedScoreboardObjective setTitle(AnimatedLine line);

    @Override
    AnimatedScoreboardObjective setTitle(String newTitle);

    @Override
    AnimatedScoreboardObjective setLines(List<Line> lines);

    @Override
    default AnimatedScoreboardObjective setStringLines(List<String> lines) {
        List<Line> entries = new ArrayList<>();

        for (String line : lines) {
            entries.add(Line.of(line));
        }

        return setLines(entries);
    }
}
