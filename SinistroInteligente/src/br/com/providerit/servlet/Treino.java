package br.com.providerit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Treino
 */
@WebServlet("/Treino")
public class Treino extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Treino() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		throw new NullPointerException();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	
	
	public ServiceCall createClassifier(CreateClassifierOptions options) {
	    Validator.notNull(options, " options cannot be null");

	    Builder bodyBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM);
	    bodyBuilder.addFormDataPart(PARAM_NAME, options.classifierName());

	    // Classes
	    for (String className : options.classNames()) {
	      String dataName = className + "_" + PARAM_POSITIVE_EXAMPLES;
	      RequestBody requestBody =
	          RequestBody.create(HttpMediaType.BINARY_FILE, options.positiveExamplesByClassName(className));
	      bodyBuilder.addFormDataPart(dataName, options.positiveExamplesByClassName(className).getName(), requestBody);
	    }

	    if (options.negativeExamples() != null) {
	      RequestBody requestBody = RequestBody.create(HttpMediaType.BINARY_FILE, options.negativeExamples());
	      bodyBuilder.addFormDataPart(PARAM_NEGATIVE_EXAMPLES, options.negativeExamples().getName(), requestBody);
	    }

	    RequestBuilder requestBuilder = RequestBuilder.post(PATH_CLASSIFIERS);
	    requestBuilder.query(VERSION, versionDate).body(bodyBuilder.build());

	    return createServiceCall(requestBuilder.build(), ResponseConverterUtils.getObject(VisualClassifier.class));
	  }

}
