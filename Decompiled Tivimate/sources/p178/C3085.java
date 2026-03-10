package p178;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import ar.tvplayer.p002tv.R;
import com.bumptech.glide.ʽ;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ˊᵎ.ﹳٴ */
/* JADX INFO: loaded from: classes.dex */
public final class C3085 {

    /* JADX INFO: renamed from: ˈ */
    public static volatile C3085 f10783;

    /* JADX INFO: renamed from: ˑﹳ */
    public static final Object f10784 = null;

    /* JADX INFO: renamed from: ʽ */
    public final Context f10785;

    /* JADX INFO: renamed from: ⁱˊ */
    public final HashSet f10786;

    /* JADX INFO: renamed from: ﹳٴ */
    public final HashMap f10787;

    static {
        f10784 = new Object();
    }

    public C3085(Context r1) {
        this.f10785 = r1.getApplicationContext();
        this.f10786 = new HashSet();
        this.f10787 = new HashMap();
    }

    /* JADX INFO: renamed from: ʽ */
    public static C3085 m6558(Context r2) {
        if (f10783 != null) goto L16;
        Object r0 = f10784;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f10783 != null) goto L11;
        f10783 = new C3085(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    L16:
        return f10783;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public final Object m6559(Class r6, HashSet r7) {
        HashMap r0 = this.f10787;
        if (ʽ.ˉˆ() == false) goto L8;
        Trace.beginSection(ʽ.ˊʻ(r6.getSimpleName()));     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        Trace.endSection();
        throw th;
    L8:
        if (r7.contains(r6) == true) goto L31;
        if (r0.containsKey(r6) == true) goto L27;
        r7.add(r6);     // Catch: Throwable -> L5
        InterfaceC3084 r1 = (InterfaceC3084) r6.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L21
        List r2 = r1.mo413();     // Catch: Throwable -> L21
        if (r2.isEmpty() == true) goto L23;
        Iterator r22 = r2.iterator();     // Catch: Throwable -> L21
    L17:
        if (r22.hasNext() == false) goto L23;
        Class r3 = (Class) r22.next();     // Catch: Throwable -> L21
        if (r0.containsKey(r3) == true) goto L17;
        m6559(r3, r7);     // Catch: Throwable -> L21
    L23:
        Object r12 = r1.mo412(this.f10785);     // Catch: Throwable -> L21
        r7.remove(r6);     // Catch: Throwable -> L21
        r0.put(r6, r12);     // Catch: Throwable -> L21
    L28:
        Trace.endSection();
        return r12;
    L21:
        th = move-exception;
        throw new StartupException(th);     // Catch: Throwable -> L5
    L27:
        r12 = r0.get(r6);     // Catch: Throwable -> L5
        goto L28
    L31:
        throw new IllegalStateException("Cannot initialize " + r6.getName() + ". Cycle detected.");     // Catch: Throwable -> L5
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m6560(Bundle r7) {
        String r0 = this.f10785.getString(R.string.u);
        if (r7 != null) goto L23;
        return;
    L23:
        HashSet r1 = new HashSet();     // Catch: ClassNotFoundException -> L13
        Iterator<String> r2 = r7.keySet().iterator();     // Catch: ClassNotFoundException -> L13
    L5:
        boolean r3 = r2.hasNext();     // Catch: ClassNotFoundException -> L13
        HashSet r4 = this.f10786;
        if (r3 == false) goto L15;
        String r32 = r2.next();     // Catch: ClassNotFoundException -> L13
        if (r0.equals(r7.getString(r32, null)) == false) goto L5;
        Class<?> r33 = Class.forName(r32);     // Catch: ClassNotFoundException -> L13
        if (InterfaceC3084.class.isAssignableFrom(r33) == false) goto L5;
        r4.add(r33);     // Catch: ClassNotFoundException -> L13
        goto L5
    L15:
        Iterator r72 = r4.iterator();     // Catch: ClassNotFoundException -> L13
    L16:
        if (r72.hasNext() == false) goto L33;
        m6559((Class) r72.next(), r1);     // Catch: ClassNotFoundException -> L13
        goto L16
    L33:
        return;
    L13:
        e = move-exception;
        throw new StartupException(e);
    }
}
