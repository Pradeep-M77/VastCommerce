package com.vast.ser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Handle {
   String execute(HttpServletRequest request,HttpServletResponse response);
}
