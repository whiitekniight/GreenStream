package p034;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: ʼˊ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public final class C1533 extends C1531 {

    /* JADX INFO: renamed from: ⁱˊ */
    public final C1519 f5072;

    public C1533() {
        this.f5072 = new C1519();
        new C1519();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.C1531
    /* JADX INFO: renamed from: ⁱˊ */
    public final void mo4098(byte[] r4) {
        C1519 r0 = this.f5072;
        int r1 = r4.length;
        if (r1 >= 32768) goto L5;
        return;
    L5:
        monitor-enter(r0);
        C1521 r2 = (C1521) r0.get(Integer.valueOf(r1));     // Catch: Throwable -> L9
        if (r2 != null) goto L11;
        r2 = new C1521();     // Catch: Throwable -> L9
        r0.put(Integer.valueOf(r1), r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
        r2.m4086(new SoftReference(r4));
        return;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p034.C1531
    /* JADX INFO: renamed from: ﹳٴ */
    public final byte[] mo4099(int r4) {
        C1519 r0 = this.f5072;
        Object r2 = null;
        if (r4 < 32768) goto L16;
        monitor-enter(r0);
        C1521 r1 = (C1521) r0.get(Integer.valueOf(r4));     // Catch: Throwable -> L21
        monitor-exit(r0);     // Catch: Throwable -> L21
        if (r1 == null) goto L16;
    L10:
        Reference r02 = (Reference) r1.m4087();
        if (r02 == null) goto L16;
        Object r03 = r02.get();
        if (r03 == null) goto L10;
        r2 = r03;
    L21:
        th = move-exception;
        throw th;
    L16:
        byte[] r22 = (byte[]) r2;
        if (r22 == null) goto L19;
        return r22;
    L19:
        return new byte[r4];
    }
}
