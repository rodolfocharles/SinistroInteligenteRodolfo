package br.com.providerit.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.addressing.model.ActionNotSupportedException;

import br.com.providerit.vo.VeiculoVO;

/**
 * Servlet implementation class EscolherVeiculo
 */
@WebServlet("/EscolherVeiculo")
public class EscolherVeiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static List<VeiculoVO> veiculos;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EscolherVeiculo() {
        super();
        
        if (EscolherVeiculo.veiculos == null){
        	veiculos = new ArrayList<VeiculoVO>();
        	
        	veiculos.add(new VeiculoVO(1,"LLL-1212","Honda Civic"));
        	veiculos.add(new VeiculoVO(2,"AAA-4848","Peugeout 206"));
        	veiculos.add(new VeiculoVO(3,"ABA-1234","Monza"));
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
