package p416;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p289.AbstractC4011;

/* JADX INFO: renamed from: ﹳʽ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C5261 {

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C5261 f18962 = null;

    /* JADX INFO: renamed from: ﹳٴ */
    public final HashMap f18963;

    static {
        f18962 = new C5261();
    }

    public C5261() {
        this.f18963 = new HashMap();
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final synchronized void m10265(Map r3) {
        monitor-enter(this);
        Iterator r32 = r3.entrySet().iterator();     // Catch: Throwable -> L8
    L4:
        if (r32.hasNext() == false) goto L10;
        Map.Entry r0 = (Map.Entry) r32.next();     // Catch: Throwable -> L8
        m10266((String) r0.getKey(), (AbstractC4011) r0.getValue());     // Catch: Throwable -> L8
        goto L4
    L10:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final synchronized void m10266(String r4, AbstractC4011 r5) {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L5:
        if (this.f18963.containsKey(r4) == true) goto L7;
        this.f18963.put(r4, r5);     // Catch: Throwable -> L12
        monitor-exit(this);
        return;
    L7:
        if (((AbstractC4011) this.f18963.get(r4)).equals(r5) == false) goto L11;
        monitor-exit(this);
        return;
    L11:
        throw new GeneralSecurityException("Parameters object with name " + r4 + " already exists (" + this.f18963.get(r4) + "), cannot insert " + r5);     // Catch: Throwable -> L12
    }
}
