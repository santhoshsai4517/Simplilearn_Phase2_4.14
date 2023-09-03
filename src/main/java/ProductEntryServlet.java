

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecommerce.ProductBean;

/**
 * Servlet implementation class ProductEntryServlet
 */
@WebServlet("/ProductEntryServlet")
public class ProductEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductEntryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve product details from the form
        String productName = request.getParameter("productName");
        String productId = request.getParameter("productId");
        double price = Double.parseDouble(request.getParameter("price"));
        
        // Create a Product object
        ProductBean product = new ProductBean();
        product.setProductName(productName);
        product.setProductId(productId);
        product.setPrice(price);
        
        // Store the product in the session
        HttpSession session = request.getSession();
        session.setAttribute("product", product);
        
        // Redirect to the second JSP page
        response.sendRedirect("ProductDisplay.jsp");
    }

}
