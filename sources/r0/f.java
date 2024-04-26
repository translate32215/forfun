package r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f24482a;

    /* compiled from: InputContentInfoCompat */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f24484a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f24485b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f24486c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24484a = uri;
            this.f24485b = clipDescription;
            this.f24486c = uri2;
        }

        public Object a() {
            return null;
        }

        public Uri b() {
            return this.f24484a;
        }

        public void c() {
        }

        public Uri d() {
            return this.f24486c;
        }

        public ClipDescription getDescription() {
            return this.f24485b;
        }
    }

    /* compiled from: InputContentInfoCompat */
    public interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f24482a = new a(uri, clipDescription, uri2);
        } else {
            this.f24482a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f24483a;

        public a(Object obj) {
            this.f24483a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.f24483a;
        }

        public Uri b() {
            return this.f24483a.getContentUri();
        }

        public void c() {
            this.f24483a.requestPermission();
        }

        public Uri d() {
            return this.f24483a.getLinkUri();
        }

        public ClipDescription getDescription() {
            return this.f24483a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24483a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.f24482a = cVar;
    }
}
