package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.Dateutil;

/**
 * Servlet implementation class EditMenuItemServlet
 */
public class EditMenuItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditMenuItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Date date=null;
		MenuItemDao menuItemDao=new MenuItemDaoCollectionImpl();
		long id =Long.parseLong(request.getParameter("id"));
		String title=request.getParameter("title");
	
		try {
			date = Dateutil.convertToDate(request.getParameter("dateOfLaunch"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		float price=Float.parseFloat(request.getParameter("price"));
		String cat=request.getParameter("category");
		String act = request.getParameter("act");
		System.out.println(act);
		boolean active=Boolean.parseBoolean(act);
		
		String free = request.getParameter("fd");
		boolean fd=Boolean.parseBoolean(free);
		doGet(request, response);
		MenuItem menuitem = new MenuItem(id,title,cat,price,active,fd,date);
		menuItemDao.modifyMenuItem(menuitem);
		RequestDispatcher rd=request.getRequestDispatcher("/edit-menu-item-status.jsp");
		rd.forward(request, response);
	}
}
