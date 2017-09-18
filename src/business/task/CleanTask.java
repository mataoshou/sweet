package business.task;

import java.io.File;

import frame.sys.BaseTask;

public class CleanTask extends BaseTask
{

	@Override
	public void excute()
	{
		String path = "";
		File f = new File(path);

		File[] child = f.listFiles();
	}
}
