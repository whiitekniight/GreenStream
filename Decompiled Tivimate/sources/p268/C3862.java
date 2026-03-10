package p268;

import androidx.datastore.preferences.protobuf.AbstractC0017;
import java.security.InvalidKeyException;

/* JADX INFO: renamed from: יٴ.ٴﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C3862 extends AbstractC0017 {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ int f14142;

    public C3862(byte[] r2, int r3, int r4) {
        this.f14142 = r4;
        if (r2.length != 32) goto L7;
        this.f396 = AbstractC3857.m7950(r2);
        this.f397 = r3;
        return;
    L7:
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0017
    /* JADX INFO: renamed from: ʼˎ */
    public final int mo228() {
        switch(this.f14142) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 24;
    L6:
        return 12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0017
    /* JADX INFO: renamed from: ʽ */
    public final int[] mo229(int[] r9, int r10) {
        switch(this.f14142) {
            case 0: goto L11;
            default: goto L5;
        };
    L5:
        if (r9.length != 6) goto L9;
        int[] r0 = new int[16];
        int[] r1 = AbstractC3857.m7951((int[]) this.f396, r9);
        int[] r5 = AbstractC3857.f14130;
        System.arraycopy(r5, 0, r0, 0, r5.length);
        System.arraycopy(r1, 0, r0, r5.length, 8);
        r0[12] = r10;
        r0[13] = 0;
        r0[14] = r9[4];
        r0[15] = r9[5];
        return r0;
    L9:
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r9.length * 32)}));
    L11:
        if (r9.length != 3) goto L15;
        int[] r02 = new int[16];
        int[] r12 = (int[]) this.f396;
        int[] r52 = AbstractC3857.f14130;
        System.arraycopy(r52, 0, r02, 0, r52.length);
        System.arraycopy(r12, 0, r02, r52.length, 8);
        r02[12] = r10;
        System.arraycopy(r9, 0, r02, 13, r9.length);
        return r02;
    L15:
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(r9.length * 32)}));
    }
}
