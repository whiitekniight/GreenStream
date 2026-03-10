package p191;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p047.C1696;
import p231.AbstractC3507;
import p319.AbstractC4223;
import p442.AbstractC5582;
import ˋⁱ.ﾞᴵ;

/* JADX INFO: renamed from: ˋˋ.ـˊ */
/* JADX INFO: loaded from: classes.dex */
public class C3196 {

    /* JADX INFO: renamed from: ʽ */
    public int f11256;

    /* JADX INFO: renamed from: ˈ */
    public int f11257;

    /* JADX INFO: renamed from: ˑﹳ */
    public int f11258;

    /* JADX INFO: renamed from: ᵎﹶ */
    public final Object f11259;

    /* JADX INFO: renamed from: ⁱˊ */
    public int f11260;

    /* JADX INFO: renamed from: ﹳٴ */
    public final /* synthetic */ int f11261;

    /* JADX INFO: renamed from: ﾞᴵ */
    public final Object f11262;

    public C3196(int r2) {
        this.f11261 = 1;
        this.f11260 = r2;
        if (r2 <= 0) goto L6;
        this.f11262 = new C1696(1);
        this.f11259 = new ﾞᴵ();
        return;
    L6:
        AbstractC3507.m7263("maxSize <= 0");
        throw null;
    }

    public C3196(StaggeredGridLayoutManager r2, int r3) {
        this.f11261 = 0;
        this.f11259 = r2;
        this.f11262 = new ArrayList();
        this.f11260 = Integer.MIN_VALUE;
        this.f11256 = Integer.MIN_VALUE;
        this.f11257 = 0;
        this.f11258 = r3;
    }

    public String toString() {
        switch(this.f11261) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ﾞᴵ r1 = (ﾞᴵ) this.f11259;
        monitor-enter(r1);
        int r2 = this.f11257;     // Catch: Throwable -> L11
        int r3 = this.f11258 + r2;     // Catch: Throwable -> L11
        if (r3 == 0) goto L13;
        int r22 = (r2 * 100) / r3;     // Catch: Throwable -> L11
    L14:
        String r0 = "LruCache[maxSize=" + this.f11260 + ",hits=" + this.f11257 + ",misses=" + this.f11258 + ",hitRate=" + r22 + "%]";     // Catch: Throwable -> L11
        monitor-exit(r1);
        return r0;
    L13:
        r22 = 0;
    L11:
        th = move-exception;
        throw th;
    L5:
        return super.toString();
    }

    /* JADX INFO: renamed from: ʼˎ */
    public View m6793(int r7, int r8) {
        StaggeredGridLayoutManager r0 = (StaggeredGridLayoutManager) this.f11259;
        ArrayList r1 = (ArrayList) this.f11262;
        View r3 = null;
        if (r8 != (-1)) goto L19;
        int r82 = r1.size();
        int r2 = 0;
    L5:
        if (r2 >= r82) goto L18;
        View r4 = (View) r1.get(r2);
        if (r0.f1546 == false) goto L11;
        if (AbstractC3152.m6674(r4) <= r7) goto L18;
    L11:
        if (r0.f1546 == true) goto L16;
        if (AbstractC3152.m6674(r4) >= r7) goto L18;
    L16:
        if (r4.hasFocusable() == false) goto L18;
        r2 = r2 + 1;
        r3 = r4;
    L18:
        return r3;
    L19:
        int r83 = r1.size() - 1;
    L20:
        if (r83 < 0) goto L33;
        View r22 = (View) r1.get(r83);
        if (r0.f1546 == false) goto L26;
        if (AbstractC3152.m6674(r22) >= r7) goto L33;
    L26:
        if (r0.f1546 == true) goto L31;
        if (AbstractC3152.m6674(r22) <= r7) goto L33;
    L31:
        if (r22.hasFocusable() == false) goto L33;
        r83 = r83 - 1;
        r3 = r22;
    L33:
        return r3;
    }

    /* JADX INFO: renamed from: ʽ */
    public Object mo6794(Object r1) {
        return null;
    }

    /* JADX INFO: renamed from: ˆʾ */
    public int m6795(int r4) {
        ArrayList r0 = (ArrayList) this.f11262;
        int r1 = this.f11260;
        if (r1 == Integer.MIN_VALUE) goto L6;
        return r1;
    L6:
        if (r0.size() != 0) goto L8;
        return r4;
    L8:
        View r42 = (View) r0.get(0);
        C3223 r02 = (C3223) r42.getLayoutParams();
        this.f11260 = ((StaggeredGridLayoutManager) this.f11259).f1555.mo4537(r42);
        r02.getClass();
        return this.f11260;
    }

    /* JADX INFO: renamed from: ˈ */
    public int m6796() {
        ArrayList r0 = (ArrayList) this.f11262;
        if (((StaggeredGridLayoutManager) this.f11259).f1546 == false) goto L7;
        return m6807(r0.size() - 1, -1);
    L7:
        return m6807(0, r0.size());
    }

    /* JADX INFO: renamed from: ˉʿ */
    public Object m6797(String r3) {
        ﾞᴵ r0 = (ﾞᴵ) this.f11259;
        monitor-enter(r0);
        Object r32 = ((C1696) this.f11262).f5636.remove(r3);     // Catch: Throwable -> L8
        if (r32 == null) goto L10;
        this.f11256--;
    L10:
        monitor-exit(r0);
        return r32;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ˉˆ */
    public void m6798(int r4) {
    L2:
        ﾞᴵ r0 = (ﾞᴵ) this.f11259;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.f11256 < 0) goto L28;
        if (((C1696) this.f11262).f5636.isEmpty() == false) goto L14;
        if (this.f11256 != 0) goto L28;
    L14:
        if (this.f11256 <= r4) goto L25;
        if (((C1696) this.f11262).f5636.isEmpty() == true) goto L25;
        Map.Entry r1 = (Map.Entry) AbstractC5582.m10752(((C1696) this.f11262).f5636.entrySet());     // Catch: Throwable -> L11
        if (r1 == null) goto L20;
        Object r2 = r1.getKey();     // Catch: Throwable -> L11
        r1.getValue();     // Catch: Throwable -> L11
        ((C1696) this.f11262).f5636.remove(r2);     // Catch: Throwable -> L11
        this.f11256--;
        monitor-exit(r0);
        goto L2
    L20:
        monitor-exit(r0);
        return;
    L25:
        monitor-exit(r0);
        return;
    L28:
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");     // Catch: Throwable -> L11
    }

    /* JADX INFO: renamed from: ˑﹳ */
    public int m6799() {
        ArrayList r0 = (ArrayList) this.f11262;
        if (((StaggeredGridLayoutManager) this.f11259).f1546 == false) goto L7;
        return m6807(0, r0.size());
    L7:
        return m6807(r0.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ٴﹶ */
    public int m6800() {
        ﾞᴵ r0 = (ﾞᴵ) this.f11259;
        monitor-enter(r0);
        int r1 = this.f11260;     // Catch: Throwable -> L7
        monitor-exit(r0);
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ᵎﹶ */
    public Object m6801(Object r5) {
        ﾞᴵ r0 = (ﾞᴵ) this.f11259;
        monitor-enter(r0);
        Object r1 = ((C1696) this.f11262).f5636.get(r5);     // Catch: Throwable -> L9
        if (r1 == null) goto L11;
        this.f11257++;
        monitor-exit(r0);
        return r1;
    L11:
        this.f11258++;
        monitor-exit(r0);
        Object r02 = mo6794(r5);
        if (r02 != null) goto L17;
        return null;
    L17:
        ﾞᴵ r12 = (ﾞᴵ) this.f11259;
        monitor-enter(r12);
        Object r2 = ((C1696) this.f11262).f5636.put(r5, r02);     // Catch: Throwable -> L28
        if (r2 == null) goto L22;
        ((C1696) this.f11262).f5636.put(r5, r2);     // Catch: Throwable -> L28
    L23:
        monitor-exit(r12);
        if (r2 == null) goto L26;
        return r2;
    L26:
        m6798(this.f11260);
        return r02;
    L22:
        this.f11256++;
    L28:
        th = move-exception;
        throw th;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ᵔʾ */
    public LinkedHashMap m6802() {
        ﾞᴵ r0 = (ﾞᴵ) this.f11259;
        monitor-enter(r0);
        LinkedHashMap r1 = new LinkedHashMap(((C1696) this.f11262).f5636.entrySet().size());     // Catch: Throwable -> L9
        Iterator r2 = ((C1696) this.f11262).f5636.entrySet().iterator();     // Catch: Throwable -> L9
    L5:
        if (r2.hasNext() == false) goto L11;
        Map.Entry r3 = (Map.Entry) r2.next();     // Catch: Throwable -> L9
        r1.put(r3.getKey(), r3.getValue());     // Catch: Throwable -> L9
        goto L5
    L11:
        monitor-exit(r0);
        return r1;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ᵔᵢ */
    public int m6803(int r3) {
        int r0 = this.f11256;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        if (((ArrayList) this.f11262).size() != 0) goto L8;
        return r3;
    L8:
        m6805();
        return this.f11256;
    }

    /* JADX INFO: renamed from: ⁱˊ */
    public void m6804() {
        ((ArrayList) this.f11262).clear();
        this.f11260 = Integer.MIN_VALUE;
        this.f11256 = Integer.MIN_VALUE;
        this.f11257 = 0;
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public void m6805() {
        View r0 = (View) AbstractC4223.m8650(1, (ArrayList) this.f11262);
        C3223 r1 = (C3223) r0.getLayoutParams();
        this.f11256 = ((StaggeredGridLayoutManager) this.f11259).f1555.mo4532(r0);
        r1.getClass();
    }

    /* JADX INFO: renamed from: ﾞʻ */
    public Object m6806(Object r3, Object r4) {
        ﾞᴵ r0 = (ﾞᴵ) this.f11259;
        monitor-enter(r0);
        this.f11256++;
        Object r32 = ((C1696) this.f11262).f5636.put(r3, r4);     // Catch: Throwable -> L8
        if (r32 == null) goto L10;
        this.f11256--;
    L10:
        monitor-exit(r0);
        m6798(this.f11260);
        return r32;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: ﾞᴵ */
    public int m6807(int r12, int r13) {
        StaggeredGridLayoutManager r0 = (StaggeredGridLayoutManager) this.f11259;
        int r1 = r0.f1555.mo4533();
        int r2 = r0.f1555.mo4529();
        if (r13 <= r12) goto L5;
        int r5 = 1;
    L6:
        if (r12 == r13) goto L20;
        View r6 = (View) ((ArrayList) this.f11262).get(r12);
        int r7 = r0.f1555.mo4537(r6);
        int r8 = r0.f1555.mo4532(r6);
        boolean r9 = false;
        if (r7 > r2) goto L10;
        boolean r10 = true;
    L11:
        if (r8 < r1) goto L13;
        r9 = true;
    L13:
        if (r10 == false) goto L19;
        if (r9 == false) goto L19;
        if (r7 < r1) goto L18;
        if (r8 <= r2) goto L19;
    L18:
        return AbstractC3152.m6674(r6);
    L19:
        r12 = r12 + r5;
        goto L6
    L10:
        r10 = false;
        goto L11
    L20:
        return -1;
    L5:
        r5 = -1;
        goto L6
    }
}
