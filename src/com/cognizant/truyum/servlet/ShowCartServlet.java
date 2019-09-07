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
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

/**
 *  implementation class ShowCartServlet
 */
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CartDaoCollectionImpl cartdao = new CartDaoCollectionImpl();
		long userId = 1;
	

		try 
		{
			ArrayList<MenuItem> cartList  = cartdao.getAllCartItems(userId);
			double totalValue = cartdao.getTotal(userId);
			
			request.setAttribute("x1",cartList);
			request.setAttribute("total",totalValue);
			RequestDispatcher rd=request.getRequestDispatcher("/cart.jsp");
			rd.forward(request, response);
		} catch (CartEmptyException e)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/cart-empty.jsp");
			rd.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
