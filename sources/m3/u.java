package m3;

import android.support.v4.media.a;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m3.j;
import n0.d;

/* compiled from: LoadPath */
public class u<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final d<List<Throwable>> f21667a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<Data, ResourceType, Transcode>> f21668b;

    /* renamed from: c  reason: collision with root package name */
    public final String f21669c;

    public u(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, d<List<Throwable>> dVar) {
        this.f21667a = dVar;
        if (!list.isEmpty()) {
            this.f21668b = list;
            StringBuilder a10 = a.a("Failed LoadPath{");
            a10.append(cls.getSimpleName());
            a10.append("->");
            a10.append(cls2.getSimpleName());
            a10.append("->");
            a10.append(cls3.getSimpleName());
            a10.append("}");
            this.f21669c = a10.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public w<Transcode> a(e<Data> eVar, k3.e eVar2, int i10, int i11, j.a<ResourceType> aVar) throws r {
        w<Transcode> wVar;
        List<Throwable> b10 = this.f21667a.b();
        e.e.b(b10);
        List list = b10;
        try {
            int size = this.f21668b.size();
            wVar = null;
            for (int i12 = 0; i12 < size; i12++) {
                wVar = ((j) this.f21668b.get(i12)).a(eVar, i10, i11, eVar2, aVar);
                if (wVar != null) {
                    break;
                }
            }
        } catch (r e10) {
            list.add(e10);
        } catch (Throwable th) {
            this.f21667a.a(list);
            throw th;
        }
        if (wVar != null) {
            this.f21667a.a(list);
            return wVar;
        }
        throw new r(this.f21669c, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder a10 = a.a("LoadPath{decodePaths=");
        a10.append(Arrays.toString(this.f21668b.toArray()));
        a10.append('}');
        return a10.toString();
    }
}
