/**
 * Copyright 2018-2020 Zxxx All right reserved.
 *
 * 建立一个系统工具异常类，主要完成系统工具的异常抛出.
 *
 * @author Kevin
 * @date 2018-11-25
 * @version V1.0
 */
package com.example.boot.error;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * AppUtilException 系统工具异常类.
 *
 * @author Kevin
 * @date 2018-11-25
 * @version V1.0
 */
public class AppUtilException extends RuntimeException
{
	
	private static final long serialVersionUID = 1L;
	
	
	
	public AppUtilException(String message)
	{
		super(message);
	}
	
	
	
	public AppUtilException(String message,Throwable cause)
	{
		super(message,cause);
	}
	
	
	
	public AppUtilException(Throwable cause)
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
