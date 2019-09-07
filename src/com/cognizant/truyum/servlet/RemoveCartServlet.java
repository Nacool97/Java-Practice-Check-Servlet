package com.cognizant.truyum.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.dao.CartDaoCollectionImpl;
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

/**
 * Servlet implementation class RemoveCartServlet
 */
public class RemoveCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RemoveCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long id =Long.parseLong( request.getParameter("id"));
		CartDaoCollectionImpl  cartDao = new CartDaoCollectionImpl();
	    long userId = 1;
	    ArrayList<MenuItem> cartList;
	    MenuItemDao menuItemDao=new MenuItemDaoCollectionImpl();
	    cartDao.removeCartItem(userId, id);
		try {
			cartList = cartDao.getAllCartItems(userId);
			 boolean removeCartStatus = true;
			 double totalValue=cartDao.getTotal(userId); 
			    request.setAttribute("rcarts",removeCartStatus);
			    request.setAttribute("x1", cartList);
				request.setAttribute("total",totalValue);
				RequestDispatcher rd = request.getRequestDispatcher("/cart.jsp");
				rd.forward(request,response);
		} catch (CartEmptyException e) {
			double totalValue=0;
			request.setAttribute("total",totalValue);
			RequestDispatcher rd = request.getRequestDispatcher("/cart-empty.jsp");
			rd.forward(request,response);
		}
	   
	    

	}



}
