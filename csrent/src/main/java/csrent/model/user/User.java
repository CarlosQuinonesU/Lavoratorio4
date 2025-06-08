package csrent.model.user;

import csrent.model.Identifiable;
import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "tbuser")
public class User implements Identifiable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name, address, type;

    public User() {
        id=0;
        name="";
        address="";
        type="";
    }

    public User(Integer id, String name, String type, String address  ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.type = type;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
