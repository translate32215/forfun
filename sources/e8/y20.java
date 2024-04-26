package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class y20 {

    /* renamed from: a  reason: collision with root package name */
    public final String f17567a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17568b;

    public y20(String str, String str2) {
        this.f17567a = str;
        this.f17568b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20 = (y20) obj;
        return this.f17567a.equals(y20.f17567a) && this.f17568b.equals(y20.f17568b);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f17567a);
        String valueOf2 = String.valueOf(this.f17568b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
