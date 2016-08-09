package com.cliff;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Authority {
    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String authority;

    @Override
    public String toString() {
        return "Authority [username=" + this.username+ ", authority=" + this.authority
                + ", id=" + this.id+"]";
    }

}
