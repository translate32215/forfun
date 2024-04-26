package d5;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import java.util.List;
import java.util.Map;

/* compiled from: ExtractorsFactory */
public interface o {
    i[] b();

    Extractor[] d(Uri uri, Map<String, List<String>> map);
}
