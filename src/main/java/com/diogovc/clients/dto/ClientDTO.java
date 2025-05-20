package com.diogovc.clients.dto;

import com.diogovc.clients.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ClientDTO {

    @NotBlank(message = "O nome deve ser preenchido")
    private String name;
    private String cpf;
    private Double income;

    @PastOrPresent(message = "Data de nascimento não pode ser uma data futura")
    private LocalDate birthday;
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(String name, String cpf, Double income, LocalDate birthday, Integer children) {
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthday = birthday;
        this.children = children;
    }

    public ClientDTO(Client client) {
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthday = client.getBirthday();
        this.children = client.getChildren();
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Integer getChildren() {
        return children;
    }
}
