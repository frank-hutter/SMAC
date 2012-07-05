package ca.ubc.cs.beta.smac.misc.version;

import org.mangosdk.spi.ProviderFor;

import ca.ubc.cs.beta.aclib.misc.version.AbstractVersionInfo;
import ca.ubc.cs.beta.aclib.misc.version.VersionInfo;

@ProviderFor(VersionInfo.class)
public class SMACVersionInfo extends AbstractVersionInfo {

	public SMACVersionInfo()
	{
		super("SMAC", "smac-version.txt",true);
	}
}
