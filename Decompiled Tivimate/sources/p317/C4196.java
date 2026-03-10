package p317;

import android.os.Handler;
import android.os.Message;
import ar.tvplayer.core.domain.ʽﹳ;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p067.C1930;

/* JADX INFO: renamed from: ᐧˎ.ʼˎ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4196 implements Handler.Callback {

    /* JADX INFO: renamed from: ʾˋ */
    public final /* synthetic */ ˉʿ f15426;

    public /* synthetic */ C4196(ˉʿ r1) {
        this.f15426 = r1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r8) {
        ˉʿ r82 = this.f15426;
        Iterator r0 = ((CopyOnWriteArraySet) r82.ﾞᴵ).iterator();
    L4:
        if (r0.hasNext() == false) goto L12;
        C4216 r1 = (C4216) r0.next();
        InterfaceC4208 r3 = (InterfaceC4208) r82.ˑﹳ;
        if (r1.f15478 == true) goto L11;
        if (r1.f15477 == false) goto L11;
        C1930 r4 = r1.f15479.ʽ();
        r1.f15479 = new ʽﹳ(4);
        r1.f15477 = false;
        r3.mo3531(r1.f15480, r4);
    L11:
        if (((C4194) r82.ˈ).f15413.hasMessages(1) == false) goto L4;
    L12:
        return true;
    }
}
