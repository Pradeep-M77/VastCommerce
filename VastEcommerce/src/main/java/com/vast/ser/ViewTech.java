package com.vast.ser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vast.dao.DaoVast;
import com.vast.dao.IDao;

public class ViewTech implements Handle  {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		IDao dao=DaoVast.getDaoInstance();
		String Electronic=request.getParameter("txtcategory");
		request.setAttribute("Electronics", dao.getProduct(Electronic));
		return "ViewTech.jsp";
	}

}
