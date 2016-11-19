package br.com.providerit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.providerit.vo.TipoSinistroVO;

/**
 * Servlet implementation class TipoSinistro
 */
@WebServlet("/TipoSinistro")
public class TipoSinistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static List<TipoSinistroVO> tiposSinistro; 
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TipoSinistro() {
        super();
        
        if (tiposSinistro == null){
        	
        	tiposSinistro = new ArrayList<TipoSinistroVO>();
        	tiposSinistro.add(new TipoSinistroVO(1, "Roubo"));
        	tiposSinistro.add(new TipoSinistroVO(2, "Furto"));
        	tiposSinistro.add(new TipoSinistroVO(3, "Colisão"));
        	tiposSinistro.add(new TipoSinistroVO(4, "Alagamento"));
        	tiposSinistro.add(new TipoSinistroVO(5, "Incêndio"));
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
