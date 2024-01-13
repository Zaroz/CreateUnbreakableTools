package net.anvian.create_unbreakable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.anvian.create_unbreakable.item.tab.ModCreativeTab;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.item.CreativeModeTab;

public class CreateUnbreakableToolsMod implements ModInitializer {
	public static final String ID = "create_unbreakable";
	public static final String NAME = "Create Unbreakable Tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID);
	public static final CreativeModeTab TAB = new ModCreativeTab(ItemGroupUtil.expandArrayAndGetId(), ID);

	@Override
	public void onInitialize() {
		ModItem.register();
		ModBlock.register();
		REGISTRATE.register();

		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}
}
