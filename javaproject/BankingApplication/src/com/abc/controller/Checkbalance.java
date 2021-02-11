package com.abc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.abc.model.Model;

@WebServlet("/Checkbalance")
public class Checkbalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		session = request.getSession();
		int accno = (int) session.getAttribute("accno");
		try {
			Model m = new Model();
			m.setAccno(accno);
			
			boolean b = m.checkBalance();
			if (b==true) {
				session.setAttribute("bal", m.getBal());
				response.sendRedirect("/BankingApplication/BalanceView.jsp");
			}else {
				response.sendRedirect("/BankingApplication/BalanceFail.html");

			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
