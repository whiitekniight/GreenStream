package p191;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: ˋˋ.ـˏ */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3197 implements Runnable {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ int f11263;

    /* JADX INFO: renamed from: ᴵˊ */
    public final /* synthetic */ RecyclerView f11264;

    public /* synthetic */ RunnableC3197(RecyclerView r1, int r2) {
        this.f11263 = r2;
        this.f11264 = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f11263) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        RecyclerView r0 = this.f11264;
        AbstractC3205 r1 = r0.f1492;
        if (r1 == null) goto L7;
        r1.m6817();
    L7:
        r0.f1501 = false;
        return;
    L9:
        RecyclerView r02 = this.f11264;
        if (r02.f1479 == true) goto L12;
        return;
    L12:
        if (r02.isLayoutRequested() == false) goto L15;
        return;
    L15:
        if (r02.f1499 == true) goto L18;
        r02.requestLayout();
        return;
    L18:
        if (r02.f1471 == false) goto L20;
        r02.f1480 = true;
        return;
    L20:
        r02.m936();
    }
}
