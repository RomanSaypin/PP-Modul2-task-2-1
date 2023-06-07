package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_cars")
public class Car {
    @Id
    @Column(name = "user_id")
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;

    public Car(){}

    public Car( String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
               "id=" + id +
               ", user=" + user +
               ", model='" + model + '\'' +
               ", series=" + series +
               '}';
    }
}
