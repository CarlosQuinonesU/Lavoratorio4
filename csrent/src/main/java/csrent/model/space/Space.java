package csrent.model.space;

import csrent.model.Identifiable;

public class Space implements Identifiable {
    private Integer id;
    private String name;
    private int capacity;
    private String type;


    public Space() {
        id=0;
        name="";
        capacity=0;
        type="";
    }

    public Space(Integer id, String name, int capacity, String type) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "space{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }
}// Fin de clase
