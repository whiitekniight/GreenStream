package p029;

import com.google.android.gms.internal.measurement.ᵎ;
import java.util.Map;

/* JADX INFO: renamed from: ʼʻ.ʽﹳ */
/* JADX INFO: loaded from: classes.dex */
public final class C1435 extends AbstractC1447 {

    /* JADX INFO: renamed from: ʽʽ */
    public final /* synthetic */ C1427 f4839;

    /* JADX INFO: renamed from: ʾˋ */
    public final Object f4840;

    /* JADX INFO: renamed from: ᴵˊ */
    public int f4841;

    public C1435(C1427 r2, int r3) {
        this.f4839 = r2;
        Object r0 = C1427.f4810;
        this.f4840 = r2.m3924()[r3];
        this.f4841 = r3;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4840;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1427 r0 = this.f4839;
        Map r1 = r0.m3923();
        if (r1 != null) goto L5;
        m3951();
        int r12 = this.f4841;
        if (r12 != (-1)) goto L11;
        return null;
    L11:
        return r0.m3927()[r12];
    L5:
        return r1.get(this.f4840);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r5) {
        C1427 r0 = this.f4839;
        Map r1 = r0.m3923();
        Object r2 = this.f4840;
        if (r1 != null) goto L5;
        m3951();
        int r12 = this.f4841;
        if (r12 != (-1)) goto L10;
        r0.put(r2, r5);
        return null;
    L10:
        Object r13 = r0.m3927()[r12];
        int r22 = this.f4841;
        r0.m3927()[r22] = r5;
        return r13;
    L5:
        return r1.put(r2, r5);
    }

    /* JADX INFO: renamed from: ﹳٴ */
    public final void m3951() {
        int r0 = this.f4841;
        Object r2 = this.f4840;
        C1427 r3 = this.f4839;
        if (r0 != (-1)) goto L5;
    L10:
        Object r02 = C1427.f4810;
        this.f4841 = r3.m3926(r2);
        return;
    L5:
        if (r0 >= r3.size()) goto L10;
        int r03 = this.f4841;
        if (ᵎ.ᵎﹶ(r2, r3.m3924()[r03]) == false) goto L10;
    }
}
