/**
 * Copyright 2018-2020 Zxxx All right reserved.
 *
 * 建立一个系统数据缓存层异常类，主要完成数据层的异常抛出.
 *
 * @author Kevin
 * @date 2018-11-25
 * @version V1.0
 */
package com.example.boot.error;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * AppDCOException 系统数据缓存层异常类.
 *
 * @author Kevin
 * @date 2018-11-25
 * @version V1.0
 */
public class AppDCOException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;
	
	
	
	public AppDCOException(String message)
	{
		super(message);
	}
	
	
	
	public AppDCOException(String message,Throwable cause)
	{
		super(message,cause);
	}
	
	
	
	public AppDCOException(Throwable cause)
	{
		super(cause);
	}
	
	
	
	public String getMessage()
	{
		return super.getMessage();
	}
	
	
	
	public Throwable getRootCause()
	{
		return super.getCause();
	}
	
	
	
	public void printStackTrace()
	{
		super.printStackTrace();
	}
	
	
	
	public void printStackTrace(PrintStream s)
	{
		super.printStackTrace(s);
	}
	
	
	
	public void printStackTrace(PrintWriter s)
	{
		super.printStackTrace(s);
	}
	
	
	
}
