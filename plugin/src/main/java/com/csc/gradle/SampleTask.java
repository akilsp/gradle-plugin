package com.csc.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.TaskExecutionException;

public class SampleTask extends DefaultTask {

  @TaskAction
  public void samplePluginTasks() throws TaskExecutionException {
    try{

      SamplePluginExtension extension = getProject().getExtensions().findByType(SamplePluginExtension.class);
      String filePath = extension.getSampleFilePath();
      System.out.println("File Path: "+filePath);

    }catch(Exception e){
      throw new TaskExecutionException(this, new Exception("Exception occured while processing simpleTask",e));
    }
  }
}



