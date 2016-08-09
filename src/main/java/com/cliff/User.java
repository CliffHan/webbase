package com.cliff;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    private String username;
    private String password;
    private boolean enabled;

    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
    @JoinColumn(name="username")
    private Set<Authority> authorities = new HashSet<Authority>();

    @Override
    public String toString() {
        return "User [username=" + this.username+ ", password=" + this.password
                + ", enabled=" + this.enabled+ ", authorites=" + this.authorities+"]";
    }
}
