package n1;

import java.io.File;
import java.io.FileFilter;

/* compiled from: MultiDexExtractor */
public class f implements FileFilter {
    public f(g gVar) {
    }

    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
