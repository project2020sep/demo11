package com.example.demo.model;

import jakarta.persistence.*;

@Table
@Entity
public class Customer2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int cid;
    String cname;
    String city;
    Long phone;
    String email;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="accno")
    Account a;
    public Customer2() {
    }

    public Customer2(int cid, String cname, String city, Long phone, String email, Account a) {
        this.cid = cid;
        this.cname = cname;
        this.city = city;
        this.phone = phone;
        this.email = email;
        this.a = a;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getA() {
        return a;
    }

    public void setA(Account a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Customer2{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", a=" + a +
                '}';
    }
}
