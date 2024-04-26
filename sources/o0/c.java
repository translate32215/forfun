package o0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: ContentInfoCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f22540a;

    /* compiled from: ContentInfoCompat */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f22541a;

        public a(ClipData clipData, int i10) {
            this.f22541a = new ContentInfo.Builder(clipData, i10);
        }

        public c a() {
            return new c(new d(this.f22541a.build()));
        }

        public void b(Bundle bundle) {
            this.f22541a.setExtras(bundle);
        }

        public void c(Uri uri) {
            this.f22541a.setLinkUri(uri);
        }

        public void d(int i10) {
            this.f22541a.setFlags(i10);
        }
    }

    /* compiled from: ContentInfoCompat */
    public interface b {
        c a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i10);
    }

    /* renamed from: o0.c$c  reason: collision with other inner class name */
    /* compiled from: ContentInfoCompat */
    public static final class C0199c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f22542a;

        /* renamed from: b  reason: collision with root package name */
        public int f22543b;

        /* renamed from: c  reason: collision with root package name */
        public int f22544c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f22545d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f22546e;

        public C0199c(ClipData clipData, int i10) {
            this.f22542a = clipData;
            this.f22543b = i10;
        }

        public c a() {
            return new c(new f(this));
        }

        public void b(Bundle bundle) {
            this.f22546e = bundle;
        }

        public void c(Uri uri) {
            this.f22545d = uri;
        }

        public void d(int i10) {
            this.f22544c = i10;
        }
    }

    /* compiled from: ContentInfoCompat */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f22547a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f22547a = contentInfo;
        }

        public ClipData a() {
            return this.f22547a.getClip();
        }

        public int b() {
            return this.f22547a.getFlags();
        }

        public ContentInfo c() {
            return this.f22547a;
        }

        public int d() {
            return this.f22547a.getSource();
        }

        public String toString() {
            StringBuilder a10 = android.support.v4.media.a.a("ContentInfoCompat{");
            a10.append(this.f22547a);
            a10.append("}");
            return a10.toString();
        }
    }

    /* compiled from: ContentInfoCompat */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* compiled from: ContentInfoCompat */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f22548a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22549b;

        /* renamed from: c  reason: collision with root package name */
        public final int f22550c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f22551d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f22552e;

        public f(C0199c cVar) {
            ClipData clipData = cVar.f22542a;
            clipData.getClass();
            this.f22548a = clipData;
            int i10 = cVar.f22543b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i10 <= 5) {
                this.f22549b = i10;
                int i11 = cVar.f22544c;
                if ((i11 & 1) == i11) {
                    this.f22550c = i11;
                    this.f22551d = cVar.f22545d;
                    this.f22552e = cVar.f22546e;
                    return;
                }
                StringBuilder a10 = android.support.v4.media.a.a("Requested flags 0x");
                a10.append(Integer.toHexString(i11));
                a10.append(", but only 0x");
                a10.append(Integer.toHexString(1));
                a10.append(" are allowed");
                throw new IllegalArgumentException(a10.toString());
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public ClipData a() {
            return this.f22548a;
        }

        public int b() {
            return this.f22550c;
        }

        public ContentInfo c() {
            return null;
        }

        public int d() {
            return this.f22549b;
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder a10 = android.support.v4.media.a.a("ContentInfoCompat{clip=");
            a10.append(this.f22548a.getDescription());
            a10.append(", source=");
            int i10 = this.f22549b;
            a10.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            a10.append(", flags=");
            int i11 = this.f22550c;
            if ((i11 & 1) != 0) {
                str = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str = String.valueOf(i11);
            }
            a10.append(str);
            String str3 = "";
            if (this.f22551d == null) {
                str2 = str3;
            } else {
                StringBuilder a11 = android.support.v4.media.a.a(", hasLinkUri(");
                a11.append(this.f22551d.toString().length());
                a11.append(")");
                str2 = a11.toString();
            }
            a10.append(str2);
            if (this.f22552e != null) {
                str3 = ", hasExtras";
            }
            return androidx.activity.e.a(a10, str3, "}");
        }
    }

    public c(e eVar) {
        this.f22540a = eVar;
    }

    public String toString() {
        return this.f22540a.toString();
    }
}
