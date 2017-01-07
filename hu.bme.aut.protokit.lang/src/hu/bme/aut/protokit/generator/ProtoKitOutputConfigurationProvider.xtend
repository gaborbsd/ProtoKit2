package hu.bme.aut.protokit.generator

import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.IFileSystemAccess

class ProtoKitOutputConfigurationProvider implements IOutputConfigurationProvider {
	public static final String GEN_ONCE_OUTPUT = "gen-once";

	override getOutputConfigurations() {
		val OutputConfiguration	defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Generated Source Folder");
		defaultOutput.setOutputDirectory("./src-gen");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCleanUpDerivedResources(true);
		defaultOutput.setSetDerivedProperty(true);

		val OutputConfiguration	readonlyOutput = new OutputConfiguration(GEN_ONCE_OUTPUT);
		readonlyOutput.setDescription("Source Folder");
		readonlyOutput.setOutputDirectory("./src");
		readonlyOutput.setOverrideExistingResources(false);
		readonlyOutput.setCreateOutputDirectory(true);
		readonlyOutput.setCleanUpDerivedResources(false);
		readonlyOutput.setSetDerivedProperty(false);
		return newHashSet(defaultOutput, readonlyOutput);
	}

}
