package com.rihem.servicesentreparticuliers.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Particulier {
	 @Id
     @Column(name = "PARTICULIER_ID")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long particulierId;

     @Column(name = "PARTICULIER_NAME")
     private String particulierName;

     @Column(name = "PARTICULIER_MAIL")
     private String particulierMail;

     @Column(name = "PARTICULIER_PASS")
     private String particulierPass;

     @Column(name = "PARTICULIER_CIN")
     private int particulierCin;

     @Column(name = "PARTICULIER_ADDRESS")
     private String particulierAddress;

     @Column(name = "PARTICULIER_PHONE")
     private int particulierPhone;
     @OneToMany(mappedBy="particulier")
     private List<RDV> rdv ;

 public Particulier() { }

     public Particulier(String particulierName, String particulierMail, String particulierPass, int particulierCin, String particulierAddress, int particulierPhone) {
         this.particulierName = particulierName;
         this.particulierMail = particulierMail;
         this.particulierPass = particulierPass;
         this.particulierCin = particulierCin;
         this.particulierAddress = particulierAddress;
         this.particulierPhone = particulierPhone;
     }



 @Override
 public String toString() {
     return "Particulier{" +
             "particulierId=" + particulierId +
             ", particulierName='" + particulierName + '\'' +
             ", particulierMail='" + particulierMail + '\'' +
             ", particulierPass='" + particulierPass + '\'' +
             ", particulierCin=" + particulierCin +
             ", particulierAddress='" + particulierAddress + '\'' +
             ", particulierPhone=" + particulierPhone +
             '}';
 }

}
