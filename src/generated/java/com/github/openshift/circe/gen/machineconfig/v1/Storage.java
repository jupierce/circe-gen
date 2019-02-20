package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Storage extends Bean {

	@YamlPropertyName(value="directories")
	List<Directory> getDirectories() throws Exception;

	@YamlPropertyName(value="disks")
	List<Disk> getDisks() throws Exception;

	@YamlPropertyName(value="files")
	List<File> getFiles() throws Exception;

	@YamlPropertyName(value="filesystems")
	List<Filesystem> getFilesystems() throws Exception;

	@YamlPropertyName(value="links")
	List<Link> getLinks() throws Exception;

	@YamlPropertyName(value="raid")
	List<Raid> getRaid() throws Exception;

	interface EZ extends Storage {

		@YamlPropertyName(value="directories")
		default List<Directory> getDirectories() throws Exception { return null; }

		@YamlPropertyName(value="disks")
		default List<Disk> getDisks() throws Exception { return null; }

		@YamlPropertyName(value="files")
		default List<File> getFiles() throws Exception { return null; }

		@YamlPropertyName(value="filesystems")
		default List<Filesystem> getFilesystems() throws Exception { return null; }

		@YamlPropertyName(value="links")
		default List<Link> getLinks() throws Exception { return null; }

		@YamlPropertyName(value="raid")
		default List<Raid> getRaid() throws Exception { return null; }

	}

}
