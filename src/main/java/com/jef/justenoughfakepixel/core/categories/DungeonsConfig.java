package com.jef.justenoughfakepixel.core.categories;

import com.google.gson.annotations.Expose;
import com.jef.justenoughfakepixel.core.config.gui.config.ConfigAnnotations.*;
import com.jef.justenoughfakepixel.core.config.utils.Position;

import java.util.HashMap;
import java.util.Map;

public class DungeonsConfig {

    @Expose
    @ConfigOption(name = "Blood Mob Highlight", desc = "Highlight blood room mobs")
    @ConfigEditorDropdown(values = {"Box", "Outline", "Off"})
    public int bloodMobHighlight = 2;

    @Expose
    @ConfigOption(name = "Dungeon Overlay", desc = "Shows run timers overlay")
    @ConfigEditorBoolean
    public boolean dungeonStats = false;

    @Expose
    @ConfigOption(name = "Dungeon overlay Background", desc = "Draw background")
    @ConfigEditorBoolean
    public boolean statsBackground = true;

    @Expose
    @ConfigOption(name = "Edit Dungeon overlay position", desc = "Drag overlay")
    @ConfigEditorButton(runnableId = "openStatsEditor", buttonText = "Edit")
    public boolean editStatsPosDummy = false;

    @Expose
    @ConfigOption(name = "Overlay Scale", desc = "Size of overlay")
    @ConfigEditorSliderAnnotation(minValue = 0.5f, maxValue = 3f, minStep = 0.1f)
    public float statsScale = 1f;

    @Expose
    public Position statsPos = new Position(4, 100);

    @Expose
    public Map<String, Long> floorPbs = new HashMap<>();

    public long getPb(String key) {
        Long v = floorPbs.get(key);
        return v == null ? 0L : v;
    }

    public void setPb(String key, long ms) {
        floorPbs.put(key, ms);
    }
}