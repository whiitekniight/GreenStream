package p331;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import p308.AbstractC4142;
import p359.AbstractC4761;

/* JADX INFO: renamed from: ᴵˈ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4422 implements Callable {

    /* JADX INFO: renamed from: ʽ */
    public final /* synthetic */ BinderC4411 f16175;

    /* JADX INFO: renamed from: ⁱˊ */
    public final /* synthetic */ String f16176;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ boolean f16177;

    public /* synthetic */ CallableC4422(boolean r1, String r2, BinderC4411 r3) {
        this.f16177 = r1;
        this.f16176 = r2;
        this.f16175 = r3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean r0 = this.f16177;
        String r1 = this.f16176;
        BinderC4411 r2 = this.f16175;
        int r3 = 0;
        if (r0 == false) goto L5;
    L7:
        String r4 = "not allowed";
    L8:
        int r6 = 0;
    L10:
        if (r6 >= 2) goto L14;
        MessageDigest r8 = MessageDigest.getInstance("SHA-256");     // Catch: NoSuchAlgorithmException -> L21
        if (r8 == null) goto L13;
    L15:
        AbstractC4142.m8398(r8);
        byte[] r22 = r8.digest(r2.f16142);
        int r5 = r22.length;
        char[] r52 = new char[r5 + r5];
        int r62 = 0;
    L17:
        if (r3 >= r22.length) goto L20;
        byte r82 = r22[r3];
        char[] r11 = AbstractC4761.f16802;
        r52[r62] = r11[(r82 & 255) >>> 4];
        r52[r62 + 1] = r11[r82 & 15];
        r62 = r62 + 2;
        r3 = r3 + 1;
        goto L17
    L20:
        return r4 + ": pkg=" + r1 + ", sha256=" + new String(r52) + ", atk=" + r0 + ", ver=12451000.false";
    L13:
        r6 = r6 + 1;
        goto L10
    L14:
        r8 = null;
        goto L15
    L5:
        if (AbstractC4418.m8823(r1, r2, true, false).f16146 == false) goto L7;
        r4 = "debug cert rejected";
        goto L8
    }
}
