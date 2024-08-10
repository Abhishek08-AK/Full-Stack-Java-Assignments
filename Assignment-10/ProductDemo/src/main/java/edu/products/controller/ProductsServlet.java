package edu.products.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import edu.products.dao.ProductsDao;
import edu.products.model.Products;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductsDao productDao = new ProductsDao();

	public ProductsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		String servURL=request.getServletPath();

				switch(servURL) {
				case "/prods":{
					try {
						List<Products> prodList=ProductsDao.getProduct();
						request.setAttribute("prodList", prodList);
						RequestDispatcher dispatcher=request.getRequestDispatcher("prod-list.jsp");

						dispatcher.forward(request, response);
					}
					catch(ClassNotFoundException e) {
						e.printStackTrace();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
					break;
				}

				case "/delete": {
					try {
						int id=Integer.parseInt(request.getParameter("id"));
						int r = 0;
						r = ProductsDao.deleteProductById(id);

						if (r > 0) {
							response.sendRedirect("done.jsp");
						} else {
							response.sendRedirect("error.jsp");
						}
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
						response.sendRedirect("error.jsp");
					} catch (SQLException e) {
						e.printStackTrace();
					}
					break;
				}

				}
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String p_name = request.getParameter("p_name");
		String p_price =request.getParameter("p_price");
		String qty = request.getParameter("qty");
		String p_details = request.getParameter("p_details");


		Products product = new Products();

		product.setP_name(p_name);
		product.setP_price(p_price);
		product.setQty(qty);
		product.setP_details(p_details);



		String requestPart = request.getServletPath();

		switch (requestPart) {

		case "/addProduct": {
			try {
				int x = 0;
				x = ProductsDao.saveProduct(product);

				if (x > 0) {
					response.sendRedirect("done.jsp");
				} else {
					response.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}

		case "/updateProduct": {
			try {
				int x = 0;
				x = ProductsDao.updateProduct(product);

				if (x > 0) {
					response.sendRedirect("done.jsp");
				} else {
					response.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}

		case "/deleteProduct": {
			try {
				int x = 0;
				x = ProductsDao.deleteProduct(product);

				if (x > 0) {
					response.sendRedirect("done.jsp");
				} else {
					response.sendRedirect("error.jsp");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				response.sendRedirect("error.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}

		}
	}
}

