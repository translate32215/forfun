package com.google.android.gms.internal.ads;

import android.util.Log;
import e8.eg0;
import e8.je0;
import e8.me0;
import e8.pd0;
import e8.w60;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ot {
    public static final int A = eg0.f("sosn");
    public static final int B = eg0.f("tvsh");
    public static final int C = eg0.f("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a  reason: collision with root package name */
    public static final int f7710a = eg0.f("nam");

    /* renamed from: b  reason: collision with root package name */
    public static final int f7711b = eg0.f("trk");

    /* renamed from: c  reason: collision with root package name */
    public static final int f7712c = eg0.f("cmt");

    /* renamed from: d  reason: collision with root package name */
    public static final int f7713d = eg0.f("day");

    /* renamed from: e  reason: collision with root package name */
    public static final int f7714e = eg0.f("ART");

    /* renamed from: f  reason: collision with root package name */
    public static final int f7715f = eg0.f("too");

    /* renamed from: g  reason: collision with root package name */
    public static final int f7716g = eg0.f("alb");

    /* renamed from: h  reason: collision with root package name */
    public static final int f7717h = eg0.f("com");

    /* renamed from: i  reason: collision with root package name */
    public static final int f7718i = eg0.f("wrt");

    /* renamed from: j  reason: collision with root package name */
    public static final int f7719j = eg0.f("lyr");

    /* renamed from: k  reason: collision with root package name */
    public static final int f7720k = eg0.f("gen");

    /* renamed from: l  reason: collision with root package name */
    public static final int f7721l = eg0.f("covr");

    /* renamed from: m  reason: collision with root package name */
    public static final int f7722m = eg0.f("gnre");

    /* renamed from: n  reason: collision with root package name */
    public static final int f7723n = eg0.f("grp");

    /* renamed from: o  reason: collision with root package name */
    public static final int f7724o = eg0.f("disk");

    /* renamed from: p  reason: collision with root package name */
    public static final int f7725p = eg0.f("trkn");

    /* renamed from: q  reason: collision with root package name */
    public static final int f7726q = eg0.f("tmpo");

    /* renamed from: r  reason: collision with root package name */
    public static final int f7727r = eg0.f("cpil");

    /* renamed from: s  reason: collision with root package name */
    public static final int f7728s = eg0.f("aART");

    /* renamed from: t  reason: collision with root package name */
    public static final int f7729t = eg0.f("sonm");

    /* renamed from: u  reason: collision with root package name */
    public static final int f7730u = eg0.f("soal");

    /* renamed from: v  reason: collision with root package name */
    public static final int f7731v = eg0.f("soar");

    /* renamed from: w  reason: collision with root package name */
    public static final int f7732w = eg0.f("soaa");

    /* renamed from: x  reason: collision with root package name */
    public static final int f7733x = eg0.f("soco");

    /* renamed from: y  reason: collision with root package name */
    public static final int f7734y = eg0.f("rtng");

    /* renamed from: z  reason: collision with root package name */
    public static final int f7735z = eg0.f("pgap");

    public static xt a(int i10, String str, w60 w60, boolean z10, boolean z11) {
        int d10 = d(w60);
        if (z11) {
            d10 = Math.min(1, d10);
        }
        if (d10 < 0) {
            String valueOf = String.valueOf(pd0.a(i10));
            Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z10) {
            return new me0(str, Integer.toString(d10));
        } else {
            return new je0("und", str, Integer.toString(d10));
        }
    }

    public static me0 b(int i10, String str, w60 w60) {
        int b10 = w60.b();
        if (w60.b() == pd0.F0) {
            w60.i(8);
            return new me0(str, w60.j(b10 - 16));
        }
        String valueOf = String.valueOf(pd0.a(i10));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static me0 c(int i10, String str, w60 w60) {
        int b10 = w60.b();
        if (w60.b() == pd0.F0 && b10 >= 22) {
            w60.i(10);
            int e10 = w60.e();
            if (e10 > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(e10);
                String sb3 = sb2.toString();
                int e11 = w60.e();
                if (e11 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(e11);
                    sb3 = sb4.toString();
                }
                return new me0(str, sb3);
            }
        }
        String valueOf2 = String.valueOf(pd0.a(i10));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static int d(w60 w60) {
        w60.i(4);
        if (w60.b() == pd0.F0) {
            w60.i(8);
            return w60.d();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
