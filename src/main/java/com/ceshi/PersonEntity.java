package com.ceshi;

import javax.persistence.*;

@Entity
@Table(name = "person", schema = "ssh", catalog = "")
public class PersonEntity {
    private int id;
    private String name;
    private Integer carid;
    private BycleEntity per;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "carid")
    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (carid != null ? !carid.equals(that.carid) : that.carid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (carid != null ? carid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "carid", referencedColumnName = "id")
    public BycleEntity getPer() {
        return per;
    }

    public void setPer(BycleEntity per) {
        this.per = per;
    }
}
