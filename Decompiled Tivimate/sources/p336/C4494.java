package p336;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᴵי.ˉـ */
/* JADX INFO: loaded from: classes.dex */
public class C4494 extends C4514 {

    /* JADX INFO: renamed from: ʽʽ */
    public final boolean f16334;

    public C4494(InterfaceC4519 r6) {
        boolean r0 = true;
        super(true);
        m8961(r6);
        AtomicReferenceFieldUpdater r62 = C4514.f16358;
        InterfaceC4526 r1 = (InterfaceC4526) r62.get(this);
        if ((r1 instanceof C4493) == false) goto L5;
        C4493 r12 = (C4493) r1;
    L7:
        if (r12 == null) goto L27;
        C4514 r13 = r12.f16320;
        if (r13 != null) goto L12;
        r13 = null;
    L12:
        if (r13 == null) goto L27;
    L15:
        if (r13.mo8914() == true) goto L28;
        InterfaceC4526 r14 = (InterfaceC4526) r62.get(r13);
        if ((r14 instanceof C4493) == false) goto L20;
        C4493 r15 = (C4493) r14;
    L21:
        if (r15 == null) goto L27;
        r13 = r15.f16320;
        if (r13 != null) goto L26;
        r13 = null;
    L26:
        if (r13 != null) goto L15;
    L20:
        r15 = null;
    L28:
        this.f16334 = r0;
        return;
    L27:
        r0 = false;
        goto L28
    L5:
        r12 = null;
        goto L7
    }

    @Override // p336.C4514
    /* JADX INFO: renamed from: ˊʻ */
    public final boolean mo8913() {
        return true;
    }

    @Override // p336.C4514
    /* JADX INFO: renamed from: ᴵᵔ */
    public final boolean mo8914() {
        return this.f16334;
    }
}
