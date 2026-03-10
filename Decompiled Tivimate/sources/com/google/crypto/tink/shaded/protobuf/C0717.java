package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ˊʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C0717 implements InterfaceC0738 {

    /* JADX INFO: renamed from: ﹳٴ */
    public InterfaceC0738[] f3017;

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0738
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo2588(Class r6) {
        InterfaceC0738[] r0 = this.f3017;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (r0[r3].mo2588(r6) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC0738
    /* JADX INFO: renamed from: ﹳٴ */
    public final C0749 mo2589(Class r6) {
        InterfaceC0738[] r0 = this.f3017;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        InterfaceC0738 r3 = r0[r2];
        if (r3.mo2588(r6) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return r3.mo2589(r6);
    L10:
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(r6.getName()));
    }
}
