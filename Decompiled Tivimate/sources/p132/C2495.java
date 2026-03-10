package p132;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: ˈˆ.ᵎﹶ */
/* JADX INFO: loaded from: classes.dex */
public final class C2495 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String r2, boolean r3) {
        if (r2.startsWith("java.") == true) goto L9;
        if (r2.startsWith("android.") == true) goto L9;
        return findClass(r2);
    L9:
        return super.loadClass(r2, r3);
    }
}
