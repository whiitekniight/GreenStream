package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.ˊˋ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0567 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        Unsafe r0 = C0553.f2341;
        Field[] r1 = Unsafe.class.getDeclaredFields();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L10;
        Field r4 = r1[r3];
        r4.setAccessible(true);
        Object r42 = r4.get(null);
        if (Unsafe.class.isInstance(r42) == true) goto L7;
        r3 = r3 + 1;
        goto L3
    L7:
        return (Unsafe) Unsafe.class.cast(r42);
    L10:
        throw new NoSuchFieldError("the Unsafe");
    }
}
