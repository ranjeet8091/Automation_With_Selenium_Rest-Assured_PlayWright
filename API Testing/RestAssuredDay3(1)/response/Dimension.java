package response;

public class Dimension {
	private String name;
	private String caption;
	private String type;
	private DimensionAnnotations annotations;
	private Hierarchy[] hierarchies;
	private String default_hierarchy;

	public String getDefault_hierarchy() {
		return default_hierarchy;
	}

	public void setDefault_hierarchy(String default_hierarchy) {
		this.default_hierarchy = default_hierarchy;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String value) {
		this.caption = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}

	public DimensionAnnotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(DimensionAnnotations value) {
		this.annotations = value;
	}

	public Hierarchy[] getHierarchies() {
		return hierarchies;
	}

	public void setHierarchies(Hierarchy[] value) {
		this.hierarchies = value;
	}

}