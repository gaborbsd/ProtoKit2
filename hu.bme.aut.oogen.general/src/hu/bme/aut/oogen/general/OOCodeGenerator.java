package hu.bme.aut.oogen.general;

import java.util.List;

import hu.bme.aut.oogen.OOModel;

public interface OOCodeGenerator {
	List<GeneratedFile> getGeneratedFiles(OOModel model);
}
