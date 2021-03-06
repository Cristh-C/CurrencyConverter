package currencyconverter.Service.gbp;

import currencyconverter.Service.Service;

/**
 * Clase que modela la moneda GBP (Libra esterlina)
 * */
public class CurrencyGbp implements Service {
    /** @param currencyQuantity Cantidad de la moneda*/
    private double currencyQuantity;
    /** @param currencyValue Valor de la moneda*/
    private double currencyValue;

    /**Constructor de la clase*/
    public CurrencyGbp (){
        super();
    }

    /**
     * Constructor de la clase
     * @param currencyQuantity Cantidad de la moneda
     * */
    public CurrencyGbp (double currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /**
     * Constructor de la clase
     * @param currencyQuantity Cantidad de la moneda.
     * @param currencyValue Valor de la moneda.
     * */
    public CurrencyGbp (double currencyQuantity, double currencyValue) {
        this.currencyQuantity = currencyQuantity;
        this.currencyValue = currencyValue;
    }

    @Override
    public double calculateConcurrencyConverter() {
        return (this.currencyQuantity * this.currencyValue);
    }

    @Override
    public String printConcurrencyConverter() {
        StringBuilder result = new StringBuilder();
        result.append("----------------------------------\n");
        result.append("      CONVERTIDOR DE MONEDA\n");
        result.append("\n");
        result.append(" $" + this.currencyQuantity + " Pesos colombianos (COP), son:\n");
        result.append(" $" + this.calculateConcurrencyConverter() +" Libras esterlinas. (GBP)\n");
        result.append("\n");
        result.append("----------------------------------\n");
        return (result.toString());
    }

    /**
     * Obtiene la cantidad de moneda a convertir
     * @return currencyQuantity Cantidad de la moneda.
     * */
    public double getCurrencyQuantity() {
        return currencyQuantity;
    }

    /**
     * Establece la cantidad de moneda a convertir.
     * @param currencyQuantity Cantidad de la moneda.
     * */
    public void setCurrencyQuantity(double currencyQuantity) {
        this.currencyQuantity = currencyQuantity;
    }

    /**
     * Obtiene el valor de la moneda.
     * @return currencyValue Valor de la moneda.
     * */
    public double getCurrencyValue() {
        return currencyValue;
    }

    /**
     * Establece el valor de la moneda.
     * @param currencyValue Valor de la moneda.
     * */
    public void setCurrencyValue(double currencyValue) {
        this.currencyValue = currencyValue;
    }

}
