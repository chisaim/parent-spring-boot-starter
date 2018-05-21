package home.pb.spring.calculatespringbootstarter.service;

import java.math.BigDecimal;

public class CalculateService {

    private int scale;//这个是配置在properties中

    public CalculateService(int scale) {
        this.scale = scale;
    }

    public CalculateService() {
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double setScale(double a,int scale){
        return new BigDecimal(a).setScale(scale,BigDecimal.ROUND_UP).doubleValue();
    }

    public double setScale(double a){
        return new BigDecimal(a).setScale(scale,BigDecimal.ROUND_UP).doubleValue();
    }

}
