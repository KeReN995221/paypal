package entities;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class Contract {

    private int number;
    private LocalDate date;
    private double totalValue;
    private List<Instalment> instalments = new ArrayList<>();

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public List<Instalment> getInstalments() {
        return instalments;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
