package it.fabrick.appFabrick.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Conto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String iban;
    private String abiCode;
    private String cabCode;
    private String countryCode;
    private String internationalCin;
    private String nationalCin;
    private String account;
    private String alias;
    private String productName;
    private String holderName;
    private Date activatedDate;
    private String currency;


    public Conto() {

    }

    public Conto(Long accountId, String iban, String abiCode, String cabCode, String countryCode, String internationalCin, String nationalCin, String account, String alias, String productName, String holderName, Date activatedDate, String currency) {
        this.accountId = accountId;
        this.iban = iban;
        this.abiCode = abiCode;
        this.cabCode = cabCode;
        this.countryCode = countryCode;
        this.internationalCin = internationalCin;
        this.nationalCin = nationalCin;
        this.account = account;
        this.alias = alias;
        this.productName = productName;
        this.holderName = holderName;
        this.activatedDate = activatedDate;
        this.currency = currency;
    }

}
