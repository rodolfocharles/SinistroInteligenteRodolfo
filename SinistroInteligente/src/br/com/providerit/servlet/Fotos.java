package br.com.providerit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.providerit.vo.SinistroVO;

/**
 * Servlet implementation class Fotos
 */
@WebServlet("/Fotos")
@MultipartConfig
public class Fotos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fotos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("fotos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		SinistroVO sinistro = (SinistroVO) request.getSession().getAttribute("sinistro");
		if ("fotos".equals(action)) {
//			String description = request.getParameter("description"); // Retrieves <input type="text" name="description">
//		    Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
//		    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
//		    InputStream fileContent = filePart.getInputStream();
	
			//TODO:Implementar o carinha aqui
			
			
			
			response.sendRedirect("DescricaoSinistro");
		}else{
			doGet(request, response);
		}
		
		
	}

}
