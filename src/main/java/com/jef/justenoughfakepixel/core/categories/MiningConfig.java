package com.jef.justenoughfakepixel.core.categories;

import com.google.gson.annotations.Expose;
import com.jef.justenoughfakepixel.core.config.gui.config.ConfigAnnotations.*;

public class MiningConfig {

    @Expose
    @ConfigOption(name = "Fetchur Helper", desc = "Prints what Fetchur wants")
    @ConfigEditorBoolean
    public boolean fetchurHelper = true;
}