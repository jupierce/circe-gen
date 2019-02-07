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

}
