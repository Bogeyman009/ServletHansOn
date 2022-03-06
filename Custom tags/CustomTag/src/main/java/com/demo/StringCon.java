package com.demo;

import java.io.IOException;
import java.io.StringWriter;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class StringCon extends SimpleTagSupport {

	private String first,last;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	public void doTag() throws IOException, JspException {
		final StringWriter sw = new StringWriter();
        getJspBody().invoke( sw );
 
        JspWriter out = getJspContext().getOut();
		out.println("The concatenation of "+first+" and "+last+" is: "+ (first+last));
		
	}
}
