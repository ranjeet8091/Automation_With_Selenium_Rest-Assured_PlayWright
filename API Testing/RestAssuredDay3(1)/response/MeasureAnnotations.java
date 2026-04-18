package response;

public class MeasureAnnotations {
	private String units_of_measurement;
	private String aggregation_method;
	private String pre_aggregation_method;
	private String error_for_measure;
	private String error_type;

	public String getUnits_of_measurement() {
		return units_of_measurement;
	}

	public void setUnits_of_measurement(String units_of_measurement) {
		this.units_of_measurement = units_of_measurement;
	}

	public String getAggregation_method() {
		return aggregation_method;
	}

	public void setAggregation_method(String aggregation_method) {
		this.aggregation_method = aggregation_method;
	}

	public String getPre_aggregation_method() {
		return pre_aggregation_method;
	}

	public void setPre_aggregation_method(String pre_aggregation_method) {
		this.pre_aggregation_method = pre_aggregation_method;
	}

	public String getError_for_measure() {
		return error_for_measure;
	}

	public void setError_for_measure(String error_for_measure) {
		this.error_for_measure = error_for_measure;
	}

	public String getError_type() {
		return error_type;
	}

	public void setError_type(String error_type) {
		this.error_type = error_type;
	}

}
