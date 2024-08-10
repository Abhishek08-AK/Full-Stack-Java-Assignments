package edu.products.model;

public class Products {
	private int id;
	private String p_name;
	private String p_price;
	private String qty;
	private String p_details;

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_price() {
		return p_price;
	}

	public void setP_price(String p_price) {
		this.p_price = p_price;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	


	public String getP_details() {
		return p_details;
	}

	public void setP_details(String p_details) {
		this.p_details = p_details;
	}

	public Products(int id, String p_name,String p_price,String qty,String p_details) {

				super();

				this.id=id;
				this.p_name=p_name;
				this.p_price=p_price;
				this.qty=qty;
				this.p_details=p_details;

			}

			public Products() {
				super();
			}
}
