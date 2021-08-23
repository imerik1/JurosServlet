package ErikSantanaJurosPOO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErikSantanaJurosPOO
 */
@WebServlet("/index.html")
public class ErikSantanaJurosPOO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErikSantanaJurosPOO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<h1>ERIK SANTANA</h1>\r\n"
				+ "<h2>1290482013016</h2>\r\n"
				+ "<a href='https://github.com/imerik1' target='__blank'>Meu github</a>"
				+ "<br />\r\n"
				+ "<br />\r\n"
				+ "<div style=\"display: flex; flex-flow: column nowrap; justify-content: center; width: 100%;\">\r\n"
				+ "  <form style=\"display: flex; flex-flow: column nowrap; width: 500px; gap: 10px\" class=\"form--juros--simples\" action=\"/ErikSantanaJurosPOO/juros_simples.html\" method=\"get\">\r\n"
				+ "    <div class=\"\">\r\n"
				+ "      <label for=\"valorAtual\">Digite o valor atual</label>\r\n"
				+ "      <input required type=\"number\" id=\"valor--atual--simples\" name=\"valor_atual\" step=\"0.01\" placeholder=\"Digite o valor atual\">\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"\">\r\n"
				+ "      <label for=\"juros\">Digite os juros</label>\r\n"
				+ "      <input required type=\"number\" id=\"juros\" name=\"juros\" step=\"0.01\" placeholder=\"Digite os juros\">\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"\">\r\n"
				+ "      <label for=\"meses\">Digite os meses</label>\r\n"
				+ "      <input required type=\"number\" id=\"meses\" name=\"meses\" placeholder=\"Digite os meses\">\r\n"
				+ "    </div>\r\n"
				+ "    <input style=\"width: 200px;\" type=\"submit\" id=\"submit\" value=\"Calcular juros simples\">\r\n"
				+ "  </form>\r\n"
				+ "  	<form style=\"display: flex; flex-flow: column nowrap; width: 500px; gap: 10px\" class=\"form--juros--compostos\" action=\"/ErikSantanaJurosPOO/juros_compostos.html\" method=\"get\">\r\n"
				+ "    <div class=\"\">\r\n"
				+ "      <label for=\"valorAtual\">Digite o valor atual</label>\r\n"
				+ "      <input required type=\"number\" id=\"valor--atual--compostos\" name=\"valor_atual\" step=\"0.01\" placeholder=\"Digite o valor atual\">\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"\">\r\n"
				+ "      <label for=\"juros\">Digite os juros</label>\r\n"
				+ "      <input required type=\"number\" id=\"juros\" name=\"juros\" step=\"0.01\" placeholder=\"Digite os juros\">\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"\">\r\n"
				+ "      <label for=\"meses\">Digite os meses</label>\r\n"
				+ "      <input required type=\"number\" id=\"meses\" name=\"meses\" placeholder=\"Digite os meses\">\r\n"
				+ "    </div>\r\n"
				+ "    <input style=\"width: 200px;\" type=\"submit\" id=\"submit\" value=\"Calcular juros compostos\">\r\n"
				+ "  </form>\r\n"
				+ "</div>\r\n"
				+ "");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
