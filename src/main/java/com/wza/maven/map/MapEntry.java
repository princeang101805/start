package com.wza.maven.map;

import java.util.Map;

public class MapEntry {
	private Map<String,Object> map;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public MapEntry() {}

	@Override
	public String toString() {
		return "MapEntry [map=" + map + "]";
	}
	
}
