package m3;

/* compiled from: DiskCacheStrategy */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f21588a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final k f21589b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final k f21590c = new c();

    /* compiled from: DiskCacheStrategy */
    public class a extends k {
        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(com.bumptech.glide.load.a aVar) {
            return false;
        }

        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class b extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(com.bumptech.glide.load.a aVar) {
            return (aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE || aVar == com.bumptech.glide.load.a.MEMORY_CACHE) ? false : true;
        }

        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class c extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(com.bumptech.glide.load.a aVar) {
            return aVar == com.bumptech.glide.load.a.REMOTE;
        }

        public boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar) {
            return ((z10 && aVar == com.bumptech.glide.load.a.DATA_DISK_CACHE) || aVar == com.bumptech.glide.load.a.LOCAL) && cVar == com.bumptech.glide.load.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.bumptech.glide.load.a aVar);

    public abstract boolean d(boolean z10, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.c cVar);
}
