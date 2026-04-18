package response;

public class Level {
    private String name;
    private String caption;
    private long depth;
    private long count;
    private HierarchyAnnotations annotations;
    private LevelProperties[] properties;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getCaption() { return caption; }
    public void setCaption(String value) { this.caption = value; }

    public long getDepth() { return depth; }
    public void setDepth(long value) { this.depth = value; }

    public long getCount() { return count; }
    public void setCount(long value) { this.count = value; }

    public HierarchyAnnotations getAnnotations() { return annotations; }
    public void setAnnotations(HierarchyAnnotations value) { this.annotations = value; }

    public LevelProperties[] getProperties() { return properties; }
    public void setProperties(LevelProperties[] value) { this.properties = value; }
}
