package com.ssm.wuye.appcomm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.rmi.CORBA.Util;

public class UtilDate {

	
	
	public static String getUUID() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssssss");// yyyy-MM-dd
																	// EE
																	// hh:mm:ss
		return sdf.format(new Date());

	}
	
	public static String getYYYY() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");// yyyy-MM-dd
																	// EE
																	// hh:mm:ss
		return sdf.format(new Date());

	}
	
	public static String getYYYYMMDD() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// yyyy-MM-dd
																	// EE
																	// hh:mm:ss
		return sdf.format(new Date());

	}

	public static String getEE() {

		SimpleDateFormat sdf = new SimpleDateFormat("EE");// yyyy-MM-dd EE
															// hh:mm:ss
		return sdf.format(new Date());

	}

	public static String getYYYYMMDDHHMMSS() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// yyyy-MM-dd
																			// EE
																			// hh:mm:ss
		return sdf.format(new Date());

	}

	public static Date getDate_YYYYMMDD() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// yyyy-MM-dd
																	
		try {
			return sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			// op Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {

		System.out.println(UtilDate.getYYYYMMDD());
		System.out.println(UtilDate.getEE());
		System.out.println(UtilDate.getYYYYMMDDHHMMSS());
		
		
		
		System.out.println(UtilDate.getDate_YYYYMMDD());
		
			System.out.println(UtilDate.getUUID());

	}

}
