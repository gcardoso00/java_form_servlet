package com.t;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
		try {
		response.setContentType("text/html");
		
		String nome = request.getParameter("Nome");
		
		int idade = Integer.parseInt(request.getParameter("pergunta-1"));
		if(idade >=24) {
			idade = 1;
		}else if(idade >=25 && idade <=39) {
			idade = 2;
		}else if(idade >=40 && idade <=59) {
			idade = 3;
		}else if(idade >=60 && idade <=75) {
			idade = 4;
		}else {
			idade = 5;
		}
			
		
		
		int pergunta_2 = Integer.parseInt(request.getParameter("pergunta-2"));
		
		int pergunta_3 = Integer.parseInt(request.getParameter("pergunta-3"));
		
		int pergunta_4 = Integer.parseInt(request.getParameter("pergunta-4"));
		
		int pergunta_5 = Integer.parseInt(request.getParameter("pergunta-5"));
		
		double risco = (idade + pergunta_2 + pergunta_3 + pergunta_4 + pergunta_5) / 3;
		
		
		request.setAttribute("name", nome);
		request.setAttribute("porcent", risco);
		
		request.getRequestDispatcher("a1.jsp").forward(request, response);
	
		response.sendRedirect("a1.jsp");
		
		}catch (Exception e) {
			
		}
		
		try {
		String resp = request.getParameter("voltar");
		if(resp.equals("sim"))
			response.sendRedirect("a1.html");
		}
		catch (Exception e) {

		}
		
		
	
	}
	
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
