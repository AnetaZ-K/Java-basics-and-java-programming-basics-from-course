package JavaTaska.Projekt1;

public class Product {
    private String name;
    private String category;
    private int countOfGrades;
    private double sumOfGrades;
    private double avgGrade;
    private boolean isAvailable;

    public Product(String name, String category, int countOfGrades, double sumOfGrades) {
        this.name = name;
        this.category = category;
        this.countOfGrades = countOfGrades;
        this.sumOfGrades = sumOfGrades;
        avgGrade = 0.0;
        isAvailable = true;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCountOfGrades() {
        return countOfGrades;
    }

    public void setCountOfGrades(int countOfGrades) {
        this.countOfGrades = countOfGrades;
    }

    public double getSumOfGrades() {
        return sumOfGrades;
    }

    public void setSumOfGrades(double sumOfGrades) {
        this.sumOfGrades = sumOfGrades;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void calculateAvgGrade() {
        avgGrade = sumOfGrades / countOfGrades;
    }
}