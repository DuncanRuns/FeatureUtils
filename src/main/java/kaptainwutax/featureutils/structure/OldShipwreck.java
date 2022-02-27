package kaptainwutax.featureutils.structure;

import kaptainwutax.mcutils.version.MCVersion;

public class OldShipwreck extends Shipwreck {
	public OldShipwreck(MCVersion version) {
		super(version);
	}

	public OldShipwreck(Config config, MCVersion version) {
		super(config, version);
	}

	@Override
	public boolean shouldAdvanceInChunks() {
		return false;
	}

	@Override
	public int getDecorationSalt() {
		return 30005;
	}
}
