package business;

public class LineItem {
	private int lineItemId;
	private int requestId;
	private int productId;
	private int quantity;

	public LineItem() {
		super();
	}

	public LineItem(int lineItemId, int requestId, int productId, int quantity) {
		super();
		this.lineItemId = lineItemId;
		this.requestId = requestId;
		this.productId = productId;
		this.quantity = quantity;
	}

	public int getLineItemId() {
		return lineItemId;
	}

	public void setLineItemId(int lineItemId) {
		this.lineItemId = lineItemId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineItem [lineItemId=" + lineItemId + ", requestId=" + requestId + ", productId=" + productId
				+ ", quantity=" + quantity + "]";
	}

}
