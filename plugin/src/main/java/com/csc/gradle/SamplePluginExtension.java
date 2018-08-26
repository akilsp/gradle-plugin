package com.csc.gradle;

public class SamplePluginExtension {
 private String sampleFilePath="/home/pon/abc";

  public String getSampleFilePath() {
    return sampleFilePath;
  }

  public void setSampleFilePath(String sampleFilePath) {
    this.sampleFilePath = sampleFilePath;
  }
}




