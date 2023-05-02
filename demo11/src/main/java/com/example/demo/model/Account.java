package com.example.demo.model;

import jakarta.persistence.*;

@Table
@Entity
public class Account {
    @Id
    int accno;
    int bal;

    @OneToOne(mappedBy = "a")
    Customer2 c;

    public Account() {
    }

    public Account(int accno, int bal) {
        this.accno = accno;
        this.bal = bal;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accno=" + accno +
                ", bal=" + bal +
                '}';
    }
}
