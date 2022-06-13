package com.jspDemo.tags;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintDateTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		JspWriter out = getJspContext().getOut();
		out.print("<h3> Current Date is : "
				+ new SimpleDateFormat("dd-MM-yyyy hh:mm:ss EEE").format(new Date()));	
	}
	
}
