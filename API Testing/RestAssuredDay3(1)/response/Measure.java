package response;

public class Measure {
    private String name;
    private String caption;
    private String aggregator;
    private MeasureAnnotations annotations;
    private Object[] attached;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getCaption() { return caption; }
    public void setCaption(String value) { this.caption = value; }

    public String getAggregator() { return aggregator; }
    public void setAggregator(String value) { this.aggregator = value; }

    public MeasureAnnotations getAnnotations() { return annotations; }
    public void setAnnotations(MeasureAnnotations value) { this.annotations = value; }

    public Object[] getAttached() { return attached; }
    public void setAttached(Object[] value) { this.attached = value; }
}