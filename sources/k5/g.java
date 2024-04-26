package k5;

import android.support.v4.media.a;
import android.util.Log;
import androidx.appcompat.widget.d0;
import f0.j;
import v5.e;
import v5.h;
import v5.l;
import v6.v;

/* compiled from: MetadataUtil */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f19953a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static e a(int i10, v vVar) {
        int f10 = vVar.f();
        if (vVar.f() == 1684108385) {
            vVar.E(8);
            String o10 = vVar.o(f10 - 16);
            return new e("und", o10, o10);
        }
        StringBuilder a10 = a.a("Failed to parse comment attribute: ");
        a10.append(a.a(i10));
        Log.w("MetadataUtil", a10.toString());
        return null;
    }

    public static v5.a b(v vVar) {
        int f10 = vVar.f();
        if (vVar.f() == 1684108385) {
            int f11 = vVar.f() & 16777215;
            String str = f11 == 13 ? "image/jpeg" : f11 == 14 ? "image/png" : null;
            if (str == null) {
                j.a("Unrecognized cover art flags: ", f11, "MetadataUtil");
                return null;
            }
            vVar.E(4);
            int i10 = f10 - 16;
            byte[] bArr = new byte[i10];
            System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i10);
            vVar.f26519b += i10;
            return new v5.a(str, (String) null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static l c(int i10, String str, v vVar) {
        int f10 = vVar.f();
        if (vVar.f() == 1684108385 && f10 >= 22) {
            vVar.E(10);
            int x10 = vVar.x();
            if (x10 > 0) {
                String a10 = d0.a("", x10);
                int x11 = vVar.x();
                if (x11 > 0) {
                    a10 = a10 + "/" + x11;
                }
                return new l(str, (String) null, a10);
            }
        }
        StringBuilder a11 = a.a("Failed to parse index/count attribute: ");
        a11.append(a.a(i10));
        Log.w("MetadataUtil", a11.toString());
        return null;
    }

    public static l d(int i10, String str, v vVar) {
        int f10 = vVar.f();
        if (vVar.f() == 1684108385) {
            vVar.E(8);
            return new l(str, (String) null, vVar.o(f10 - 16));
        }
        StringBuilder a10 = a.a("Failed to parse text attribute: ");
        a10.append(a.a(i10));
        Log.w("MetadataUtil", a10.toString());
        return null;
    }

    public static h e(int i10, String str, v vVar, boolean z10, boolean z11) {
        int f10 = f(vVar);
        if (z11) {
            f10 = Math.min(1, f10);
        }
        if (f10 < 0) {
            StringBuilder a10 = a.a("Failed to parse uint8 attribute: ");
            a10.append(a.a(i10));
            Log.w("MetadataUtil", a10.toString());
            return null;
        } else if (z10) {
            return new l(str, (String) null, Integer.toString(f10));
        } else {
            return new e("und", str, Integer.toString(f10));
        }
    }

    public static int f(v vVar) {
        vVar.E(4);
        if (vVar.f() == 1684108385) {
            vVar.E(8);
            return vVar.s();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
