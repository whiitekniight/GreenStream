package p025;

import java.io.Serializable;
import p341.InterfaceC4587;

/* JADX INFO: renamed from: ʻᵢ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C1389 implements InterfaceC1391, Serializable {

    /* JADX INFO: renamed from: ʽʽ */
    public final Object f4771;

    /* JADX INFO: renamed from: ʾˋ */
    public InterfaceC4587 f4772;

    /* JADX INFO: renamed from: ᴵˊ */
    public volatile Object f4773;

    public C1389(InterfaceC4587 r1) {
        this.f4772 = r1;
        this.f4773 = C1399.f4780;
        this.f4771 = this;
    }

    @Override // p025.InterfaceC1391
    public final Object getValue() {
        Object r0 = this.f4773;
        C1399 r1 = C1399.f4780;
        if (r0 == r1) goto L5;
        return r0;
    L5:
        Object r02 = this.f4771;
        monitor-enter(r02);
        Object r2 = this.f4773;     // Catch: Throwable -> L13
        if (r2 != r1) goto L11;
        r2 = this.f4772.mo716();     // Catch: Throwable -> L13
        this.f4773 = r2;     // Catch: Throwable -> L13
        this.f4772 = null;     // Catch: Throwable -> L13
    L11:
        monitor-exit(r02);
        return r2;
    L13:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        if (m3896() == true) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean m3896() {
        if (this.f4773 == C1399.f4780) goto L6;
        return true;
    L6:
        return false;
    }
}
