package response;

public class Hierarchy {
    private String name;
    private String caption;
    private HierarchyAnnotations annotations;
    private Level[] levels;
    private String type;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getCaption() { return caption; }
    public void setCaption(String value) { this.caption = value; }

    public HierarchyAnnotations getAnnotations() { return annotations; }
    public void setAnnotations(HierarchyAnnotations value) { this.annotations = value; }

    public Level[] getLevels() { return levels; }
    public void setLevels(Level[] value) { this.levels = value; }

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }
}
