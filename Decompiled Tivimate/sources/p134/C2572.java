package p134;

import android.os.Build;

/* JADX INFO: renamed from: ˈˋ.ٴﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C2572 {

    /* JADX INFO: renamed from: ﹳٴ */
    public final boolean f9116;

    public C2572(boolean r3) {
        String r0 = Build.VERSION.RELEASE;
        String r1 = Build.VERSION.CODENAME;
        if (r0 == null) goto L10;
        if (r1 == null) goto L8;
        this.f9116 = r3;
        return;
    L8:
        throw new NullPointerException("Null osCodeName");
    L10:
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L5;
        return true;
    L5:
        if ((r2 instanceof C2572) == false) goto L14;
        C2572 r22 = (C2572) r2;
        String r0 = Build.VERSION.RELEASE;
        if (r0.equals(r0) == false) goto L17;
        String r02 = Build.VERSION.CODENAME;
        if (r02.equals(r02) == true) goto L11;
        return false;
    L11:
        if (this.f9116 != r22.f9116) goto L19;
        return true;
    L19:
        return false;
    L17:
        return false;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.f9116 == false) goto L5;
        int r1 = 1231;
    L7:
        return r0 ^ r1;
    L5:
        r1 = 1237;
        goto L7
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f9116 + "}";
    }
}
