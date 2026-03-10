package p047;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import p374.AbstractC4882;

/* JADX INFO: renamed from: ʼﾞ.ˈٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C1696 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final LinkedHashMap f5636;

    public C1696(int r4) {
        switch(r4) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        this.f5636 = new LinkedHashMap();
        return;
    L5:
        this.f5636 = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m4467(AbstractC4882 r5) {
        int r0 = r5.f17303;
        int r1 = r5.f17302;
        Integer r02 = Integer.valueOf(r0);
        LinkedHashMap r2 = this.f5636;
        Object r3 = r2.get(r02);
        if (r3 != null) goto L5;
        r3 = new TreeMap();
        r2.put(r02, r3);
    L5:
        TreeMap r32 = (TreeMap) r3;
        if (r32.containsKey(Integer.valueOf(r1)) == false) goto L8;
        String r03 = "Overriding migration " + r32.get(Integer.valueOf(r1)) + " with " + r5;
    L8:
        r32.put(Integer.valueOf(r1), r5);
    }
}
