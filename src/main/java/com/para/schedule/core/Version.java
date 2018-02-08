package com.para.schedule.core;

/**
 * 
 * @author para
 *
 */
public class Version {
	
   private final static String version="distributed-schedule-1.0.0";
   
   public static String getVersion(){
	   return version;
   }
   public static boolean isCompatible(String dataVersion){
	   return version.compareTo(dataVersion) >= 0;
   }
   
}
