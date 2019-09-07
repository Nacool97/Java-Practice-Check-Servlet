package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.*;
import com.cognizant.truyum.model.*;

/**
 * Servlet implementation class ShowMenuItemCustomerServlet
 */
public class ShowMenuItemCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMenuItemCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenuItemDao menuItemDao=new MenuItemDaoCollectionImpl();
		ArrayList<MenuItem> menuItemList=menuItemDao.getMenuItemListCustomer();
			 request.setAttribute("x",menuItemList);
	RequestDispatcher rd=request.getRequestDispatcher("/menu-item-list-customer.jsp");
				rd.forward(request, response);
	
		
		
	}

}
