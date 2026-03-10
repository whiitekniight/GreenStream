package p361;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᵎⁱ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final class C4767 extends C4774 {
    @Override // p361.C4774
    /* JADX INFO: renamed from: ʻᵎ */
    public final Typeface mo9378(Object r6) {
        Object r1 = Array.newInstance(this.f16826, 1);     // Catch: InvocationTargetException -> L5 Throwable -> L7
        Array.set(r1, 0, r6);     // Catch: InvocationTargetException -> L5 Throwable -> L7
        return (Typeface) this.f16823.invoke(null, new Object[]{r1, "sans-serif", -1, -1});
    L7:
        e = move-exception;
        throw new RuntimeException(e);
    }

    @Override // p361.C4774
    /* JADX INFO: renamed from: ˈˏ */
    public final Method mo9379(Class r4) {
        Class r2 = Integer.TYPE;
        Method r42 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(r4, 1).getClass(), String.class, r2, r2});
        r42.setAccessible(true);
        return r42;
    }
}
