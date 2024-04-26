package g0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import f0.e;
import java.io.IOException;
import java.io.InputStream;
import l0.o;

/* compiled from: TypefaceCompatApi29Impl */
public class j extends k {
    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (e.d dVar : cVar.f18033a) {
                try {
                    Font build = new Font.Builder(resources, dVar.f18039f).setWeight(dVar.f18035b).setSlant(dVar.f18036c ? 1 : 0).setTtcIndex(dVar.f18038e).setFontVariationSettings(dVar.f18037d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r10, android.os.CancellationSignal r11, l0.o[] r12, int r13) {
        /*
            r9 = this;
            android.content.ContentResolver r10 = r10.getContentResolver()
            r0 = 0
            int r1 = r12.length     // Catch:{ Exception -> 0x006f }
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x0009:
            if (r3 >= r1) goto L_0x0052
            r5 = r12[r3]     // Catch:{ Exception -> 0x006f }
            android.net.Uri r6 = r5.f20996a     // Catch:{ IOException -> 0x004f }
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r6 = r10.openFileDescriptor(r6, r7, r11)     // Catch:{ IOException -> 0x004f }
            if (r6 != 0) goto L_0x001d
            if (r6 == 0) goto L_0x004f
        L_0x0019:
            r6.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x004f
        L_0x001d:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x004a }
            r7.<init>(r6)     // Catch:{ all -> 0x004a }
            int r8 = r5.f20998c     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch:{ all -> 0x004a }
            boolean r8 = r5.f20999d     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x002e
            r8 = 1
            goto L_0x002f
        L_0x002e:
            r8 = 0
        L_0x002f:
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch:{ all -> 0x004a }
            int r5 = r5.f20997b     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r5 = r7.setTtcIndex(r5)     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0046
            android.graphics.fonts.FontFamily$Builder r7 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x004a }
            r7.<init>(r5)     // Catch:{ all -> 0x004a }
            r4 = r7
            goto L_0x0019
        L_0x0046:
            r4.addFont(r5)     // Catch:{ all -> 0x004a }
            goto L_0x0019
        L_0x004a:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r5     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0052:
            if (r4 != 0) goto L_0x0055
            return r0
        L_0x0055:
            android.graphics.fonts.FontFamily r10 = r4.build()     // Catch:{ Exception -> 0x006f }
            android.graphics.Typeface$CustomFallbackBuilder r11 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x006f }
            r11.<init>(r10)     // Catch:{ Exception -> 0x006f }
            android.graphics.fonts.Font r10 = r9.g(r10, r13)     // Catch:{ Exception -> 0x006f }
            android.graphics.fonts.FontStyle r10 = r10.getStyle()     // Catch:{ Exception -> 0x006f }
            android.graphics.Typeface$CustomFallbackBuilder r10 = r11.setStyle(r10)     // Catch:{ Exception -> 0x006f }
            android.graphics.Typeface r10 = r10.build()     // Catch:{ Exception -> 0x006f }
            return r10
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.j.b(android.content.Context, android.os.CancellationSignal, l0.o[], int):android.graphics.Typeface");
    }

    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public o e(o[] oVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public final Font g(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int h10 = h(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int h11 = h(fontStyle, font2.getStyle());
            if (h11 < h10) {
                font = font2;
                h10 = h11;
            }
        }
        return font;
    }
}
