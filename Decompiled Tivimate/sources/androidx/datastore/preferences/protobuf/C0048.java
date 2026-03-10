package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ᴵˊ */
/* JADX INFO: loaded from: classes.dex */
public final class C0048 implements InterfaceC0054 {

    /* JADX INFO: renamed from: ﹳٴ */
    public InterfaceC0054[] f448;

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0054
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo255(Class r6) {
        InterfaceC0054[] r0 = this.f448;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (r0[r3].mo255(r6) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0054
    /* JADX INFO: renamed from: ﹳٴ */
    public final C0029 mo256(Class r6) {
        InterfaceC0054[] r0 = this.f448;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        InterfaceC0054 r3 = r0[r2];
        if (r3.mo255(r6) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return r3.mo256(r6);
    L10:
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(r6.getName()));
    }
}
