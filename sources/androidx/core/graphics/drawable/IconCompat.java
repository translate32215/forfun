package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1409k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1410a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f1411b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1412c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1413d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f1414e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1415f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1416g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1417h = f1409k;

    /* renamed from: i  reason: collision with root package name */
    public String f1418i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f1419j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (NoSuchMethodException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r6, android.content.Context r7) {
            /*
                int r0 = r6.f1410a
                r1 = 26
                r2 = 0
                switch(r0) {
                    case -1: goto L_0x0162;
                    case 0: goto L_0x0008;
                    case 1: goto L_0x0149;
                    case 2: goto L_0x00fe;
                    case 3: goto L_0x00f1;
                    case 4: goto L_0x00e8;
                    case 5: goto L_0x00cd;
                    case 6: goto L_0x0010;
                    default: goto L_0x0008;
                }
            L_0x0008:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r7 = "Unknown type"
                r6.<init>(r7)
                throw r6
            L_0x0010:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L_0x0020
                android.net.Uri r7 = r6.f()
                android.graphics.drawable.Icon r7 = androidx.core.graphics.drawable.IconCompat.d.a(r7)
                goto L_0x0151
            L_0x0020:
                if (r7 == 0) goto L_0x00b6
                android.net.Uri r0 = r6.f()
                java.lang.String r3 = r0.getScheme()
                java.lang.String r4 = "content"
                boolean r4 = r4.equals(r3)
                java.lang.String r5 = "IconCompat"
                if (r4 != 0) goto L_0x0062
                java.lang.String r4 = "file"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L_0x003d
                goto L_0x0062
            L_0x003d:
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004c }
                java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004c }
                java.lang.Object r4 = r6.f1411b     // Catch:{ FileNotFoundException -> 0x004c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ FileNotFoundException -> 0x004c }
                r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x004c }
                r7.<init>(r3)     // Catch:{ FileNotFoundException -> 0x004c }
                goto L_0x0081
            L_0x004c:
                r7 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to load image from path: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                android.util.Log.w(r5, r0, r7)
                goto L_0x0080
            L_0x0062:
                android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x006b }
                java.io.InputStream r7 = r7.openInputStream(r0)     // Catch:{ Exception -> 0x006b }
                goto L_0x0081
            L_0x006b:
                r7 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unable to load image from URI: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                android.util.Log.w(r5, r0, r7)
            L_0x0080:
                r7 = 0
            L_0x0081:
                if (r7 == 0) goto L_0x009f
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 < r1) goto L_0x0091
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)
                android.graphics.drawable.Icon r7 = androidx.core.graphics.drawable.IconCompat.b.b(r7)
                goto L_0x0151
            L_0x0091:
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)
                android.graphics.Bitmap r7 = androidx.core.graphics.drawable.IconCompat.a(r7, r2)
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
                goto L_0x0151
            L_0x009f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot load adaptive icon from uri: "
                java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
                android.net.Uri r6 = r6.f()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L_0x00b6:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Context is required to resolve the file uri of the icon: "
                java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
                android.net.Uri r6 = r6.f()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L_0x00cd:
                int r7 = android.os.Build.VERSION.SDK_INT
                if (r7 < r1) goto L_0x00db
                java.lang.Object r7 = r6.f1411b
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                android.graphics.drawable.Icon r7 = androidx.core.graphics.drawable.IconCompat.b.b(r7)
                goto L_0x0151
            L_0x00db:
                java.lang.Object r7 = r6.f1411b
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                android.graphics.Bitmap r7 = androidx.core.graphics.drawable.IconCompat.a(r7, r2)
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
                goto L_0x0151
            L_0x00e8:
                java.lang.Object r7 = r6.f1411b
                java.lang.String r7 = (java.lang.String) r7
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithContentUri(r7)
                goto L_0x0151
            L_0x00f1:
                java.lang.Object r7 = r6.f1411b
                byte[] r7 = (byte[]) r7
                int r0 = r6.f1414e
                int r1 = r6.f1415f
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithData(r7, r0, r1)
                goto L_0x0151
            L_0x00fe:
                r7 = -1
                if (r0 != r7) goto L_0x010e
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 23
                if (r1 < r3) goto L_0x010e
                java.lang.Object r7 = r6.f1411b
                java.lang.String r7 = b(r7)
                goto L_0x012b
            L_0x010e:
                r1 = 2
                if (r0 != r1) goto L_0x0132
                java.lang.String r0 = r6.f1419j
                if (r0 == 0) goto L_0x011f
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x011c
                goto L_0x011f
            L_0x011c:
                java.lang.String r7 = r6.f1419j
                goto L_0x012b
            L_0x011f:
                java.lang.Object r0 = r6.f1411b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r1 = ":"
                java.lang.String[] r7 = r0.split(r1, r7)
                r7 = r7[r2]
            L_0x012b:
                int r0 = r6.f1414e
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithResource(r7, r0)
                goto L_0x0151
            L_0x0132:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "called getResPackage() on "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L_0x0149:
                java.lang.Object r7 = r6.f1411b
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
            L_0x0151:
                android.content.res.ColorStateList r0 = r6.f1416g
                if (r0 == 0) goto L_0x0158
                r7.setTintList(r0)
            L_0x0158:
                android.graphics.PorterDuff$Mode r6 = r6.f1417h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1409k
                if (r6 == r0) goto L_0x0161
                r7.setTintMode(r6)
            L_0x0161:
                return r7
            L_0x0162:
                java.lang.Object r6 = r6.f1411b
                android.graphics.drawable.Icon r6 = (android.graphics.drawable.Icon) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1414e = i10;
            iconCompat.f1411b = str;
            iconCompat.f1419j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public Bitmap c() {
        int i10 = this.f1410a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f1411b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f1411b;
        } else {
            if (i10 == 5) {
                return a((Bitmap) this.f1411b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int d() {
        int i10 = this.f1410a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.a(this.f1411b);
        }
        if (i10 == 2) {
            return this.f1414e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public int e() {
        int i10 = this.f1410a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : a.c(this.f1411b);
    }

    public Uri f() {
        int i10 = this.f1410a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.d(this.f1411b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1411b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Deprecated
    public Icon g() {
        return h((Context) null);
    }

    public Icon h(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        String str;
        if (this.f1410a == -1) {
            return String.valueOf(this.f1411b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1410a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1410a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1411b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1411b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1419j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", new Object[]{Integer.valueOf(d())}));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1414e);
                if (this.f1415f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1415f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1411b);
                break;
        }
        if (this.f1416g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1416g);
        }
        if (this.f1417h != f1409k) {
            sb2.append(" mode=");
            sb2.append(this.f1417h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1410a = i10;
    }
}
