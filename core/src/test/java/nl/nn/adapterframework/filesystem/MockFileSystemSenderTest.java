package nl.nn.adapterframework.filesystem;

public class MockFileSystemSenderTest extends FileSystemSenderTest <MockFile,MockFileSystem>{

	
	@Override
	protected MockFileSystem getFileSystem() {
		return new MockFileSystem();
	}

	@Override
	protected IFileSystemTestHelper getFileSystemTestHelper() {
		return new MockFileSystemTestHelper(fileSystem);
	}


}