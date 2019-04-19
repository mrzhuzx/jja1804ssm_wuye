package com.ssm.wuye.appcomm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MyUUID {
	
	
	
	public static String getUUID() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssssss");// yyyy-MM-dd
																	// EE
																	// hh:mm:ss
		return sdf.format(new Date());

	}

	
	
	
	public static String getProviderID() {

		Random r=new Random();
		
		String id="GZ_GYS"+Calendar.YEAR+Calendar.MONTH+(r.nextInt(1000)+100);
		return id;

	}

}
