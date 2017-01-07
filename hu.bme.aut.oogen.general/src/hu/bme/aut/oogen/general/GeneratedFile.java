package hu.bme.aut.oogen.general;

import java.nio.file.Path;

public class GeneratedFile {
	private Path path;
	private String content;
	private boolean keep;

	public GeneratedFile() {
	}

	public GeneratedFile(Path path, String content) {
		this(path, content, false);
	}

	public GeneratedFile(Path path, String content, boolean keep) {
		super();
		this.path = path;
		this.content = content;
		this.keep = keep;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isKeep() {
		return keep;
	}

	public void setKeep(boolean keep) {
		this.keep = keep;
	}
}