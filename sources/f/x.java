package f;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* compiled from: TwilightManager */
public class x {

    /* renamed from: d  reason: collision with root package name */
    public static x f17979d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17980a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f17981b;

    /* renamed from: c  reason: collision with root package name */
    public final a f17982c = new a();

    /* compiled from: TwilightManager */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17983a;

        /* renamed from: b  reason: collision with root package name */
        public long f17984b;
    }

    public x(Context context, LocationManager locationManager) {
        this.f17980a = context;
        this.f17981b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f17981b.isProviderEnabled(str)) {
                return this.f17981b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }
}
