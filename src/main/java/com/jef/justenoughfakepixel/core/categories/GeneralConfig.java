package com.jef.justenoughfakepixel.core.categories;

import com.google.gson.annotations.Expose;
import com.jef.justenoughfakepixel.core.config.gui.config.ConfigAnnotations.*;

public class GeneralConfig {

    @Expose
    @ConfigOption(name = "Damage Splashes", desc = "Settings for damage number nametags")
    @ConfigEditorAccordion(id = 0)
    public boolean damageSplashesAccordion = false;

    @Expose
    @ConfigOption(name = "Hide Crit Splashes", desc = "Hides crit damage nametags (✧ stars)")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean hideCritSplashes = false;

    @Expose
    @ConfigOption(name = "Hide Non-Crit Splashes", desc = "Hides gray and fire-aspect damage numbers")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    public boolean hideNonCritSplashes = false;

    @Expose
    @ConfigOption(name = "Roman Numerals", desc = "Converts Roman numerals to integers")
    @ConfigEditorBoolean
    public boolean romanNumerals = true;

    @Expose
    @ConfigOption(name = "Skyblock ID", desc = "Shows skyblock item ID in tooltip")
    @ConfigEditorBoolean
    public boolean showSkyblockId = true;

    @Expose
    @ConfigOption(name = "Disable Enchant Glint", desc = "Removes enchantment glint")
    @ConfigEditorBoolean
    public boolean disableEnchantGlint = false;

    @Expose
    @ConfigOption(name = "Brewing helper", desc = "Highlights brewing stands when done")
    @ConfigEditorBoolean
    public boolean colorBrewingStands = true;
}