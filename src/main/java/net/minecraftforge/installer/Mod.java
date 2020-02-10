package net.minecraftforge.installer;

import java.util.Objects;

import argo.jdom.JsonNode;

public class Mod {
	
	public final String name;
	public final String path;
	
	public Mod(String name, String path) {
		Objects.requireNonNull(name, "Mod name must not be null.");
		Objects.requireNonNull(path, "Mod path/url must not be null.");
		this.name = name;
		this.path = path;
	}
	
	public Mod(JsonNode node) {
		this(node.getStringValue("name"), node.getStringValue("url"));
	}
}
