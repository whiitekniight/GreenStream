package p416;

import java.nio.ByteBuffer;
import p083.C2114;

/* JADX INFO: renamed from: ﹳʽ.יـ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5276 {

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2114 f18983 = null;

    static {
        f18983 = C2114.m5123(new byte[0]);
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public static final C2114 m10291(int r2) {
        return C2114.m5123(ByteBuffer.allocate(5).put((byte) 1).putInt(r2).array());
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public static final C2114 m10292(int r2) {
        return C2114.m5123(ByteBuffer.allocate(5).put((byte) 0).putInt(r2).array());
    }
}
