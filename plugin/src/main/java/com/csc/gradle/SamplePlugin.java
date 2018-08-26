package com.csc.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SamplePlugin implements Plugin<Project> {
  @Override
  public void apply(Project project){
    //create extension using extension class and register with plugin to receive inputs from user
    project.getExtensions().create("samplePlugin", SamplePluginExtension.class);
  }
}


