package p028;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p164.AbstractC2927;
import p283.AbstractC3963;
import p283.C3961;
import p447.AbstractC5637;
import ˋⁱ.ﾞᴵ;
import ـˎ.ˈ;

/* JADX INFO: renamed from: ʼ.ˑﹳ */
/* JADX INFO: loaded from: classes.dex */
public class C1418 implements InterfaceC1420 {

    /* JADX INFO: renamed from: ﾞᴵ */
    public static final ˈ f4797 = null;

    /* JADX INFO: renamed from: ʽ */
    public final Method f4798;

    /* JADX INFO: renamed from: ˈ */
    public final Method f4799;

    /* JADX INFO: renamed from: ˑﹳ */
    public final Method f4800;

    /* JADX INFO: renamed from: ⁱˊ */
    public final Method f4801;

    /* JADX INFO: renamed from: ﹳٴ */
    public final Class f4802;

    static {
        f4797 = new ˈ(4);
    }

    public C1418(Class r5) {
        this.f4802 = r5;
        this.f4801 = r5.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        this.f4798 = r5.getMethod("setHostname", new Class[]{String.class});
        this.f4799 = r5.getMethod("getAlpnSelectedProtocol", null);
        this.f4800 = r5.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ʽ */
    public final boolean mo3910() {
        boolean r0 = C3961.f14596;
        return C3961.f14596;
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ˈ */
    public final void mo3911(SSLSocket r6, String r7, List r8) {
        if (this.f4802.isInstance(r6) == true) goto L20;
        return;
    L20:
        this.f4801.invoke(r6, new Object[]{Boolean.TRUE});     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11
        if (r7 != null) goto L7;
    L13:
        Method r72 = this.f4800;     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11
        AbstractC3963 r0 = AbstractC3963.f14600;     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11
        r72.invoke(r6, new Object[]{ﾞᴵ.ʽﹳ(r8)});     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11
        return;
    L7:
        if (Build.VERSION.SDK_INT > 23) goto L13;
        this.f4798.invoke(r6, new Object[]{r7});     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11
    L11:
        e = move-exception;
        throw new AssertionError(e);
    L9:
        e = move-exception;
        throw new AssertionError(e);
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ⁱˊ */
    public final boolean mo3913(SSLSocket r2) {
        return this.f4802.isInstance(r2);
    }

    @Override // p028.InterfaceC1420
    /* JADX INFO: renamed from: ﹳٴ */
    public final String mo3914(SSLSocket r4) {
        if (this.f4802.isInstance(r4) == true) goto L22;
    L17:
        return null;
    L22:
        byte[] r42 = (byte[]) this.f4799.invoke(r4, null);     // Catch: InvocationTargetException -> L9 IllegalAccessException -> L11
        if (r42 == null) goto L17;
        return new String(r42, AbstractC5637.f20377);
    L11:
        e = move-exception;
        throw new AssertionError(e);
    L9:
        e = move-exception;
        Throwable r0 = e.getCause();
        if ((r0 instanceof NullPointerException) == false) goto L19;
        if (AbstractC2927.m6273(((NullPointerException) r0).getMessage(), "ssl == null") == true) goto L17;
    L19:
        throw new AssertionError(e);
    }
}
