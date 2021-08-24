package ErikSantanaJurosPOO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JurosSimplesServlet
 */
@WebServlet("/juros_simples.html")
public class JurosSimplesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JurosSimplesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// C * (1 + i * n)
		try {
			Double capital = Double.parseDouble(request.getParameter("valor_atual"));
			Double juros = Double.parseDouble(request.getParameter("juros"));
			Integer meses = Integer.parseInt(request.getParameter("meses"));
			Double valorFinal = capital * (1 + (juros/100) * meses);
			response.getWriter().append("<h1>O valor do juros simples é "+String.format("%.2f", valorFinal)+"</h1>");
		} catch (Exception ex) {
			response.getWriter().append("<h1>Ocorreu um erro ao calcular os juros simples.</h1>");
		}
		response.getWriter().append("<a href='/ErikSantanaJurosPOO/index.html'>Voltar ao inicio</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
