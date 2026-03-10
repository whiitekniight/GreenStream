package p005j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: j$.time.format.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C0828z implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object r1, Object r2) {
        return ((String) ((Map.Entry) r2).getKey()).length() - ((String) ((Map.Entry) r1).getKey()).length();
    }
}
