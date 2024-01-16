package input;

import jakarta.persistence.Column;

public class GetListDogDataInput {

    private Integer size;
    private Integer page;
    private String name;
    private String style;
    private String color;
    private Integer age;
    public GetListDogDataInput(){

    }

    public GetListDogDataInput(Integer size, Integer page, String name, String style, String color, Integer age) {
        this.size = size;
        this.page = page;
        this.name = name;
        this.style = style;
        this.color = color;
        this.age = age;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

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
}
