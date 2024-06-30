package io.starfall.template;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateMod implements ModInitializer {

	public static final String NAME = "Template Mod";
	public static final String ID = NAME.toLowerCase().replace(' ', '_');
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Loaded successfully");
	}

}
