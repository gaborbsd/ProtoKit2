package hu.bme.aut.oogen.general;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import hu.bme.aut.oogen.OOClass;
import hu.bme.aut.oogen.OOModel;
import hu.bme.aut.oogen.OOPackage;

public class OOCodeGeneratorUtil {

	private static void checkOrCreateDir(File dir) {
		if (!dir.exists())
			dir.mkdirs();
		else if (!dir.isDirectory())
			throw new IllegalArgumentException("Specified path is not a directory.");
	}

	public void generate(OOModel model, Path baseDir) {
		generate(model, baseDir.toFile());
	}

	public void generate(OOModel model, File baseDir) {
		checkOrCreateDir(baseDir);

		for (OOPackage pkg : model.getPackages()) {
			File pkgDir = new File(baseDir, pkg.getName().replace('.', '/'));
			checkOrCreateDir(pkgDir);

			for (OOClass cl : pkg.getClasses()) {
				File classSrc = new File(pkgDir, cl.getName());
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(classSrc));) {

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
