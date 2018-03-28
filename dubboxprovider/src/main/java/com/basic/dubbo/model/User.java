package com.basic.dubbo.model;

import com.sun.istack.internal.NotNull;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * locate com.basic.com.basic.dubbo.model
 * Created by mastertj on 2018/3/27.
 */
@XmlRootElement
public class User implements Serializable{
    @NotNull
    private String id;


    @NotNull
    @Size(min = 6,max = 10)
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    @XmlElement(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
