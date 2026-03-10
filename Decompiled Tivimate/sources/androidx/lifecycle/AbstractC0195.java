package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p216.C3402;

/* JADX INFO: renamed from: androidx.lifecycle.ᵎᵔ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0195 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final C3402 f1097;

    public AbstractC0195() {
        this.f1097 = new C3402();
    }

    /* JADX INFO: renamed from: ʽ */
    public final void m727(String r3, AutoCloseable r4) {
        C3402 r0 = this.f1097;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f11984 == false) goto L8;
        C3402.m7157(r4);
        return;
    L8:
        ﹳˋ.ʼˎ r1 = (ﹳˋ.ʼˎ) r0.f11983;
        monitor-enter(r1);
        AutoCloseable r32 = (AutoCloseable) ((LinkedHashMap) r0.f11981).put(r3, r4);     // Catch: Throwable -> L14
        monitor-exit(r1);
        C3402.m7157(r32);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˈ */
    public final void m728() {
        C3402 r0 = this.f1097;
        if (r0 != null) goto L5;
    L24:
        mo730();
        return;
    L5:
        if (r0.f11984 == true) goto L24;
        r0.f11984 = true;
        ﹳˋ.ʼˎ r1 = (ﹳˋ.ʼˎ) r0.f11983;
        monitor-enter(r1);
        Iterator r2 = ((LinkedHashMap) r0.f11981).values().iterator();     // Catch: Throwable -> L13
    L11:
        if (r2.hasNext() == false) goto L15;
        C3402.m7157((AutoCloseable) r2.next());     // Catch: Throwable -> L13
        goto L11
    L15:
        Iterator r22 = ((LinkedHashSet) r0.f11982).iterator();     // Catch: Throwable -> L13
    L17:
        if (r22.hasNext() == false) goto L19;
        C3402.m7157((AutoCloseable) r22.next());     // Catch: Throwable -> L13
        goto L17
    L19:
        ((LinkedHashSet) r0.f11982).clear();     // Catch: Throwable -> L13
        monitor-exit(r1);
    L13:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public final AutoCloseable m729(String r3) {
        C3402 r0 = this.f1097;
        if (r0 == null) goto L12;
        ﹳˋ.ʼˎ r1 = (ﹳˋ.ʼˎ) r0.f11983;
        monitor-enter(r1);
        AutoCloseable r32 = (AutoCloseable) ((LinkedHashMap) r0.f11981).get(r3);     // Catch: Throwable -> L9
        monitor-exit(r1);
        return r32;
    L9:
        th = move-exception;
        throw th;
    L12:
        return null;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public void mo730() {
    }
}
