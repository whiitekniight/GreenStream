package p024;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p164.AbstractC2927;
import p436.C5498;

/* JADX INFO: renamed from: ʻᴵ.ﾞᴵ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1388 {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f4769;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f4770;

    public /* synthetic */ AbstractC1388(int r1) {
        this.f4769 = r1;
    }

    public /* synthetic */ AbstractC1388(int r1, int r2) {
        this.f4769 = r2;
        this.f4770 = r1;
    }

    /* JADX INFO: renamed from: ʽ */
    public static void m3881(String r7) {
        if (r7.equalsIgnoreCase(":memory:") == true) goto L41;
        int r0 = r7.length() - 1;
        int r3 = 0;
        boolean r4 = false;
    L5:
        if (r3 > r0) goto L21;
        if (r4 == true) goto L8;
        int r5 = r3;
    L10:
        if (AbstractC2927.m6274(r7.charAt(r5), 32) > 0) goto L12;
        boolean r52 = true;
    L13:
        if (r4 == false) goto L14;
        if (r52 == false) goto L21;
        r0 = r0 - 1;
        goto L5
    L14:
        if (r52 == false) goto L15;
        r3 = r3 + 1;
        goto L5
    L15:
        r4 = true;
        goto L5
    L12:
        r52 = false;
        goto L13
    L8:
        r5 = r0;
    L21:
        if (r7.subSequence(r3, r0 + 1).toString().length() == 0) goto L42;
        "deleting the database file: ".concat(r7);
        SQLiteDatabase.deleteDatabase(new File(r7));     // Catch: Exception -> L26
        return;
    L28:
        return;
    L42:
        return;
    }

    /* JADX INFO: renamed from: ˈ */
    public static String m3882(int r2) {
        return "" + ((char) ((r2 >> 24) & 255)) + ((char) ((r2 >> 16) & 255)) + ((char) ((r2 >> 8) & 255)) + ((char) (r2 & 255));
    }

    public String toString() {
        switch(this.f4769) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return m3882(this.f4770);
    }

    /* JADX INFO: renamed from: ʼˎ */
    public abstract int mo3883();

    /* JADX INFO: renamed from: ʼᐧ */
    public abstract void mo3884(C5498 r1);

    /* JADX INFO: renamed from: ˆʾ */
    public abstract int mo3885();

    /* JADX INFO: renamed from: ˉʿ */
    public void mo3886(C5498 r1) {
    }

    /* JADX INFO: renamed from: ˉˆ */
    public void mo3887(C5498 r3) {
        String r0 = "Corruption reported by sqlite on database: " + r3 + ".path";
        SQLiteDatabase r02 = r3.f19705;
        if (r02.isOpen() == true) goto L8;
        String r32 = r02.getPath();
        if (r32 == null) goto L41;
        m3881(r32);
        return;
    L41:
        return;
    L8:
        List<Pair<String, String>> r1 = null;
        r1 = r02.getAttachedDbs();     // Catch: Throwable -> L11 SQLiteException -> L33
    L11:
        th = move-exception;
        if (r1 == null) goto L20;
        Iterator<T> r03 = r1.iterator();
    L18:
        if (r03.hasNext() == false) goto L23;
        m3881((String) ((Pair) r03.next()).second);
    L23:
        throw th;
    L20:
        String r04 = r02.getPath();
        if (r04 == null) goto L23;
        m3881(r04);
    L35:
        r3.close();     // Catch: Throwable -> L11 IOException -> L34
    L24:
        if (r1 == null) goto L29;
        Iterator<T> r33 = r1.iterator();
    L27:
        if (r33.hasNext() == false) goto L43;
        m3881((String) ((Pair) r33.next()).second);
        goto L27
    L43:
        return;
    L29:
        String r34 = r02.getPath();
        if (r34 == null) goto L42;
        m3881(r34);
        return;
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public boolean m3888(int r2) {
        if ((this.f4770 & r2) != r2) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: יـ */
    public abstract void mo3889(C5498 r1, int r2, int r3);

    /* JADX INFO: renamed from: ٴﹶ */
    public abstract int mo3890();

    /* JADX INFO: renamed from: ᵎﹶ */
    public abstract int mo3891();

    /* JADX INFO: renamed from: ᵔᵢ */
    public abstract int mo3892();

    /* JADX INFO: renamed from: ᵔﹳ */
    public abstract void mo3893(C5498 r1, int r2, int r3);

    /* JADX INFO: renamed from: ⁱˊ */
    public void m3894(int r2) {
        this.f4770 = r2 | this.f4770;
    }

    /* JADX INFO: renamed from: ﹳᐧ */
    public abstract void mo3895(C5498 r1);
}
