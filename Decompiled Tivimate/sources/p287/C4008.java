package p287;

import android.content.Context;
import android.net.ConnectivityManager;
import com.parse.ˊﾞ;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p099.InterfaceC2228;
import p308.AbstractC4142;
import ˉᵎ.ⁱˊ;

/* JADX INFO: renamed from: ـﹶ.ﾞʻ */
/* JADX INFO: loaded from: classes.dex */
public final class C4008 implements InterfaceC3986, InterfaceC2228 {

    /* JADX INFO: renamed from: ʾˋ */
    public final Context f14807;

    public C4008(Context r1, int r2) {
        switch(r2) {
            case 1: goto L7;
            case 2: goto L5;
            default: goto L3;
        };
    L3:
        this.f14807 = r1.getApplicationContext();
        return;
    L5:
        AbstractC4142.m8398(r1);
        Context r12 = r1.getApplicationContext();
        AbstractC4142.m8398(r12);
        this.f14807 = r12;
        return;
    L7:
        this.f14807 = r1;
    }

    @Override // p099.InterfaceC2228
    public Object get() {
        return (ConnectivityManager) this.f14807.getSystemService("connectivity");
    }

    @Override // p287.InterfaceC3986
    /* JADX INFO: renamed from: ﹳٴ */
    public void mo8158(ⁱˊ r9) {
        ThreadFactoryC4006 r7 = new ThreadFactoryC4006(0, "EmojiCompatInitializer");
        ThreadPoolExecutor r0 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r7);
        r0.allowCoreThreadTimeOut(true);
        r0.execute(new ˊﾞ(this, r9, r0, 7));
    }
}
