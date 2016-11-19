package br.com.providerit.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.providerit.vo.SinistroVO;
import br.com.providerit.vo.VeiculoVO;

/**
 * Servlet implementation class EscolherVeiculo
 */
@WebServlet("/EscolherVeiculo")
public class EscolherVeiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static Map<Integer, VeiculoVO> veiculos;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EscolherVeiculo() {
        super();
        
        if (EscolherVeiculo.veiculos == null){
        	veiculos = new HashMap<Integer,VeiculoVO>();
        	
        	veiculos.put(1,new VeiculoVO(1l,"LLL-1212","Honda Civic"));
        	veiculos.put(2,new VeiculoVO(2l,"AAA-4848","Peugeout 206"));
        	veiculos.put(3,new VeiculoVO(3l,"ABA-1234","Gol"));
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if ("escolher".equals(action)){
			
			SinistroVO sinistro = new SinistroVO();
			sinistro.setVeiculo(veiculos.get(Integer.parseInt(request.getParameter("idVeiculo"))));
			request.getSession().setAttribute("sinistro", sinistro);
			
			request.getRequestDispatcher("TipoSinistro").forward(request, response);
		}else{
			request.setAttribute("listaVeiculos", veiculos.values());
			request.getRequestDispatcher("escolherVeiculo.jsp").forward(request, response);
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
