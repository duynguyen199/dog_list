package output;

public class DogDataOutput {
    private String name;
    private String style;
    private String color;
    private Integer age;

    public DogDataOutput(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DogDataOutput(String name, String style, String color, Integer age) {
        this.name = name;
        this.style = style;
        this.color = color;
        this.age = age;
    }
}
