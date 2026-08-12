package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Client client;

    @Column
    private String portfolioName;

    @Column
    private LocalDate createdDate;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    protected Portfolio() {
    }

    public Portfolio(Client client, String portfolioName, LocalDate createdDate, List<Security> securities) {
        this.client = client;
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.securities = securities;
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
