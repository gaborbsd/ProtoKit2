package hu.bme.aut.oogen.cpp;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import hu.bme.aut.oogen.OOClass;
import hu.bme.aut.oogen.OOLanguage;
import hu.bme.aut.oogen.OOModel;
import hu.bme.aut.oogen.OOPackage;
import hu.bme.aut.oogen.general.GeneratedFile;
import hu.bme.aut.oogen.general.OOCodeGenerator;

public class OOCodeGeneratorCpp implements OOCodeGenerator {
	private static String EXT = ".cpp";

	private static OOCodeGeneratorCpp instance;

	public static OOCodeGeneratorCpp getInstance() {
		if (instance == null)
			instance = new OOCodeGeneratorCpp();
		return instance;
	}

	@Override
	public List<GeneratedFile> getGeneratedFiles(OOModel model) {
		List<GeneratedFile> files = new ArrayList<>();
		OOCodeGeneratorTemplatesCpp generator = OOCodeGeneratorTemplatesCpp.getInstance();
		for (OOPackage pkg : model.getPackages()) {
			String pkgPathStr = pkg.getName().replace(".", "/");
			Path pkgPath = Paths.get(pkgPathStr);

			for (OOClass cl : pkg.getClasses().stream()
					.filter(c -> c.getLanguages().isEmpty() || c.getLanguages().contains(OOLanguage.CPP))
					.collect(Collectors.toList())) {
				Path classRelPath = Paths.get(cl.getName() + EXT);
				Path classPath = pkgPath.resolve(classRelPath);

				String classDef = generator.generate(cl);
				files.add(new GeneratedFile(classPath, classDef, cl.isKeep()));
			}
		}
		return files;
	}
}