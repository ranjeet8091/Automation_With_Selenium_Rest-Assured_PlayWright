package response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DimensionAnnotations {
	  @JsonProperty("dim_type")
	private String dim_type;

	public String getDimType() {
		return dim_type;
	}

	public void setDimType(String value) {
		this.dim_type = value;
	}
}
