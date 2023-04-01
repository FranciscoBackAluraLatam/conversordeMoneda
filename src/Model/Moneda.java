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
  private double USD;
  private double EUR;
  private double QT;
  private double RMB;
  
  
  
  
    
    public Moneda(){
        
    }

    public Moneda(String updated, String source, String target, double USD, double EUR, double QT, double RMB) {
        setUpdated(updated);
        setSource(source);
        setTarget(target);
         setUSD(USD);
        setEUR(EUR);
        setQT(QT);
        setRMB(RMB);
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

    public double getUSD() {
        return USD;
    }

    public void setUSD(double USD) {
        this.USD = USD;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getQT() {
        return QT;
    }

    public void setQT(double QT) {
        this.QT = QT;
    }

    public double getRMB() {
        return RMB;
    }

    public void setRMB(double RMB) {
        this.RMB = RMB;
    }



    @Override
    public String toString() {
        return target ;
    }



  

    
   
 
    
}
