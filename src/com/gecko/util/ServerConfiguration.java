package com.gecko.util;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.logging.Logger;

import com.gecko.Constants;
import com.gecko.cache.CacheManager;
import com.gecko.model.world.def.WorldListBuilder;
import com.gecko.plugin.PluginManager;
import com.gecko.util.region.MapDataPacker;
import com.gecko.util.region.MapDataReader;

/**
 * ServerConfiguration.java
 * RuneCore 525 www.runecore.org
 * @author Canownueasy, Sinisoul + Harry Andreas
 * 4 Jun 2011
 */
public class ServerConfiguration {
	
	/**
	 * The XStream instance
	 */
	public XStreamParser xStream = new XStreamParser();
	
	/**
	 * JavaScript manager
	 */
	public JavaScriptManager jsManager = new JavaScriptManager();
	
	/**
	 * WorldListBuilder instance
	 */
	private WorldListBuilder worldListBuilder = new WorldListBuilder();
		
	/**
	 * Logger instance
	 */
	public Logger logger = Logger.getLogger(ServerConfiguration.class.getName());
	
	/**
	 * RegionKey instance
	 */
	private RegionKeys regionKeys = new RegionKeys();
	
	/**
	 * The plug-in manager
	 */
	private PluginManager pluginManager = new PluginManager();
	
	/**
	 * Instance of the cache manager
	 */
	private CacheManager cacheManager;
	
	/**
	 * This makes you wish that Java supported typedefs.
	 */
	private Map<Integer, int[]> mapData = new java.util.HashMap<Integer, int[]>();
	
	/**
	 * Sets up the server
	 */
	public void setupServer() {
		call("start.configXStream", this);
		call("start.readWorldList", this);
		call("start.buildRegionData", this, new Constants(), new MapDataPacker(), new MapDataReader());
		call("start.loadPlugins", getPluginManager());
		try {
			setCacheManager(new CacheManager());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
	
	/**
	 * Calls a script
	 * @param script the script name
	 * @param args the argumenets
	 * @return
	 */
	public Object call(String script, Object... args) {
		return jsManager.call(script, args);
	}

	/**
	 * @param worldListBuilder the worldListBuilder to set
	 */
	public void setWorldListBuilder(WorldListBuilder worldListBuilder) {
		this.worldListBuilder = worldListBuilder;
	}

	/**
	 * @return the worldListBuilder
	 */
	public WorldListBuilder getWorldListBuilder() {
		return worldListBuilder;
	}

	/**
	 * @param mapData the mapData to set
	 */
	public void setMapData(Map<Integer, int[]> mapData) {
		this.mapData = mapData;
	}

	/**
	 * @return the mapData
	 */
	public Map<Integer, int[]> getMapData() {
		return mapData;
	}

	/**
	 * @param regionKeys the regionKeys to set
	 */
	public void setRegionKeys(RegionKeys regionKeys) {
		this.regionKeys = regionKeys;
	}

	/**
	 * @return the regionKeys
	 */
	public RegionKeys getRegionKeys() {
		return regionKeys;
	}

	/**
	 * @param pluginManager the pluginManager to set
	 */
	public void setPluginManager(PluginManager pluginManager) {
		this.pluginManager = pluginManager;
	}

	/**
	 * @return the pluginManager
	 */
	public PluginManager getPluginManager() {
		return pluginManager;
	}

	/**
	 * @param cacheManager the cacheManager to set
	 */
	public void setCacheManager(CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	/**
	 * @return the cacheManager
	 */
	public CacheManager getCacheManager() {
		return cacheManager;
	}
}