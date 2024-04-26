package com.startapp;

/* compiled from: Sta */
public class s2 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f11693a = 6371000;

    public static double a(double d10, double d11, double d12, double d13) {
        double cos = Math.cos(Math.toRadians(d10 + d12) / 2.0d) * Math.toRadians(d13 - d11);
        double radians = Math.toRadians(d12 - d10);
        return Math.sqrt((radians * radians) + (cos * cos)) * 6371000.0d;
    }

    public static double b(double d10, double d11, double d12, double d13) {
        double radians = Math.toRadians(d12 - d10);
        double radians2 = Math.toRadians(d13 - d11);
        double d14 = radians / 2.0d;
        double sin = Math.sin(d14);
        double cos = Math.cos(Math.toRadians(d12)) * Math.cos(Math.toRadians(d10));
        double d15 = radians2 / 2.0d;
        double sin2 = (Math.sin(d15) * Math.sin(d15) * cos) + (Math.sin(d14) * sin);
        return Math.atan2(Math.sqrt(sin2), Math.sqrt(1.0d - sin2)) * 2.0d * 6371000.0d;
    }
}
