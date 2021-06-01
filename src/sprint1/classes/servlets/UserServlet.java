package sprint1.classes.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sprint1.classes.Client;
import sprint1.dao.ClientDao;
import sprint1.services.ClientService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String email=request.getParameter("email");
		String adresse=request.getParameter("adresse");
		String telephone=request.getParameter("telephone");
		double code=Double.parseDouble(request.getParameter("code"));
		PrintWriter out= response.getWriter();
		//out.print(cl.toString());
		
		
		// TODO Auto-generated method stub
		//doGet(request, response);
		//récupération des champs
		// 2 création d'instance de client
		//alt client valide => afficher un message de succés
		//alt 2 client invalide => echec
		Client cl=new Client(nom, prenom, email, adresse, telephone, code);
		cl.setSolde(0);
		ClientService cls=new ClientService();
		ClientDao cld=new ClientDao();
		if(cls.saveClient(cl))
		{
			cld.saveClient(cl);
			response.sendRedirect("user.jsp");
		}
		else
		{
			request.setAttribute("erreur","impossible d'ajouter");
			RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			out.print("impossible d'ajouter");
		}
		
	}
		
		
		
	}


