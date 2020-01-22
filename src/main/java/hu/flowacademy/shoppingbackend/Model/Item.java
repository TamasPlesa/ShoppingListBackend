package hu.flowacademy.shoppingbackend.Model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="item")
    private String item;

    @Column(name="holderName")
    private String holderName;


    public Item() {
    }

    public Item(String item, String holderName) {
        this.item = item;
        this.holderName = holderName;
    }

    public Long getId() {
        return id;
    }


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
