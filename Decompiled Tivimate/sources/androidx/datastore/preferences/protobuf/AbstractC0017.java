package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.י;
import com.google.crypto.tink.shaded.protobuf.C0698;
import com.google.crypto.tink.shaded.protobuf.C0741;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import p268.AbstractC3857;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ˆʾ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0017 {

    /* JADX INFO: renamed from: ⁱˊ */
    public Object f396;

    /* JADX INFO: renamed from: ﹳٴ */
    public int f397;

    /* JADX INFO: renamed from: ˈ */
    public static int m225(int r1) {
        int r0 = r1 >>> 1;
        return (-(r1 & 1)) ^ r0;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public static long m226(long r4) {
        long r0 = r4 >>> 1;
        return (-(r4 & 1)) ^ r0;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public static C0698 m227(byte[] r1, int r2, int r3, boolean r4) {
        C0698 r0 = new C0698(r1, r2, r3, r4);
        r0.mo213(r3);     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L5
        return r0;
    L5:
        e = move-exception;
        throw new IllegalArgumentException(e);
    }

    /* JADX INFO: renamed from: ʻٴ */
    public abstract long mo179();

    /* JADX INFO: renamed from: ʼʼ */
    public abstract int mo180();

    /* JADX INFO: renamed from: ʼˎ */
    public abstract int mo228();

    /* JADX INFO: renamed from: ʼᐧ */
    public abstract double mo182();

    /* JADX INFO: renamed from: ʽ */
    public abstract int[] mo229(int[] r1, int r2);

    /* JADX INFO: renamed from: ʽʽ */
    public abstract int mo183();

    /* JADX INFO: renamed from: ʽﹳ */
    public abstract int mo184();

    /* JADX INFO: renamed from: ʾˋ */
    public abstract String mo185();

    /* JADX INFO: renamed from: ʾᵎ */
    public abstract long mo186();

    /* JADX INFO: renamed from: ˆʾ */
    public abstract void mo187(int r1);

    /* JADX INFO: renamed from: ˈٴ */
    public abstract int mo190();

    /* JADX INFO: renamed from: ˉʿ */
    public abstract boolean mo191();

    /* JADX INFO: renamed from: ˉˆ */
    public abstract C0741 mo230();

    /* JADX INFO: renamed from: ˊʻ */
    public abstract boolean mo193(int r1);

    /* JADX INFO: renamed from: ˏי */
    public abstract float mo196();

    /* JADX INFO: renamed from: יـ */
    public abstract long mo198();

    /* JADX INFO: renamed from: ـˆ */
    public abstract int mo199();

    /* JADX INFO: renamed from: ٴᵢ */
    public void m231() {
    L2:
        int r0 = mo183();
        if (r0 == 0) goto L9;
        int r1 = this.f397;
        if (r1 >= 100) goto L11;
        this.f397 = r1 + 1;
        this.f397--;
        if (mo193(r0) == true) goto L2;
        return;
    L11:
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public void m232(byte[] r7, ByteBuffer r8, ByteBuffer r9) {
        if (r7.length != mo228()) goto L13;
        int r0 = r9.remaining();
        int r1 = r0 / 64;
        int r2 = r1 + 1;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L11;
        ByteBuffer r4 = m233(this.f397 + r3, r7);
        if (r3 != r1) goto L9;
        י.ˊʻ(r8, r9, r4, r0 % 64);
    L10:
        r3 = r3 + 1;
        goto L5
    L9:
        י.ˊʻ(r8, r9, r4, 64);
        goto L10
    L11:
        return;
    L13:
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo228());
    }

    /* JADX INFO: renamed from: ᴵˊ */
    public abstract String mo201();

    /* JADX INFO: renamed from: ᴵᵔ */
    public abstract long mo202();

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract boolean mo205();

    /* JADX INFO: renamed from: ᵔʾ */
    public abstract C0055 mo206();

    /* JADX INFO: renamed from: ᵔﹳ */
    public abstract int mo209();

    /* JADX INFO: renamed from: ᵢˏ */
    public abstract long mo210();

    /* JADX INFO: renamed from: ⁱˊ */
    public abstract void mo211(int r1);

    /* JADX INFO: renamed from: ﹳٴ */
    public ByteBuffer m233(int r5, byte[] r6) {
        int[] r52 = mo229(AbstractC3857.m7950(r6), r5);
        int[] r62 = (int[]) r52.clone();
        AbstractC3857.m7949(r62);
        int r1 = 0;
    L4:
        if (r1 >= r52.length) goto L6;
        r52[r1] = r52[r1] + r62[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        ByteBuffer r63 = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        r63.asIntBuffer().put(r52, 0, 16);
        return r63;
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public abstract int mo212();

    /* JADX INFO: renamed from: ﾞʻ */
    public abstract int mo213(int r1);

    /* JADX INFO: renamed from: ﾞᴵ */
    public abstract int mo214();
}
