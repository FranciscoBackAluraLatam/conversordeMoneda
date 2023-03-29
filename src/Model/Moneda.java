/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author fbacks
 */
public final class Moneda {
      private String updated;
  private String source;
  private String target;
  private double value;
  private double quantity;
  private double amount;
    
    public Moneda(){
        
    }

    public Moneda(String updated, String source, String target, double value, double quantity, double amount) {
        setAmount(amount);
        setQuantity(quantity);
        setSource(source);
        setTarget(target);
        setValue(value);
        setUpdated(updated);
    }

 

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return target ;
    }



  

    
   
 
    
}
