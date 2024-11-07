package MP1;

import java.io.Serializable;

public class ProductDetails implements Serializable {
    private static final long serialVersionUID = 2L;

    private String brand;
    private String model;
    private String additionalInfo;

    public ProductDetails(String brand, String model, String additionalInfo) {
        this.brand = brand;
        this.model = model;
        this.additionalInfo = additionalInfo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    // Przesłonięcie metody toString()
    @Override
    public String toString() {
        return "MP1.ProductDetails{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
