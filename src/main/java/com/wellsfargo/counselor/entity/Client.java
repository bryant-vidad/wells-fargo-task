package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDate dateJoined;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    protected Client() {
    }

    public Client(FinancialAdvisor financialAdvisor, String firstName, String lastName,
                  String email, String phone, LocalDate dateJoined, Portfolio portfolio) {
        this.financialAdvisor = financialAdvisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.dateJoined = dateJoined;
        this.portfolio = portfolio;
    }

    public Long getId() {
        return id;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
