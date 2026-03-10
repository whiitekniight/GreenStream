package p005j$.time.format;

/* JADX INFO: renamed from: j$.time.format.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0814l extends C0815m {
    @Override // p005j$.time.format.C0815m
    /* JADX INFO: renamed from: b */
    public final boolean mo3053b(char r1, char r2) {
        return C0824v.m3078b(r1, r2);
    }

    @Override // p005j$.time.format.C0815m
    /* JADX INFO: renamed from: d */
    public final C0815m mo3054d(String r2, String r3, C0815m r4) {
        return new C0814l(r2, r3, r4);
    }

    @Override // p005j$.time.format.C0815m
    /* JADX INFO: renamed from: e */
    public final boolean mo3055e(CharSequence r5, int r6, int r7) {
        int r0 = this.f3271a.length();
        if (r0 <= (r7 - r6)) goto L5;
        return false;
    L5:
        int r72 = 0;
    L6:
        int r2 = r0 - 1;
        if (r0 <= 0) goto L12;
        int r3 = r72 + 1;
        int r02 = r6 + 1;
        if (C0824v.m3078b(this.f3271a.charAt(r72), r5.charAt(r6)) == false) goto L10;
        r6 = r02;
        r0 = r2;
        r72 = r3;
        goto L6
    L10:
        return false;
    L12:
        return true;
    }
}
