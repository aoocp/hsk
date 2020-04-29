package com.huawei.classroom.student.h18;

@Table("User")
public class User {
    @Column("id")
    private int id;

    @Column("username")
    private String username;

    @Column("age")
    private int age;

    @Column("email")
    private String email;

    @Column("telephone")
    private String telephone;

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
