package com.jspDemo.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomDateTag extends SimpleTagSupport{
	
	private String format;

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		
		out.print("<h3> Custom Date is : "
				+ new SimpleDateFormat(format).format(new Date())+"</h3>");	
	}

}
