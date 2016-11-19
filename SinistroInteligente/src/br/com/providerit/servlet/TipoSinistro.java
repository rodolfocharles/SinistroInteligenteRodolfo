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

	public static Map<Integer,TipoSinistroVO> tiposSinistro;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TipoSinistro() {
		super();

		if (tiposSinistro == null) {

			tiposSinistro = new HashMap<Integer, TipoSinistroVO>();
			tiposSinistro.put(1,new TipoSinistroVO(1l, "Roubo"));
			tiposSinistro.put(2,new TipoSinistroVO(2l, "Furto"));
			tiposSinistro.put(3,new TipoSinistroVO(3l, "Colisão"));
			tiposSinistro.put(4,new TipoSinistroVO(4l, "Alagamento"));
			tiposSinistro.put(5,new TipoSinistroVO(5l, "Incêndio"));
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if ("escolher".equals(action)) {

			SinistroVO sinistro = (SinistroVO) request.getSession().getAttribute("sinistro");
			
			List<TipoSinistroVO> tiposSinistro = new ArrayList<TipoSinistroVO>();
			
			
			for (String s : request.getParameterValues("idTipoSinitro")) {
				
				tiposSinistro.add(TipoSinistro.tiposSinistro.get(Integer.valueOf(s)));
			}
			sinistro.setTiposSinistro(tiposSinistro);
			
			request.getSession().setAttribute("sinistro", sinistro);

			request.getRequestDispatcher("PrecisaDeNos").forward(request, response);
		} else {
			request.setAttribute("listaTiposSinistro", tiposSinistro.values());
			request.getRequestDispatcher("tiposSinistro.jsp").forward(request, response);
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
