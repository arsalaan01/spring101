package org.example.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{11+22}")
    private int x;

    @Value("#{33+22}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double z;

    @Value("#{T(java.lang.Math).E}")
    private double e;

    @Value("#{new java.lang.String('Ali')}")
    private String name;

    @Value("#{9>5}")
    private boolean isTrue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isTrue=" + isTrue +
                '}';
    }
}
