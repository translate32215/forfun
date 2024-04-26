package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.e5;
import com.startapp.ob;
import com.startapp.wb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ConnectivityHelperMetadata implements Serializable {
    private static final long serialVersionUID = -3942031112402817295L;
    @ob(complex = true)
    private Transport transport = new Transport();

    /* compiled from: Sta */
    public static class Transport implements Serializable {
        private static final long serialVersionUID = 9037003673849815220L;
        @ob(parser = e5.class)
        private int[][] active;
        @ob(parser = e5.class)
        private int[][] all = {new int[]{21, Integer.MAX_VALUE}};

        public int[][] a() {
            return this.active;
        }

        public int[][] b() {
            return this.all;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Transport transport = (Transport) obj;
            if (!Arrays.deepEquals(this.all, transport.all) || !Arrays.deepEquals(this.active, transport.active)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object[] objArr = {this.all, this.active};
            Map<Activity, Integer> map = wb.f12765a;
            return Arrays.deepHashCode(objArr);
        }
    }

    public Transport a() {
        return this.transport;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return wb.a(this.transport, ((ConnectivityHelperMetadata) obj).transport);
    }

    public int hashCode() {
        Object[] objArr = {this.transport};
        Map<Activity, Integer> map = wb.f12765a;
        return Arrays.deepHashCode(objArr);
    }
}
