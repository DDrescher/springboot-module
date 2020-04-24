package academy.everyonecodes.drhouseaccountancy.DataClasses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;
    private double cost;
    private boolean paid;
    @ManyToOne
    private Patient patient;

    public Invoice(double cost, boolean paid, Patient patient) {
        this.cost = cost;
        this.paid = paid;
        this.patient = patient;
    }

    public Invoice() {
    }

    public Long getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "cost=" + cost +
                ", paid=" + paid +
                ", patient=" + patient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.cost, cost) == 0 &&
                paid == invoice.paid &&
                Objects.equals(patient, invoice.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, paid, patient);
    }
}
