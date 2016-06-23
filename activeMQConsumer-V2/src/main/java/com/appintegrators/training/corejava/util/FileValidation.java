package com.appintegrators.training.corejava.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class FileValidation implements Callable {
	static boolean value;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String id = eventContext.getMessage().getInvocationProperty("File_ID");
		File directory = new File(
				"E:/training/poc_workspace/activeMQConsumer-V2/src/main/resources/Output");
		List<File> fList = new ArrayList<File>(Arrays.asList(directory
				.listFiles()));

		for (File file : fList) {
			if (file.isFile()) {
				value = file.getName().contains(id);
			}
		}
		return value;
	}

}