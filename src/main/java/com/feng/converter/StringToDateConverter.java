package com.feng.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date>
{
	private String datePattern;
	public void setDatePattern(String datePattern)
	{
		this.datePattern = datePattern;
	}

	@Override
	public Date convert(String date)
	{
		try
		{
			SimpleDateFormat sdFormat= new SimpleDateFormat(datePattern);
			return sdFormat.parse(date);
		}
		catch (Exception e)
		{
			// e: handle exception
			e.printStackTrace();
			System.out.println("日期转换失败");
			return null;
		}
	}
	
}
