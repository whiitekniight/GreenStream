package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.ᵎⁱ */
/* JADX INFO: loaded from: classes.dex */
public final class C0740 {
    /* JADX INFO: renamed from: ﹳٴ */
    public static C0716 m2710(Object r1, Object r2) {
        C0716 r12 = (C0716) r1;
        C0716 r22 = (C0716) r2;
        if (r22.isEmpty() == false) goto L5;
    L10:
        return r12;
    L5:
        if (r12.f3016 == true) goto L7;
        r12 = r12.m2586();
    L7:
        r12.m2587();
        if (r22.isEmpty() == true) goto L10;
        r12.putAll(r22);
        goto L10
    }
}
