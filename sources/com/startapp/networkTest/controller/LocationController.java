package com.startapp.networkTest.controller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.startapp.a5;
import com.startapp.k2;
import com.startapp.networkTest.data.LocationInfo;
import com.startapp.networkTest.enums.LocationProviders;
import com.startapp.ua;
import com.startapp.x2;
import java.util.List;

/* compiled from: Sta */
public class LocationController {

    /* renamed from: j  reason: collision with root package name */
    private static double f10923j = 0.0d;

    /* renamed from: k  reason: collision with root package name */
    private static double f10924k = 0.0d;

    /* renamed from: l  reason: collision with root package name */
    private static final String f10925l = "LocationController";

    /* renamed from: m  reason: collision with root package name */
    private static final boolean f10926m = false;

    /* renamed from: a  reason: collision with root package name */
    private LocationManager f10927a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f10928b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public LocationInfo f10929c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Location f10930d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public long f10931e;

    /* renamed from: f  reason: collision with root package name */
    private b f10932f;

    /* renamed from: g  reason: collision with root package name */
    private long f10933g = 4000;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10934h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public c f10935i;

    /* compiled from: Sta */
    public enum ProviderMode {
        Passive,
        Network,
        Gps,
        GpsAndNetwork,
        RailNet
    }

    /* compiled from: Sta */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10942a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.startapp.networkTest.controller.LocationController$ProviderMode[] r0 = com.startapp.networkTest.controller.LocationController.ProviderMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10942a = r0
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Gps     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10942a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.GpsAndNetwork     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10942a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Network     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10942a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.networkTest.controller.LocationController$ProviderMode r1 = com.startapp.networkTest.controller.LocationController.ProviderMode.Passive     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.networkTest.controller.LocationController.a.<clinit>():void");
        }
    }

    /* compiled from: Sta */
    public class b implements LocationListener {
        private b() {
        }

        public void onLocationChanged(Location location) {
            if (location != null && location.getProvider() != null) {
                if (LocationController.this.f10930d == null || location.getProvider().equals("gps") || LocationController.this.f10930d.getProvider() == null || !LocationController.this.f10930d.getProvider().equals("gps") || SystemClock.elapsedRealtime() - LocationController.this.f10928b >= 5000) {
                    Location unused = LocationController.this.f10930d = location;
                    long unused2 = LocationController.this.f10931e = SystemClock.elapsedRealtime();
                    LocationInfo unused3 = LocationController.this.f10929c = LocationController.b(location);
                    LocationController.this.f10929c.LocationAge = 0;
                    long unused4 = LocationController.this.f10928b = SystemClock.elapsedRealtime();
                    if (LocationController.this.f10935i != null) {
                        LocationController.this.f10935i.a(LocationController.this.f10929c);
                    }
                    if (location.getProvider().equals("gps")) {
                        a5.f().a(location);
                    }
                }
            }
        }

        public void onProviderDisabled(String str) {
        }

        public void onProviderEnabled(String str) {
        }

        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }

        public /* synthetic */ b(LocationController locationController, a aVar) {
            this();
        }
    }

    /* compiled from: Sta */
    public interface c {
        void a(LocationInfo locationInfo);
    }

    public LocationController(Context context) {
        this.f10927a = (LocationManager) context.getSystemService("location");
        this.f10932f = new b(this, (a) null);
    }

    public long e() {
        return this.f10933g;
    }

    public void f() {
        b bVar;
        LocationManager locationManager = this.f10927a;
        if (!(locationManager == null || (bVar = this.f10932f) == null)) {
            try {
                locationManager.removeUpdates(bVar);
            } catch (Throwable th) {
                x2.a(th);
            }
        }
        this.f10934h = false;
    }

    @SuppressLint({"NewApi"})
    private void d() {
        Location location;
        List<String> allProviders = this.f10927a.getAllProviders();
        Location location2 = null;
        if (allProviders != null && allProviders.size() > 0) {
            Location location3 = null;
            for (int i10 = 0; i10 < allProviders.size(); i10++) {
                try {
                    location = this.f10927a.getLastKnownLocation(allProviders.get(i10));
                } catch (SecurityException e10) {
                    x2.b(e10);
                    location = null;
                    location3 = location;
                } catch (Throwable th) {
                    x2.a(th);
                    location = null;
                    location3 = location;
                }
                if (location != null && (location3 == null || location.getTime() > location3.getTime())) {
                    location3 = location;
                }
            }
            location2 = location3;
        }
        if (location2 != null) {
            this.f10930d = location2;
            this.f10931e = location2.getElapsedRealtimeNanos() / 1000000;
            this.f10929c = b(location2);
        }
    }

    public LocationInfo c() {
        if (this.f10929c == null) {
            d();
        }
        if (this.f10929c == null) {
            LocationInfo locationInfo = new LocationInfo();
            this.f10929c = locationInfo;
            locationInfo.LocationProvider = LocationProviders.Unknown;
        }
        LocationInfo locationInfo2 = this.f10929c;
        if (locationInfo2.LocationProvider != LocationProviders.Unknown) {
            locationInfo2.LocationAge = SystemClock.elapsedRealtime() - this.f10931e;
        }
        LocationInfo locationInfo3 = this.f10929c;
        f10923j = locationInfo3.LocationLatitude;
        f10924k = locationInfo3.LocationLongitude;
        try {
            return (LocationInfo) locationInfo3.clone();
        } catch (Throwable th) {
            x2.a(th);
            return this.f10929c;
        }
    }

    /* access modifiers changed from: private */
    public static LocationInfo b(Location location) {
        LocationInfo locationInfo = new LocationInfo();
        locationInfo.LocationAccuracyHorizontal = (double) location.getAccuracy();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || !location.hasVerticalAccuracy()) {
            locationInfo.LocationAccuracyVertical = (double) location.getAccuracy();
        } else {
            locationInfo.LocationAccuracyVertical = (double) location.getVerticalAccuracyMeters();
        }
        long d10 = ua.d();
        locationInfo.locationTimestampMillis = d10;
        locationInfo.LocationTimestamp = k2.b(d10);
        locationInfo.LocationAltitude = location.getAltitude();
        locationInfo.LocationBearing = (double) location.getBearing();
        locationInfo.LocationLatitude = location.getLatitude();
        locationInfo.LocationLongitude = location.getLongitude();
        if (i10 >= 18) {
            locationInfo.IsMocked = location.isFromMockProvider() ? 1 : 0;
        }
        if (location.getProvider() == null) {
            locationInfo.LocationProvider = LocationProviders.Unknown;
        } else if (location.getProvider().equals("gps")) {
            locationInfo.LocationProvider = LocationProviders.Gps;
        } else if (location.getProvider().equals("network")) {
            locationInfo.LocationProvider = LocationProviders.Network;
        } else if (location.getProvider().equals("fused")) {
            locationInfo.LocationProvider = LocationProviders.Fused;
        } else {
            locationInfo.LocationProvider = LocationProviders.Unknown;
        }
        locationInfo.LocationSpeed = (double) location.getSpeed();
        return locationInfo;
    }

    public void a(ProviderMode providerMode) {
        LocationManager locationManager;
        boolean z10;
        boolean z11;
        if (providerMode != null && (locationManager = this.f10927a) != null) {
            this.f10934h = true;
            List<String> allProviders = locationManager.getAllProviders();
            boolean z12 = false;
            if (allProviders != null) {
                boolean z13 = false;
                z11 = false;
                z10 = false;
                for (String next : allProviders) {
                    next.getClass();
                    char c10 = 65535;
                    switch (next.hashCode()) {
                        case -792039641:
                            if (next.equals("passive")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 102570:
                            if (next.equals("gps")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1843485230:
                            if (next.equals("network")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            z10 = true;
                            break;
                        case 1:
                            z13 = true;
                            break;
                        case 2:
                            z11 = true;
                            break;
                    }
                }
                z12 = z13;
            } else {
                z11 = false;
                z10 = false;
            }
            try {
                int i10 = a.f10942a[providerMode.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (z12) {
                            this.f10927a.requestLocationUpdates("gps", 500, 5.0f, this.f10932f);
                        }
                        if (z11) {
                            this.f10927a.requestLocationUpdates("network", 0, 0.0f, this.f10932f);
                        }
                    } else if (i10 != 3) {
                        if (i10 == 4) {
                            if (z10) {
                                this.f10927a.requestLocationUpdates("passive", 0, 0.0f, this.f10932f);
                            }
                        }
                    } else if (z11) {
                        this.f10927a.requestLocationUpdates("network", 0, 0.0f, this.f10932f);
                    }
                } else if (z12) {
                    this.f10927a.requestLocationUpdates("gps", 500, 5.0f, this.f10932f);
                }
            } catch (SecurityException e10) {
                x2.b(e10);
            } catch (Throwable th) {
                x2.a(th);
            }
        }
    }

    public void a(c cVar) {
        this.f10935i = cVar;
    }

    public static double a() {
        return f10923j;
    }

    public void a(long j10) {
        this.f10933g = j10;
    }

    public static double b() {
        return f10924k;
    }
}
