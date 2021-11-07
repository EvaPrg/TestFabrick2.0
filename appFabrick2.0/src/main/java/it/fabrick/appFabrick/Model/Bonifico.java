package it.fabrick.appFabrick.Model;


import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Data
public class Bonifico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String receiverName;
    private String description;
    private String currency;
    private String amount;
    private String executionDate;




   public Bonifico(){

   }

    public Bonifico(String receiverName, String description, String currency, String amount, String executionDate) {
        this.receiverName = receiverName;
        this.description = description;
        this.currency = currency;
        this.amount = amount;
        this.executionDate = executionDate;

    }





}
