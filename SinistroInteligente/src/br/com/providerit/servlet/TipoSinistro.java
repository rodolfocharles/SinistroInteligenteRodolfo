package br.com.providerit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.providerit.vo.SinistroVO;
import br.com.providerit.vo.TipoSinistroVO;

/**
 * Servlet implementation class TipoSinistro
 */
@WebServlet("/TipoSinistro")
public class TipoSinistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static Map<Integer,TipoSinistroVO> tiposSinistro= new HashMap<Integer, TipoSinistroVO>();

	static {
		
		tiposSinistro.put(1,new TipoSinistroVO(1l, "Roubo"));
		tiposSinistro.put(2,new TipoSinistroVO(2l, "Furto"));
		tiposSinistro.put(3,new TipoSinistroVO(3l, "Colis�o"));
		tiposSinistro.put(4,new TipoSinistroVO(4l, "Alagamento"));
		tiposSinistro.put(5,new TipoSinistroVO(5l, "Inc�ndio"));
	}
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TipoSinistro() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if ("tipo".equals(action)) {
			System.out.println("Caiu no escolher do tipoSinistro");
			SinistroVO sinistro = (SinistroVO) request.getSession().getAttribute("sinistro");
			System.out.println("Sinistro");
			System.out.println(sinistro);
			
			List<TipoSinistroVO> tiposSinistro = new ArrayList<TipoSinistroVO>();
			
			System.out.println(request.getParameterValues("idTipoSinitro"));
			for (String s : request.getParameterValues("idTipoSinitro")) {
				System.out.println(s);
				tiposSinistro.add(TipoSinistro.tiposSinistro.get(Integer.valueOf(s)));
			}
			System.out.println(tiposSinistro);
			sinistro.setTiposSinistro(tiposSinistro);
			System.out.println(sinistro);
			request.getSession().setAttribute("sinistro", sinistro);

			response.sendRedirect("PrecisaDeNos");
		} else {
			System.out.println("Caiu no else do tipoSinistro");
			request.setAttribute("listaTiposSinistro", TipoSinistro.tiposSinistro.values());
			request.getRequestDispatcher("tipoSinistro.jsp").forward(request, response);
		}

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
