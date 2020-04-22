package com.ceshi;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "bycle", schema = "ssh", catalog = "")
public class BycleEntity {
    private int id;
    private String name;
    private Set<PersonEntity> byv;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BycleEntity that = (BycleEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "per")
    public Set<PersonEntity> getByv() {
        return byv;
    }

    public void setByv(Set<PersonEntity> byv) {
        this.byv = byv;
    }
}
