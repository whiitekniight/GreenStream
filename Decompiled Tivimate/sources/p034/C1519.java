package p034;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ʼˊ.ʽ */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 extends LinkedHashMap {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f5011;

    public C1519() {
        this.f5011 = 0;
        super(64, 0.75f, true);
    }

    public /* synthetic */ C1519(int r2, float r3, boolean r4) {
        this.f5011 = 1;
        super(r2, r3, r4);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry r2) {
        switch(this.f5011) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (size() <= 4) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (size() <= 32) goto L12;
        return true;
    L12:
        return false;
    }
}
