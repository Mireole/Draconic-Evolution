package com.brandon3055.draconicevolution.integration.computers;

/**
 * Created by brandon3055 on 21/9/2015.
 */
public class CCOCIntegration {

	public static void init() {
//		if (Loader.isModLoaded("ComputerCraft")) initCC();
//		if (Loader.isModLoaded("OpenComputers")) initOC();
	}
//
//	@Optional.Method(modid = "ComputerCraft")
//	public static void initCC() {
//		ComputerCraftAPI.registerPeripheralProvider(new DEPeripheralProvider());
//	}
//
//	@Optional.Method(modid = "OpenComputers")
//	public static void initOC() {
//		Driver.add(new OCAdapter());
//	}
//
//	public static class OCAdapter extends DriverTileEntity {
//
//		@Override
//		public Class<?> getTileEntityClass() {
//			return IDEPeripheral.class;
//		}
//
//		@Override
//		public ManagedEnvironment createEnvironment(World world, int x, int y, int z) {
//			return new DEManagedPeripheral((IDEPeripheral)world.tileEntity(x, y, z));
//		}
//	}
//
//	public static class DEPeripheralProvider implements IPeripheralProvider {
//
//		@Override
//		public IPeripheral getPeripheral(World world, int x, int y, int z, int i3) {
//			TileEntity tile = world.tileEntity(x, y, z);
//			if (tile instanceof IDEPeripheral) {
//				return new CCAdapter((IDEPeripheral)tile);
//			}
//			else return null;
//		}
//	}

}
