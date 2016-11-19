package br.com.providerit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.providerit.vo.LogVo;
import br.com.providerit.vo.SinistroVO;
import br.com.providerit.vo.TipoSinistroVO;

/**
 * Servlet implementation class PrecisaDeNos
 */
@WebServlet("/PrecisaDeNos")
public class PrecisaDeNos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrecisaDeNos() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		SinistroVO sinistro = (SinistroVO) request.getSession().getAttribute("sinistro");
		if ("escolher".equals(action)) {


			List<LogVo> logs = new ArrayList<LogVo>();

			StringBuilder sb = new StringBuilder(300);

			sb.append("Sinistro solicitado para o veículo ");
			sb.append(sinistro.getVeiculo().getModelo());
			sb.append(" com a placa nº ");
			sb.append(sinistro.getVeiculo().getPlaca());

			if (sinistro.getTiposSinistro().size() > 1) {
				sb.append(" pelo motivo de ");
				sb.append(sinistro.getTiposSinistro().get(0));
			} else {
				sb.append(" pelos motivos de ");
				for (int i = 0; i < sinistro.getTiposSinistro().size(); i++) {
					sb.append(sinistro.getTiposSinistro().get(i));

					if (i - 2 < sinistro.getTiposSinistro().size()) {
						sb.append(", ");
					} else if (i - 2 == sinistro.getTiposSinistro().size()) {
						sb.append(" e ");
					}
				}
			}
			sb.append(".");

			logs.add(new LogVo(new Date(), sb.toString()));

			String endereco = request.getParameter("enderecoSinistro");
			
			if (Boolean.parseBoolean(request.getParameter("reboque"))) {
				//TODO: Implementar push
				logs.add(new LogVo(new Date(), "Reboque solicitado para o endereço " + endereco + "."));
			}

			if (Boolean.parseBoolean(request.getParameter("taxi"))) {
				logs.add(new LogVo(new Date(), "Taxi solicitado para o endereço " + endereco + "."));
			}

			if (Boolean.parseBoolean(request.getParameter("ambulancia"))) {
				logs.add(new LogVo(new Date(), "Ambulância solicitada para o endereço " + endereco + "."));
			}

			if (Boolean.parseBoolean(request.getParameter("bo"))) {
				logs.add(new LogVo(new Date(), "B.O nº " + (new Random().nextInt(80000000)+5215212 ) + " concluído com sucesso."));
			}
			sinistro.setLogs(logs);
			request.getSession().setAttribute("sinistro", sinistro);
			request.getRequestDispatcher("Fotos").forward(request, response);
		} else {
			
			for (TipoSinistroVO vo : sinistro.getTiposSinistro()) {
				if (vo.getId() < 3){
					request.setAttribute("aceitaBo", true);
					break;
				}
			}
			request.getRequestDispatcher("precisaDeNos.jsp").forward(request, response);
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
