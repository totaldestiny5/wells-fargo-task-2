package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity class Portfolio {

    @GeneratedValue()
    long portfolioId;

    @OneToMany
    @JoinColumn private long clientId;
    private Client client;

    @Column private String creationDate;



    public Portfolio(String creationDate){
        this.creationDate=creationDate;
    }


    private void setCreationDate(String creationDate){this.creationDate=creationDate;}
    private String getCreationDate(){return creationDate;}





}
