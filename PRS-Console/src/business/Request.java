package business;

public class Request {
	private int requestId;
	private int userId;
	private String description;
	private String justification;
	private String dateNeeded; 
	private String deliveryMode;
	private String status;
	private double total;
	private String submittedDate; 
	private String reasonForRejection;

	public Request() {
		super();
	}

	public Request(int requestId, int userId, String description, String justification, String dateNeeded,
			String deliveryMode, String status, double total, String submittedDate, String reasonForRejection) {
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}

	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", userId=" + userId + ", description=" + description
				+ ", justification=" + justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode
				+ ", status=" + status + ", total=" + total + ", submittedDate=" + submittedDate
				+ ", reasonForRejection=" + reasonForRejection + "]";
	}

}
