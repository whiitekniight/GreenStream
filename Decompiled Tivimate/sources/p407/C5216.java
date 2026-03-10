package p407;

import android.os.Build;
import java.util.UUID;
import p433.InterfaceC5483;

/* JADX INFO: renamed from: ⁱᴵ.ﹳᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C5216 implements InterfaceC5483 {

    /* JADX INFO: renamed from: ʽ */
    public static final boolean f18825 = false;

    /* JADX INFO: renamed from: ⁱˊ */
    public final byte[] f18826;

    /* JADX INFO: renamed from: ﹳٴ */
    public final UUID f18827;

    static {
        if ("Amazon".equals(Build.MANUFACTURER) == false) goto L9;
        String r0 = Build.MODEL;
        if ("AFTM".equals(r0) == false) goto L7;
    L8:
        boolean r02 = true;
    L10:
        f18825 = r02;
        return;
    L7:
        if ("AFTB".equals(r0) == true) goto L8;
    L9:
        r02 = false;
        goto L10
    }

    public C5216(UUID r1, byte[] r2) {
        this.f18827 = r1;
        this.f18826 = r2;
    }
}
