package p039;

import java.util.Collections;
import java.util.List;
import p063.InterfaceC1873;
import p317.AbstractC4214;

/* JADX INFO: renamed from: ʼٴ.ʼᐧ */
/* JADX INFO: loaded from: classes.dex */
public final class C1568 implements InterfaceC1873 {

    /* JADX INFO: renamed from: ʾˋ */
    public final List f5182;

    public /* synthetic */ C1568(List r1) {
        this.f5182 = r1;
    }

    @Override // p063.InterfaceC1873
    /* JADX INFO: renamed from: ᵔʾ */
    public int mo4149() {
        return 1;
    }

    @Override // p063.InterfaceC1873
    /* JADX INFO: renamed from: ﹳٴ */
    public int mo4150(long r3) {
        if (r3 >= 0) goto L6;
        return 0;
    L6:
        return -1;
    }

    @Override // p063.InterfaceC1873
    /* JADX INFO: renamed from: ﾞʻ */
    public List mo4151(long r3) {
        if (r3 < 0) goto L7;
        return this.f5182;
    L7:
        return Collections.EMPTY_LIST;
    }

    @Override // p063.InterfaceC1873
    /* JADX INFO: renamed from: ﾞᴵ */
    public long mo4152(int r3) {
        if (r3 != 0) goto L4;
        boolean r32 = true;
    L5:
        AbstractC4214.m8560(r32);
        return 0;
    L4:
        r32 = false;
        goto L5
    }
}
